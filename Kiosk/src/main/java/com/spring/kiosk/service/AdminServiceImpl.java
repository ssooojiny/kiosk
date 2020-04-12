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

	// ��ǰ ��� �ҷ�����
	@Override
	public List<GoodsVO> goodList() throws Exception {
		return dao.goodList();
	}

	// ��ǰ ����ϱ�
	@Override
	public void goodsInsert(GoodsVO vo) throws Exception {
		dao.goodsInsert(vo);
	}
	
	// ��ǰ ��ȸ
	@Override
	public GoodsVO goodsView(int gdId) throws Exception {
		return dao.goodsView(gdId);
	}


	// ��ǰ ����
	@Override
	public void goodsUpdate(GoodsVO vo) throws Exception {
		dao.goodsUpdate(vo);
	}


}
