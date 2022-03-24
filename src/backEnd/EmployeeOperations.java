package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class EmployeeOperations extends Employee{

    DBConnection con = new DBConnection();
    Connection con_obj = con.EstablishConnection();
    Statement state = null;
    PreparedStatement PrepState = null;
    ResultSet result = null;

    public boolean fetchUser(int uID) throws Exception {

        String loginString = "select * from EmployeeDetails where EmployeeID='" + uID + "'  ";
        boolean access = false;
        try {
            PrepState = con_obj.prepareStatement(loginString);
            result = PrepState.executeQuery();
            while (result.next()) {
                Name = result.getString("EName");
                Age = result.getString("Age");
                Phone = result.getString("Phone");
                Dept = result.getString("Department");
                Qual = result.getString("Qualification");
                Desg = result.getString("Designation");
                Salary = result.getDouble("Salary");
                AvLeaves = result.getInt("AvailableLeaves");

                access = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            access = false;
        }
        return access;

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

    public boolean adminMessage(String Name, String Message) throws Exception {
        boolean access = false;
        String sql = "insert into DirectMessages(Ename,Messages)values('" + Name + "','" + Message + "')";
        try {
            state = con_obj.createStatement();
            int res = state.executeUpdate(sql);
            if (res > 0) {;
                access = true;
            } else {
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return access;
    }

    public boolean fetchLeaves(String ID) throws Exception {
        String loginString = "select * from EmployeeDetails where EmployeeID='" + ID + "'  ";
        boolean access = false;
        try {
            PrepState = con_obj.prepareStatement(loginString);
            result = PrepState.executeQuery();
            while (result.next()) {
                AvLeaves = result.getInt("AvailableLeaves");
                Name = result.getString("EName");
                access = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            access = false;
        }
        return access;
    }

    public boolean leaveRequest(String Name, String ID, String AvLeaves, String Reason, String Leaves) throws Exception {
        boolean access = false;
        String sql = "insert into LeaveRequest(EName,EmployeeID,AvailableLeaves,Reason,RequestedLeaves,Status)values('" + Name + "','" + ID + "','" + AvLeaves + "','" + Reason + "','" + Leaves + "','" + "PENDING" + "')";
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

    public boolean Suggestion(String dept, String suggest) throws Exception {

        String sql = "insert into Suggestions(Dept, Suggestion)values('" + dept + "','" + suggest + "')";
        boolean b = false;

        try {
            state = con_obj.createStatement();
            int rs = state.executeUpdate(sql);

            if (rs > 0) {
                b = true;
            } else {
                b = false;
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }

    public boolean Complaint(String dept, String comp) throws Exception {

        String sql = "insert into Complaints(Dept, Complaint,Status)values('" + dept + "','" + comp + "','" + "PENDING" + "')";
        boolean b = false;

        try {
            state = con_obj.createStatement();
            int rs = state.executeUpdate(sql);

            if (rs > 0) {
                b = true;
            } else {
                b = false;
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }

    public boolean passwordFetch(String ID) {
        String loginString = "select * from EmployeeDetails where EmployeeID='" + ID + "'  ";
        boolean access = false;
        try {
            PrepState = con_obj.prepareStatement(loginString);
            result = PrepState.executeQuery();
            while (result.next()) {
                Password = result.getString("Password");
                access = true;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            access = false;
        }
        return access;
    }

    public boolean passwordUpdate(String ID, String Password) {
        boolean access = false;
        String sql = "UPDATE EmployeeDetails set (Password)=('" + Password + "') where EmployeeID='" + ID + "'";
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
