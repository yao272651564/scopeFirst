package com.xx.scope.common.exception;

public class SystemException extends RuntimeException {

	private static final long serialVersionUID = -360277845666981697L;

	public SystemException() {
		super();
	}

	public SystemException(String message, Throwable cause) {
		super(message, cause);
	}

	public SystemException(String message) {
		super(message);
	}

	public SystemException(Throwable cause) {
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
