package com.wellsfargo.serv_req_center.task_management.commons;

public class DataNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(String msg) {
		super(msg);
	}

}
