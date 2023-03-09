package org.codej.rest.algorithm.클래스.board.dto;

import lombok.Data;

@Data //lombok을 사용하기 때문에 getter,setter를 적어주지 않아도 됨
public class BoardDto {
    private int boardIdx;
    private String title;
    private String contents;
    private int hitCnt;
    private String creatorId="kdh";
    private String createdDatetime;
    private String updaterId;
    private String updatedDatetime;
}