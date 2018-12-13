package com.demo.dependencies;

import com.demo.dependencies.controller.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {
  Printer printer;

  @Autowired
  public DependenciesApplication(Printer printer) {
    this.printer = printer;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);
    System.exit(0);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println("MESSAGE");
    printer.log("Hello");
    System.out.println("MESSAGE");
  }
}

