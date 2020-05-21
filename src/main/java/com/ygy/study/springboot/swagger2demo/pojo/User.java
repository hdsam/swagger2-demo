package com.ygy.study.springboot.swagger2demo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

@ApiModel("用户实体类")
@Data
public class User {

    @ApiModelProperty("用户姓名")
    private String name;

    @ApiModelProperty("年龄")
    private int age;

    @ApiModelProperty("性别")
    private String sex;
}
