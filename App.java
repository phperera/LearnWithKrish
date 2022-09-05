package equal;

//import .*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class App {
    public static void main(String[] args) {
        Employee emp1 = new Employee("e001","d001","John","2000145011V","Jaela");
        Employee emp2 = new Employee("e002","d002","Jane","19990145011V","Jaffna");
        
        boolean res1 = emp1.equals(emp2);
        System.out.println("emp1 equals emp2 "+res1);
        
        //change emp2 id and emp code
        emp2.setEid("e002");
        emp2.setEcode("d001");
        
        boolean res2 = emp1.equals(emp2);
        System.out.println("emp1 equals emp2 "+res2);
    }
}
