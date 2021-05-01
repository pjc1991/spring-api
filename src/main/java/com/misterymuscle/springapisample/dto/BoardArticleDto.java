package com.misterymuscle.springapisample.dto;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BoardArticleDto {

    private long boardIdx;
    private String boardTitle;
    private String boardContent;
    private Date boardRegDate;
    private Date boardModDate;
    private String memberId;
    
}
