package com.saul.wx.dao;

import com.saul.wx.model.MstbWxUser;
import com.saul.wx.model.MstbWxUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MstbWxUserMapper {
    int countByExample(MstbWxUserCriteria example);

    int deleteByExample(MstbWxUserCriteria example);

    int deleteByPrimaryKey(Integer mwId);

    int insert(MstbWxUser record);

    int insertSelective(MstbWxUser record);

    List<MstbWxUser> selectByExample(MstbWxUserCriteria example);

    MstbWxUser selectByPrimaryKey(Integer mwId);

    int updateByExampleSelective(@Param("record") MstbWxUser record, @Param("example") MstbWxUserCriteria example);

    int updateByExample(@Param("record") MstbWxUser record, @Param("example") MstbWxUserCriteria example);

    int updateByPrimaryKeySelective(MstbWxUser record);

    int updateByPrimaryKey(MstbWxUser record);
}