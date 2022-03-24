package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import projectstart.*;

public class AdminOperations extends Employee{

    DBConnection con = new DBConnection();
    Connection con_obj = con.EstablishConnection();
    Statement state = null;
    PreparedStatement PrepState = null;
    ResultSet result = null;
    EditProfile ed = new EditProfile();

    public boolean updateLeavesInfo(String EName, String EID, String Avleaves, String Reason, String ReqLeaves, String Status) throws SQLException, Exception {
        boolean access = false;     
        String sql = "UPDATE LeaveRequest set (EName, EmployeeID,AvailableLeaves,Reason,RequestedLeaves,Status)=('" + EName + "','" + EID + "','" + Avleaves + "','" + Reason + "','" + ReqLeaves + "','" + Status + "') where EmployeeID='" + EID + "'";
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

    public boolean updateLeaves(String EID, String Avleaves, String ReqLeaves) throws SQLException, Exception {
        boolean access = false;
        int Leaves = (Integer.parseInt(Avleaves) - Integer.parseInt(ReqLeaves));
        String sql = "UPDATE EmployeeDetails set (AvailableLeaves)=('" + Leaves + "') where EmployeeID='" + EID + "'";
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

    public boolean addAnnounce(String Name, String Announcement) {
        boolean access = false;
        String sql = "insert into Announcement(AdminName,Announcement) values('" + Name + "','" + Announcement + "')";
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

    public boolean deleteEmployee(String ID) {
        boolean access = false;
        String sql = "delete from EmployeeDetails where EmployeeID='" + ID + "'";
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

    public boolean deleteSuggestion(String ID) {
        boolean access = false;
        String sql = "delete from Suggestions where SuggestionID='" + ID + "'";
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

    public boolean complaintResolve(String strID, String Dept, String Comp, String Status) {
        boolean access = false;
        String sql = "UPDATE Complaints set (Dept, Complaint, Status)=('" + Dept + "','" + Comp + "','" + Status + "') where ComplaintID='" + strID + "'";
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

    public boolean adminEmpUpdate(String uID, String Name, String Age, String Phone, String Dept, String Qual, String Designation, String Salary, String Leaves) throws SQLException, Exception {
        boolean access = false;
        String sql = "UPDATE EmployeeDetails set (EName,Age,Phone,Department,Qualification,Designation,Salary,AvailableLeaves)=('" + Name + "','" + Age + "','" + Phone + "','" + Dept + "','" + Qual + "','" + Designation + "','" + Salary + "','" + Leaves + "') where EmployeeID='" + uID + "'";
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
