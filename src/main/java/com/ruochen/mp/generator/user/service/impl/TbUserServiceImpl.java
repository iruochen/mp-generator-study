package com.ruochen.mp.generator.user.service.impl;

import com.ruochen.mp.generator.user.entity.TbUser;
import com.ruochen.mp.generator.user.mapper.TbUserMapper;
import com.ruochen.mp.generator.user.service.ITbUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ruochen
 * @since 2022-03-16
 */
@Service
public class TbUserServiceImpl extends ServiceImpl<TbUserMapper, TbUser> implements ITbUserService {

}
