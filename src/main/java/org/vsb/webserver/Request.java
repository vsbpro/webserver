package org.vsb.webserver;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;

public class Request {
	public static void main(String[] args) {
		HttpClient httpClient = HttpClientBuilder.create().build();
		try {

		    HttpPost request = new HttpPost("http://localhost:8080");
		    TestPojo pojo = new TestPojo();
		    pojo.age = "20";
		    pojo.name = "Vish";
		    StringEntity params =new StringEntity(pojo.toString());
		    request.addHeader("content-type", "application/x-www-form-urlencoded");
		    request.setEntity(params);
		    HttpResponse response = httpClient.execute(request);

		    //handle response here...

		}catch (Exception ex) {

		    //handle exception here

		} finally {
		    //Deprecated
		    //httpClient.getConnectionManager().shutdown(); 
		}
	}
}
