package com.technicalinterest.group.api.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;


/**
 * @package: com.technicalinterest.group.dto
 * @className: NewCategoryParam
 * @description: NewCategoryParam
 * @author: Shuyu.Wang
 * @date: 2019-08-15 13:02
 * @since: 0.1
 **/
@Data
@ApiModel(description = "新增博客分类参数")
public class NewCategoryParam {

	@ApiModelProperty(value = "分类名称")
	@NotBlank(message = "分类名称不能为空")
	private String name;
}
