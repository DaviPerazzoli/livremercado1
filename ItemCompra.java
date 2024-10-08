/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Tufic
 */
class ItemCompra {

    private Produto produto;
    private int quantidade;
    private Vendedor vendedor;

    public ItemCompra(Produto produto, Vendedor vendedor, int quantidade) throws IllegalArgumentException{
        if (produto == null || vendedor == null || quantidade < 0)
            throw new IllegalArgumentException();
        
        this.produto = produto;
        this.quantidade = quantidade;
        this.vendedor = vendedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void adicioneQuantidade(int quantidade) {
        this.quantidade += quantidade;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }
    
    public void setQuantidade (int quantidade) {
        this.quantidade = quantidade;
    }
}
