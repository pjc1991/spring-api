package com.misterymuscle.springapisample.dto;

import java.util.Date;

import lombok.Data;

@Data
public class BoardArticleDto {

    private long boardIdx;
    private String boardTitle;
    private String boardContent;
    private Date boardRegDate;
    private String memberId;
    
}
