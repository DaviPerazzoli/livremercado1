/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Tufic
 */
class Comprador extends Pessoa{
    private Carrinho carrinho = new Carrinho();
    
    public Comprador (String nome){
        super(nome);
    }
    
    public void adicioneAoCarrinho(Produto produto, Vendedor vendedor, int quantidade) {
        carrinho.adicioneItem(produto, vendedor, quantidade);
    }
    
    /*
        Formas de pagamento
            - Pedidos tem que ser pagos pelo cliente ao vendedor.
            - Transferência, PIX, MercadoPago, cartão, boleto, etc.
    
        Histórico de pedidos
            
        Pesquisa por produtos similares, por categoria, por vendedor, por faixa de preço.
        Ordenar produtos por preço, quantidade, vendedor.
    
        Avisar o comprador quando um produto de interesse voltar ao estoque
        
        A efetivação da compra passa por diferentes etapas (ou estados).
            -Avaliando pagamento, em preparação, em transito, entregue, finalizado, perdido, sob reclamação.
            
        Cliente pode desfazer a inclusão ou exclusão de itens no carrinho.
        Vendedor pode desfazer ações sobre o estoque.
    */
    public void efetuarCompra() {
        for (ItemCompra item : carrinho.getItens()) {
            try {
                item.getVendedor().getEstoque().reduzaQuantidade(item.getProduto(), item.getQuantidade());
                item.setQuantidade(0);
            } catch (IllegalArgumentException e) {
            
            }
        }
        
        for (ItemCompra item : carrinho.getItens()) {
            if (item.getQuantidade() == 0) {
                carrinho.removaItem(item.getProduto());
            }
        }
    }
    
    public Carrinho getCarrinho() {
        return carrinho;
    }
}
