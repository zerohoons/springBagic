package com.ict.service;

import com.ict.vo.CVO;
import com.ict.vo.TVO;
import com.ict.vo.VO;

public interface MyService {
	//MyDAO의 insertCar와 insertTicket을 같이 처리하자.
	//여러개의 일처리를 묶어서 하나로 처리하는 것을 트랜잭션이라고 한다.
	int InsertCT(VO vo) throws Exception;

	int InsertCT2(CVO cvo, TVO tvo) throws Exception;
}
