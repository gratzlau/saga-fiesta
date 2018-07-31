package org.saga.kzcore;

import java.io.Serializable;
import java.util.List;
import java.util.Map;


/**
 * 
 * @author 刘冠钊
 *	Service基类接口
 */
public abstract interface IBaseService {
	
	public <T, ID extends Serializable> T getById(Class<T> t, ID id) throws Exception;
	
	public boolean updateByHQL(String hql, Object...args) throws Exception;
	public boolean updateBySQL(String sql, Object...args) throws Exception;
	
	public <T> List<T> getByMap(Class<T> t,Map<String,Object> queryMap,String orderBy) throws Exception;
	public <T> List<T> getByMap(Class<T> t,Map<String,Object> queryMap) throws Exception;
	public <T> List<T> getAll(Class<T> t) throws Exception;
	public <T> List<T> getAll(Class<T> t,String orderBy) throws Exception;
	
	public <T> T getFirstItemByMap(Class<T> t,Map<String,Object> queryMap) throws Exception;
	
	public <T> List<T> findByHql(String hql, Object...values) throws Exception;
	//分页查询
	public <T> List<T> queryForPage(String hql, Object[] params, int offset,int length) throws Exception;
	//总记录条数
	public <T> int getCount(String hql) throws Exception;
	public <T> int getCount(String hql, Object...args) throws Exception;
	public <T> List<T> queryBySQL(String sql, Object...args) throws Exception;
	
	
//	public <T extends BaseBean, ID extends Serializable> T getById(Class<T> t, ID id) throws Exception;
	public <T extends BaseBean> boolean isExistBean(T t) throws Exception;
	public <T extends BaseBean> T loadBean(T t) throws Exception;
	
	public <T extends BaseBean> boolean update(T t) throws Exception;
	public <T extends BaseBean> boolean save(T t) throws Exception;
	public <T extends BaseBean> boolean delete(T t) throws Exception;
	public <T extends BaseBean, ID extends Serializable> boolean delete(Class<T> t, ID id) throws Exception;
	
	public <T extends BaseBean> boolean deleteForLogic(T t) throws Exception;
	public <T extends BaseBean, ID extends Serializable> boolean deleteForLogic(Class<T> t, ID id) throws Exception;
	public <T extends BaseBean, ID extends Serializable> boolean deleteBatchForLogic(Class<T> t, ID ids) throws Exception;
	
	public <T extends BaseBean> boolean addOrUpdate(T t) throws Exception;
	public <T extends BaseBean> boolean addBatch(List<T> beanList) throws Exception;
	
	
}
