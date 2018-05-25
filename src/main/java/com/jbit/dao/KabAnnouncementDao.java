package com.jbit.dao;

import com.jbit.entity.KabAnnouncement;

public interface KabAnnouncementDao {
    KabAnnouncement selectByPrimaryKey(Integer id);
}