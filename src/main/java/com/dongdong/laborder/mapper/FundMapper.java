package com.dongdong.laborder.mapper;

import com.dongdong.laborder.entity.Fund;
import com.dongdong.laborder.entity.FundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FundMapper {
    int countByExample(FundExample example);

    int deleteByExample(FundExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Fund record);

    int insertSelective(Fund record);

    List<Fund> selectByExample(FundExample example);

    Fund selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Fund record, @Param("example") FundExample example);

    int updateByExample(@Param("record") Fund record, @Param("example") FundExample example);

    int updateByPrimaryKeySelective(Fund record);

    int updateByPrimaryKey(Fund record);
}