/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;



/**
 *
 * @author ASUS
 */
public class BDServiceImpl {
    public int calculateBD(int year ,int month ,int day){
        boolean isLeap=isLeap(year);
        int date;
        
        if(isLeap==true){
            date = findDateLeap(month,day);
            
        }
        else{
            date = findDate(month,day);
        }
        return date;
}
      


    private boolean isLeap(int year){
    if (year%4==0 && year%100!=0 || year%400==0){
        return true;
        }else
    {
    return false;
    }
    }
   private int findDate(int month,int day ){
    
switch(month){
        case 1:
            return day;
        case 2:
            return day+31;
        case 3:
            return day+31+28;
        case 4:
            return day+31*2+28; 
        case 5:
            return day+31*2+30+28;  
        case 6:
            return day+31*3+30+28; 
        case 7:
            return day+31*3+30*2+28;
        case 8:
            return day+31*4+30*2+28;
        case 9:
            return day+31*5+30*2+28;
        case 10:
            return day+31*5+30*3+28;
        case 11:
            return day+31*6+30*3+28;
        case 12:
            return day+31*6+30*4+28;
    }
       return 0;

}
 private int findDateLeap(int month,int day ){
    
switch(month){
        case 1:
            return day;
        case 2:
            return day+31;
        case 3:
            return day+31+29;
        case 4:
            return day+31*2+29; 
        case 5:
            return day+31*2+30+29;  
        case 6:
            return day+31*3+30+28; 
        case 7:
            return day+31*3+30*2+28;
        case 8:
            return day+31*4+30*2+28;
        case 9:
            return day+31*5+30*2+28;
        case 10:
            return day+31*5+30*3+28;
        case 11:
            return day+31*6+30*3+28;
        case 12:
            return day+31*6+30*4+28;
    }
       return 0;

}
}
