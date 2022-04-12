package com.yu.h2.mapper;

import com.yu.h2.pojo.CountryPo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @author yuhangbin
 * @date 2022/4/12
 **/
@SpringBootTest
public class CountryMapperTest {

	@Resource
	CountryMapper countryMapper;

	@Test
	void testGetCountryById() {
		CountryPo countryPo = countryMapper.getCountryById(1);
		Assertions.assertEquals(1, countryPo.getId());
	}
}
