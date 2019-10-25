package com.fkx.gmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.fkx.gmall.entity.UmsMember;
import com.fkx.gmall.entity.UmsMemberReceiveAddress;
import com.fkx.gmall.service.UserService;
import com.fkx.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.fkx.gmall.user.mapper.UserMapper;
//import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
//改为dubbo的包，不仅是spring的bean，同时也是可以提供dubbo协议的rpc服务
@Service
public class UserServiceImpl implements UserService {
    @Reference
    UserMapper userMapper;
    @Reference
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMember> getAllUser() {
        return userMapper.selectAll();
    }


    /**
     * 单表的查询
     * @param memberId
     * @return
     */
    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
//        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
//        umsMemberReceiveAddress.setMemberId(memberId);
//
//        List<UmsMemberReceiveAddress> select = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
//
//        return select;
        Example example = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressMapper.selectByExample(example);

        return list;
    }
}
