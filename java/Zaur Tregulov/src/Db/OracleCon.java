package Db;

import java.sql.*;
import java.util.*;

public class OracleCon {
    public static void main(String args[]){
        try{
            //step1 load the driver class
            Locale.setDefault(Locale.ENGLISH); // use this for change NLS
            String URL = "jdbc:oracle:thin:@localhost:1521:xe";
            DriverManager.registerDriver((Driver) new OracleCon());
            Connection con = DriverManager.getConnection(URL,"sys as sysdba","sys");
            //Class.forName("oracle.jdbc.driver.OracleDriver");

            //step2 create  the connection object
            con=DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","sys");

            //step3 create the statement object
            Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY);

            //step4 execute query
            ResultSet rs=stmt.executeQuery("select * from emp");
            System.out.println(rs.first());
            while(rs.next()) {
                System.out.println(rs.getInt("id")+"  "+rs.getString("name"));
            }
            con.close();

        }catch(Exception e){ System.out.println(e);}
    }

}
