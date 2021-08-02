package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import itemPage.model.dao.PictureDao;
import itemPage.model.vo.Picture;

public class PictureService {
	private PictureDao pdao = new PictureDao();

	public ArrayList<Picture> selectList() {
		Connection conn = getConnection();
		ArrayList<Picture> list = pdao.selectList(conn);
		close(conn);
		return list;
	}
}
