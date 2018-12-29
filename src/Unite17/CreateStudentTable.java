package Unite17;

import java.sql.*;

/* 基础训练1建立表格 */
public class CreateStudentTable {
    public static void main(String args[]){
        String url = "jdbc:mysql://localhost:3306/studentdata?serverTimezone=UTC ";
        String dropString = "drop table student";
        String creatString = "create table student" + "(xuehao INTEGER,"
                + "name VARCHAR(8)," + "born date," + "sex char(2),"
                + "address VARCHAR(32))";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("连接数据库...");
        } catch (ClassNotFoundException e) {
            System.err.println("ClassNotFoundException：");
            System.err.println(e.getMessage());
        }
        try {
            Connection con ;
            Statement stmt ;
            con = DriverManager.getConnection(url, "root","19990827");
            System.out.println("连接成功！");
            stmt = con.createStatement();
            stmt.executeUpdate(dropString);
            System.out.println("学生信息表成功删除!");
            stmt.executeUpdate(creatString);
            System.out.println("学生信息表创建成功!");
            stmt.close();
            con.close();
        }catch (SQLException ex){
            System.err.println("==>SQLException："+ex.getMessage());
        }
    }
}
