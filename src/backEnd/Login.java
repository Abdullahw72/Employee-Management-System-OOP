/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login {

    DBConnection con = new DBConnection();
    Connection con_obj = con.EstablishConnection();

    String name, pass;

    Statement stmt = null; //used for insert, update, delete.
    PreparedStatement pst = null;
    ResultSet rs = null;

    public boolean AdminLogin(String uname, String upass) throws SQLException {

        String loginString = "select * from AdminLoginDetails where UserID='" + uname + "' and Password='" + upass + "' ";
        boolean b;
        try {
            pst = con_obj.prepareStatement(loginString);
            rs = pst.executeQuery();
            if (rs.next()) {

                b = true;
            } else {
                b = false;
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
            b = false;
        } finally {
            con_obj.close();
        }
        return b;
    }

    public boolean EmpLogin(String id, String upass) throws SQLException {

        String loginString = "select * from EmployeeDetails where EmployeeID='" + id + "' and Password='" + upass + "' ";
        boolean b;
        try {
            pst = con_obj.prepareStatement(loginString);
            rs = pst.executeQuery();
            if (rs.next()) {

                b = true;
            } else {
                b = false;
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, ex);
            b = false;
        } finally {
            con_obj.close();
        }
        return b;
    }
}
