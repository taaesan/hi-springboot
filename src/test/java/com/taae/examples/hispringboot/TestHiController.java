package com.taae.examples.hispringboot;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(HiRestController.class)
public class TestHiController {
	@Autowired
    private MockMvc mockMvc;



	@Test
	public void shouldReturn200WhenSendingRequestToController() throws Exception {
		this.mockMvc.perform(get("/api/hi")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("Sawasdee")));
	}

}
