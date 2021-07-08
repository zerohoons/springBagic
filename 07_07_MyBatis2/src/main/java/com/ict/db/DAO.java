package com.ict.db;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

public class DAO {
	private SqlSessionTemplate sqlsessionTemplate;
	
	public void setSqlSessionTemplate(SqlSessionTemplate sqlsessionTemplate) {
		this.sqlsessionTemplate = sqlsessionTemplate; 
	}
	// list
		public List<VO> getSelectList(){
			List<VO> list  = null;
			list = sqlsessionTemplate.selectList("list");
			return list;
		}
		
		// insert
		public int getInsert(VO vo) {
			int result = 0 ;
			result = sqlsessionTemplate.insert("insert", vo);
			return result;
		}
		
		// onelist
		public VO getSelectOne(String idx) {
			VO vo = null;
			vo = sqlsessionTemplate.selectOne("onelist", idx);
			return vo;
		}
		
		// delete
		public int getDelete(String idx) {
			int result = 0 ;
			result = sqlsessionTemplate.delete("delete", idx);
			return result;
		}
		
		// update
		public int getUpdate(VO vo) {
			int result = 0 ;
			result = sqlsessionTemplate.update("update", vo);
			return result;
		}
		
}
