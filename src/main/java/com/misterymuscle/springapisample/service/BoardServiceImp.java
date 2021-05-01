package com.misterymuscle.springapisample.service;

import com.misterymuscle.springapisample.dto.BoardArticleDto;
import com.misterymuscle.springapisample.repository.BoardRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImp implements BoardService {
    
    private final BoardRepository boardRepository;

    @Override
    public BoardArticleDto insertBoardArticle(BoardArticleDto dto) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
