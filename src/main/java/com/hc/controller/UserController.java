package com.hc.controller;

import com.hc.entity.CommonResult;
import com.hc.entity.UserDO;
import com.hc.exception.BaseException;
import com.hc.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ：hc
 * @date ：Created in 2021/10/9 21:15
 * @modified ：
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation("查询所有用户信息")
    @GetMapping("/list")
    public CommonResult listUsers() {
        List<UserDO> userDOList = userService.listUsers();
        return CommonResult.ok().data("items", userDOList);
    }

    @ApiOperation("添加用户")
    @PostMapping("/add")
    public CommonResult insertUser(@RequestBody UserDO userDO) {
        boolean success = userService.save(userDO);
        return success ? CommonResult.ok().message("添加成功！") : CommonResult.error().message("添加失败！");
    }

}
