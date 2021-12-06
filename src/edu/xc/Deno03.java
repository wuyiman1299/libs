package edu.xc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deno03 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        // 获取链接
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test01","root","1299");
        // 创建输出状态
        // 增  PreparedStatement preparedStatement = connection.prepareStatement("insert into book ('name' ,author,prices")+"values(?,?,?)");
       // 删  PreparedStatement preparedStatement =  connection.prepareStatement("delete from book where author ='迪迦'");
        // 改 PreparedStatement preparedStatement = connection.prepareStatement("update book set name = '汉语词典' where author = ‘迪迦’");
       // 查  PreparedStatement preparedStatement = connection.prepareStatement("select * from book");
       // 执行语句
       /* preparedStatement.setString (1,"汉语词典");
        preparedStatement.setString(2,"迪迦");
        preparedStatement.setDouble(3,666);*/
        // 关闭资源
        connection.close();


    }
}
