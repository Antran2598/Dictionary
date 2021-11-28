/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Menu {
    public Menu(){
int choice;
Wordmanagement w = new Wordmanagement();
w.ReadData(); //gọi phương thức đọc dữ liệu từ file text vào list
do{
System.out.printf("======MENU=======\n");
System.out.printf("1/In từ điển\n");
System.out.printf("2/tra cứu từ Anh sang Việt\n");
System.out.printf("3/Tra cứu từ Việt sang Anh\n");
System.out.printf("4/Thêm từ\n");
System.out.printf("5/Xóa từ\n");
System.out.printf("6/Sửa từ\n");
System.out.printf("7/Lưu vào file\n");
System.out.printf("8/Thoát\n");
System.out.printf("------------------\n");
System.out.printf("Chọn chức năng thực hiện:");
Scanner sc = new Scanner(System.in);
choice = sc.nextInt();
switch (choice){
case 1: w.PrintWord(); break;
case 2: w.TratuAnhsangViet();break; 
case 3: w.TratuVietsangAnh();break; 
case 4: w.Themtu();break; 
case 5: w.Xoatu();
        System.out.println(w.thongbao);   
        break;
case 6: w.Chinhsua();
        System.out.println(w.thongbao);
        break;
case 7: w.WriteData();
default: System.out.println("Chọn sai chức năng\n");
}
}
while (choice !=8);
}
}
