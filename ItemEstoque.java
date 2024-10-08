/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Tufic
 */
class ItemEstoque {
    private Produto produto;
    private int quantidade;
    
    public ItemEstoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    public void adicioneQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }
    
    public void removaQuantidade(int quantidade) throws IllegalArgumentException{
        if (this.quantidade >= quantidade) {
            this.quantidade -= quantidade;
        } else {
            throw new IllegalArgumentException("Quantidade em estoque insuficiente.");
        }
    }
    
    public Produto getProduto() {
        return produto;
    }
    
    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
