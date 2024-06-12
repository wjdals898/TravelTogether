package com.shinhan.travelTogether.funding;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("fundingDAO")
public class FundingDAO {

	@Autowired
	SqlSession sqlSession;
	
	Logger logger = LoggerFactory.getLogger(FundingDAO.class);
	
	public List<FundingDTO> selectAll() {
		System.out.println("========");
		
		return sqlSession.selectList("com.shinhan.travelTogether.funding.selectAll");
	}
	


}
