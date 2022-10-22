package com.dongdong.laborder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class File {
    private Integer id;

    private String fileSt;

    private String receiptSt;

    private String reimbSt;
}