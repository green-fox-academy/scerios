package com.demo.dependencies.controller;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {
  public void log(String message) {
    System.out.println(LocalDateTime.now() + "My printer says: " + message);
  }
}
