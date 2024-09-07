package com.mycompany.metodospago;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Tarjeta_credito implements Realizar_Pago, Cancelar_Pago  {

    @Override
  public void realizarpago() {
        System.out.println("Se ha realizado el pago con Tarjeta de Tranferencia");
    }

    public void Cancelar_Pago() {
        System.out.println("Se ha cancelado el pago con Tarjeta de Transferencia");

    }
}
