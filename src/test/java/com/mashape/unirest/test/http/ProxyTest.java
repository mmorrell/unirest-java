package com.mashape.unirest.test.http;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.apache.http.HttpHost;
import org.junit.Test;

import com.mashape.unirest.http.Headers;
import static org.junit.Assert.assertEquals;

public class ProxyTest {

	@Test
	public void testProxy() {

		try {
			System.out.println(Unirest.get("https://httpbin.org/ip").asString().getBody());
		} catch (UnirestException e) {
			e.printStackTrace();
		}

		Unirest.setProxy(new HttpHost("proxy-nl.privateinternetaccess.com", 1080));
		Unirest.setProxyAuthentication("x1481044", "6JQdvfyGqo");

		try {
			System.out.println(Unirest.get("https://httpbin.org/ip").asString().getBody());
		} catch (UnirestException e) {
			e.printStackTrace();
		}
	}
}
