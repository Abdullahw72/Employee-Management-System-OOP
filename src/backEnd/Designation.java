/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;

public class Designation {

    String DesName;
    private Double Allowance, BasicPay=15000.0, NetSalary;
    private int Leaves;

    public Designation(String DesName) {
        this.DesName = DesName;
    }

    public double netSalary() {
        if(this.DesName.equals("CEO"))
        Allowance=5.0;
        else if(this.DesName.equals("Manager"))
        Allowance=3.0;
        else if(this.DesName.equals("Staff"))
        Allowance=2.0;       
        this.NetSalary = (this.BasicPay * Allowance)+this.BasicPay;
        return NetSalary;
    }

    public int Leaves()
    {
    if(this.DesName.equals("CEO"))
        Leaves=120;
    else if(this.DesName.equals("Manager"))
        Leaves=90;
    else if(this.DesName.equals("Staff"))
        Leaves=30;
    return Leaves;
    }
    
    
    public void setDesName(String DesName) {
        this.DesName = DesName;
    }

    public void setNetSalary(Double NetSalary) {
        this.NetSalary = NetSalary;
    }

    public String getDesName() {
        return DesName;
    }

    public Double getNetSalary() {
        return NetSalary;
    }
    
    
    
}
