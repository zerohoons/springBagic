package com.ict.service;

import java.util.List;

import com.ict.vo.VO;

//service -> serviceImpl
//service = DAO + 가공처리, 트랜잭션처리

public interface MyService {
	//해야할 것들을 미리 만들어 놓는다. (리스트, 삽입, 상세보기, 수정, 삭제)
	List<VO> getList() throws Exception;
	
	int getInsert(VO vo) throws Exception;
	
	VO getOneList(String idx) throws Exception;
	
	int getUpdate(VO vo) throws Exception;
	
	int getdelete(String idx) throws Exception;
	
}
