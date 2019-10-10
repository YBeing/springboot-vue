/**
 * className:StringUtils
 * author:Lyibing
 * date: 2019/10/10
 */
package com.lying.test.utils;

public class StringUtils {
    public static boolean isemty(String str){
        if (!str.equals("")&& str!=null){
            return true;
        }
        return false;
    }
}
