package com.spring.kiosk;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.spring.kiosk.domain.GoodsVO;
import com.spring.kiosk.service.AdminService;

@Controller
@RequestMapping(value="/admin/**")
public class AdminController {
	
	private static final Logger logger = LoggerFactory.getLogger(AdminController.class);
	
	@Inject
	AdminService service;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public void goodsList(Model model) throws Exception {
		logger.info("goodsList �ҷ����� ����");
		List<GoodsVO> goodsList = service.goodList();
		logger.info("goodsList : " + goodsList.toString());
		model.addAttribute("goodsList", goodsList);
	}
	
	// ��ǰ��� GET
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void register() throws Exception {
		logger.info("��ǰ ����ϱ� ������ ����");
		
	}
	
	// ��ǰ ��� POST
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String registerPOST(GoodsVO vo, MultipartFile file) throws Exception{
		service.goodsInsert(vo);
		return "redirect:/admin/list";
	}
	
	// ��ǰ ������ GET
	@RequestMapping(value="/view", method=RequestMethod.GET)
	public void view(@RequestParam("n") int gdId, Model model) throws Exception {
		logger.info("��ǰ ������ ����");
		GoodsVO goods = service.goodsView(gdId);
		model.addAttribute("goods", goods);
	}
	
	// ��ǰ ���� GET
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public void modify() {
		logger.info("��ǰ ���� ������ ����!");
	}
	

}
