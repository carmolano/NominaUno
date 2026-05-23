/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.nominauno.Empleados;

/**
 *
 * @author carlo
 */
public class Main {
    
    public static void main(String[] args){
        
        Empleado empl=
                new EmpleadoAsalariado(
                "Carlos",
                "1047477373",
                3000000,
                6);
        
        Empleado emp2 =
                new EmpleadoPorHoras(
                         "pedro",
                         "12345",
                          45,
                           20000);
                           
                           
            Empleado emp3 =
                    new EmpleadoComision(
                    "Ana",
                    "55555",
                     1500000,
                     25000000,
                     0.05);
            
            Empleado emp4 =
                    new EmpleadoTemporal(
                    "juan",
                    "88888",
                    2000000,
                    12);
        Empleado emp1 = null;
            Empleado[] empleados = {
                emp1, emp2, emp3, emp4
        };

        for (Empleado e : empleados) {

            System.out.println("Empleado: "
                    + e.getNombre());

            System.out.println("Salario Bruto: "
                    + e.calcularSalarioBruto());

            System.out.println("Salario Neto: "
                    + e.calcularSalarioNeto());

            System.out.println("----------------");
            
            
        }     
                     
    }
}
