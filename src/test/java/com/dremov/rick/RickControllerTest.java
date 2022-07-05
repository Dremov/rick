package com.dremov.rick;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(RickController.class)
class RickControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void shouldRespondOk() throws Exception {
    mockMvc.perform(get("/greeting"))
        .andExpect(status().isOk());
  }


}
