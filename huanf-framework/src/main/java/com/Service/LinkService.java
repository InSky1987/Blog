package com.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.ResponseResult;
import com.domain.entity.Link;

public interface LinkService extends IService<Link> {
    ResponseResult getAllLink();
}

