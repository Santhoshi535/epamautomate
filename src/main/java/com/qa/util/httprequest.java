package com.qa.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class httprequest {
	
	public void setup() throws IOException {
		URL url = new URL("https://api.covid19india.org/data.json");
		HttpURLConnection conn = (HttpURLConnection)url.openConnection(); 
		conn.setRequestMethod("GET"); 
		conn.connect(); 
		int responsecode = conn.getResponseCode();
		//System.out.println(responsecode);
		
		Scanner sc = new Scanner(url.openStream());
		String inline = null;
		while(sc.hasNext()) {
			inline+= sc.nextLine();
			
		}
		System.out.println(inline);
		sc.close();
		
		JsonParser parse = new JsonParser();
		JsonObject jobj = (JsonObject) parse.parse(inline);
		
	}
	
	public static void main(String[] args) throws IOException {
		httprequest obj = new httprequest();
		obj.setup();
	}

}

