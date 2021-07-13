package com.ict.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.MyDAO;
import com.ict.vo.CVO;
import com.ict.vo.TVO;
import com.ict.vo.VO;

@Service("myServiceImpl")
public class MyServiceImpl implements MyService {

	@Autowired
	private MyDAO myDAO;

	@Override
	public int InsertCT(VO vo) throws Exception {
		//트랜잭션 : 여러가지 작업을 하나의 묶음으로 처리한다.
		//트랜잭션 단위가 모두 다 성공해야지만 성공이다.
		//오류가 발생하는 경우, 전부 롤백을 해야한다.

		myDAO.insertCard(vo);
		myDAO.insertTicket(vo);
		
		//성공하면 1이 넘어가게 되고, 실패하면 Exceotion을 통해 생략되어 0이 넘어간다.
		return 1;
	}
	
	@Override
	public int InsertCT2(CVO cvo, TVO tvo) throws Exception {
		myDAO.insertCard(cvo);
		myDAO.insertTicket(tvo);
		return 1;
	}
}
