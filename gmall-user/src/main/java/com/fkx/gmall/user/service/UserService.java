package com.fkx.gmall.user.service;

import com.fkx.gmall.user.entity.UmsMember;
import com.fkx.gmall.user.entity.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberid);
}