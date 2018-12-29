package Unite17;
/* 基础训练1查询数据 */
import java.sql.*;

public class QueryStudents {
    public static void main(String args[]){
        String url="jdbc:mysql://localhost:3306/studentdata?serverTimezone=UTC";
        String queryString="SELECT name,born,address FROM student";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(java.lang.ClassNotFoundException e){}
        try {
            Connection con;
            Statement stmt;
            con=DriverManager.getConnection(url,"root","19990827");
            stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(queryString);
            while(rs.next()){
                String s=rs.getString("name");
                Date d=rs.getDate("born");
                String p=rs.getString("address");
                System.out.println(s+" "+d+" "+p);
            }
            stmt.close();
            con.close();
        }catch(SQLException ex){}
    }
}
