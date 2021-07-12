package com.ict.dao;

import java.util.List;

import com.ict.vo.VO;

public interface MyDAO {

	List<VO> getList() throws Exception;
	
	int getInsert(VO vo)throws Exception;
	
	VO getOnelist(String idx) throws Exception;

	int getDelete(String idx) throws Exception;

	int getUpdate(VO vo) throws Exception;
}
