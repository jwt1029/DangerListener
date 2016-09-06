package com.xeno.dl;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DataReceiveController {

	private static final Logger logger = LoggerFactory.getLogger(DataReceiveController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/dataReceive", method = RequestMethod.POST)
	public String home(Locale locale, Model model, HttpServletRequest request) {
		String stringData = request.getParameter("");
		String[] splitedData = stringData.split(" ");
		float[] datas = new float[splitedData.length];
		for(int i=0;i<splitedData.length;i++)
			datas[i] = Float.parseFloat(splitedData[i]);

		int packetSize = 0;
		return "{'success':true, 'size':}" + packetSize;
	}

}
