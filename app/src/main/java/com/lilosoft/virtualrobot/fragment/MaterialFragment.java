package com.lilosoft.virtualrobot.fragment;

import android.os.Bundle;
import android.view.View;

import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechError;
import com.lilosoft.virtualrobot.R;
import com.lilosoft.virtualrobot.base.BaseFragment;

public class MaterialFragment extends BaseFragment {

    @Override
    public void init(Bundle savedInstanceState, View view) {
//        String name = getArguments().getString("name");
//        String sex = getArguments().getString("sex");
//        String idCard = getArguments().getString("idCard");
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_material;
    }

    public static MaterialFragment newInstance() {
        return new MaterialFragment();
    }

    @Override
    public void onVolumeChanged(int i, byte[] bytes) {

    }

    @Override
    public void onBeginOfSpeech() {

    }

    @Override
    public void onEndOfSpeech() {

    }

    @Override
    public void onResult(RecognizerResult recognizerResult, boolean b) {

    }

    @Override
    public void onError(SpeechError speechError) {

    }

    @Override
    public void onEvent(int i, int i1, int i2, Bundle bundle) {

    }
}
