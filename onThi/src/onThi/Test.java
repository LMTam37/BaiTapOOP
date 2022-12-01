package onThi;

import java.time.LocalDate;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Experience("1523", "Nguyễn", "Văn A", LocalDate.of(1996, 6, 7), "0987724154", 5);
		Employee e2 = new Experience("1524", "Trần", "Văn B", LocalDate.of(1998, 9, 12), "0886214357", 7);
		Employee e3 = new Experience("1525", "Nguyễn", "Văn C", LocalDate.of(1999, 12, 15), "0956436742", 2);
		Employee e4 = new Fresher("1526", "Nguyễn", "Lương", LocalDate.of(1999, 2, 3), "0123523742", 2022, "A");
		Employee e5 = new Fresher("1527", "Phạm", "Minh Đăng", LocalDate.of(2001, 3, 19), "0916432785", 2022, "C");
		Employee e6 = new Fresher("1528", "Trần", "Ngọc Phú", LocalDate.of(2000, 5, 25), "0953126465", 2020, "B");
		Employee e7 = new Intern("1529", "Nguyễn", "Bảo Ngọc", LocalDate.of(1980, 1, 29), "0575368690", "KTPM", 7);
		Management list = new Management();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		System.out.println(list);
		System.out.println("số nhân viên tốt nghiệp trong năm nay:");
		System.out.println(list.getNumGradEmpThisYear());
		System.out.println("danh sách sau khi sửa ngày sinh:");
		list.setBirthById("1529", LocalDate.of(2002, 1, 29));
		System.out.println(list);
		System.out.println("danh sách nhân viên có kinh nghiệm hơn 5 năm: ");
		System.out.println(list.getListEmp5Exp());
		System.out.println("danh sách sau khi sắp xếp:");
		list.sortAscByName();
		System.out.println(list);
	}
}