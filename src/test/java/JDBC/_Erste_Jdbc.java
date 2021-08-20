package JDBC;


import org.testng.annotations.Test;

import java.sql.*;

public class _Erste_Jdbc {



    @Test
    public void test() throws SQLException {
       String path="jdbc:mysql://test.medis.mersys.io:33306/ts_BurakMentoring";
       String username="technostudy";
       String password="zhTPis0l9#$&";
       // wir sind bereit, dass wir einen weg bauen

        Connection connection=DriverManager.getConnection(path, username, password);

       // diese Method ist wie FileInputStream , wir haben inputstream in Apachi poi benutzt,
        // In JDBC konnen wir Connection Method verwenden
       Statement statement=connection.createStatement();
       // wir habe einen gebiet ,in dem wir arbeite konnen , erstellt
       ResultSet rs=statement.executeQuery("select * from cinema ");
       // mit diesem methon kann ich meine ergebnisse bekommen

        rs.next();// wir sind in der Datei

        String Title=rs.getString("Title");
        System.out.println("Title = " + Title);
        


    }
}
