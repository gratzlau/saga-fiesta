package org.saga.common;

import java.util.List;
import java.util.Set;

/**
 * 
 * @author 刘冠钊
 *	公共工具类
 */
public class CommonUtils {

	public static boolean isNull(Object o){
		return null==o;
	}
	
	public static boolean isNotNull(Object o){
		return null!=o;
	}
	
	public static boolean isEmpty(List<?> list) {
		return !isNotEmpty(list);
	}
	
	public static boolean isNotEmpty(List<?> list) {		
		return isNotNull(list) && list.size() > 0 && isNotNull(list.get(0));
	}
	
	public static <T> boolean isEmpty(T[] list) {
		return !isNotEmpty(list);
	}
	
	public static <T> boolean isNotEmpty(T[] list) {		
		return isNotNull(list) && list.length > 0 && isNotNull(list[0]);
	}
	
	public static boolean isNotEmpty(Set<?> set) {		
		return isNotNull(set) && set.size() > 0 ;
	}
	

}
