package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.FirstMapper;
import com.model.First;

@Service("firstService")
public class FirstServiceImpI implements FirstServiceI {

	private FirstMapper firstMapper;

	public FirstMapper getFirstMapper() {
		return firstMapper;
	}

	@Autowired
	public void setFirstMapper(FirstMapper firstMapper) {
		this.firstMapper = firstMapper;
	}


	@Override
	public First getFirstById(Integer id) {
		return firstMapper.selectByPrimaryKey(1);
	}

}
