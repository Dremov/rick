package com.dremov.rick;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RickController {

  @GetMapping("/greeting")
  public ResponseEntity<String> getGreeting() {
    return ResponseEntity.ok("Hey Morty");
  }

}
