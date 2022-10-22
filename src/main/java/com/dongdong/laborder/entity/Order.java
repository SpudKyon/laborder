package com.dongdong.laborder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Integer id;

    private String orderType;

    private Integer equipId;

    private Integer managerId;

    private Integer fundId;

    private Integer fileId;

    private Integer paymentId;
}