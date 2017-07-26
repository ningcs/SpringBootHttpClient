package com.example.demo.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.List;

/**
 * Created by ningcs on 2017/7/26.
 */
public class GsonUtils {

    // 将Json数据解析成相应的映射对象
    public static <T> T parseJsonWithGson(String jsonData, Class<T> type) {
        Gson gson = new Gson();
        T result = gson.fromJson(jsonData, type);
        return result;
    }

    /**
     *  Exception：java.lang.IllegalStateException: Expected BEGIN_ARRAY but was BEGIN_OBJECT
     * 错误原因：
     * 应该以JsonArray的形式接收。
     * JsonArray json =new JsonArray();
     */

    // 将Json数组解析成相应的映射对象列表
    public static <T> List<T> parseJsonArrayWithGson(String jsonData,
                                                     Class<T> type) {
        Gson gson = new Gson();
        List<T> result = gson.fromJson(jsonData, new TypeToken<List<T>>(){
        }.getType());
        return result;
    }


}
