package com.demo.dependencies.services;

import org.springframework.stereotype.Service;
import java.time.LocalDateTime;

@Service
public class Printer {
  public void log(String message) {
    System.out.println("------ MESSAGE ------");
    System.out.println(LocalDateTime.now() + " My printer says: " + message);
    System.out.println("------ MESSAGE ------");
  }
}
