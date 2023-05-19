import java.util.*;
public class Metodos {
    public static void FCADRASTRAESTATISTICA(estatistica[] estatisticas){
        Scanner sc=new Scanner(System.in);
        int i;
        estatisticas[0].codigoCidade=1;
        estatisticas[0].nomeCidade="Campinas";
        estatisticas[0].qtdAcidentes=205;

        estatisticas[1].codigoCidade=2;
        estatisticas[1].nomeCidade="Sorocaba";
        estatisticas[1].qtdAcidentes=102;

        estatisticas[2].codigoCidade=3;
        estatisticas[2].nomeCidade="Sao paulo";
        estatisticas[2].qtdAcidentes=480;

        estatisticas[3].codigoCidade=4;
        estatisticas[3].nomeCidade="Garulhos";
        estatisticas[3].qtdAcidentes=347;

        estatisticas[4].codigoCidade=5;
        estatisticas[4].nomeCidade="ABC";
        estatisticas[4].qtdAcidentes=382;

        estatisticas[5].codigoCidade=6;
        estatisticas[5].nomeCidade="Jundiai";
        estatisticas[5].qtdAcidentes=32;

        estatisticas[6].codigoCidade=7;
        estatisticas[6].nomeCidade="Sao jose do rio preto";
        estatisticas[6].qtdAcidentes=201;

        estatisticas[7].codigoCidade=8;
        estatisticas[7].nomeCidade="Suzano";
        estatisticas[7].qtdAcidentes=302;

        estatisticas[8].codigoCidade=9;
        estatisticas[8].nomeCidade="Bauru";
        estatisticas[8].qtdAcidentes=409;

        estatisticas[9].codigoCidade=10;
        estatisticas[9].nomeCidade="Ribeirao preto";
        estatisticas[9].qtdAcidentes=302;
    }


    public static void PQTDACIDENTES(estatistica[] estatisticas){
        int i;
        for(i=0;i<10;i++){
            if(estatisticas[i].qtdAcidentes>100 & estatisticas[i].qtdAcidentes<500){
                System.out.println("Quantidade de acidentes na cidade de "+estatisticas[i].nomeCidade+", de codigo "+estatisticas[i].codigoCidade+": "+estatisticas[i].qtdAcidentes);
            }
        }
    }

    public static void PMAIORMENOR(estatistica[] estatisticas){
        int i;
        String cidadeMaior="";
        String cidadeMenor="";
        int maior=0;
        int menor=0;
        for(i=0;i<10;i++){
            if(i==0){
                cidadeMaior=estatisticas[i].nomeCidade;
                cidadeMenor=estatisticas[i].nomeCidade;
                maior=estatisticas[i].qtdAcidentes;
                menor=estatisticas[i].qtdAcidentes;
            }
            if(maior<estatisticas[i].qtdAcidentes){
                cidadeMaior=estatisticas[i].nomeCidade;
                maior=estatisticas[i].qtdAcidentes;
            }
            if(menor>estatisticas[i].qtdAcidentes){
                cidadeMenor=estatisticas[i].nomeCidade;
                menor=estatisticas[i].qtdAcidentes;
            }
        }
        System.out.println("Cidade com maior numero de acidentes: "+cidadeMaior+" com "+maior+" acidentes");
        System.out.println("Cidade com menor numero de acidentes: "+cidadeMenor+" com "+menor+" acidentes");
    }

    public static void PACIMA(estatistica[] estatisticas){
        int i;
        int somaAcidentes=0;
        for(i=0;i<9;i++){
            somaAcidentes+=estatisticas[i].qtdAcidentes;
        }
        long media=somaAcidentes/10;
        System.out.println("Cidades com numero de acidentes acima da media:");
        for(i=0;i<10;i++){
            if(estatisticas[i].qtdAcidentes>media){
                System.out.println(estatisticas[i].nomeCidade);
            }
        }
    }
}