package com.esa.bmap.autologin.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface AutoLoginInterface {

	public void login(HttpServletRequest request, HttpServletResponse response);
}
