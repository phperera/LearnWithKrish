/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.jws.WebMethod;
import javax.jws.WebService;
import service.BDServiceImpl;

/**
 *
 * @author ASUS
 */
@WebService
public class BDFinder {
    BDServiceImpl serviceImpl=new BDServiceImpl();
    
    @WebMethod
    public int calculateBD(int year,int month,int day){
        
        return serviceImpl.calculateBD(year,month,day);
    }
            
}
