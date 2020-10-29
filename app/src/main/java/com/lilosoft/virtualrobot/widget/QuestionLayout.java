package com.lilosoft.virtualrobot.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


import com.lilosoft.virtualrobot.R;

import java.util.List;
import java.util.Random;

/**
 * created by hehuan
 * on 2020/7/29
 */
public class QuestionLayout extends RelativeLayout {

    private List<String> mQuestionList;
    private QuestionLayoutListener mListener;

    public QuestionLayout(Context context) {
        super(context);
    }

    public QuestionLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QuestionLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public QuestionLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    public void setListener(QuestionLayoutListener listener) {
        this.mListener = listener;
    }

    public void initData(List<String> questionList) {
        removeAllViews();
//        int length = questionList.size()<6 ? questionList.size() : 5;
        int length = questionList.size();

//        int screenWidth = ((ViewGroup)getParent()).getWidth();
        int screenWidth = 947;
        int minMargin = 10;

        int lastTop = 0;
        int lastLeft = 0;
        int lastWidth = 0;
        int lastHeight = 0;

        int leftMargin = 16;
        int topMargin = 16;
        int currentUsableWidth = screenWidth;

        Log.i("QuestionLayout", "currentUsableWidth:" + currentUsableWidth);

        for (int i = 0; i < length; i++) {
            String question = questionList.get(i);
            LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            params.leftMargin = leftMargin;
            params.topMargin = topMargin;
            TextView textView = new TextView(getContext());
            textView.setText(question);
            textView.setTextColor(Color.WHITE);
            textView.setGravity(Gravity.LEFT);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            textView.setBackground(getContext().getDrawable(R.drawable.bg_question));
            textView.setPadding(16, 0, 16, 0);
            textView.setLayoutParams(params);

            textView.measure(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
            int width = textView.getMeasuredWidth();
            int height = textView.getMeasuredHeight();

            int top = 0;
            int left = 0;

            if (currentUsableWidth >= (width + leftMargin)) {
                top = lastTop;
                if (i == 0) {
                    left = 0;
                } else {
                    left = lastLeft + lastWidth + leftMargin;
                }
            } else {
                currentUsableWidth = screenWidth;
                top = lastTop + lastHeight + topMargin;
                left = 0;
                height = height * (width / screenWidth + 1);
            }

            lastTop = top;
            lastLeft = left;

            Log.i("QuestionLayout", " lastLeft:" + lastLeft);
            currentUsableWidth -= (width + leftMargin);

            params.leftMargin = left + leftMargin;
            params.topMargin = top + topMargin;
            textView.setLayoutParams(params);

            textView.setOnClickListener(v -> mListener.onItemClick(question));

            addView(textView);

//            textView.measure(LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
            lastWidth = width;
            lastHeight = height;
//            int lineCount = textView.getLineCount();

            Log.i("QuestionLayout", " index:" + i + " top:" + top + " left:" + left + " width:" + width + " height:" + lastHeight + " currentUsableWidth:" + currentUsableWidth);
        }
    }

    public interface QuestionLayoutListener {
        void onItemClick(String question);
    }
}
