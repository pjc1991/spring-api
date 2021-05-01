package com.misterymuscle.springapisample;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.misterymuscle.springapisample.domain.BoardArticle;
import com.misterymuscle.springapisample.repository.BoardRepository;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class SpringApiRepositoryTest {
    
    @Autowired
    private BoardRepository boardRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringApiRepositoryTest.class);
    @Test
    void SimpleInsertTest(){
        int minTestCase = 2;
        int maxTestCase = 100;
        int testCase = new Random().nextInt(maxTestCase) + minTestCase;
        List<BoardArticle> insertList = new ArrayList<>();
        LOGGER.info("The number of Test case : {}", testCase);
        for (int i = 0; i < testCase; i++) {
            String randomTitle = "Title " + i ;
            String randomContent = UUID.randomUUID().toString();
            BoardArticle article = BoardArticle.builder()
            .boardTitle(randomTitle)
            .boardContent(randomContent)
            .build();
            insertList.add(article);
        }
        boardRepository.saveAll(insertList);
        List<BoardArticle> selectList = boardRepository.findAll();
        LOGGER.info("The number of selected list : {}", selectList.size());
        assert(selectList.containsAll(insertList));
    }

}
