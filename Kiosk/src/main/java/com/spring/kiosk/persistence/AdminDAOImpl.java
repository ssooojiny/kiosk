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

	// ��ǰ ��� �ҷ�����
	@Override
	public List<GoodsVO> goodList() throws Exception {
		return sql.selectList(namespace+".goodsList");
	}

	// ��ǰ ����ϱ�
	@Override
	public void goodsInsert(GoodsVO vo) throws Exception {
		sql.insert(namespace+".goodsInsert", vo);
	}
	
	// ��ǰ ��ȸ
	@Override
	public GoodsVO goodsView(int gdId) throws Exception {
		return sql.selectOne(namespace+".goodsView",gdId);
	}

	// ��ǰ ����
	@Override
	public void goodsUpdate(GoodsVO vo) throws Exception {
		sql.update(namespace+"goodsUpdate", vo);
		
	}



}
