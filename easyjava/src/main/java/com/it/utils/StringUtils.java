package com.it.utils;

public class StringUtils {
    public static String uperCaseFiretleLateer(String filed){
        if (org.apache.commons.lang3.StringUtils.isEmpty(filed)){
            return filed;
        }
        return filed.substring(0,1).toUpperCase()+filed.substring(1);
    }
    public static String lowerCaseFiretleLateer(String filed){
        if (org.apache.commons.lang3.StringUtils.isEmpty(filed)){
            return filed;
        }
        return filed.substring(0,1).toLowerCase()+filed.substring(1);
    }

    public static void main(String[] args) {
        System.out.println(lowerCaseFiretleLateer("Company"));
    }
}
