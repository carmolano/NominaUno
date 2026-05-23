/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominauno.Empleados;

/**
 *
 * @author carlo
 */
public class EmpleadoTemporal extends Empleado {
    
    private double  salarioMensual;
    private int mesesContrato;
    
    public EmpleadoTemporal(String nombre,
                            String documento,
                            double salarioMensual,
                            int mesesContrato){
        
        super(nombre,documento);
        this.salarioMensual = salarioMensual;
        this.mesesContrato = mesesContrato;
        
   }
      public double calcularSalarioBruto(){
          return salarioMensual;
    
    
    
    
}
}