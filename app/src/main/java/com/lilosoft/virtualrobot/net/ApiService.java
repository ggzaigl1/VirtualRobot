package com.lilosoft.virtualrobot.net;

import android.util.ArrayMap;

import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ApiService {


    //普通get 请求
//    @GET
//    Observable<IBeanModule<Object>> getCompose(@Url String apiUrl, @QueryMap ArrayMap<String, Object> params);
//
//
//    //普通post 请求【请求参数 json格式 】
//    @POST
//    Observable<IBeanModule<Object>> postCompose(@Url String apiUrl, @Body ArrayMap<String, Object> params);

    /**
     * 机器人注册接口
     *
     * @param robotCode  机器人终端编号(终端机器人生成的一个类似序列号)
     * @param registCode 机器人注册码(由后台统一分发的一个授权注册码)
     * @return
     */
    @FormUrlEncoded
    @POST("robotReg")
    Observable<ResponseBody> robotReg(@Field("robotCode") String robotCode, @Field("registCode") String registCode);

    /**
     * 获取Token
     *
     * @param serviceId 机器人id 注册时获取
     * @return
     */
    @FormUrlEncoded
    @POST("https://rapi.egovrobot.com/accessToken")
    Call<ResponseBody> accessToken(@Field("serviceId") String serviceId);

    /**
     * 机器人初始化
     *
     * @param access_token 有效的token
     * @param serviceId    平台分配的机器人id
     * @return
     */
    @FormUrlEncoded
    @POST("v1/robot/initialize")
    Call<ResponseBody> initialize(@Field("access_token") String access_token, @Field("serviceId") String serviceId);

    /**
     * 人脸搜索   百度
     *
     * @return
     */
    @FormUrlEncoded
    @POST("v2/face/robotFaceInfo")
    Call<ResponseBody> robotFaceInfo(@FieldMap Map<String, String> map);


//    @FormUrlEncoded
//    @POST("v2/face/robotFaceInfo")
//    Call<ResponseBody> robotFaceInfo(
//            @Field("access_token") String access_token,
//            @Field("enterprise_code") String enterprise_code,
//            @Field("image_base64") String image_base64,
//            @Field("service_id") String service_id);



    @FormUrlEncoded
    @POST("botservice/api/bot/chat")
    Observable<ResponseBody> chatTest(
            @Field("userId") String userId,
            @Field("query") String query,
            @Field("areaCode") String areaCode);
}
