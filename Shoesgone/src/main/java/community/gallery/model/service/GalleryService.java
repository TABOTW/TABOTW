package community.gallery.model.service;

import static common.JDBCTemp.*;

import java.sql.Connection;
import java.util.ArrayList;

import community.gallery.model.dao.GalleryDao;
import community.gallery.model.vo.Gallery;

public class GalleryService {
	private GalleryDao bdao = new GalleryDao();
	
	public ArrayList<Gallery> selectTop3(){
		Connection conn = getConnection();
		ArrayList<Gallery> list = bdao.selectTop3(conn);
		close(conn);
		return list;
	}
	public Gallery selectGallery(int GalleryNum) {
		Connection conn = getConnection();
		Gallery Gallery = bdao.selectGallery(conn, GalleryNum);
		close(conn);
		return Gallery;
	}
	
	public void addReadCount(int GalleryNum) {
		Connection conn = getConnection();
		int result = bdao.updateReadCount(conn, GalleryNum);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
	}

	public int getListCount() {
		Connection conn = getConnection();
		int listCount = bdao.getListCount(conn);
		close(conn);
		return listCount;
	}

	public ArrayList<Gallery> selectList(int startRow, int endRow) {
		Connection conn = getConnection();
		ArrayList<Gallery> list = bdao.selectList(conn, startRow, endRow);
		close(conn);
		return list;
	}

	public int insertOriginGallery(Gallery Gallery) {
		Connection conn = getConnection();
		int result = bdao.insertOriginGallery(conn, Gallery);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int updateOrigin(Gallery Gallery) {
		Connection conn = getConnection();
		int result = bdao.updateOrigin(conn, Gallery);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
	
	public int updateReply(Gallery Gallery) {
		Connection conn = getConnection();
		int result = bdao.updateReply(conn, Gallery);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public void updateReplySeq(Gallery reply) {
		Connection conn = getConnection();
		int result = bdao.updateReplySeq(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);		
	}

	public int insertReplyGallery(Gallery reply) {
		Connection conn = getConnection();
		int result = bdao.insertReplyGallery(conn, reply);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public int deleteGallery(int GalleryNum, int GalleryLevel) {
		Connection conn = getConnection();
		int result = bdao.deleteGallery(conn, GalleryNum, GalleryLevel);
		if(result > 0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}
}
