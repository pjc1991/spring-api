package com.misterymuscle.springapisample.board.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class BoardArticleDto {

    private long boardIdx;
    private String boardTitle;
    private String boardContent;
    private Date boardRegDate;
    private Date boardModDate;
    private String memberId;
    
}
