/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodospago;

/**
 *
 * @author andre
 */
public class Efectivo implements Realizar_Pago, Cancelar_Pago {

    @Override
    public void realizarpago() {
        System.out.println("Se ha realizado el pago con Efectivo");
    }

    public void Cancelar_Pago() {
        System.out.println("Se ha cancelado el pago con Efectivo");

    }
}
