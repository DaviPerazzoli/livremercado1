/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Tufic
 */
public class ProdutoDisponivel implements Event{
    private Produto produto;
    private int quantidade;
    
    public ProdutoDisponivel(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public Produto getProduto(){
        return produto;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
}
