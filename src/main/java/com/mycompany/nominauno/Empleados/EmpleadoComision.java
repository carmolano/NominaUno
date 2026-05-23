/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominauno.Empleados;

/**
 *
 * @author carlo
 */
public class EmpleadoComision extends Empleado {
    private double salarioBase;
    private double ventas;
    private double porcentajeComision;

    public EmpleadoComision(String nombre,
                            String documento,
                            double salarioBase,
                            double ventas,
                            double porcentajeComision) {

        super(nombre, documento);

        if (ventas < 0) {
            throw new IllegalArgumentException(
                    "Las ventas no pueden ser negativas");
        }
        
        this.salarioBase = salarioBase;
        this.ventas = ventas;
        this.porcentajeComision = porcentajeComision;
    }
    
    public double calcularSalarioBruto(){
        
        double salario = salarioBase
                +(ventas * porcentajeComision);
        
        if (ventas> 20000000){
            salario += ventas *0.03;
        }
         return salario;
    }
}
