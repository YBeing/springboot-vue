/**
 * className:StringUtils
 * author:Lyibing
 * date: 2019/10/10
 */
package com.lying.test.utils;

public class StringUtils {
    public static boolean isemty(String str){
        if (str!=null && !"".equals(str) ){
            return true;
        }
        return false;
    }
}
