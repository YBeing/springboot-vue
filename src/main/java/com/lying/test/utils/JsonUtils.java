/**
 * className:JsonUtils
 * author:Liuyibin
 * date: 2019/9/4
 */
package com.lying.test.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public  class JsonUtils {
    public  static Object  jsonString2Bean (Class T, Map m ,String mapKey){
        String tmp = (String) m.get(mapKey);
        JSON jsonuser =(JSON) JSON.parse(tmp);
        Object obj = JSONObject.toJavaObject(jsonuser, T);
        return  obj;

    }
}
