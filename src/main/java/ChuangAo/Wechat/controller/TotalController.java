package ChuangAo.Wechat.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ChuangAo.Wechat.service.Wechat4jService;


/**
 * Hello world!
 *
 */
@RestController
public class TotalController
{
	
	Date dt = new Date();	
	private static final Logger logger = LoggerFactory.getLogger(TotalController.class);
	
	
	@RequestMapping("/la")
	private String home(String la){
		la = "sss";
		logger.debug("---/la "+la);
		return "hello " + la;
	}
	
	@RequestMapping("/")
	private String wtf(String la){
		la = "wtf";
		return  la;
	}
	
	@RequestMapping("/sss")
	protected void defaultResponse(HttpServletRequest request, HttpServletResponse  response) throws IOException{
		Wechat4jService wechat4jService = new Wechat4jService(request);
        String result = wechat4jService.execute();
        logger.debug("---servie result: "+result);
        response.getOutputStream().write(result.getBytes());
	}
	

}
