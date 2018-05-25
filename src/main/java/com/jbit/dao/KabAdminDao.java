package com.jbit.dao;

import com.jbit.entity.KabAdmin;

public interface KabAdminDao {
    KabAdmin selectByPrimaryKey(Integer id);
}