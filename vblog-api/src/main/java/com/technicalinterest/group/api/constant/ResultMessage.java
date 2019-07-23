package com.technicalinterest.group.api.constant;

/**
 * @package:com.ganinfo.utils
 * @className:ResultCode
 * @description:请求提示msg枚举类
 * @author:Shuyu.Wang
 * @date:2018-11-30 18:13
 * @version:V1.0
**/
public enum ResultMessage {

	SUCCESS("请求成功！"),
	ERROR("请求失败！"),
	PARAM_ERROR("参数异常！"),
	ACCESTOKEN_NULL("accessToken为空，请先登录！"),
	TIME_OUT("登录超时，请重新登录！"),
	NO_URL("访问地址不存在！"),
	METHOD_NOT_ALLOWED("请求方式不被支持！"),
	SERVER_ERROR("服务器异常！"),
	NO_DATA("没有匹配数据！"),
	NET_BLOCK("网络拥堵，请稍后重试！"),
	SERVER_OUT("服务过期，请联系服务提供商！");

	private String message;

	private ResultMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}