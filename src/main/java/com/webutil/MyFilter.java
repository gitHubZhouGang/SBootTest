package com.webutil;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 自定义web 的Filter
 * @Description: TODO
 * @author Cloop
 *	需要结合@ServletComponentScan使用
 * @date 2017年10月11日 下午2:45:01
 */
@WebFilter(urlPatterns="/*")
public class MyFilter implements Filter{
	private static final Logger log = LoggerFactory.getLogger(MyFilter.class);
	@Override
	public void destroy() {
		log.info("Filter执行销毁动作");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		log.info("Filter执行拦截动作");
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		log.info("Filter执行初始化动作");
	}

}
