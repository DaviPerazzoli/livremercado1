
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tufic
 */
class Memento {
    private List<ItemCompra> itens;
    
    public Memento(List<ItemCompra> itens){
        this.itens = new ArrayList<>();
        for (ItemCompra item : itens){
            this.itens.add(item);
        }
    }
    
    public List<ItemCompra> getState(){
        return itens;
    }
}   
