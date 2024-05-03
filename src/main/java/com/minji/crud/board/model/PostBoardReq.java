package com.minji.crud.board.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostBoardReq {
    private long writerId;
    private String title;
    private String contents;
}
