package com.misterymuscle.springapisample.board.dto;

import java.util.List;

import lombok.Data;

import lombok.ToString;

@Data
@ToString

public class ResponseVO<T> {
    String message;
    T Object;
    List<Error> error;

    public ResponseVO(String msg, T object){
        this.message = msg;
        this.Object = object;
    }
    public ResponseVO(String msg){
        this.message = msg;
    }
}
