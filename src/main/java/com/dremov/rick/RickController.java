package com.dremov.rick;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RickController {

  @GetMapping("/greeting")
  public String getGreeting() {
    return "";
  }

}
