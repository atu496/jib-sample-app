package com.atu496.jib.domain.service.impl;

import org.springframework.stereotype.Service;

import com.atu496.jib.domain.service.SampleService;
@Service
public class SampleServiceImpl implements SampleService {

	@Override
	public String get() {
		return "test";
	}

}
