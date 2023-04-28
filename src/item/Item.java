package item;

import entities.Produto;
import enums.Categoria;

import java.math.BigDecimal;

public class Item {
    Produto produto;
    BigDecimal quantidade;
    private BigDecimal preco;
    private Categoria categoria;
}
