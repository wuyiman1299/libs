package edu.xc;

import java.sql.*;

public class Domo01 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        // 1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01","root","1299");
        // 3
          Statement statement = connection.createStatement();

        // 4
        String sql = " insert into book values(null ,'迪迦','美玉学姐',99)";
        String sql2 = "delete from book where author ='美玉学姐'";
        String sql3 = "update book set name= '野史金瓶梅' where author ='罗贯中'";

        int result = statement.executeUpdate(sql3);
        // 5
        if(result != -1) {
            System.out.println("执行成功");
        }
        // 6
        statement.close();
        connection.close();
        
    }
}
