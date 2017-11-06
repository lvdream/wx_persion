package com.saul.wx.service.impl;


import com.Page;
import com.saul.wx.dao.IBaseDao;
import com.saul.wx.service.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Saul on 22/01/2017.
 */
@Service
public abstract class BaseServiceImpl<T, F> implements IBaseService<T, F> {
    @Autowired
    public Map<String, IBaseService> serviceMap;
    private IBaseDao<T, F> baseDao;

    public Map<String, IBaseService> getServiceMap() {
        return serviceMap;
    }

    public IBaseDao<T, F> getBaseDao() {
        return baseDao;
    }

    public void setBaseDao(IBaseDao<T, F> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public int add(T t) {
        if (t != null) {
            try {
                return baseDao.save(t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int delete(F obj) {
        if (obj != null) {
            try {
                return baseDao.delete(obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int deleteById(int id) {
        try {
            return baseDao.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(T t) {
        if (t != null) {
            try {
                return baseDao.update(t);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int update(T t, F find) {
        if (t != null) {
            try {
                return baseDao.updatewithoutNull(t, find);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public T query(int id) {
        try {
            return baseDao.ReadByID(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public T query(F find) {
        try {
            return baseDao.ReadSingle(find);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> queryForAll(F find) {
        try {
            return baseDao.ReadAll(find);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> queryForAll(F find, Page page) {
        try {
            return baseDao.ReadLimitedByOrder(find, page);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<T> queryLimitedByOrder(F find) {
        try {
            return baseDao.ReadLimitedByOrder(find);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int queryCountByOrder(F find) {
        try {
            return baseDao.ReadCount(find);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}
