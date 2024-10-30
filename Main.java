/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Tufic
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
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
*/
        Vendedor vendedor1 = new Vendedor("Lauson");
        Comprador comprador = new Comprador("Gilberto");
        Categoria cat1 = new Categoria("cat1");
        Produto prod1 = new Produto("p1","1","1",1,cat1);
        Produto prod2 = new Produto("p2","2","2",2,cat1);
        Produto prod3 = new Produto("p3","3","3",3,cat1);
        Produto prod4 = new Produto("p4","4","4",4,cat1);
        
        vendedor1.adicioneProdutoAoEstoque(prod1, 100);
        vendedor1.adicioneProdutoAoEstoque(prod2, 100);
        vendedor1.adicioneProdutoAoEstoque(prod3, 100);
        vendedor1.adicioneProdutoAoEstoque(prod4, 100);
        vendedor1.adicioneProdutoAoEstoque(prod1, 100);
        
        comprador.adicioneAoCarrinho(prod1, vendedor1, 10);
        comprador.adicioneAoCarrinho(prod2, vendedor1, 20);
        comprador.adicioneAoCarrinho(prod3, vendedor1, 30);
        comprador.adicioneAoCarrinho(prod4, vendedor1, 40);
        
        printCarrinho(comprador.getCarrinho());
        comprador.getCarrinho().undo();
        printCarrinho(comprador.getCarrinho());
        comprador.getCarrinho().undo();
        printCarrinho(comprador.getCarrinho());
        comprador.getCarrinho().undo();
        printCarrinho(comprador.getCarrinho());
        comprador.getCarrinho().undo();
        printCarrinho(comprador.getCarrinho());
        
        comprador.getCarrinho().redo();
        printCarrinho(comprador.getCarrinho());
        comprador.getCarrinho().redo();
        printCarrinho(comprador.getCarrinho());
        comprador.adicioneAoCarrinho(prod4, vendedor1, 10);
        comprador.getCarrinho().redo();
        printCarrinho(comprador.getCarrinho());
        comprador.getCarrinho().redo();
        printCarrinho(comprador.getCarrinho());
        comprador.getCarrinho().redo();
        printCarrinho(comprador.getCarrinho());
        }
    
    public static void printCarrinho(Carrinho carrinho){
        System.out.println();
        System.out.println("Carrinho:");
        
        for (ItemCompra item : carrinho.getItens())
           System.out.println("Produto: "+ item.getProduto().getNome() + ", quantidade: "+item.getQuantidade());
    }
    
}
