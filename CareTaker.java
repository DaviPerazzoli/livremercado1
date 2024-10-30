
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
public class CareTaker {
    private Map<Integer,Memento> stateHistory;
    private int indexAtual;
    
    public CareTaker(){
        stateHistory = new HashMap<>();
        indexAtual = 0;
    }
    
    public void saveState(Memento memento){
        
        indexAtual += 1;
        stateHistory.put(indexAtual, memento);
        
        System.out.println("Saving state "+indexAtual);
        deleteAlternativeFuture();
    }
    
    public Memento undo(){
        if (stateHistory.containsKey(indexAtual-1)){
            indexAtual -= 1;
        }
        System.out.println("returning state "+indexAtual);
        return stateHistory.get(indexAtual);
    }
    
    public Memento redo(){
        if (stateHistory.containsKey(indexAtual+1)){
            indexAtual += 1;
        }
        System.out.println("returning state "+indexAtual);
        return stateHistory.get(indexAtual);
    }
    
    private void deleteAlternativeFuture(){
        for (int i = indexAtual + 1; i <= stateHistory.size();i++){
            stateHistory.remove(i);
            System.out.println("Deleting state "+i);
        }
    }
}   
