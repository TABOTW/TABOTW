package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import itemPage.model.dao.ItemDao;
import itemPage.model.vo.Item;

public class ItemService {
	private ItemDao idao = new ItemDao();
	
	public ArrayList<Item> selectRegList() {
		Connection conn = getConnection();
		ArrayList<Item> list = idao.selectRegList(conn);
		close(conn);
		return list;
	}

	public ArrayList<Item> selectHotList() {
		Connection conn = getConnection();
		ArrayList<Item> list = idao.selectHotList(conn);
		close(conn);
		return list;
	}

	public ArrayList<Item> selectRecList() {
		Connection conn = getConnection();
		ArrayList<Item> list = idao.selectRecList(conn);
		close(conn);
		return list;
	}

}
