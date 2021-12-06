package edu.xc;

import java.sql.*;

public class Demo02 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException {
        // 1 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 2
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01","root","1299");
        // 3 创建状态
        PreparedStatement preparedStatement = connection.prepareStatement("insert into book('name',author,prices) values(?,?,?)");
        // 4
        preparedStatement.setString(1,"我的奋斗");
        preparedStatement.setString(2,"希特勒");
        preparedStatement.setString(3,"999");







        // 6
        preparedStatement.close();
        connection.close();



    }
}


