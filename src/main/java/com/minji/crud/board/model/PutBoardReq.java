package com.minji.crud.board.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PutBoardReq {
    private long boardId;
    private String title;
    private String contents;
}
