package com.spring.kiosk.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.spring.kiosk.domain.GoodsVO;

@Repository
public class AdminDAOImpl implements AdminDAO {
	
	@Inject
	private SqlSession sql;
	
	private String namespace = "com.spring.kiosk.mappers.adminMapper";

	// 상품 목록 불러오기
	@Override
	public List<GoodsVO> goodList() throws Exception {
		return sql.selectList(namespace+".goodsList");
	}

	// 상품 등록하기
	@Override
	public void goodsInsert(GoodsVO vo) throws Exception {
		sql.insert(namespace+".goodsInsert", vo);
	}
	
	// 상품 조회
	@Override
	public GoodsVO goodsView(int gdId) throws Exception {
		return sql.selectOne(namespace+".goodsView",gdId);
	}

	// 상품 수정
	@Override
	public void goodsUpdate(GoodsVO vo) throws Exception {
		sql.update(namespace+"goodsUpdate", vo);
		
	}



}
