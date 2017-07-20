import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectionExample
{
 public static void main(String args[])
 {
 String empname;
 int id;
 int age;
 empname="Mayank";
 id=22;
 age=20;
 Connection con=null;
Statement st;
try
{
Class.forname("com.mysql.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull";
con=DriverManager.getConnection("url","root","");
String query="Insert into employee(empname,id,age)values("+empname+"','"+id+"','"+age+")";
st=con.createStatement();
int a=st.executeUpdate(query);
}
catch(Exception ex)
{
System.out.println("Error:"+ex);
}
} 
 
 
 
 
 }




