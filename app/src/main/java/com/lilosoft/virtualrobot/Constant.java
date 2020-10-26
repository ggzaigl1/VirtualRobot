package com.lilosoft.virtualrobot;

import com.lilosoft.virtualrobot.bean.InitializeBean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constant {

    public final static String SPNAME = "OutsideScreen";
    public static String URL_BASE = "http://192.168.2.144:9103/";

    public static String Base_URL = "http://47.111.254.223:8081/";
    public static String RobotURL = "https://rapi.egovrobot.com/";
    //    public static String RobotURL = "http://172.20.152.8:8181/";//海康威视
    private static String uploadXml = "http://192.168.1.107:9002/config.xml";
    public static String AREACODE = "110105000000";
    private static String VIDEO_PATH = "rtsp://192.168.1.107:554/VideoServer/vts.wmv";
    private static String ICON_PATH = "http://192.168.1.107:9003/pic/wp/top.png";
    private static String TITTLE = "";
    private static int PJTIME = 8;
    private static String Token = "123";
    private static String ENTERPRISE_CODE = "123";
    private static String QRCodeURL = "";
    private static String WebCodeURL = "";
    public static final String serviceId = "S100007";
    public final static String LogFile = "/VirtualRobotLog.txt";
    public static ArrayList<InitializeBean.ObjBean.RobotBean.GreetingsBean> Greetings;
    public static String backImgUrl = "";
    public static List<String> Banner;
    public static String eventWebUrl;
    public static String projectWebUrl;
    public static String faceinfoWebUrl;
    public final static int ImageTime = 30;

    public static final Map<String, Integer> POPUP_SELECTED_ENTITY = new HashMap<>(4);

    // 全屏模式
    public static final int SHOW_MODE_FULL = 1;
    // 半屏 4/3模式
    public static final int SHOW_MODE_HALF = 0;
    // SurfaceView 显示模式
    public static int sShowMode = SHOW_MODE_FULL;

    public static String getEnterpriseCode() {
        return ENTERPRISE_CODE;
    }

    public static void setEnterpriseCode(String enterpriseCode) {
        ENTERPRISE_CODE = enterpriseCode;
    }

    public static String getBase_URL() {
        return Base_URL;
    }

    public static void setBase_URL(String base_URL) {
        Base_URL = base_URL;
    }

    /**
     * 获取更新地址
     *
     * @return
     */
    public static String getUploadXml() {
        return uploadXml;
    }

    /**
     * 设置接口地址
     *
     * @return
     */
    public static void setUploadXml(String uploadXml) {
        Constant.uploadXml = uploadXml;
    }

    /**
     * 获取区划地址
     *
     * @return
     */
    public static String getAREACODE() {
        return AREACODE;
    }

    /**
     * 设置区划
     *
     * @return
     */
    public static void setAREACODE(String AREACODE) {
        Constant.AREACODE = AREACODE;
    }

    /**
     * 获取流媒体地址
     *
     * @return
     */
    public static String getVideoPath() {
        return VIDEO_PATH;
    }

    /**
     * 设置流媒体地址
     *
     * @return
     */
    public static void setVideoPath(String videoPath) {
        VIDEO_PATH = videoPath;
    }

    /**
     * 获取tittle
     *
     * @return
     */
    public static String getTITTLE() {
        return TITTLE;
    }

    /**
     * 设置TITTLE
     *
     * @param TITTLE
     */
    public static void setTITTLE(String TITTLE) {
        Constant.TITTLE = TITTLE;
    }

    public static String getIconPath() {
        return ICON_PATH;
    }

    public static void setIconPath(String iconPath) {
        ICON_PATH = iconPath;
    }

    /**
     * @return 评价时间
     */
    public static int getPJTIME() {
        return PJTIME;
    }

    /**
     * 设置评价时间 单位秒
     *
     * @param PJTIME
     */
    public static void setPJTIME(int PJTIME) {
        Constant.PJTIME = PJTIME;
    }


    public static String getToken() {
        return Token;
    }

    public static void setToken(String token) {
        Token = token;
    }

    /**
     * 二维码
     *
     * @return
     */
    public static String getQRCodeURL() {
        return QRCodeURL;
    }

    public static void setQRCodeURL(String QRCodeUrl) {
        QRCodeURL = QRCodeUrl;
    }


    /**
     * 网页二维码
     *
     * @return
     */
    public static String getWebCodeURL() {
        return WebCodeURL;
    }

    public static void setWebCodeURL(String webCodeURL) {
        WebCodeURL = webCodeURL;
    }

    public static List<String> getBanner() {
        return Banner;
    }

    public static void setBanner(List<String> banner) {
        Constant.Banner = banner;
    }

    public static ArrayList<InitializeBean.ObjBean.RobotBean.GreetingsBean> getGreetings() {
        return Greetings;
    }

    public static void setGreetings(ArrayList<InitializeBean.ObjBean.RobotBean.GreetingsBean> greetings) {
        Greetings = greetings;
    }

    public static String getBackImgUrl() {
        return backImgUrl;
    }

    public static void setBackImgUrl(String backImgUrl) {
        Constant.backImgUrl = backImgUrl;
    }

    public static String getEventWebUrl() {
        return eventWebUrl;
    }

    public static void setEventWebUrl(String eventWebUrl) {
        Constant.eventWebUrl = eventWebUrl;
    }

    public static String getProjectWebUrl() {
        return projectWebUrl;
    }

    public static void setProjectWebUrl(String projectWebUrl) {
        Constant.projectWebUrl = projectWebUrl;
    }

    public static String getFaceinfoWebUrl() {
        return faceinfoWebUrl;
    }

    public static void setFaceinfoWebUrl(String faceinfoWebUrl) {
        Constant.faceinfoWebUrl = faceinfoWebUrl;
    }
}
