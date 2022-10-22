package com.dongdong.laborder.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Equip {
    private Integer id;

    private String equipName;

    private String equipPurpose;

    private String equipBrand;

    private String equipSeller;

    private Float equipPrice;

    private String equipDetail;
}