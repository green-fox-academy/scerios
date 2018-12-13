package com.demo.dependencies;

import com.demo.dependencies.interfaces.Coloring;
import com.demo.dependencies.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {
  private Printer printer;
  private Coloring color;

  @Autowired
  public DependenciesApplication(Printer printer, Coloring color) {
    this.printer = printer;
    this.color = color;
  }

  public static void main(String[] args) {
    SpringApplication.run(DependenciesApplication.class, args);
    System.exit(0);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("Hello");
    color.printColor("GreenColor");
  }
}

