package com.ict.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.vo.CVO;
import com.ict.vo.TVO;
import com.ict.vo.VO;

@Repository("myDAOImpl")
public class MyDAOImpl implements MyDAO{
	@Autowired
	private SqlSessionTemplate sqlsessionTemplate;
	@Override
	public void insertCard(VO vo) throws Exception {
		sqlsessionTemplate.insert("tx.cardInsert", vo);
	}
	@Override
	public void insertTicket(VO vo) throws Exception {
		sqlsessionTemplate.insert("tx.ticketInsert", vo);
	}
	@Override
	public void insertCard(CVO cvo) throws Exception {
		sqlsessionTemplate.insert("tx.cardInsert2", cvo);
		
	}
	@Override
	public void insertTicket(TVO tvo) throws Exception {
		sqlsessionTemplate.insert("tx.ticketInsert2", tvo);
	}
}
