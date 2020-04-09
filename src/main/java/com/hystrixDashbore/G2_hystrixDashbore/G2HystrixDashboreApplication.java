package com.hystrixDashbore.G2_hystrixDashbore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class G2HystrixDashboreApplication {

	public static void main(String[] args) {
		SpringApplication.run(G2HystrixDashboreApplication.class, args);
	}

}
