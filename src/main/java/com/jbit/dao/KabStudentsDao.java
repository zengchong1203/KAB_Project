package com.jbit.dao;

import com.jbit.entity.KabStudents;

public interface KabStudentsDao {
    KabStudents selectByPrimaryKey(Integer sid);
}