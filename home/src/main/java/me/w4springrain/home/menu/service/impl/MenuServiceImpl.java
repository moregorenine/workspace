package me.w4springrain.home.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.w4springrain.home.common.domain.CommonSequenceVO;
import me.w4springrain.home.common.service.CommonSequenceService;
import me.w4springrain.home.common.util.CommonUtil;
import me.w4springrain.home.menu.damain.Menu;
import me.w4springrain.home.menu.damain.ZTree;
import me.w4springrain.home.menu.damain.ZTreeWrapper;
import me.w4springrain.home.menu.dao.MenuDao;
import me.w4springrain.home.menu.service.MenuService;

@Service("menuService")
public class MenuServiceImpl implements MenuService {

	private static final Logger logger = LoggerFactory.getLogger(MenuServiceImpl.class);
	
	@Resource
	MenuDao menuDao;
	
	@Autowired
	CommonSequenceService commonSequenceService;
	
	@Override
	public int createMenu(Menu menu) {
		return menuDao.createMenu(menu);
		
	}
	
	/**
	 * 같은 그룹내 게시물의 순서
	 */
	private int seq = 0;
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	@Override
	@Transactional(rollbackFor=Exception.class)
	public void createMenu(ZTreeWrapper zTreeWrapper) {
		logger.debug("###메뉴생성 all delete###");
		this.deleteMenu();
		logger.debug("###메뉴생성 시퀀스 초기화###");
		CommonSequenceVO commonSequenceVO = new CommonSequenceVO();
		commonSequenceVO.setSeqNm("W4_MENU_SEQ");
		commonSequenceVO.setSeqCurrval(0);
		commonSequenceService.restartSeq(commonSequenceVO);
		logger.debug("###메뉴생성 재귀함수 호출###");
//		seq : 같은 그룹내 게시물의 순서
//		그룹 시작시 초기화
		for(ZTree zTree : zTreeWrapper.getzTrees()) {
			this.setSeq(0);
			this.createMenuLoop(zTree);
		}
	}

	/**
	 * 메뉴생성 재귀함수
	 * zTree의 메뉴를 생성하고 자식 메뉴들이 존재할 경우 재귀호출한다.
	 * 재귀호출의 종료는 더 이상 자식이 존재하지 않을때까지
	 * @param zTree
	 */
	private void createMenuLoop(ZTree zTree) {
		
		if(!zTree.gettId().isEmpty()) {
			logger.debug("###메뉴생성 재귀함수 실행###");
			logger.debug("1.메뉴 생성 : "+zTree.getName());

//			create할 메뉴 객체 생성
			Menu createMenu = new Menu();
//			메뉴ID : 글번호(Primary Key)
			String menuId = CommonUtil.generateUUID();
//			메뉴명 : 글제목
			String menuNm = zTree.getName();
//			grp : 같은 주제를 갖는 게시물의 고유번호. 부모글과 부모글로부터 파생된 모든 자식글은 같은 번호를 갖는다.
			int grp = 0;
//			seq : 같은 그룹내 게시물의 순서
//			lvl : 같은 그룹내 계층
			int level = zTree.getLevel();
//			부모 menuId
			String parent = null;
			
			logger.debug("	1-1.최상위 메뉴 체크");
			if(zTree.getLevel()==0) {
				logger.debug("	1-1-Y.grp값 nextval sequence 가져오기");
				//grp = this.selectNextvalSeq("W4_MENU_SEQ");
				CommonSequenceVO commonSequenceVO = new CommonSequenceVO();
				commonSequenceVO.setSeqNm("W4_MENU_SEQ");
				grp = commonSequenceService.selectNextvalSeq(commonSequenceVO);
				logger.debug("	1-1-Y.parent값 null : default");
			} else {
				logger.debug("	1-1-N.grp값 부모와 동일한 grp값 : from 부모에서 set해준다.");
//				부모가 set해준 값 그대로 가져다 사용
				grp = zTree.getGrp();
				logger.debug("	1-1-N.parent값 부모의 menuId : from 부모에서 set해준다.");
//				부모가 set해준 값 그대로 가져다 사용
				parent = zTree.getpId();
			}
			
//			화면에서 받은 zTree 정보를 메뉴 테이블 객체 Menu.java로 setting 한다.
			createMenu.setMenuId(menuId);
			createMenu.setMenuNm(menuNm);
			createMenu.setGrp(grp);
			this.setSeq(this.getSeq()+1);
			createMenu.setSeq(this.getSeq());
			createMenu.setLevel(level);
			createMenu.setParent(parent);
			
			logger.debug("menu 테이블 생성 : " + createMenu);
			this.createMenu(createMenu);
			
//			TODO
//			메뉴에 연결할 url
//			String url;
//			메뉴 사용여부
//			String useYn;
//			String regUser;
//			Date regDt;
//			String uptUser;
//			Date uptDt;
			
			logger.debug("2.메뉴의 자식 존재 여부 체크");
			logger.debug("	2-Y.자식 메뉴생성 재귀함수 호출");
			if(zTree.getChildren()!=null) {
				for(ZTree childZTree : zTree.getChildren()) {
					logger.debug("	1-1-N.grp값 부모와 동일한 grp값 : from 부모에서 set해준다.");
					childZTree.setGrp(grp);
					logger.debug("	1-1-N.parent값 부모의 menuId : from 부모에서 set해준다.");
					childZTree.setpId(menuId);
					this.createMenuLoop(childZTree);
				}
			}
			logger.debug("3.메뉴 생성완료 : "+zTree.getName());
		}
		
	}

	@Override
	public int deleteMenu() {
		return menuDao.deleteMenu();
	}
	
	@Override
	public List<Menu> selectMenus() {
		return menuDao.selectUsers();
	}
	
	@Override
	public List<ZTree> selectMenus2ZTree() {
		return menuDao.selectMenus2ZTree();
	}

}
