package lanchonete;
import br.unicap.edi.arqowl.Queue;

public class Lanchonete {
    private Queue<Pedido> fila;
    
    public Lanchonete() {
        fila = new Queue();
    }
    public void cadastrarPedido (Pedido p) {
        fila.enQueue(p);
        System.out.println("Pedido cadastrado com sucesso!");
    }
    public void atenderPedido () {
        Pedido p;
        if (fila.isEmpty() == true) {
            System.out.println("Não há pedidos esperando atendimento");
        }
        else {
            p = fila.deQueue();
            System.out.println("Preparando pedido " + p);
        }
    }
    
}