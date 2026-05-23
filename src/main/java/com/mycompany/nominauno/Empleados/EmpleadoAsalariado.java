/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominauno.Empleados;

/**
 *
 * @author carlo
 */
public class EmpleadoAsalariado  extends Empleado {
    
    private double salarioMensual;
    private int aniosEmpresa;
    
    public EmpleadoAsalariado(String nombre,
                              String documento,
                              double salarioMnesual,
                              int aniosEmpresa){
        
           super(nombre,documento);
           this.salarioMensual = salarioMensual;
           this.aniosEmpresa = aniosEmpresa;
           
       
    }
    
    public double calcularSalarioBruto(){
        
        double bono = 0;
        
        if (aniosEmpresa > 5){
            bono = salarioMensual * 0.10;
            
        }
        
        return salarioMensual + bono;
        }
    }
    

