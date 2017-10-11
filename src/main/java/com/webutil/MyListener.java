package com.webutil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 需要结合@ServletComponentScan使用
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年10月11日 下午3:27:04
 */
@WebListener
public class MyListener implements ServletContextListener {

	private static final Logger log = LoggerFactory.getLogger(MyFilter.class);
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		log.info("Listener 销毁");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		log.info("Listener 初始化");
	}
}
