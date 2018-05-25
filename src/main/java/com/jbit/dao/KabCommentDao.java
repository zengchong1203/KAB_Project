package com.jbit.dao;

import com.jbit.entity.KabComment;

public interface KabCommentDao {
    KabComment selectByPrimaryKey(Integer id);
}