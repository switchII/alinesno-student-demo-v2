package com.alinesno.student.learn.demo.alinesnostudentdemo;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回的对照数据
 */
public class R extends HashMap<String , Object> {
    public static R ok() {
        R r = new R() ;

        r.put("code" , 200)  ;

        return r ;
    }

    public static R ok(Map<String, StudentDto> database) {
        R r = new R() ;

        r.put("code" , 200)  ;
        r.put("data" , database) ;

        return r ;
    }
}
