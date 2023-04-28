package enums;

public enum Marca {
    //MARCAS
    SAMSUNG("SAMSUNG"),
    ELETROLUX("ELETROLUX");

    private final String nome;

    Marca(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
