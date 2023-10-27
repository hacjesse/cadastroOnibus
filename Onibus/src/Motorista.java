public class Motorista {
    private String nome;
    private String numeroHabilitacao;
    private int idade;

    public Motorista(String nome, String numeroHabilitacao, int idade) {
        this.nome = nome;
        this.numeroHabilitacao = numeroHabilitacao;
        this.idade = idade;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroHabilitacao() {
        return numeroHabilitacao;
    }

    public void setNumeroHabilitacao(String numeroHabilitacao) {
        this.numeroHabilitacao = numeroHabilitacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
