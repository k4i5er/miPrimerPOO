package org.malestar.bank;

public class CrearCuenta {
    public static void main(String[] args){
        Cuenta cuentaDeVanya = new Cuenta();
        System.out.printf("Saldo de la cuenta: %.2f \n", cuentaDeVanya.saldo);
        cuentaDeVanya.saldo = 10000;
        System.out.println("Saldo de la cuenta: "+ cuentaDeVanya.saldo);
    }
}