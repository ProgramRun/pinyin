package com.oie.pinyin.config;

/**
 * @author oie
 * @date 2020/7/20 13:20
 * @description
 */
public class SysErrorCode {

	/**
	 * 处理成功
	 */
	public static final int SUCCESS = 0;

	/**
	 * 系统繁忙
	 */
	public static final int BUSY = -1;

	/**
	 * 操作失败（多为实际数据库影应行数不对）
	 */
	public static final int FAIL = -2;

	/**
	 * 参数检查失败
	 */
	public static final int PARAMS_ERROR = -3;



}
