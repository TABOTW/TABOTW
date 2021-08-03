package itemPage.model.service;

import static common.JDBCTemp.close;
import static common.JDBCTemp.getConnection;

import java.sql.Connection;
import java.util.ArrayList;

import itemPage.model.dao.PictureDao;
import itemPage.model.vo.Picture;

public class PictureService {
	private PictureDao pdao = new PictureDao();

	public ArrayList<Picture> selectRegList() {
		Connection conn = getConnection();
		ArrayList<Picture> list = pdao.selectRegList(conn);
		close(conn);
		return list;
	}

	public ArrayList<Picture> selectHotList() {
		Connection conn = getConnection();
		ArrayList<Picture> list = pdao.selectHotList(conn);
		close(conn);
		return list;
	}

	public ArrayList<Picture> selectRecList() {
		Connection conn = getConnection();
		ArrayList<Picture> list = pdao.selectRecList(conn);
		close(conn);
		return list;
	}
}
