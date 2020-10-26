package com.lilosoft.virtualrobot.utils;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.Iterator;

/**
 *
 * @author hehuan
 * @date 2017/11/6
 */

public class JsonKeyToLower {

    public static JSONObject transObject(JSONObject jsonObject) throws Exception {
        JSONObject jsonOb = new JSONObject();
        Iterator iterator = jsonObject.keys();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            Object object = jsonObject.get(key);
            if (object.getClass().toString().endsWith("JSONObject")) {
                jsonOb.accumulate(key.toLowerCase(), transObject((JSONObject) object));
            } else if (object.getClass().toString().endsWith("JSONArray")) {
                jsonOb.accumulate(key.toLowerCase(), transArray(jsonObject.getJSONArray(key)));
            } else {
                jsonOb.accumulate(key.toLowerCase(), object);
            }
        }
        return jsonOb;
    }

    private static JSONArray transArray(JSONArray jsonArray) throws Exception {
        JSONArray o2 = new JSONArray();
        for (int i = 0; i < jsonArray.length(); i++) {
            Object jArray = jsonArray.getJSONObject(i);
            if (jArray.getClass().toString().endsWith("JSONObject")) {
                o2.put(transObject((JSONObject) jArray));
            } else if (jArray.getClass().toString().endsWith("JSONArray")) {
                o2.put(transArray((JSONArray) jArray));
            }
        }
        return o2;
    }
}
