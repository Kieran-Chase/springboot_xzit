package com.xzit.mybatisX.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xzit.mybatisX.entity.Team;
import com.xzit.mybatisX.service.TeamService;
import com.xzit.mybatisX.mapper.TeamMapper;
import org.springframework.stereotype.Service;

/**
* @author bulang
* @description 针对表【team】的数据库操作Service实现
* @createDate 2025-11-21 15:59:32
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService{

}




