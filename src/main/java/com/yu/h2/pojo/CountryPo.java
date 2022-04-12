package com.yu.h2.pojo;


/**
 * @author yuhangbin
 * @date 2022/4/12
 **/
public class CountryPo {
	private Integer id;
	private String name;

	public CountryPo(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
