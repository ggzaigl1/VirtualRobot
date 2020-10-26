package com.lilosoft.virtualrobot.net.result;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * Post请求封装
 */
public interface PostRequest {

    /**
     * 发送Post请求
     *
     * @param url URL路径
     * @param map 请求参数
     * @return
     */
    @POST
    Call<ResponseBody> postMap(@Url String url, @QueryMap Map<String, String> map);

}
