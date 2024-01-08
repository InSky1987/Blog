package com.Service;

import com.Mapper.ArticleMapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.domain.ResponseResult;
import com.domain.entity.Article;

public interface ArticleService extends IService<Article> {

    ResponseResult<Article> hotArticleList();

    ResponseResult articleList(Integer pageNum, Integer pageSize, Long categoryId);

    ResponseResult getArticleDetail(Long id);
}
