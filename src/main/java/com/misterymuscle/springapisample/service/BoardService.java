package com.misterymuscle.springapisample.service;

import java.util.List;

import com.misterymuscle.springapisample.dto.BoardArticleDto;
import com.misterymuscle.springapisample.dto.BoardArticleSearch;

public interface BoardService {

	BoardArticleDto insertBoardArticle(BoardArticleDto dto);

	List<BoardArticleDto> selectBoardArticles(BoardArticleSearch search);

}
