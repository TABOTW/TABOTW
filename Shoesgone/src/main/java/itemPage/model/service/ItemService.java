package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;

import itemPage.model.dao.ItemDao;
import itemPage.model.vo.Item;

public class ItemService {
	private ItemDao idao = new ItemDao();
	
	public Item selectItem() {
		Connection conn = getConnection();
		Item item = idao.selectItem(conn);
		close(conn);
		return item;
	}

}
