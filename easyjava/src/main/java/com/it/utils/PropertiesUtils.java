package com.it.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class PropertiesUtils {
    private static Properties props=new Properties();
    private static Map<String,String> PROPS_MAP=new ConcurrentHashMap();
    static {
        InputStream ie=null;
        try {
            ie = PropertiesUtils.class.getClassLoader().getResourceAsStream("application.properties");
            props.load(ie);
            Iterator<Object> iterator=props.keySet().iterator();
            while (iterator.hasNext()){
                String key=(String) iterator.next();
                PROPS_MAP.put(key, props.getProperty(key));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (ie!=null){
                try{
                    ie.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    public static String getString(String key){
        return PROPS_MAP.get(key);
    }
}
