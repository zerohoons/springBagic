package com.ict.db;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;

public class DAO {
	private SqlSessionTemplate sqlSessionTemplate;

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	
	
	// list
	public List<VO> getDynamic(String search, String keyword){
		List<VO> list  = null;
		
//		mapper에서 하나 이상의 값을 파라미터로 넣어주기 위해서 map을 이용.
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("search", search);
		map.put("keyword", keyword);
		
		list = sqlSessionTemplate.selectList("list",map);
		
		return list;
	}

	
}
