package com.ict.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.dao.MyDAO;
import com.ict.vo.VO;

//myserviceImpl -> DAO(interface)
@Service("myServiceImpl")
public class MyServiceImpl implements MyService {
	@Autowired
	private MyDAO myDAO;
	
	@Override
	public List<VO> getList() throws Exception {
		return myDAO.getList();
	}

	@Override
	public int getInsert(VO vo) throws Exception {
		
		return myDAO.getInsert(vo);
	}

	@Override
	public VO getOneList(String idx) throws Exception {
		// TODO Auto-generated method stub
		return myDAO.getOneList(idx);
	}

	@Override
	public int getdelete(String idx) throws Exception {
		// TODO Auto-generated method stub
		return myDAO.getdelete(idx);
	}

	@Override
	public int getUpdate(VO vo) throws Exception {
		// TODO Auto-generated method stub
		return myDAO.getUpdate(vo);
	}
}
