/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class Compra {
    private PagamentoStrategy strategy;
    
    public void setPagamentoStrategy(PagamentoStrategy strategy){
        this.strategy = strategy;
    }
    
    public void realizarPagamento(double valor){
        strategy.pagar(valor);
    }
}
