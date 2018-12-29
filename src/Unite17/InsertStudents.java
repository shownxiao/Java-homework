package Unite17;
/* 基础训练1插入数据 */
import java.sql.*;

public class InsertStudents {
    public static void main(String args[]){
        String url="jdbc:mysql://localhost:3306/studentdata?serverTimezone=UTC";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(java.lang.ClassNotFoundException e){
            System.err.println(e.getMessage());
        }
        try{
            Connection con;
            Statement stmt;
            con=DriverManager.getConnection(url,"root","19990827");
            stmt=con.createStatement();
            stmt.executeUpdate("INSERT INTO student VALUES (200011101,"+
                    "'张三','1992/10/01','男','江西')");
            stmt.executeUpdate("INSERT INTO student VALUES (200011112,"+
                    "'李四','1991/03/12','女','北京')");
            System.out.println("新插入两条记录到学生表中");
            stmt.close();
            con.close();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
}

