package com.udemy.PeoplefindersScraper;

import org.apache.http.HttpHost;

import com.mashape.unirest.http.HttpResponse;

import com.mashape.unirest.http.Unirest;

public class PeoplefindersScraper {

	public static void main(String[] args) throws Exception {
        //Change the default user-agent header
        //Unirest.setDefaultHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36");

        //Use a proxy
        //Unirest.setProxy(new HttpHost("138.197.222.35", 8080));
		
		final HttpResponse<String> response = Unirest.get("https://www.peoplefinders.com/people/james-smith/ny/new-york").asString();
		
		System.out.println(response.getBody());
	}

}
