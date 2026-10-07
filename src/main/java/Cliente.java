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

    private EstadoPedido ultimaAtualizacao;

    @Override
    public void update(Observable o, Object arg) {
        if (!(arg instanceof EstadoPedido))
            throw new IllegalArgumentException("Update not supported");
        this.ultimaAtualizacao = (EstadoPedido) arg;
        System.out.println("Cliente " + nome + " recebeu atualização: " +
                ultimaAtualizacao);
    }

    public EstadoPedido getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }
}
