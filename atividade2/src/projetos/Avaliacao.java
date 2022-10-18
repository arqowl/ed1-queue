package projetos;

import br.unicap.edi.arqowl.Queue;

public class Avaliacao {
    private Queue<Projeto> fila;

    public Avaliacao() {
        fila = new Queue<>();
    }

    public void novoProjeto(Projeto p){
        fila.enQueue(p);
        System.out.println("Novo projeto colocado na fila do Jose");
    }

    public void avaliarProjeto(boolean avaliacao){
        Projeto p;
        if(fila.isEmpty()==true){
            System.out.println("Não ha projetos para serem avaliados");
        }else{
            p = fila.deQueue();
            if(avaliacao==true){
                System.out.println("Projeto "+p+" foi aprovado!! :)");
            }else{
                System.out.println("Projeto "+p+" foi reprovado!! :(");
            }
        }
    }
    
}
