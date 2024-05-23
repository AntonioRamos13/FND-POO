/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_8_cuenta_bancaria;

/**
 *
 * @author Usuario
 */
public class CuentaBancaria {
    private double saldo;
    private int noCuenta;
    private String noCL;
    
    public CuentaBancaria(){
    saldo = 100000000;
    noCL = "nel";
    noCuenta = 0;
    
    }
    
    
    public void imprimirDatosCuenta(){
        System.out.println("el cliente es...");
        System.out.println("El numero es...");
        System.out.println("el numero de cliente es....");
    }
    public void retirar(double monto){
        if(monto <= saldo)
            saldo = saldo - monto;
                    } 
    public void depositar (double monto){
        saldo = saldo + monto;  
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getNoCL() {
        return noCL;
    }

    public void setNoCL(String noCL) {
        this.noCL = noCL;
    }
    
    }
            
    

