public class Passageiro {
    private String nome;
    private String registroIdentidade;
    private int idade;

    public Passageiro(String nome, String registroIdentidade, int idade) {
        this.nome = nome;
        this.registroIdentidade = registroIdentidade;
        this.idade = idade;
    }

    public double calcularValorPassagem(double valorBase) {
        if (idade > 60) {
            return valorBase / 2.0; // Aplica 50% de desconto para passageiros com mais de 60 anos
        } else {
            return valorBase;
        }
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroIdentidade() {
        return registroIdentidade;
    }

    public void setRegistroIdentidade(String registroIdentidade) {
        this.registroIdentidade = registroIdentidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
