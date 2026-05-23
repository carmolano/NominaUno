/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominauno.Empleados;

/**
 *
 * @author carlo
 */
public class EmpleadoPorHoras  extends Empleado{
    
    private double horasTrabajadas;
    private double tarifaHora;
    
    public EmpleadoPorHoras(String nombre,
                            String documento,
                            double horasTrabajadas,
                            double tarifahora){
        
        
        super(nombre, documento);
        
        if(horasTrabajadas < 0){
            throw new IllegalArgumentException(
                         "las horas no pueden ser negativas");
        }
        
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifahora;
        
    }
    
    public double calcularSalarioBruto(){
        if (horasTrabajadas <=40){
            double tarifahora = 0;
            return horasTrabajadas * tarifahora;
        }
        
        double normales = 40 * tarifaHora;
        double extras = (horasTrabajadas - 40)
                * tarifaHora * 1.5;
        
        return normales + extras;
    }
    
}
