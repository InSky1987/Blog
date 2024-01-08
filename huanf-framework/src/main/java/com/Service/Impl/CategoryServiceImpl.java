package com.Service.Impl;

import com.Constants.SystemConstants;
import com.Mapper.CategoryMapper;
import com.Service.ArticleService;
import com.Service.CategoryService;
import com.Utils.BeanCopyUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.ResponseResult;
import com.domain.Vo.CategoryVo;
import com.domain.entity.Article;
import com.domain.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private ArticleService articleService;
    @Override
    public ResponseResult getCategoryList() {
        LambdaQueryWrapper<Article> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Article::getStatus, SystemConstants.ARTICLE_STATUS_NORMAL);
        List<Article> articleList = articleService.list(queryWrapper);
        Set<Long> categoryIds = articleList.stream()
                .map(Article::getCategoryId)
                .collect(Collectors.toSet());
        List<Category> categories = listByIds(categoryIds);
        categories = categories.stream().filter(category -> SystemConstants.STATUS_NORMAL.equals(category.getStatus())).collect(Collectors.toList());
        List<CategoryVo> categoryVos = BeanCopyUtils.copyBeanList(categories, CategoryVo.class);
        return ResponseResult.okResult(categoryVos);
    }
}
