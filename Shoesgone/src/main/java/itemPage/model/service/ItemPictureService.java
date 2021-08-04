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
}
