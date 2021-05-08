package com.misterymuscle.springapisample.board.controller;

import java.util.List;

import com.misterymuscle.springapisample.board.dto.BoardArticleDto;
import com.misterymuscle.springapisample.board.dto.BoardArticleSearch;
import com.misterymuscle.springapisample.board.service.BoardService;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/board")
public class ApiController {

    private final BoardService boardService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public BoardArticleDto createItem(@RequestBody BoardArticleDto dto){
        return boardService.insertBoardArticle(dto);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping()
    public List<BoardArticleDto> ListBoardArticles(@RequestBody BoardArticleSearch search){
        return boardService.selectBoardArticles(search);
    }
    
}
