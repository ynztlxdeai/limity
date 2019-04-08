package com.compatsdk;

public class LiteApi {

    static {
        System.loadLibrary("limit_ability");
    }

    private static volatile LiteApi sLiteApi;

    private LiteApi(){}

    public native boolean iniSdk();

    public static LiteApi getLiteApi(){
        if (sLiteApi == null){
            synchronized (LiteApi.class){
                if (sLiteApi == null){
                    sLiteApi = new LiteApi();
                }
            }
        }
        return sLiteApi;
    }
}
