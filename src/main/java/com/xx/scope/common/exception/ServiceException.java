package com.xx.scope.common.exception;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = -360277845666981697L;

	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}

	@Override
	public String getMessage() {
		String message = super.getMessage();
		if (message == null) {
			return "";
		}
		return message;
	}

}
