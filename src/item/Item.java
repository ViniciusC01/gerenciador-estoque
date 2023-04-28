package item;

import entities.Produto;
import enums.Categoria;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
    Produto produto;
    BigDecimal quantidade;
    private BigDecimal preco;
    private Categoria categoria;

<<<<<<< HEAD
=======
    public Item(Produto produto, BigDecimal quantidade, BigDecimal preco, Categoria categoria) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

>>>>>>> 56fa8757ffe57f054b0afd31c024901e2bba9d3a
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        return "Item{" +
                "produto=" + produto +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(produto, item.produto) && categoria == item.categoria;
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto, categoria);
    }
>>>>>>> 56fa8757ffe57f054b0afd31c024901e2bba9d3a
}
