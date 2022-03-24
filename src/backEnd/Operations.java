package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import projectstart.*;

public class Operations {

    DBConnection con = new DBConnection();
    Connection con_obj = con.EstablishConnection();
    Statement state = null;
    PreparedStatement PrepState = null;
    ResultSet result = null;
    String Name, Age, Phone, Dept, Qualification, Designation, Leaves, Password;
    Double Salary;
    EditProfile ed = new EditProfile();
    String AvLeave, name;

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
                Qualification = result.getString("Qualification");
                Designation = result.getString("Designation");
                Salary = result.getDouble("Salary");
                Leaves = result.getString("AvailableLeaves");

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
            if (res > 0) {
//                JOptionPane.showMessageDialog(null, "inserted");
                access = true;
            } else {
//                JOptionPane.showMessageDialog(null, "Error");
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
                AvLeave = result.getString("AvailableLeaves");
                name = result.getString("EName");
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
//                JOptionPane.showMessageDialog(null, "inserted");
                access = true;
            } else {
                //JOptionPane.showMessageDialog(null, "Available Leaves are less than requested.");
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
                //JOptionPane.showMessageDialog(null, "Inserted!");
                b = true;
            } else {
                //JOptionPane.showMessageDialog(null, "Error");
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
                //JOptionPane.showMessageDialog(null, "Inserted!");
                b = true;
            } else {
                //JOptionPane.showMessageDialog(null, "Error");
                b = false;
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
        }
        return b;
    }

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

    public boolean updateLeavesInfo(String EName, String EID, String Avleaves, String Reason, String ReqLeaves, String Status) throws SQLException, Exception {
        boolean access = false;
        int Leaves = (Integer.parseInt(Avleaves) - Integer.parseInt(ReqLeaves));
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

    public void deleteComplaint() {

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

    public boolean passwordFetch(String ID) {
        String loginString = "select * from EmployeeDetails where EmployeeID='" + ID + "'  ";
        boolean access = false;
        try {
            PrepState = con_obj.prepareStatement(loginString);
            result = PrepState.executeQuery();
            while (result.next()) {
                Password = result.getString("Password");
//                Name = result.getString("EName");
//                Age = result.getString("Age");
//                Phone = result.getString("Phone");
//                Dept = result.getString("Department");
//                Qualification = result.getString("Qualification");
//                Designation = result.getString("Designation");
//                Salary = result.getDouble("Salary");
//                Leaves = result.getString("AvailableLeaves");          
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
