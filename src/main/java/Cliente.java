import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("deprecation")
public class Cliente implements Observer {
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private String ultimaAtualizacao;

    @Override
    public void update(Observable o, Object arg) {
        this.ultimaAtualizacao = arg.toString();
        // System.out.println("Cliente " + nome + " recebeu atualização: " + ultimaAtualizacao);
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }
}
