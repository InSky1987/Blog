package com.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Long id;
    private String type;
    private Long article_id;
    private Long root_id;
    private String content;
    private Long to_comment_user_id;
    private Long to_comment_id;
    private Long create_by;
    private Date create_time;
    private Long update_by;
    private Date update_time;
    private Integer del_flag;
}
