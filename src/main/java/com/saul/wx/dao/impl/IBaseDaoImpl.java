package com.saul.wx.dao.impl;

import com.Page;
import com.saul.wx.dao.IBaseDao;
import com.saul.wx.dao.IBaseMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Saul on 22/01/2017.
 * 通用DAO实现
 *
 * @param <T>
 * @param <F>
 */
@SuppressWarnings("unused")
@Repository("baseDao")
public abstract class IBaseDaoImpl<T, F> implements IBaseDao<T, F> {

    private final int returncode = -1;
    @Autowired
    public Map<String, IBaseDao> daoMap;
    private IBaseMapper<T, F> iBaseMapper;

    public IBaseMapper<T, F> getiBaseMapper() {
        return iBaseMapper;
    }

    public void setiBaseMapper(IBaseMapper<T, F> iBaseMapper) {
        this.iBaseMapper = iBaseMapper;
    }

    @Override
    public int save(T object) throws Exception {
        if (object != null) {
            return iBaseMapper.insert(object);
        }
        return returncode;
    }

    @Override
    public int saveBatch(List<T> object) throws Exception {
        if (object != null) {
            return iBaseMapper.sqlBatchInsert(object);
        }
        return returncode;
    }

    @Override
    public int update(T object) throws Exception {
        if (object != null) {
            return iBaseMapper.updateByPrimaryKey(object);
        }
        return returncode;
    }

    @Override
    public int savewithoutNull(T object) throws Exception {
        if (object != null) {
            return iBaseMapper.insertSelective(object);
        }
        return returncode;
    }

    @Override
    public int updatewithoutNull(T object, F find) throws Exception {
        if (object != null) {
            return iBaseMapper.updateByExampleSelective(object, find);
        }
        return returncode;
    }

    @Override
    public int delete(F object) throws Exception {
        if (object != null) {
            return iBaseMapper.deleteByExample(object);
        }
        return returncode;
    }

    @Override
    public int deleteById(int id) throws Exception {
        if (id > 0) {
            return iBaseMapper.deleteByPrimaryKey(id);
        }
        return returncode;
    }

    @Override
    public T ReadSingle(F exampleCriteria) throws Exception {
        if (exampleCriteria != null) {
            return iBaseMapper.selectByExample(exampleCriteria).get(0);
        }
        return null;
    }

    @Override
    public List ReadAll(F exampleCriteria) throws Exception {
        if (exampleCriteria != null) {
            return iBaseMapper.selectByExample(exampleCriteria);
        }
        return null;
    }

    @Override
    public List ReadAllByOrder(F exampleCriteria) throws Exception {
        if (exampleCriteria != null) {
            return iBaseMapper.selectByExample(exampleCriteria);
        }
        return null;
    }

    @Override
    public List ReadByProperty(F exampleCriteria) throws Exception {
        if (exampleCriteria != null) {
            return iBaseMapper.selectByExample(exampleCriteria);
        }
        return null;
    }

    @Override
    public List ReadByPropertyList(F exampleCriteria) throws Exception {
        if (exampleCriteria != null) {
            return iBaseMapper.selectByExample(exampleCriteria);
        }
        return null;
    }

    @Override
    public List ReadLimitedByOrder(F exampleCriteria, Page page) throws Exception {
        if (exampleCriteria != null) {
            return iBaseMapper.selectByExample(exampleCriteria);
        }
        return null;
    }

    @Override
    public List ReadLimitedByOrder(F exampleCriteria) throws Exception {
        if (exampleCriteria != null) {
            List<Object> resultList = new ArrayList<Object>();
            CollectionUtils.addAll(resultList, iBaseMapper.selectByExample(exampleCriteria).iterator());
            CollectionUtils.addIgnoreNull(resultList, iBaseMapper.countByExample(exampleCriteria));

            return resultList;
        }
        return null;
    }

    @Override
    public int ReadCount(F exampleCriteria) throws Exception {
        if (exampleCriteria != null) {
            return iBaseMapper.countByExample(exampleCriteria);
        }
        return returncode;
    }

    @Override
    public T ReadByID(Integer id) throws Exception {
        if (id > 0) {
            return iBaseMapper.selectByPrimaryKey(id);
        }
        return null;
    }
}
