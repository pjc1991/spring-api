package com.misterymuscle.springapisample.board.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import com.misterymuscle.springapisample.board.domain.BoardArticle;
import com.misterymuscle.springapisample.board.dto.BoardArticleDto;
import com.misterymuscle.springapisample.board.dto.BoardArticleSearch;
import com.misterymuscle.springapisample.board.repository.BoardRepository;
import com.misterymuscle.springapisample.board.service.BoardService;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImp implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public BoardArticleDto insertBoardArticle(BoardArticleDto dto) {
        // dto to entity
        BoardArticle article = BoardArticle.builder()
                .boardTitle(dto.getBoardTitle())
                .boardContent(dto.getBoardContent())
                .memberId(dto.getMemberId())
                .build();
        // there is no member function yet

        article = boardRepository.save(article);
        // entity to dto;
        BoardArticleDto rtn = BoardArticleDto.builder()
                .boardIdx(article.getBoardIdx())
                .boardTitle(article.getBoardTitle())
                .boardContent(article.getBoardContent())
                .boardRegDate(article.getBoardRegDate())
                .boardModDate(article.getBoardModDate())
                .memberId(article.getMemberId())
                .build();

        return rtn;
    }

    @Override
    public List<BoardArticleDto> selectBoardArticles(BoardArticleSearch search) {
        List<BoardArticle> list = boardRepository.findAll();
        List<BoardArticleDto> dtoList = list.stream()
                                        .map(article -> BoardArticleDto.builder()
                                        .boardIdx(article.getBoardIdx())
                                        .boardTitle(article.getBoardTitle())
                                        .boardContent(article.getBoardContent())
                                        .boardRegDate(article.getBoardRegDate())
                                        .boardModDate(article.getBoardModDate())
                                        .build())
                                        .collect(Collectors.toList());

        return dtoList;
    }

}
