package com.saul.wx.dao;

import com.saul.wx.model.MstbWhereMain;
import com.saul.wx.model.MstbWhereMainCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstbWhereMainMapper {
    int countByExample(MstbWhereMainCriteria example);

    int deleteByExample(MstbWhereMainCriteria example);

    int deleteByPrimaryKey(Integer mwmId);

    int insert(MstbWhereMain record);

    int insertSelective(MstbWhereMain record);

    List<MstbWhereMain> selectByExample(MstbWhereMainCriteria example);

    MstbWhereMain selectByPrimaryKey(Integer mwmId);

    int updateByExampleSelective(@Param("record") MstbWhereMain record, @Param("example") MstbWhereMainCriteria example);

    int updateByExample(@Param("record") MstbWhereMain record, @Param("example") MstbWhereMainCriteria example);

    int updateByPrimaryKeySelective(MstbWhereMain record);

    int updateByPrimaryKey(MstbWhereMain record);
}