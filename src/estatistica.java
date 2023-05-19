public class estatistica {
    int codigoCidade;
    String nomeCidade;
    int qtdAcidentes;

    estatistica(){
        this(0,"",0);
    }
    estatistica(int codigo, String nome, int qtd){
        codigoCidade=codigo;
        nomeCidade=nome;
        qtdAcidentes=qtd;
    }
}
