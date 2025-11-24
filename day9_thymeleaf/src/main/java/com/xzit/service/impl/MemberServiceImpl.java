package com.xzit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.entity.Member;
import com.xzit.service.MemberService;
import com.xzit.mapper.MemberMapper;
import org.springframework.stereotype.Service;

/**
* @author bulang
* @description 针对表【member】的数据库操作Service实现
* @createDate 2025-11-24 15:50:07
*/
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member>
    implements MemberService{

}




