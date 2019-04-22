package com.lingc.oilcard.util;

import com.alibaba.fastjson.JSONObject;

import javax.net.ssl.*;
import java.io.*;
import java.net.URL;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

/**
 * @author wzp
 * @descripton
 * @time 2019/4/23 1:03
 * @modify
 */
public class HttpUtil {

    private static InputStream inputStream = null;
    private static InputStreamReader inputStreamReader = null;
    private static BufferedReader bufferedReader = null;
    private static HttpsURLConnection conn = null;





    /**
     * 发送https请求
     *
     * @param httpUrl     请求url
     * @param method      请求方式
     * @param requestData 请求参数
     * @return string
     */
    public static String request(String httpUrl, String method, String requestData) {
        if (httpUrl == null || method == null) {
            return null;
        }
        String response = null;
        try {
            // 创建SSLConrext对象，并使用我们指定的信任管理器初始化
            SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
            TrustManager[] tm = {new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }
                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            }};
            sslContext.init(null, tm, new java.security.SecureRandom());
            // 从上面对象中得到SSLSocketFactory
            SSLSocketFactory ssf = sslContext.getSocketFactory();

            URL url = new URL(httpUrl);
            conn = (HttpsURLConnection) url.openConnection();
            conn.setSSLSocketFactory(ssf);

            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setUseCaches(false);

            // 设置请求方式（get|post）
            conn.setRequestMethod(method);
            // 有数据提交时
            if (null != requestData) {
                OutputStream outputStream = conn.getOutputStream();
                outputStream.write(requestData.getBytes("UTF-8"));
                outputStream.close();
            }
            // 将返回的输入流转换成字符串
            inputStream = conn.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            bufferedReader = new BufferedReader(inputStreamReader);
            String str;
            StringBuffer buffer = new StringBuffer();
            while ((str = bufferedReader.readLine()) != null) {
                buffer.append(str);
            }
            response = buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return response;
    }


    private static void close() {
        try {
            if (conn != null) {
                conn.disconnect();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (inputStream != null) {
                inputStreamReader.close();
            }
            if (inputStream != null) {

                inputStream.close();
            }
        } catch (IOException execption) {
            execption.printStackTrace();
        }
    }
}
