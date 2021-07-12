package com.ict.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.vo.VO;

@Repository("myDAOImpl")
public class MyDAOImpl implements MyDAO {
	
	@Autowired SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public List<VO> getList() throws Exception {
		return sqlSessionTemplate.selectList("list");
	}
	
	@Override
	public int getInsert(VO vo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.insert("insert",vo);
	}
	
	@Override
	public VO getOnelist(String idx) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("onelist",idx);
	}

	@Override
	public int getDelete(String idx) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.delete("delete", idx);
	}
	
	@Override
	public int getUpdate(VO vo) throws Exception {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.update("update", vo);
	}
}
