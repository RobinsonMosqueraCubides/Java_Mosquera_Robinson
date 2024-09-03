/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agregacion;

/**
 *
 * @author Robinson Mosquera
 */
public class Main {
    public static void main(String[] args) {
        Department dept = new Department ("Engineering");
        Employee emp1 = new Employee ("mozo");
        Employee emp2 = new Employee ("daza");
        
        dept.addEmployee(emp2);
        dept.addEmployee(emp1);
        
        for (int i = 0; i<= dept.getEmployees().size();i++){
            System.out.println("");
        }
    }
   
}
