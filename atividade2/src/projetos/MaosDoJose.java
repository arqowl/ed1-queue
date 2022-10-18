package projetos;

import java.util.Scanner;

public class MaosDoJose {
    public static void main(String[] args) {

    Scanner in = new Scanner (System.in);
    Avaliacao avaliacao = new Avaliacao();
    int op, numero = 0;
    String descricao;
    Projeto p;
    do {
    exibirOpcoes();
    op = in.nextInt(); in.nextLine();
    switch(op) {

        case 1:
            numero++;
            System.out.print("Informe o nome do projeto: ");
            descricao = in.nextLine();
            p = new Projeto (descricao,numero);
            avaliacao.novoProjeto(p);
            break;
        
        case 2:
            avaliacao.avaliarProjeto(true);
            break;
        case 0: System.out.println("Boa noite!!!");
            break;

        default: System.out.println("Opção inválida!!");
        }

    } while (op != 0); 

    }

    public static void exibirOpcoes() {
    System.out.println("1 - Colocar um novo projeto nas maos do Ze");
    System.out.println("2 - Avaliar o projeto");
    System.out.println("0 - Encerrar programa");
    System.out.print("Informe a opção desejada: ");

    }


}

