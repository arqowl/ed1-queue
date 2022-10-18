package lanchonete;
import java.util.Scanner;

public class LanchoneteJoaoEMaria {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Lanchonete lanche = new Lanchonete();
        int op, numero = 0;
        String descricao;
        Pedido p;
        do {
            exibirOpcoes();
            op = in.nextInt(); in.nextLine();
            switch(op) {
                case 1: numero++;
                        System.out.print("Informe seu pedido: ");
                        descricao = in.nextLine();
                        p = new Pedido (descricao,numero);
                        lanche.cadastrarPedido(p);
                        break;
                case 2: lanche.atenderPedido();
                        break;
                case 0: System.out.println("Boa noite!!!");
                        break;
                default: System.out.println("Opção inválida!!");
            }
        } while (op != 0);  
    }
    public static void exibirOpcoes() {
        System.out.println("1 - Cadastrar novo pedido");
        System.out.println("2 - Atender pedido");
        System.out.println("0 - Encerrar programa");
        System.out.print("Informe a opção desejada: ");
    }
}
