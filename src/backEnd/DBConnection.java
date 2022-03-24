/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author fazee
 */
public class DBConnection {

    static Connection con = null;

    public Connection EstablishConnection() {

        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://D:\\OOPLabProject.accdb");
            //JOptionPane.showMessageDialog(null, "Connected.");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return con;   
    }
    public void CloseConnection() throws Exception {
        DBConnection.con.close();
        JOptionPane.showMessageDialog(null, "Closed");
    }

}
