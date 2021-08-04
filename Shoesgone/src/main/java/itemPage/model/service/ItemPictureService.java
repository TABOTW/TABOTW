package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import itemPage.model.dao.ItemPictureDao;
import itemPage.model.vo.ItemPicture;

public class ItemPictureService {
	private ItemPictureDao ipdao = new ItemPictureDao();

	// ItemPictureDao의 selectLookupList() 값을 받아서 전달하는 메소드
	public ArrayList<ItemPicture> selectLookupList() {
		Connection conn = getConnection();
		ArrayList<ItemPicture> list = ipdao.selectLookupList(conn);
		close(conn);
		return list;
	}

	public ArrayList<ItemPicture> selectHotList() {
		Connection conn = getConnection();
		ArrayList<ItemPicture> list = ipdao.selectHotList(conn);
		close(conn);
		return list;
	}

	public ArrayList<ItemPicture> selectPremiumList() {
		Connection conn = getConnection();
		ArrayList<ItemPicture> list = ipdao.selectPremiumList(conn);
		close(conn);
		return list;
	}

	public ArrayList<ItemPicture> selectBuyList() {
		Connection conn = getConnection();
		ArrayList<ItemPicture> list = ipdao.selectBuyList(conn);
		close(conn);
		return list;
	}

	public ArrayList<ItemPicture> selectSellList() {
		Connection conn = getConnection();
		ArrayList<ItemPicture> list = ipdao.selectSellList(conn);
		close(conn);
		return list;
	}

	public ArrayList<ItemPicture> selectDropList() {
		Connection conn = getConnection();
		ArrayList<ItemPicture> list = ipdao.selectDropList(conn);
		close(conn);
		return list;
	}
}
