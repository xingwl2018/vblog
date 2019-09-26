package com.technicalinterest.group.api.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;


/**
 * @package: com.shuyu.blog.vo
 * @className: UserVO
 * @description:
 * @author: Shuyu.Wang
 * @date: 2019-07-14 19:00
 * @since: 0.1
 **/
@Data
@ApiModel(description = "登录请求参数")
public class UserParam {

    @ApiModelProperty(value = "用户名",required = true)
    @NotBlank(message = "用户名不能为空")
    private String userName;

    @ApiParam(value = "密码",required = true)
    @NotBlank(message = "密码不能为空")
    private String passWord;
}
