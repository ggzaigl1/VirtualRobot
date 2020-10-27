package com.lilosoft.virtualrobot.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.bean.CharBean;
import com.lilosoft.virtualrobot.utils.QRCodeUtil;
import com.lilosoft.virtualrobot.widget.QuestionLayout;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<CharBean> mList;
    private Context mContext;
    private ChatAdapterListener mListener;

    public ChatAdapter(ArrayList<CharBean> list, Context context) {
        this.mList = list;
        this.mContext = context;
    }

    public void setListener(ChatAdapterListener listener) {
        this.mListener = listener;
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView mAnswer;
        TextView mQuestion;
        RelativeLayout mRelative_QrCode;
        ImageView mQRCodeImage;
        RelativeLayout mRlQuestion;
        QuestionLayout mQuestionLayout;

        VH(@NonNull View itemView) {
            super(itemView);
            mAnswer = itemView.findViewById(R.id.tv_msg);
            mQuestion = itemView.findViewById(R.id.tv_question);
            mRelative_QrCode = itemView.findViewById(R.id.rl_Qr_code);
            mQRCodeImage = itemView.findViewById(R.id.iv_qrcode);//二维码
            mRlQuestion = itemView.findViewById(R.id.rl_question);
            mQuestionLayout = itemView.findViewById(R.id.questionLayout);
        }
    }

    public ArrayList<CharBean> getList() {
        return mList;
    }

    public void setList(ArrayList<CharBean> list) {
        mList = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v;
        if (viewType == CharBean.TYPE_SENT) {
            v = LayoutInflater.from(mContext).inflate(R.layout.item_char_user, viewGroup, false);
            return new VH(v);
        } else if (viewType == CharBean.TYPE_RECEIVED) {
            v = LayoutInflater.from(mContext).inflate(R.layout.item_char_robot, viewGroup, false);
            return new VH(v);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        CharBean charBean = mList.get(position);
        int viewType = viewHolder.getItemViewType();
        switch (viewType) {
            case CharBean.TYPE_RECEIVED:
                ((VH) viewHolder).mAnswer.setText(charBean.getMessage());
                if (!TextUtils.isEmpty(charBean.getQuestion())) {
//                    ((VH) viewHolder).mQuestion.setVisibility(View.VISIBLE);
                    ((VH) viewHolder).mQuestion.setText(charBean.getQuestion());
                } else {
                    ((VH) viewHolder).mQuestion.setVisibility(View.GONE);
                }
//                显示二维码
                if (!TextUtils.isEmpty(charBean.getQRCodeURL())) {
                    Bitmap bitmap = QRCodeUtil.createBitmap(charBean.getQRCodeURL());
                    ((VH) viewHolder).mRelative_QrCode.setVisibility(View.VISIBLE);
                    ((VH) viewHolder).mQRCodeImage.setImageBitmap(bitmap);
                } else {
                    ((VH) viewHolder).mRelative_QrCode.setVisibility(View.GONE);
                }

                final String question = charBean.getMessage();
                if (mListener != null) {
                    ((VH) viewHolder).mAnswer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            mListener.onQuestionClick(question);
                        }
                    });
                }

                //问题集合显示
                if (charBean.getQuestions() == null || charBean.getQuestions().size() == 0) {
                    ((VH) viewHolder).mRlQuestion.setVisibility(View.GONE);
                } else {
                    ((VH) viewHolder).mRlQuestion.setVisibility(View.VISIBLE);
                    ((VH) viewHolder).mQuestionLayout.initData(charBean.getQuestions());
                    ((VH) viewHolder).mQuestionLayout.setListener(new QuestionLayout.QuestionLayoutListener() {
                        @Override
                        public void onItemClick(String question) {
                            if (mListener != null) {
                                mListener.onQuestionClick(question);
                            }
                        }
                    });
                }

                break;
            case CharBean.TYPE_SENT:
                ((VH) viewHolder).mAnswer.setText(charBean.getMessage());
                break;
        }
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    @Override
    public int getItemViewType(int position) {
        if (mList.get(position).getType() == 0) {
            return CharBean.TYPE_RECEIVED;
        } else if (mList.get(position).getType() == 1) {
            return CharBean.TYPE_SENT;
        }
        throw new RuntimeException("未找到对应类型");
    }

    public void addData(CharBean charBean) {
        mList.add(charBean);
        notifyDataSetChanged();
    }

    public interface ChatAdapterListener {
        void onQuestionClick(String question);
    }
}
