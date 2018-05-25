package com.jbit.dao;

import com.jbit.entity.KabMember;

public interface KabMemberDao {
    KabMember selectByPrimaryKey(Integer mid);
}