/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class CartaoCreditoStrategy implements PagamentoStrategy{

    @Override
    public void pagar(double valor) {
        System.out.println("Realizando pagamento com cartão de crédito no valor de R$"+valor);
    }
    
}
