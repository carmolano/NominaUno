/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominauno.Empleados;

/**
 *
 * @author carlo
 */
public abstract class Empleado {
    protected String nombre;
    protected String documento;
    
    
    public Empleado(String nombre, String documento){
        this.nombre = nombre;
        this.documento = documento;
        
    }
    // formulada que se emplea que se implementara 
    public abstract double calcularSalarioBruto();
    
    //deducciones
    public double calcularDeducciones(){
        return calcularSalarioBruto()*0.04;
        
    }
   
      public double calcularARL(){
          return calcularSalarioBruto() * 0.00522;
    }
      
       public double calcularSalarioNeto() {
        double neto = calcularSalarioBruto()
                - calcularDeducciones()
                - calcularARL();

        return Math.max(neto, 0);
        
      
       }
       
       public String getNombre(){
           return nombre;
       }
       
}
