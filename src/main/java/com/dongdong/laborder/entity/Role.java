package com.dongdong.laborder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Role {
    private Integer id;

    private String roleName;

    private Integer userId;
}