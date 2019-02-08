package microservices.book.serviceregistry;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext context =	SpringApplication.run(ServiceRegistryApplication.class, args);
		System.out.println("Hit enter to terminate");
		System.in.read();
		context.close();
	}

}

