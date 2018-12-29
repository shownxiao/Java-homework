package Unite17;

import java.sql.*;
import java.util.Scanner;

public class Java_2 {
    private int a;
    private String name;
    private String tel;
    private static Connection con;

    public static void main(String args[]) {
        String url = "jdbc:mysql://localhost:3306/studentdata?serverTimezone=UTC";

        try {
            con = DriverManager.getConnection(url, "root", "19990827");
            new Java_2().choose();
        }catch(SQLException e) {}
    }

    private void insertName(Scanner scan){
        try{
            PreparedStatement ps = con.prepareStatement("insert into student_tel values(?,?)");
            System.out.print("请输入你想插入的名字: ");

            if(scan.hasNextLine()) {
                name = scan.nextLine();
            }

            System.out.print("请输入你想插入的电话号码: ");

            if(scan.hasNextLine()) {
                tel = scan.nextLine();
            }

            ps.setString(1, name);
            ps.setString(2, tel);
            ps.executeUpdate();
            System.out.println("插入成功！");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private void deleteName(Scanner scan){
        try{
            System.out.print("请输入你要删除的数据对应的名字: ");
            if(scan.hasNextLine()) {
                name =scan.nextLine();
            }
            PreparedStatement ps = con.prepareStatement("delete from student_tel where name=?");
            ps.setString(1, name);
            ps.executeUpdate();
            System.out.println("删除成功！");
        }
        catch (Exception e){}
    }

    private void updateName(Scanner scan){
        try {
            System.out.print("请输入更新前的名字: ");
            if(scan.hasNextLine()) {
                name=scan.nextLine();
            }

            String name1 = null;
            System.out.print("请输入更新后的名字: ");
            if(scan.hasNextLine()){
                name1=scan.nextLine();
            }

            PreparedStatement ps = con.prepareStatement("update student_tel set name=? where name=?");
            ps.setString(1, name1);
            ps.setString(2, name);
            ps.executeUpdate();
        }
        catch (Exception e){}
    }

    private void getByName(Scanner scan){
        try {
            System.out.print("请输入要查询的名字: ");
            if(scan.hasNextLine()) {
                name=scan.nextLine();
            }

            PreparedStatement ps = con.prepareStatement("select * from student_tel where name=?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                String name2=rs.getString("name");
                String tel = rs.getString("tel");
                System.out.println("name: "+name2);
                System.out.println("tel: "+tel);
            }
        }
        catch (Exception e){}
    }

    public void choose() {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数代表你想进行的操作:" +
                "0.插入 1.删除 2.更新 3.查找 4.退出");

        outer:while(scan.hasNextLine()) {

            try {
                a=Integer.parseInt(scan.nextLine());
                switch(a) {
                    case 0:
                        insertName(scan);
                        break;
                    case 1:
                        deleteName(scan);
                        break;
                    case 2:
                        updateName(scan);
                        break;
                    case 3:
                        getByName(scan);
                        break;
                    case 4:
                        break outer;
                    default:
                        System.out.println("你输入了错误的数字");
                        break;
                }

                System.out.println("请输入一个整数代表你想进行的操作:" +
                        "0.插入 1.删除 2.更新 3.查找 4.退出");
            }catch (java.lang.NumberFormatException e){
                System.err.println("输入错误，请重新输入！");
            }
        }
        System.out.println("程序结束运行。");
    }
}

