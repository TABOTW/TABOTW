package wishlist.model.vo;

public class Wishlist implements java.io.Serializable {
	private static final long serialVersionUID = 26L;
	
	private int wishlistNo;
	private int userNo;
	private int itemNo;
	
	public Wishlist() {}
	
	public Wishlist(int wishlistNo, int userNo, int itemNo) {
		super();
		this.wishlistNo = wishlistNo;
		this.userNo = userNo;
		this.itemNo = itemNo;
	}

	public int getWishlistNo() {
		return wishlistNo;
	}

	public void setWishlistNo(int wishlistNo) {
		this.wishlistNo = wishlistNo;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public int getItemNo() {
		return itemNo;
	}

	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Wishlist [wishlistNo=" + wishlistNo + ", userNo=" + userNo + ", itemNo=" + itemNo + "]";
	}
	
	
	

}