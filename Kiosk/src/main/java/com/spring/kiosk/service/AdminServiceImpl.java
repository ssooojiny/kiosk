package com.spring.kiosk.service;

import java.util.List;
import javax.inject.Inject;
import org.springframework.stereotype.Service;
import com.spring.kiosk.domain.GoodsVO;
import com.spring.kiosk.persistence.AdminDAO;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Inject
	AdminDAO dao;

	// 상품 목록 불러오기
	@Override
	public List<GoodsVO> goodList() throws Exception {
		return dao.goodList();
	}

	// 상품 등록하기
	@Override
	public void goodsInsert(GoodsVO vo) throws Exception {
		dao.goodsInsert(vo);
	}
	
	// 상품 조회
	@Override
	public GoodsVO goodsView(int gdId) throws Exception {
		return dao.goodsView(gdId);
	}


	// 상품 수정
	@Override
	public void goodsUpdate(GoodsVO vo) throws Exception {
		dao.goodsUpdate(vo);
	}


}
