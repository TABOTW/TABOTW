package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import itemPage.model.dao.ItemDao;
import itemPage.model.vo.Item;

public class ItemService {
	private ItemDao idao = new ItemDao();
	
	public ArrayList<Item> selectList() {
		Connection conn = getConnection();
		ArrayList<Item> list = idao.selectList(conn);
		close(conn);
		return list;
	}

}
