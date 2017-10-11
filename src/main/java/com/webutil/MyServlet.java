package com.webutil;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 需要结合@ServletComponentScan使用
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年10月11日 下午3:27:11
 */
@WebServlet(urlPatterns="/myServlet", name="myServlet")
public class MyServlet extends HttpServlet {

	private static final Logger log = LoggerFactory.getLogger(MyFilter.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log.info("myServlet  do something");
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}
}
