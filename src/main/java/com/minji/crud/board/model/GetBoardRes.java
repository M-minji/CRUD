package com.minji.crud.board.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetBoardRes {
    private long boardId;
    private long writerId;
    private String title;
    private String contents;
    private String createdAt;
    private String updatedAt;
}
