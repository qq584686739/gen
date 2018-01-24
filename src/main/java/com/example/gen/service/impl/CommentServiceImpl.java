package com.example.gen.service.impl;

import com.example.gen.annotation.BaseService;
import com.example.gen.base.impl.BaseServiceImpl;
import com.example.gen.service.CommentService;
import com.example.gen.mapper.CommentMapper;
import com.example.gen.entity.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* CommentService实现
* Created by XJH on 2018/1/24.
*/
@Service
@Transactional
@BaseService
public class CommentServiceImpl extends BaseServiceImpl<CommentMapper, Comment> implements CommentService {

    private final CommentMapper commentMapper;

    @Autowired
    public CommentServiceImpl(CommentMapper commentMapper) {
        this.commentMapper = commentMapper;
    }

}