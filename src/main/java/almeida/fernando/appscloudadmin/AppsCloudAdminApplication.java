package almeida.fernando.appscloudadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.config.EnableAdminServer;

@Configuration
@SpringBootApplication
@EnableAdminServer
public class AppsCloudAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppsCloudAdminApplication.class, args);
	}
}
