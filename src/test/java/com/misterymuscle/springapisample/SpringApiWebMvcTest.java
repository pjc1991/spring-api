package com.misterymuscle.springapisample;

import java.util.Random;
import java.util.UUID;

import javax.sql.DataSource;

import com.misterymuscle.springapisample.board.controller.ApiController;
import com.misterymuscle.springapisample.board.dto.BoardArticleDto;
import com.misterymuscle.springapisample.board.repository.BoardRepository;
import com.misterymuscle.springapisample.board.service.BoardService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
@WebAppConfiguration
@AutoConfigureMockMvc
public class SpringApiWebMvcTest {

    private MockMvc mockMvc;

    @MockBean
    private BoardService boardService;

    @MockBean
    private BoardRepository boardRepository;

    @MockBean
    private DataSource dataSource;

    @BeforeEach
    public void setup() throws Exception{
        this.mockMvc = MockMvcBuilders
            .standaloneSetup(ApiController.class)
            .build();
    }

    @Test
    void MvcTestGet() throws Exception{
        int minCase = 0;
        int maxCase = 100;
        int testCase = minCase + new Random().nextInt(maxCase+1);
        for (int i = 0; i < testCase; i++) {
            String randomTitle = UUID.randomUUID().toString();
            String randomContent = UUID.randomUUID().toString();
            String randomId = UUID.randomUUID().toString();
            BoardArticleDto dto = BoardArticleDto.builder()
                .boardTitle(randomTitle)
                .boardContent(randomContent)
                .memberId(randomId)
                .build(); 

            mockMvc.perform(MockMvcRequestBuilders
                        .post("/board")
                        .content(dto.toString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)).andExpect(status().isCreated());

        }
    }

}