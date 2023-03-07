package SuDungToanTu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        float with; // khai báo biến chieuf rộng
        float height; // khai báo biến chiều cao
        Scanner scanner = new Scanner(System.in); //khai báo đối tượng Scanner để thực hiện chức năng nhập liệu trong JAVA CORE
        System.out.println("Enter With: ");
        with = scanner.nextFloat(); // nhập chiểu dài
        System.out.println("Enter height: ");
        height = scanner.nextFloat(); // nhập chiều cao
        float area = with*height; // khai báo biến area đồng thời tính diện tích
        System.out.println("Area is :" +area); // in ra kết quả diện tích của hình
    }
}
