package estoque;

import entities.Produto;
import enums.Categoria;
import item.Item;

import java.util.ArrayList;
import java.util.Optional;

public class Estoque {



    ArrayList<Item> listaDeProdutos;

    public void consultarPorCategoriaPreco(Categoria ){

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
