package com.api.swagger.swaggerdemo.controller;

import com.api.swagger.swaggerdemo.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api( tags = "用户列表接口")
@RequestMapping("user")
public class UserController {

    @GetMapping("/{id}")
    @ApiOperation("根据 ID 查询用户信息")
    @ApiImplicitParam(name ="id", value = "用户 id", defaultValue = "0", required = true)
    public User getUserById(@PathVariable Integer id){
        User user = new User();
        user.setUserId(id);
        return user;
    }

    @PostMapping("")
    @ApiOperation("添加用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name="userName", value="用户名", defaultValue ="", required = true),
            @ApiImplicitParam(name="addr", value="用户地址", defaultValue = "", required = true)
    })
    public User addUser(@RequestParam() String userName,@RequestParam() String addr){
        User user = new User();
        user.setUserName(userName);
        user.setAddr(addr);
        return user;
    }


    @PutMapping("/{id}")
    @ApiOperation("根据用户id更新用户的接口")
    public User updateUserById(@RequestBody User user,@PathVariable Integer id){
        user.setUserId(id);
        return user;
    }


}
