package equal;


import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Employee {
    private String eid;
    private String ecode;
    private String name;
    private String nic;
    private String address;

    public Employee(String eid, String ecode, String name, String nic, String address) {
        this.eid = eid;
        this.ecode = ecode;
        this.name = name;
        this.nic = nic;
        this.address = address;
    }

    public String getEid() {
        return eid;
    }

    public String getEcode() {
        return ecode;
    }

    public String getName() {
        return name;
    }

    public String getNic() {
        return nic;
    }

    public String getAddress() {
        return address;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
     @Override
    public boolean equals(Object obj){
        
        Employee emp = (Employee) obj;
        if(emp.getEid()==this.eid && emp.getEcode()==this.getEcode()){
         return true;
        
    }else{
        return false;}

    }

    @Override
    public String toString() {
        return "Employee{" + "eid=" + eid + ", ecode=" + ecode + ", name=" + name + ", nic=" + nic + ", address=" + address + '}';
    }
    
}
