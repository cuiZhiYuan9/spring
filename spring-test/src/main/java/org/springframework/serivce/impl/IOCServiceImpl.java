package org.springframework.serivce.impl;

import org.springframework.serivce.IOCService;
import org.springframework.stereotype.Service;

@Service
public class IOCServiceImpl implements IOCService {
	@Override
	public String hello() {
		return "hello";
	}
}
