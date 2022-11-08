package bai13;

public class Test {
	public static void main(String[] args) {
		DanhSachCongNhan list = new DanhSachCongNhan(5);
		list.themCN(new CongNhan("Nguyễn Văn", "A", 100));
		list.themCN(new CongNhan("Trần Văn", "B", 20));
		list.themCN(new CongNhan("Lê Văn", "C", 50));
		list.themCN(new CongNhan("Nguyễn Thị", "D", 650));
		list.themCN(new CongNhan("Phạm Văn", "E", 200));
		System.out.println(DanhSachCongNhan.getTitle());
		System.out.println(list);
		System.out.println("số lương công nhân: " + list.getSoLuongCN());
		System.out.println("\ndanh sách công nhân làm hơn 200 sản phẩm");
		list.dsCNHon200();
		list.sortCN();
		System.out.println("\ndanh sách công nhân sau khi sắp xếp");
		System.out.println(list);
	}

}
