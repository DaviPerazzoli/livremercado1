/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livremercado1;

import java.util.ArrayList;

/**
 *
 * @author Tufic
 */
class Carrinho {
    private ArrayList<ItemCompra> itens;
    
    public Carrinho() {
        itens = new ArrayList<>();
    }
    
    public void adicioneItem(Produto produto, Vendedor vendedor, int quantidade) throws IllegalArgumentException {
        int quantidadeEstoque = vendedor.getEstoque().quantidadeEmEstoque(produto);
        
        if (quantidade > quantidadeEstoque)
            throw new IllegalArgumentException();
        
        boolean produtoNoCarrinho = false;
        
        for (ItemCompra item : itens) {
            if (item.getProduto().equals(produto)) {
                produtoNoCarrinho = true;
                if (item.getQuantidade() + quantidade > quantidadeEstoque) {
                    throw new IllegalArgumentException();
                }
                
                item.adicioneQuantidade(quantidade);
            }
        }
        
        if (! produtoNoCarrinho) {
            itens.add(new ItemCompra(produto, vendedor, quantidade));
        }
    }
    
    public ArrayList<ItemCompra> getItens() {
        return itens;
    }
    
    public void removaItem(Produto produto) {
        for (ItemCompra item : itens) {
            if (item.getProduto().equals(produto)) {
                itens.remove(item);
                return;
            }
        }
    }
}
