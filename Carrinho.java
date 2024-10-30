/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tufic
 */
class Carrinho {
    private List<ItemCompra> itens;
    private CareTaker careTaker;
    
    public Carrinho() {
        itens = new ArrayList<>();
        careTaker = new CareTaker();
        saveState();
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
        
        saveState();
    }
    
    public List<ItemCompra> getItens() {
        return itens;
    }
    
    public void removaItem(Produto produto) {
        for (ItemCompra item : itens) {
            if (item.getProduto().equals(produto)) {
                itens.remove(item);
                saveState();
                return;
            }
        }
    }
    
    public void undo(){

        copyState(careTaker.undo().getState());
    }
    
    public void redo(){
        copyState(careTaker.redo().getState());
    }
    
    private void saveState(){
        careTaker.saveState(new Memento(itens));
    }
    
    private void copyState(List<ItemCompra> state){
        itens.clear();
        for (ItemCompra item: state){
            itens.add(item);
        }
    }
}
