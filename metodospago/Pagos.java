package com.mycompany.metodospago;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class Pagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchFieldException {
        // TODO code application logic here
        Pago_Metodo_Factory pagofactory = new Pago_Metodo_Factory();
        Realizar_Pago pagos= pagofactory.obtenerpago(MetodosdePago.TARJETA_DEBITO);
        pagos.realizarpago();
    }
    
}
