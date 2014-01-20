package fr.bomberman.server;

import java.io.IOException;
import java.net.ServerSocket;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;

import spark.Spark;

public class ServerTest {
	private static boolean initOk = false;
	private static Gson gson = new Gson();
	private static int port;

	@Before
	public void startServer() throws IOException {
		if (!initOk) {
			Server localServer = new Server();
			Spark.setPort(findPort());
			localServer.process();
			initOk = true;
		}
	}
	
	@Test
	public void testSimpleRegister() throws ClientProtocolException, IOException {
		String body = Request.Post("http://localhost:" + port + "/register").bodyForm((org.apache.http.client.fluent.Form.form().add("username", "test")).build()).execute().returnContent().asString();
		System.err.println("Message : " + body);
		Assert.assertEquals(gson.toJson(new Boolean(true)), body);
	}
	
	@Test
	public void test_hello_get() throws ClientProtocolException, IOException {
		String body = Request.Get("http://localhost:" + port + "/hello").execute().returnContent().asString();
		Assert.assertEquals("true", body);
	}
	
	@Test
	public void test_hello_post() throws ClientProtocolException, IOException {
		String body = Request.Post("http://localhost:" + port + "/hello").execute().returnContent().asString();
		Assert.assertEquals("true", body);
	}
	
	
	@Test
	public void testMultiRegister() throws ClientProtocolException, IOException {
		String body = Request.Post("http://localhost:" + port + "/register").bodyForm((org.apache.http.client.fluent.Form.form().add("username", "test")).build()).execute().returnContent().asString();
		body = Request.Post("http://localhost:" + port + "/register").bodyForm((org.apache.http.client.fluent.Form.form().add("username", "test4")).build()).execute().returnContent().asString();
		Assert.assertEquals("true", body);
	}
	
	@Test
	public void testMultiRegisterWithSameName() throws ClientProtocolException, IOException {
		String body = Request.Post("http://localhost:" + port + "/register").bodyForm((org.apache.http.client.fluent.Form.form().add("username", "test")).build()).execute().returnContent().asString();
		body = Request.Post("http://localhost:" + port + "/register").bodyForm((org.apache.http.client.fluent.Form.form().add("username", "test")).build()).execute().returnContent().asString();
		Assert.assertEquals(gson.toJson(new Boolean(false)), body);
	}
	
	public static int findPort() throws IOException {
		ServerSocket s = new ServerSocket(0);
		port = s.getLocalPort();
		s.close();
		return port;
	}
}
