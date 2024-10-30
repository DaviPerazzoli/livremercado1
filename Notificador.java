
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
public class Notificador {
    private List<VendaListener> listeners;
    
    public Notificador(){
        listeners = new ArrayList<>();
    }
    
    public void adicionaListener(VendaListener listener){
        if (!listeners.contains(listener))
            listeners.add(listener);
    }
    
    public void removerListener(VendaListener listener){
        if (listeners.contains(listener))
            listeners.remove(listener);
    }
    
    public void notificarVenda(List<ItemCompra> itensVendidos){
        itensVendidos.forEach(item -> listeners.forEach(l -> l.produtoVendido(item)));
    }
}
