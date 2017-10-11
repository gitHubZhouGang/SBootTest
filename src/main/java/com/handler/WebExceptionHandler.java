package com.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * 异常 统一处理   
 * @Description: TODO
 * @author Cloop
 *
 * @date 2017年10月11日 下午2:42:21
 */
@ControllerAdvice
public class WebExceptionHandler {
	private static final Logger logger = LoggerFactory.getLogger(WebExceptionHandler.class);

	@ExceptionHandler({ RuntimeException.class })
	@ResponseStatus(HttpStatus.OK)
	ModelAndView processorException(RuntimeException exception) {
		logger.info("自定义异常处理-RuntimeException");
		ModelAndView m = new ModelAndView();
		m.addObject("exception", exception.getMessage());
		m.setViewName("/WEB-INF/templates/error.jsp");
		return m;
	}

	@ExceptionHandler({ Exception.class })
	@ResponseStatus(HttpStatus.OK)
	public ModelAndView processException(Exception exception) {
		logger.info("自定义异常处理-Exception");
		ModelAndView m = new ModelAndView();
		m.addObject("exception", exception.getMessage());
		m.setViewName("/WEB-INF/templates/error.jsp");
		return m;
	}
}
