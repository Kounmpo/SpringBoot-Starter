package com.hui;

/**
 * @author huang jiehui
 * @date 2021/1/20 23:05
 */
public class HelloService {
	HelloProperties helloProperties;
	public HelloProperties getHelloProperties() {
		return helloProperties;
	}

	public void setHelloProperties(HelloProperties helloProperties) {
		this.helloProperties = helloProperties;
	}

	public String sayHello(String name){
		return helloProperties.getPrefix() + name + helloProperties.getSuffix();
	}
}
