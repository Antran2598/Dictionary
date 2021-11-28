/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudien;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN 
 * 
 * 
 */
public class Wordmanagement extends Word {

    List<Word> list = new ArrayList<Word>();
    public String thongbao = null;

    public void AddWord(String tv, String ta, String vd) {
        list.add(new Word(ta, tv, vd));
    }
//Đọc dữ liệu từ file tudien.txt vào list

    public void ReadData() {
        String ta;
        String tv;
        String vd;
        try {
            BufferedReader br = new BufferedReader(new FileReader("tudien.txt"));
            while (br != null) {
                String line = br.readLine();
                String[] value = line.split(";");
                ta = value[0];
                tv = value[1];
                vd = value[2];
                list.add(new Word(ta, tv, vd));
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

//Lưu dữ liệu từ list vào file text tudien.txt
    public void WriteData() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("tudien.txt"));
            for (Word x : list) {
                writer.write(x.getTa() + ";" + x.getTv() + ";" + x.getVd());
                writer.newLine(); //Xuống hàng mới
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void TratuVietsangAnh() {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu tieng viet:");
        String a = sc.nextLine();
        for (Word w : list) {
            if (w.getTv().contains(a)) {
                System.out.printf("Tu tieng anh : " + w.getTa() + "\nVi du :" + w.getVd() + "\n");
            }           
        }      
    }

    public void TratuAnhsangViet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tu tieng anh");
        String x = sc.nextLine();
        for (Word w : list) {
            if (w.getTa().contains(x)) {
                System.out.printf("Nghia tieng viet :" + w.getTv() + "\nVi du : " + w.getVd() + "\n");
            }
        }      
    }
    

    public void Themtu() {
        Scanner sc = new Scanner(System.in);
        String tt;
        do {
            System.out.println("Nhập từ tiếng việt");
            String tv = sc.nextLine();
            System.out.println("Nhập từ tiếng Anh");
            String ta = sc.nextLine();
            System.out.println("Nhập ví dụ");
            String vd = sc.nextLine();
            list.add(new Word(ta, tv, vd));
            WriteData();
            System.out.println("Nhan Y|y de nhap them tu");
            tt = sc.nextLine();
        } while (tt.equals("y") || tt.equals("y"));
    }

    public String Xoatu() {
        Scanner sc = new Scanner(System.in);
        thongbao = null;
        System.out.println("Nhap tu muốn xóa");
        String x = sc.nextLine();
        for (Word w : list) {
            if (w.getTa().contains(x) || w.getTv().contains(x)) {
                list.remove(w);
                WriteData();
                return thongbao = "Đa xóa!!!";
            }
        }
        return thongbao = "Khong co tu de xoa!!!";
    }

public String Chinhsua(){
    Scanner sc = new Scanner(System.in);
    thongbao = null;
    System.out.println("Nhap tu muon sua");
    String x = sc.nextLine();
    for(Word w : list){
        if(w.getTa().contains(x)||w.getTv().contains(x)){
            list.remove(w);
            Themtu();
            return thongbao = "Đã chỉnh sửa từ";
        }
    }
    return thongbao = "k co tu de chinh sua";
}
//In danh sách từ ra màn hình
    public void PrintWord() {
        for (Word x : list) {
            System.out.printf("%20s%20s%20s\n", x.getTa(), x.getTv(), x.getVd());
        }
    }
}