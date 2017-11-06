package com.saul.wx.dao;


import com.Page;

import java.util.List;

/**
 * 定义泛型DAO对象,其他接口可以直接继承该对象
 * Created by Saul on 21/01/2017.
 *
 * @param <T> 泛型对象
 * @param <F> 查询条件对象
 */
@SuppressWarnings({"MybatisMapperInXmlInspection", "unused"})
public interface IBaseDao<T, F> {
    /**
     * 保存对象
     *
     * @param object 实体对象
     */
    int save(T object) throws Exception;

    /**
     * 保存对象,多个
     *
     * @param object 实体对象
     */
    int saveBatch(List<T> object) throws Exception;

    /**
     * 更新对象
     *
     * @param object 实体对象
     * @throws Exception 项目异常
     */
    int update(T object) throws Exception;

    /**
     * 保存对象,空的属性不进行插入
     *
     * @param object 实体对象
     * @throws Exception 项目异常
     */
    int savewithoutNull(T object) throws Exception;

    /**
     * 更新对象,空的属性不经更新
     *
     * @param object 实体对象
     * @param find   查找对象
     * @return 操作是否成功
     * @throws Exception 项目异常
     */
    int updatewithoutNull(T object, F find) throws Exception;

    /**
     * 删除对象
     *
     * @param object 查找对象
     * @return
     * @throws Exception 项目异常
     */
    int delete(F object) throws Exception;

    /**
     * 根据Id删除对象
     *
     * @return
     * @throws Exception 项目异常
     */
    int deleteById(int id) throws Exception;

    /**
     * 获取单个对象
     *
     * @param id 序号对象
     * @return
     * @throws Exception 项目异常
     */
    T ReadByID(Integer id) throws Exception;

    /**
     * 获取全部对象
     *
     * @param exampleCriteria 查询条件对象
     * @throws Exception 项目异常
     */
    List ReadAll(F exampleCriteria) throws Exception;

    /**
     * @param exampleCriteria 查询条件对象
     * @throws Exception 项目异常
     */
    List ReadAllByOrder(F exampleCriteria) throws Exception;

    /**
     * 依据单独属性,获取对象,不分页
     *
     * @param exampleCriteria 查询条件对象
     * @throws Exception 项目异常
     */
    List ReadByProperty(F exampleCriteria) throws Exception;

    /**
     * 依据单独属性,获取对象,不分页
     *
     * @param exampleCriteria 查询条件对象
     * @throws Exception 项目异常
     */
    List ReadByPropertyList(F exampleCriteria) throws Exception;

    /**
     * 依据单独属性,获取对象,分页
     *
     * @param exampleCriteria 查询条件对象
     * @param page            分页对象
     * @throws Exception 项目异常
     */
    List ReadLimitedByOrder(F exampleCriteria, Page page) throws Exception;

    /**
     * 依据单独属性,获取对象,分页
     *
     * @param exampleCriteria 查询条件对象(带分页对象)
     * @throws Exception 项目异常
     */
    List ReadLimitedByOrder(F exampleCriteria) throws Exception;

    /**
     * 依据属性,获取单独对象
     *
     * @param exampleCriteria
     * @return
     * @throws Exception 项目异常
     */
    T ReadSingle(F exampleCriteria) throws Exception;

    /**
     * 依据条件,获取统计的条数
     *
     * @param exampleCriteria 查询条件对象
     * @throws Exception 项目异常
     */
    int ReadCount(F exampleCriteria) throws Exception;
}
