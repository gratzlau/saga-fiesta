package org.saga.kzcore.dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author 刘冠钊
 *	DAO基类接口
 */
public interface IBaseDao {

	<T> void save(T bean) throws Exception;
	<T> void update(T bean) throws Exception;
	<T> void merge(T bean) throws Exception;
	<T> void saveOrUpdate(T bean) throws Exception;
	<T> void delete(T bean) throws Exception;
	
	
	//查询
	<T, ID extends Serializable> T getById(Class<T> type, ID id) throws Exception;		
	<T> List<T> getAll(Class<T> type) throws Exception;			
	
	<T> List<T> query(String jpql, Object...args) throws Exception;
	<T> List<T> query(String jpql, Map<String,Object> paramsMap) throws Exception;
	<T> List<T> sqlQuery(String sql, Object...args) throws Exception;
	<T> List<T> sqlQuery(String sql, Map<String,Object> paramsMap) throws Exception;
	<T> List<Map<String,T>> sqlQueryMap(String sql, Object...args) throws Exception;
	<T> List<Map<String,T>> sqlQueryMap(String sql, Map<String, Object> paramsMap) throws Exception;
	
	//分页查询
	<T> List<T> queryForPage(String queryString,Object[] params, int offset,int length) throws Exception;
	<T> List<T> queryForPage(String jpql, Map<String, Object> paramsMap, int offset, int length) throws Exception;
	<T> List<T> sqlQueryForPage(String sql, Object[] params, int offset, int length) throws Exception;
	<T> List<T> sqlQueryForPage(String sql, Map<String, Object> paramsMap, int offset, int length) throws Exception;
	<T> List<Map<String,T>> sqlQueryMapForPage(String sql, Object[] params, int offset, int length) throws Exception;
	<T> List<Map<String,T>> sqlQueryMapForPage(String sql, Map<String, Object> paramsMap, int offset, int length) throws Exception;
	
	int executeUpdate(String jpql, Object...args) throws Exception;
	int executeUpdate(String jpql, Map<String,Object> paramsMap) throws Exception;
	int executeSqlUpdate(String sql, Object...args) throws Exception;
	int executeSqlUpdate(String sql, Map<String,Object> paramsMap) throws Exception;
	
	
	
	//总记录条数
	//<T> int getCount(String hql) throws Exception;
	//<T> int getCount(String hql, Object...values) throws Exception;
	
	
	
	
}
