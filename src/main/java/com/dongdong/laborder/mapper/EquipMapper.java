package com.dongdong.laborder.mapper;

import com.dongdong.laborder.entity.Equip;
import com.dongdong.laborder.entity.EquipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipMapper {
    int countByExample(EquipExample example);

    int deleteByExample(EquipExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Equip record);

    int insertSelective(Equip record);

    List<Equip> selectByExample(EquipExample example);

    Equip selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Equip record, @Param("example") EquipExample example);

    int updateByExample(@Param("record") Equip record, @Param("example") EquipExample example);

    int updateByPrimaryKeySelective(Equip record);

    int updateByPrimaryKey(Equip record);
}