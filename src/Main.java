
import  java.sql.*;
public class Main {
    public static void main(String[] args)  {

        System.out.println("Hello world!");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
            Statement st = con.createStatement();
            //String sql = "create table student(name varchar(20), roll int)";
/*            String sql = "insert into student(name, roll) values('XYZ', 103)";*/
        String sql = "select * from student";
       ResultSet rs =  st.executeQuery(sql);
       while(rs.next())
       {
           System.out.println("STudent name "+rs.getString("name"));
           System.out.println("Student roll"+rs.getInt("roll"));
       }

        }
        catch (Exception e)
        {
            System.out.println("Error!!!");
        }



    }
}