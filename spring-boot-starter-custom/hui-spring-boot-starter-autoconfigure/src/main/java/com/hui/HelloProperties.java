package com.hui;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author huang jiehui
 * @date 2021/1/20 23:07
 */
@ConfigurationProperties(prefix = "hui.hello")
public class HelloProperties {
	private String prefix;
	private String suffix;

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
}
