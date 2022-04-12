package com.yu.h2.mapper;

import com.yu.h2.pojo.CountryPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author yuhangbin
 * @date 2022/4/12
 **/
@Mapper
@Component
public interface CountryMapper {

	@Select("select * from country where id = #{id} ")
	CountryPo getCountryById(Integer id);
}
