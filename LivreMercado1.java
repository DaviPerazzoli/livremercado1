/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livremercado1;

/**
 *
 * @author Tufic
 */
public class LivreMercado1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Categoria cat1 = new Categoria("cat1");
        Categoria cat2 = new Categoria("cat2");
        Categoria cat3 = new Categoria("cat3");
        Categoria cat4 = new Categoria("cat4");
        
        cat1.adicioneSubcategoria(cat3);
        cat3.adicioneSubcategoria(cat4);
        cat3.adicioneSubcategoria(cat2);
        
        Produto prod1 = new Produto("1", "2", "3",2, cat1);
        Produto prod2 = new Produto("2", "2", "3",2, cat2);
        Produto prod3 = new Produto("3", "2", "3",2, cat3);
        Produto prod4 = new Produto("4", "2", "3",2, cat4);
        
        cat1.adicioneProduto(prod1);
        cat2.adicioneProduto(prod2);
        cat3.adicioneProduto(prod3);
        cat4.adicioneProduto(prod4);
        
        System.out.println("cat1 prods:");

        cat1.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat2 prods:");
        cat2.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat3 prods:");
        cat3.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat4 prods:");
        cat4.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        System.out.println("Subcategorias de cada categoria:");
        
        System.out.println("cat1 cats:");
        cat1.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("cat2 cats:");
        cat2.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("cat3 cats:");
        cat3.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("cat4 cats:");
        cat4.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        
        cat1.removaSubcategoria(cat3, true);
        System.out.println("Removendo subcategoria 3 da 1...");
        
        System.out.println("cat3 prods:");
        cat3.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        System.out.println("cat1 prods:");
        cat1.getProdutos().forEach(p -> System.out.println(p.getNome() + " " + p.getCategoria().getNome()));
        
        
        System.out.println("Subcategorias de cada categoria:");
        
        System.out.println("cat1 cats:");
        cat1.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("cat2 cats:");
        cat2.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("cat3 cats:");
        cat3.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        System.out.println("cat4 cats:");
        cat4.getSubcategorias().forEach(p -> System.out.println(p.getNome()));
        }
    
}
