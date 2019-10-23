package com.fkx.gmall.user.mapper;

import com.fkx.gmall.user.entity.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
