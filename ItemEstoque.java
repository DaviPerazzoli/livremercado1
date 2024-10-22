
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Tufic
 */
class ItemEstoque implements Subject{
    private Produto produto;
    private int quantidade;
    private HashMap<Comprador, Integer> interessados;
    
    public ItemEstoque(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        interessados = new HashMap<>();
    }
    
    public void adicioneQuantidade(int quantidade) {
        setQuantidade(this.quantidade + quantidade);
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
        notifyObservers();
    }
    
    public void adicionarInteressado(Comprador comprador, int quantidade){
        interessados.put(comprador, quantidade);
    }
    
    @Override
    public void notifyObservers() {
        for (Comprador interessado : interessados.keySet()) {
            int quantidade = interessados.get(interessado);
            if (quantidade < this.quantidade)
                interessado.produtoDesejadoDisponivel(new ProdutoDisponivel(getProduto(),getQuantidade()));
        }
    }
}
