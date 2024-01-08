package com.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.domain.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;


public interface ArticleMapper extends BaseMapper<Article> {

}
