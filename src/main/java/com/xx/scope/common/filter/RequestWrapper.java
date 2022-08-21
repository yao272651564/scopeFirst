package com.xx.scope.common.filter;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

/**
 * @Author: lvyk
 * @Description: 请求包装类
 * @Date: 2020/5/26 16:29
 */
public class RequestWrapper extends HttpServletRequestWrapper {
    private static final Logger log = LoggerFactory.getLogger(RequestWrapper.class);

    private String requestBody = null;
    //请求体
    private HttpServletRequest req = null;
    //    private final byte[] body;//保存流的字节数组
    private final Map<String, String> reqHeaders=new HashMap<>();


    public RequestWrapper(HttpServletRequest request) throws IOException {

        super(request);
        this.req = request;
//        this.reqHeaders = new HashMap<String, String>();
//        String sessionStream = getRequestBodyStr(request);//读取流中的参数
//        body = sessionStream.getBytes(Charset.forName("UTF-8"));
    }

    public RequestWrapper(HttpServletRequest request, String requestBody) {
        super(request);
        this.requestBody = requestBody;
        this.req = request;
//        this.reqHeaders = request.get;
    }

    /**
     * @Author: lvyk
     * @Description: 获取请求body
     * @Date: 2020/5/26 10:31
     * @Param: [request]
     * @Return: java.lang.String
     */
    public String getRequestBodyStr(final ServletRequest request) throws IOException {
        StringBuilder sb = new StringBuilder();
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = cloneInputStream(request.getInputStream());
            reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
            String line = "";
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (reader != null) {
                reader.close();
            }
        }
        return sb.toString();
    }

    /**
     * @Author: lvyk
     * @Description: 复制输入流
     * @Date: 2020/5/26 10:33
     * @Param: [inputStream]
     * @Return: java.io.InputStream
     */
    public InputStream cloneInputStream(ServletInputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int len;
        while ((len = inputStream.read(buffer)) > -1) {
            byteArrayOutputStream.write(buffer, 0, len);
        }
        byteArrayOutputStream.flush();
        InputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        return byteArrayInputStream;
    }

    @Override
    public BufferedReader getReader() throws IOException {
        return new BufferedReader(new InputStreamReader(getInputStream()));
    }

    @Override
    public ServletInputStream getInputStream() throws IOException {

        final ByteArrayInputStream bais = new ByteArrayInputStream(requestBody.getBytes(req.getCharacterEncoding()));

        return new ServletInputStream() {
            @Override
            public boolean isFinished() {
                return false;
            }

            @Override
            public boolean isReady() {
                return false;
            }

            @Override
            public void setReadListener(ReadListener readListener) {

            }

            @Override
            public int read() throws IOException {
                return bais.read();
            }
        };
    }


    /**
     * 添加header的名称和值
     *
     * @param name
     * @param value
     */
    public void addHeader(String name, String value) {
        reqHeaders.put(name, value);
    }

    @Override
    public String getHeader(String name) {
//        log.info("getHeader --->{}", name);
        String headerValue = super.getHeader(name);
        if (reqHeaders.containsKey(name)) {
            headerValue = reqHeaders.get(name);
        }
        return headerValue;
    }

    /**
     * 得到headers的名称
     */
    @Override
    public Enumeration<String> getHeaderNames() {
        List<String> names = Collections.list(super.getHeaderNames());
        for (String name : reqHeaders.keySet()) {
            names.add(name);
        }
        return Collections.enumeration(names);
    }

    @Override
    public Enumeration<String> getHeaders(String name) {
//        log.info("getHeaders name --->>>>>>{}", name);
        List<String> values = Collections.list(super.getHeaders(name));
//        log.info("getHeaders value --->>>>>>{}", values);
        if (reqHeaders.containsKey(name)) {
            log.info("getHeaders --->{}", reqHeaders.get(name));
            values = Arrays.asList(reqHeaders.get(name));
        }
        return Collections.enumeration(values);
    }
}