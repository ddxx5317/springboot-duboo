package com.happy.springboot.dubbo.contract.service;

import org.springframework.stereotype.Component;

@Component
public class IHelloWorldDubboServiceMock implements IHelloWorldDubboService{

	@Override
	public String sayHello() {
		return "服务暂时不可用，请稍后再试！！！";
	}

}
