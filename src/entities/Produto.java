package entities;

import enums.Marca;

import java.util.Objects;

public class Produto {
    private long id;
    private String nome;
    private Marca marca;

    public Produto() {
    }

    public Produto(String nome, Marca marca) {
        this.marca = marca;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(nome, produto.nome) && marca == produto.marca;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, marca);
    }
}
