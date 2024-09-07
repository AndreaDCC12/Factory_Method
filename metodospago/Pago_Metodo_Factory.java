/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodospago;

import static com.mycompany.metodospago.MetodosdePago.EFECTIVO;
import static com.mycompany.metodospago.MetodosdePago.PAYPAL;
import static com.mycompany.metodospago.MetodosdePago.TARJETA_CREDITO;
import static com.mycompany.metodospago.MetodosdePago.TARJETA_DEBITO;
import static com.mycompany.metodospago.MetodosdePago.TRANSFERENCIA;

/**
 *
 * @author andre
 */
public class Pago_Metodo_Factory {

    public Realizar_Pago obtenerpago(MetodosdePago metodosdepago) throws NoSuchFieldException {

        return switch (metodosdepago) {
            case EFECTIVO -> new Efectivo();
            case TARJETA_CREDITO -> new Tarjeta_credito();
            case TARJETA_DEBITO -> new Tarjeta_Debito();
            case PAYPAL -> new Paypal();
            case TRANSFERENCIA -> new Transferencia();
            default -> throw new NoSuchFieldException("Método de pago no reconocido: " + metodosdepago);
        };

    /**
     *
     * @param metodosdepago
     * @return
     * @throws NoSuchFieldException
     */
    }
}
