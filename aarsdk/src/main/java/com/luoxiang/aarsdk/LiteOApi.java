package com.luoxiang.aarsdk;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * projectName: 	    LimitAbility
 * packageName:	        com.luoxiang.aarsdk
 * className:	        LiteOApi
 * author:	            Luoxiang
 * time:	            08/04/2019	8:24 PM
 * desc:	            TODO
 *
 * svnVersion:	        $Rev
 * upDateAuthor:	    luoxiang
 * upDate:	            08/04/2019
 * upDateDesc:	        TODO
 */
public class LiteOApi {

    private static LiteOApi sApi;

    private static final long LIMITTIME = 1559997124379L;

    private LiteOApi (){}

    public static LiteOApi getApi(){
        if (sApi == null){
            synchronized (LiteOApi.class){
                if (sApi == null){
                    sApi = new LiteOApi();
                }
            }
        }
        return sApi;
    }

    public boolean initSdk(){
        long time = getWebsiteDatetime("http://www.baidu.com");
        return  time > LIMITTIME;
    }

    /**
     * 获取指定网站的日期时间
     */
    private  long getWebsiteDatetime(String webUrl){
        try {
            URL           url = new URL(webUrl);// 取得资源对象
            URLConnection uc  = url.openConnection();// 生成连接对象
            uc.connect();// 发出连接
            return uc.getDate();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return System.currentTimeMillis();
    }
}
