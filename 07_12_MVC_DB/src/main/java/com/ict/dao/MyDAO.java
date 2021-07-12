package com.ict.dao;

import java.util.List;

import com.ict.vo.VO;

//mydao -> myDAOImpl

public interface MyDAO {
	List<VO> getList() throws Exception;
	
	int getInsert(VO vo) throws Exception;
	
	VO getOneList(String idx) throws Exception;
	
	int getUpdate(VO vo) throws Exception;
	
	int getdelete(String idx) throws Exception;
	
}
