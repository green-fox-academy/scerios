package spring.sql.connections;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionsApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(ConnectionsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}

