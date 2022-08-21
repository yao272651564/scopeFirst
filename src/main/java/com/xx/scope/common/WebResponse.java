package com.xx.scope.common;

import java.io.Serializable;

public class WebResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private int code;

	private String message;

	private Object data;

	public WebResponse() {

	}

	public WebResponse(int code, String message, Object data) {
		this.code = code;
		this.message = message;
		this.data = data;//todo 返回参数加密处
	}

	public WebResponse(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public WebResponse(int code, Object data) {
		this.code = code;
		this.data = data;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static WebResponse successMessage(String msg) {
		return new WebResponse(WebResponseCode.SUCCESS.getValue(),msg);
	}

	public static WebResponse successDataAndMessage(Object data, String message) {
		return new WebResponse(WebResponseCode.SUCCESS.getValue(), message,data);
	}

	public static WebResponse successData(Object data) {
		return new WebResponse(WebResponseCode.SUCCESS.getValue(),data);
	}

	public static WebResponse errorMessage(String msg) {
		return new WebResponse(WebResponseCode.ERROR.getValue(),msg);
	}
}
