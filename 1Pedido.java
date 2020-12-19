/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sub;

/**
 *
 * @author Bruno Felipe Ko Yan Ip
 * RA: 0040961613034
 */
public class Pedido {
    private int numeroPedido;
    private int codCliente;
    private int codVendedor;
    private double valor;
    private boolean atendido;
    private boolean pago;

    public Pedido(int numeroPedido, int codCliente, int codVendedor, double valor) {
        this.numeroPedido = numeroPedido;
        this.codCliente = codCliente;
        this.codVendedor = codVendedor;
        this.valor = valor;
        atendido = false;
        pago = false;
    }


    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isAtendido() {
        return atendido;
       
    }

    public boolean isPago() {
        return pago;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public int getCodVendedor() {
        return codVendedor;
    }
    
    public void atender()
    {
        atendido = true;
    }
    
    public void pagar()
    {
        pago = true;
    }

    public void setAtendido(boolean atendido) {
        this.atendido = atendido;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }
    

}
