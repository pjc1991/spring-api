package com.misterymuscle.springapisample.board.service;

import java.util.List;

import com.misterymuscle.springapisample.board.dto.BoardArticleDto;
import com.misterymuscle.springapisample.board.dto.BoardArticleSearch;

public interface BoardService {

	BoardArticleDto insertBoardArticle(BoardArticleDto dto);

	List<BoardArticleDto> selectBoardArticles(BoardArticleSearch search);

}
