package com.lilosoft.virtualrobot.utils;

import android.content.Context;
import android.support.annotation.NonNull;

import com.faceunity.FUStaEngine;
import com.faceunity.fuenum.FUTtsType;

import java.io.IOException;

/**
 * FUStaEngine 工具类
 */
public final class StaUnityUtils {
    private FUStaEngine mFUStaEngine;
    private Context mContext;

    private StaUnityUtils() {
    }

    public static StaUnityUtils getInstance() {
        return StaUnityHolder.INSTANCE;
    }

    /**
     * 初始化 FUStaEngine
     *
     * @param context
     */
    public void init(@NonNull Context context) {
        mContext = context.getApplicationContext();
        try {

//            String offLinePath = "offline/827d5330-01f8-11ea-b582-0f52140c6649.bundle";
//            byte[] offLineAuth = FileUtils.readBytesFromAssets(mContext, offLinePath);

            String decoderPath = "fustaengine/data_decoder.bin";
            byte[] bytesDecoder = FileUtils.readBytesFromAssets(mContext, decoderPath);

            String asrPath = "fustaengine/data_asr.bin";
            byte[] bytesAsr = FileUtils.readBytesFromAssets(mContext, asrPath);

            String alignPath = "fustaengine/data_ali.bin";
            byte[] bytesAlign = FileUtils.readBytesFromAssets(mContext, alignPath);

            /**
             * 1. type1不走离线鉴权。能走的通
             * 2. type2走离线鉴权。能走通
             * 3. type1走离线鉴权。走不通
             * */
            FUStaEngine.Builder builder = new FUStaEngine
                    //传入上下文，必要
                    .Builder(mContext)
                    //验证证书，必要
                    .setAuth(authpack.A())
                    //设置tts查询方式，必要（ASR方式需要设置：FUTtsType.ASR；Align方式需要设置：FUTtsType.ALIGNMENT）
                    .setFUTtsType(FUTtsType.ALIGNMENT)
                    //设置语音识别工具包（ASR方式需要设置）
                    // .setAsrData(bytesAsr)
                    //设置语音自动校准工具包（Align模式需要设置）
                    .setAlignData(bytesAlign)
                    //设置文字编码功能数据文件（Align模式和文本时间戳需要设置）
                    .setCharacterDecoder(bytesDecoder)
                    //设置离线鉴权
                    //.setOffLineAuth(offLineAuth)
                    //设置帧率限制
                    .setIsLimitFps(true);

//            FUStaEngine.Builder builder = new FUStaEngine
//                    //传入上下文，必要
//                    .Builder(mContext)
//                    //验证证书，必要
//                    .setAuth(authpack.A())
//                    //设置tts查询方式，必要（ASR方式需要设置：FUTtsType.ASR；Align方式需要设置：FUTtsType.ALIGNMENT）
//                    .setFUTtsType(FUTtsType.ASR)
//                    //设置语音识别工具包（ASR方式需要设置）
//                    .setAsrData(bytesAsr)
//                    //设置语音自动校准工具包（Align模式需要设置）
//                    // .setAlignData(bytesAlign)
//                    //设置文字编码功能数据文件（Align模式和文本时间戳需要设置）
//                    .setCharacterDecoder(bytesDecoder)
//                    //设置离线鉴权
//                    //.setOffLineAuth(offLineAuth)
//                    //设置帧率限制
//                    .setIsLimitFps(true);

            mFUStaEngine = builder.build();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Context getContext() {
        return mContext;
    }

    public FUStaEngine getFUStaEngine() {
        return mFUStaEngine;
    }

    private static class StaUnityHolder {
        private static final StaUnityUtils INSTANCE = new StaUnityUtils();
    }

}
