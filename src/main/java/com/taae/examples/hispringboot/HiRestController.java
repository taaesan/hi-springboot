package com.taae.examples.hispringboot;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.taae.examples.hispringboot.model.Player;

@RestController
@RequestMapping("api")
@ConfigurationProperties(prefix = "hiapp")
public class HiRestController {

	private String saying;


	@RequestMapping(method = RequestMethod.GET, value = "/hi", produces = "text/plain")
	public String hi() {
		String hostName = null;
		try {
			hostName = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			hostName = "unknow";
		}
		return saying+" " + hostName;
	}


	public String getSaying() {
		return saying;
	}

	public void setSaying(String saying) {
		this.saying = saying;
	}

}
