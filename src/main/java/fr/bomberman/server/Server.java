package fr.bomberman.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import com.google.gson.Gson;

public class Server {
	private Gson gson = new Gson();
	Logger logger = LoggerFactory.getLogger(Server.class); 
	
	public void process() {
		Spark.post(new Route("/register") {
			@Override
			public Object handle(Request request, Response response) {
				try {
					logger.debug(request.queryParams("username"));
					User.createUser(request.queryParams("username"));
					return gson.toJson(new Boolean(true));
				} catch(Exception e) {
					return gson.toJson(new Boolean(false));
				}
			}
		});
		Spark.get(new Route("/hello") {
			@Override
			public Object handle(Request request, Response response) {
				return gson.toJson(new Boolean(true));
			}
		});
		Spark.post(new Route("/hello") {
			@Override
			public Object handle(Request request, Response response) {
				return gson.toJson(new Boolean(true));
			}
		});
	}
}