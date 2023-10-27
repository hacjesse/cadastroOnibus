import java.util.ArrayList;
import java.util.List;

public class Onibus {
    private int numeroOnibus;
    private int capacidadePassageiros;
    private String cidadePartida;
    private String cidadeDestino;
    private boolean emViagem;
    private Motorista motorista;
    private List<Passageiro> passageiros;
    private double valorPassagem;

    public Onibus(int numeroOnibus, int capacidadePassageiros, String cidadePartida, String cidadeDestino, double valorPassagem) {
        this.numeroOnibus = numeroOnibus;
        this.capacidadePassageiros = capacidadePassageiros;
        this.cidadePartida = cidadePartida;
        this.cidadeDestino = cidadeDestino;
        this.valorPassagem = valorPassagem;
        this.emViagem = false;
        this.motorista = null;
        this.passageiros = new ArrayList<>();
    }

    public void atribuirMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public void iniciarViagem() {
        this.emViagem = true;
    }

    public void adquirirPassagem(Passageiro passageiro) {
        double valorPassagemParaCompra = passageiro.calcularValorPassagem(valorPassagem);
        passageiros.add(passageiro);
    }
    
    public int getNumeroOnibus() {
        return numeroOnibus;
    }
    
    public int getNumeroPassageiros() {
        return passageiros.size();
    }

    public String getNomeMotorista() {
        return motorista.getNome();
    }

    public String getCidadePartida() {
        return cidadePartida;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public int getNumeroPassagensInteiras() {
        int inteiras = 0;
        for (Passageiro passageiro : passageiros) {
            if (passageiro.getIdade() <= 60) {
                inteiras++;
            }
        }
        return inteiras;
    }

    public int getNumeroMeiaPassagens() {
        int meias = 0;
        for (Passageiro passageiro : passageiros) {
            if (passageiro.getIdade() > 60) {
                meias++;
            }
        }
        return meias;
    }

    public double getTotalArrecadado() {
        return (getNumeroPassagensInteiras() * valorPassagem) + (getNumeroMeiaPassagens() * (valorPassagem / 2.0));
    }

    public void finalizarViagem() {
        this.emViagem = false;
    }

    public boolean estaEmViagem() {
        return emViagem;
    }
}
