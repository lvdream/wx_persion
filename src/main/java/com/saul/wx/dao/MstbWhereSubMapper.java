package com.saul.wx.dao;

import com.saul.wx.model.MstbWhereSub;
import com.saul.wx.model.MstbWhereSubCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstbWhereSubMapper {
    int countByExample(MstbWhereSubCriteria example);

    int deleteByExample(MstbWhereSubCriteria example);

    int deleteByPrimaryKey(Integer mwsId);

    int insert(MstbWhereSub record);

    int insertSelective(MstbWhereSub record);

    List<MstbWhereSub> selectByExample(MstbWhereSubCriteria example);

    MstbWhereSub selectByPrimaryKey(Integer mwsId);

    int updateByExampleSelective(@Param("record") MstbWhereSub record, @Param("example") MstbWhereSubCriteria example);

    int updateByExample(@Param("record") MstbWhereSub record, @Param("example") MstbWhereSubCriteria example);

    int updateByPrimaryKeySelective(MstbWhereSub record);

    int updateByPrimaryKey(MstbWhereSub record);
}