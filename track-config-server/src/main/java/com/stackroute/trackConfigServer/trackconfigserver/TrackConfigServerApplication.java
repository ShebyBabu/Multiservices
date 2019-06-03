package com.stackroute.trackConfigServer.trackconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class TrackConfigServerApplication {

	public static void main(String[] args) {

		SpringApplication.run(TrackConfigServerApplication.class, args);
	}

}
