package com.laoxu.dao;

import com.laoxu.pojo.Streets;
import com.laoxu.pojo.StreetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StreetsMapper {
    long countByExample(StreetsExample example);

    int deleteByExample(StreetsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Streets record);

    int insertSelective(Streets record);

    List<Streets> selectByExample(StreetsExample example);

    Streets selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Streets record, @Param("example") StreetsExample example);

    int updateByExample(@Param("record") Streets record, @Param("example") StreetsExample example);

    int updateByPrimaryKeySelective(Streets record);

    int updateByPrimaryKey(Streets record);
}