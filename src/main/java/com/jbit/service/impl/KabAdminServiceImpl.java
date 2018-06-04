package com.jbit.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.jbit.dao.KabAdminDao;
import com.jbit.entity.KabAdmin;
import com.jbit.service.KabAdminService;

@Service("kabAdminService")
public class KabAdminServiceImpl implements KabAdminService {

	@SuppressWarnings("unused")
	@Resource
	private KabAdminDao kabAdminDao;
	
	@Override
	public KabAdmin Login(KabAdmin admin) {
		return null;
	}

}
