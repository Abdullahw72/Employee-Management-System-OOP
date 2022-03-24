package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Employee {

    public String Name, Age, Phone, Dept, Qual, Desg, EmpID, Password;
    public int AvLeaves;
    public Double Salary;
    DBConnection con = new DBConnection();
    Connection con_obj = con.EstablishConnection();
    Statement state = null;
    PreparedStatement PrepState = null;
    ResultSet result = null;

    public boolean addEmp(String Name, String Age, String Phone, String Dept, String Qual, String Designation, String Salary, int AvLeave) {
        String Pass = "12345";
        String sql = "insert into EmployeeDetails(Password, EName, Age, Phone, Department, Qualification, Designation, Salary, AvailableLeaves)values('" + Pass + "','" + Name + "','" + Age + "','" + Phone + "','" + Dept + "','" + Qual + "','" + Designation + "','" + Salary + "','" + AvLeave + "')";
        boolean b = false;
        try {
            state = con_obj.createStatement();
            int rs = state.executeUpdate(sql);

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Inserted!");
                b = true;
            } else {
                JOptionPane.showMessageDialog(null, "Error");
                b = false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }

    public boolean updateUser(int uID, String Name, String Age, String Phone) throws SQLException, Exception {
        boolean access = false;
        String sql = "UPDATE EmployeeDetails set (EName,Age,Phone)=('" + Name + "','" + Age + "','" + Phone + "') where EmployeeID='" + uID + "'";
        try {
            state = con_obj.createStatement();
            int res = state.executeUpdate(sql);
            if (res > 0) {
                access = true;
            } else {
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return access;
    }

}
