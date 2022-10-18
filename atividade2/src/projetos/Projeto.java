package projetos;

public class Projeto {
    private String descricao;
    private int num;


    public Projeto(String descricao, int num) {
        this.descricao = descricao;
        this.num = num;
    }


    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }


    @Override
    public String toString() {
        return "Projeto [descricao=" + descricao + ", num=" + num + "]";
    }

    
}
