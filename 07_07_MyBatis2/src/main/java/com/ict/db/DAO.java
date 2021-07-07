package com.ict.db;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class DAO {
	private SqlSessionTemplate sqlsessionTemplate;
	
	public void setSqlSessionTemplate(SqlSessionTemplate sqlsessionTemplate) {
		this.sqlsessionTemplate = sqlsessionTemplate; 
	}
	
	public List<VO> getList() {
		List<VO> list = new ArrayList<VO>();
		list = sqlsessionTemplate.selectList("list");
		
		return list;	
	}
	
	public int getInsert(VO vo) {
		int result = 0;
		result = sqlsessionTemplate.insert("insert",vo);
		return result;
	}
	
	public VO getSelectOne(String idx) {
		VO vo = null;
		vo = sqlsessionTemplate.selectOne("onelist", idx);
		return vo;
	}
	
	public int getDelete(String idx) {
		int result = 0;
		result = sqlsessionTemplate.delete("delete", idx);
		return result;
	}
	
	public int getUpdate(VO vo) {
		int result = 0;
		result = sqlsessionTemplate.update("update",vo);
		return result;
	}
}
