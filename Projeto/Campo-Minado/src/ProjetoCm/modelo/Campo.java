package ProjetoCm.modelo;
import java.util.ArrayList;
import java.util.List;

public class Campo {
    private int linha;
    private int coluna;
    private boolean minado=false;
    private boolean aberto=false;
    private boolean marcado=false;
    private List<Campo> vizinhos = new ArrayList<>();

    Campo(int linha,int coluna){
        this.linha=linha;
        this.coluna=coluna;
    }
}
