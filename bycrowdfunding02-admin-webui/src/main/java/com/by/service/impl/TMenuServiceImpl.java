package com.by.service.impl;

import com.by.model.TMenu;
import com.by.mapper.TMenuDao;
import com.by.service.TMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yc
 * @since 2020-07-28
 */
@Service
public class TMenuServiceImpl extends ServiceImpl<TMenuDao, TMenu> implements TMenuService {

    @Autowired
    private TMenuDao tMenuDao;

}
