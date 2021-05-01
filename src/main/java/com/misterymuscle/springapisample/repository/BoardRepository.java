package com.misterymuscle.springapisample.repository;

import com.misterymuscle.springapisample.domain.BoardArticle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<BoardArticle, Long>{

}
