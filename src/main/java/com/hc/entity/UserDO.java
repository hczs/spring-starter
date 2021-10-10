package com.hc.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author ：hc
 * @date ：Created in 2021/10/9 21:18
 * @modified ：
 */
@ApiModel("用户实体类")
@TableName("user")
@Data
public class UserDO {

    @ApiModelProperty("主键")
    private Long id;

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("密码")
    private String password;
}
