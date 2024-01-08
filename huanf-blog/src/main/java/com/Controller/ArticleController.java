package com.Controller;

import com.Service.ArticleService;
import com.domain.ResponseResult;
import com.domain.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @GetMapping("/hotArticleList")
    public ResponseResult findHotArticleList(){
        return articleService.hotArticleList();
    }

    @GetMapping("/articleList")
    public ResponseResult articleList(Integer pageNum,Integer pageSize,Long categoryId){
        return articleService.articleList(pageNum,pageSize,categoryId);
    }
    @GetMapping("/{id}")
//    @PathVariable("id")获取路径形式的参数
    public ResponseResult getArticleDetail(@PathVariable("id") Long id){
        return articleService.getArticleDetail(id);
    }
}
