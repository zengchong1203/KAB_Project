package com.jbit.dao;

import com.jbit.entity.KabNews;

public interface KabNewsDao {
    KabNews selectByPrimaryKey(Integer id);
}