/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;

/**
 *
 * @author Tufic
 */
public class Categoria {

    private String nome;
    private ArrayList<Produto> produtos;
    private ArrayList<Categoria> subcategorias;

    public Categoria(String nome) {
        this.nome = nome;
        produtos = new ArrayList<>();
        subcategorias = new ArrayList<>();
        
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public ArrayList<Categoria> getSubcategorias() {
        return subcategorias;
    }
    
    public void adicioneSubcategoria (Categoria subcategoria) {
        if (!subcategorias.contains(subcategoria)) {
            subcategorias.add(subcategoria);
        }
    }
    
    public void adicioneProduto(Produto produto) {
        if (! produtos.contains(produto)) {
            produtos.add(produto);
            if (!produto.getCategoria().equals(this)){
                produto.getCategoria().produtos.remove(produto);
                produto.setCategoria(this);
            }
        }
    }
    
    public void removaSubcategoria(Categoria subcategoria, boolean permanente) {
        if (permanente) {
            for (Produto produto : subcategoria.produtos) {
                produtos.add(produto);
                produto.setCategoria(this);
            }
            subcategoria.produtos.clear();
            
            for(Categoria subsubcategoria : subcategoria.subcategorias) {
                subcategorias.add(subsubcategoria);
            }
            subcategoria.subcategorias.clear();
        }
        
        subcategorias.remove(subcategoria);
    }
}
