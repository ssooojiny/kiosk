package com.spring.kiosk.service;

import java.util.List;

import com.spring.kiosk.domain.GoodsVO;

public interface AdminService {
	
	public List<GoodsVO> goodList() throws Exception;
	
	public void goodsInsert(GoodsVO vo) throws Exception;
	
	public GoodsVO goodsView(int gdId) throws Exception;
	
	public void goodsUpdate(GoodsVO vo) throws Exception;


}
