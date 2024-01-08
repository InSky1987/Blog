package com.domain.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//封装仅前端页面所需的数据，避免传递大量不必要数据
public class HotArticleVo {
    private Long id;
    private String title;
    private Long viewCount;
}
