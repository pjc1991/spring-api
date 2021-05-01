package com.misterymuscle.springapisample.controller;

import com.misterymuscle.springapisample.dto.BoardArticleDto;
import com.misterymuscle.springapisample.service.BoardService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ApiController {

    private final BoardService boardService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public BoardArticleDto createItem(@RequestBody BoardArticleDto dto){
        return boardService.insertBoardArticle(dto);
    }
    
}
