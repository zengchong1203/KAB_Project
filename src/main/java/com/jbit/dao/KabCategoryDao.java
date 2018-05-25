package com.jbit.dao;

import com.jbit.entity.KabCategory;

public interface KabCategoryDao {
    KabCategory selectByPrimaryKey(Integer catid);
}