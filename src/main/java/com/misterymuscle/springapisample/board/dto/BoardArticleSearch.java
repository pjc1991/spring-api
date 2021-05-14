package com.misterymuscle.springapisample.board.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardArticleSearch {


    private long boardIdx;
    private String boardTitle;
    private String boardContent;
    private Date boardRegDate;
    private Date boardModDate;
    private String memberId;

}
