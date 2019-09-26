package com.technicalinterest.group.api.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @package: com.technicalinterest.group.dto
 * @className: UserRoleDTO
 * @description: 用户角色关联
 * @author: Shuyu.Wang
 * @date: 2019-08-31 21:17
 * @since: 0.1
 **/
@Data
@ApiModel(description = "用户信息")
public class UserInfoVO {

	@ApiModelProperty(value = "用户名")
	private String userName;

	@ApiModelProperty(value = "昵称")
	private String nickName;

	@ApiModelProperty(value = "头像")
	private String photo;

	@ApiModelProperty(value = "博客数量")
	private Integer blogNum;

	@ApiModelProperty(value = "状态，1:被禁用，2:使用中")
	private Short isDel;

	@ApiModelProperty(value = "角色类型",allowableValues = "1:管理员，2:普通用户")
	private Short roleType;
}
