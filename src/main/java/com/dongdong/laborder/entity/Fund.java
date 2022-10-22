package com.dongdong.laborder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fund {
    private Integer id;

    private Integer fundId;

    private String fundName;

    private String fundRemark;
}