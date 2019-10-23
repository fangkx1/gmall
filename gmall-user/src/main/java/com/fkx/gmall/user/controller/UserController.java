package com.fkx.gmall.user.controller;

import com.fkx.gmall.user.entity.UmsMember;
import com.fkx.gmall.user.entity.UmsMemberReceiveAddress;
import com.fkx.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.fkx.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userServiceImpl;
    @RequestMapping("/index")
    @ResponseBody
    public String index(){
        return "hello index";
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        return userServiceImpl.getAllUser();
    }

    /**
     * 通过用户id获得用户住址
     * @return
     */
    @RequestMapping("/getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberid){
        return userServiceImpl.getReceiveAddressByMemberId(memberid);
    }
}
