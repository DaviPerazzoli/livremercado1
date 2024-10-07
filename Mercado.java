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
public class Mercado {
    private final ArrayList<Categoria> categorias;
    private final ArrayList<Comprador> compradores;
    private final ArrayList<Vendedor> vendedores;
    
    public Mercado(){
        categorias = new ArrayList<>();
        compradores = new ArrayList<>();
        vendedores = new ArrayList<>();
    }
    
    public void adicioneCategoria(Categoria categoria) {
        if (! categorias.contains(categoria))
            categorias.add(categoria);
    }
    
    public void adicioneComprador(Comprador comprador) {
        if (! compradores.contains(comprador))
            compradores.add(comprador);
    }
    
    public void adicioneGVendedor(Vendedor vendedor) {
        if (! vendedores.contains(vendedor))
            vendedores.add(vendedor);
    }
    
    public ArrayList<Categoria> getCategorias() {
        return categorias;
    }
    
    public ArrayList<Comprador> getCompradores() {
        return compradores;
    }
    
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }
}
