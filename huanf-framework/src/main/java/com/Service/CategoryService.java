package com.Service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.ResponseResult;
import com.domain.entity.Category;

public interface CategoryService extends IService<Category> {
    ResponseResult getCategoryList();

}
