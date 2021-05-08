package com.misterymuscle.springapisample.board.repository;

import com.misterymuscle.springapisample.board.domain.BoardArticle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardArticle, Long>{

}
