/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan48.kalkulator;

/**
 *
 * @author korik
 */
public class Kalkulator {
   private double value1;
   private double value2; 
   private String note;

    public double getValue1() {
        return value1;
    }

    public void setValue1(double value1) {
        this.value1 = value1;
    }

    public double getValue2() {
        return value2;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }
  
    public void setNamaProject(){
        System.out.println("Project Calculator");
    }
    
    public void setNoteProject(String note){
        this.note = note;
    }
    
    public double add(double val1, double val2){
       double add; 
       return add = val1 + val2;
    }
    
    public double minus(double val1, double val2){
       double minus;
       return minus = val1 - val2;
    }
    
    public double multiplication(double val1, double val2){
       double multiplicaton;
       return multiplicaton = val1 * val2;
    }
    
    public double division(double val1, double val2){
       double division;
       return division = val1 / val2;
    }
}