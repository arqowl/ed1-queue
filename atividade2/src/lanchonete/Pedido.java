package lanchonete;
public class Pedido {
    private String descricao;
    private int num;    
    public Pedido (String desc, int n) {
        this.descricao = desc;
        this.num = n;
    }    
    public void setDescricao(String d){
        this.descricao = d;
    }
    public String getDescricao () {
        return this.descricao;
    }
    public void setNumero (int n) {
        this.num = n;
    }
    public int getNumero () {
        return this.num;
    }
    public String toString () {
        return this.num + " " + this.descricao;
    }
}