package estoque;

import entities.Produto;
import enums.Categoria;
<<<<<<< HEAD
=======
import enums.Marca;
>>>>>>> 56fa8757ffe57f054b0afd31c024901e2bba9d3a
import item.Item;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

public class Estoque {



    ArrayList<Item> listaDeProdutos;

<<<<<<< HEAD
    public void consultarPorCategoriaPreco(Categoria ){
=======
    public void consultarPorCategoriaPreco(){}
    public void consultarPorCategoria(){}
    public void adicionarProduto(Produto produto, BigDecimal quantidade, BigDecimal preco, Categoria categoria){

    }
    public boolean removerProduto(Produto produto){
        for (Item p:listaDeProdutos) {
>>>>>>> 56fa8757ffe57f054b0afd31c024901e2bba9d3a

    }
    public Optional<ArrayList<Item>> consultarPorCategoria(Categoria categoria ){
        ArrayList<Item> itens = new ArrayList<>();
        for (Item item: listaDeProdutos) {
            if(item.getCategoria() == categoria){
                itens.add(item);
            }
        }
        if ()
        return Optional.of(itens);
    }
    public void adicionarProduto( ){}
    public boolean removerProduto(int id){
        for (Item p:listaDeProdutos) {
            if (p.getProduto().getId() == id)
                listaDeProdutos.remove(p);
        }

    }
    public void criarNomeProduto(){

    }

}
