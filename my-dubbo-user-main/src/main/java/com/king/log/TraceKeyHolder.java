package com.king.log;

/**
 * Created by pengjun on 15/12/12.
 */
public class TraceKeyHolder {

    private  static ThreadLocal<String> threadLocal = new ThreadLocal<String>();


    public static String getTraceKey() {
        return threadLocal.get();
    }


    public static void setTraceKey(String traceKey) {
        threadLocal.set(traceKey);
    }

    public static void clear() {
        threadLocal.remove();
    }


}
