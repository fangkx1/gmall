package com.fkx.gmall.service;

import com.fkx.gmall.entity.UmsMember;
import com.fkx.gmall.entity.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}