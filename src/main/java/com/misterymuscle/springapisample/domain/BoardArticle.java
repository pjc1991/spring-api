package com.misterymuscle.springapisample.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardArticle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long boardIdx;

    private String boardTitle;

    private String boardContent;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date boardRegDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date boardModDate;

    private String memberId;

    @PrePersist
    void preInsert(){
        if(this.boardRegDate == null){
            this.boardRegDate = new Date();
        }
        if(this.boardModDate == null){
            this.boardModDate = new Date();
        }
    }

    
}
