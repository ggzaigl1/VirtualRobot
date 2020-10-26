package com.lilosoft.virtualrobot.bean;

import java.util.List;

public class CharBean  {

    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SENT = 1;
    private int type; //显示类型 0:robot    1:user    2:question
    private String message;//内容
    private String QRCodeURL;//二维码
    private String question;//问题
    private String Url;
    private List<String> questions;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getQRCodeURL() {
        return QRCodeURL;
    }

    public void setQRCodeURL(String QRCodeURL) {
        this.QRCodeURL = QRCodeURL;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }
}
