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
}
