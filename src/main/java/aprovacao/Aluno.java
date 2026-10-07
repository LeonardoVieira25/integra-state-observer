package aprovacao;

public class Aluno {

    private int frequencia;
    private int p1;
    private int p2;
    private int provaFinal;


    public int getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(int frequencia) {
        if ((frequencia < 0) || (frequencia > 100)) {
            throw new IllegalArgumentException("Frequencia invalida");
        }
        this.frequencia = frequencia;
    }

    public int getProvaFinal() {
        return provaFinal;
    }

    public void setProvaFinal(int provaFinal) {
        if ((provaFinal < 0) || (provaFinal > 100)) {
            throw new IllegalArgumentException("Nota prova final invalida");
        }
        this.provaFinal = provaFinal;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        if ((p1 < 0) || (p1 > 100)) {
            throw new IllegalArgumentException("Nota prova 1 invalida");
        }
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        if ((p2 < 0) || (p2 > 100)) {
            throw new IllegalArgumentException("Nota prova 2 invalida");
        }
        this.p2 = p2;
    }


    public boolean verificarAprovacao() {
        if (this.frequencia < 75) {
            return false;
        }
        else {
            float media = (this.p1 + this.p2) / 2;
            if (media < 30) {
                return false;
            }
            else {
                if (media >= 70) {
                    return true;
                }
                else {
                    if (((media + this.provaFinal) / 2) >= 50){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
            }
        }
    }
}