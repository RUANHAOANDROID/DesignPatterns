package com.ruanhao.abstractdocument;

import java.util.stream.Stream;
import java.util.Map;
import java.util.function.Function;

/**
 * 文档接口
 * 
 * @author rh
 *
 */
public interface Document {
	/**
	 * 提value相关的key
	 * @param key
	 * @param value
	 * @return Void
	 */
	Void put(String key, Object value);
	/**
	 * 通过key获取相应的value
	 * @param key
	 * @return value or null
	 */
	Object get(String key);
	/**
	 * 获取子文档流
	 * @param key 
	 * @param construcor 子类的构造函数
	 * @return child documents 
	 */
	<T> Stream<T> children(String key, Function<Map<String, Object>, T> construcor);
}
