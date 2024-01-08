package com.Service.Impl;

import com.Constants.SystemConstants;
import com.Mapper.LinkMapper;
import com.Service.LinkService;
import com.Utils.BeanCopyUtils;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.domain.ResponseResult;
import com.domain.entity.Link;
import com.domain.Vo.LinkVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("linkService")
public class LinkServiceImpl extends ServiceImpl<LinkMapper, Link> implements LinkService {

    @Override
    public ResponseResult getAllLink() {
        LambdaQueryWrapper<Link> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Link::getStatus, SystemConstants.LINK_STATUS_NORMAL);
        List<Link> links = list(queryWrapper);
        List<LinkVo> linkList = BeanCopyUtils.copyBeanList(links, LinkVo.class);
        return ResponseResult.okResult(linkList);
    }
}
