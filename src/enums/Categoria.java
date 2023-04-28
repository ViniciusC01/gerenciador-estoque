package enums;

public enum Categoria {

//    CATEGORIAS

    GELADEIRA("GELADEIRA"),
    TELEVISAO("TELEVISAO"),
    MAQUINA_DE_LAVAR("MAQUINA_DE_LAVAR"),
    VIDEOGAME("VIDEOGAME"),
    FOGAO("FOGAO");


    Categoria(String nome) {
        this.nome = nome;
    }

    String nome;

    Categoria() {
    }
}
