public class Principal {
    public static void main(String[] args) {
        // Criação de motoristas
        Motorista motorista1 = new Motorista("Sergio", "12345", 45);

        // Criação de um ônibus com capacidade para 50 passageiros
        Onibus onibus1 = new Onibus(1, 30, "Guarabira", "João Pessoa", 30.0);

        // Atribuição de um motorista ao ônibus
        onibus1.atribuirMotorista(motorista1);

        // Início da viagem
        onibus1.iniciarViagem();

        // Criação de passageiros
        Passageiro passageiro1 = new Passageiro("Niellen Jhose", "111", 21);
        Passageiro passageiro2 = new Passageiro("Abdeel Lucena", "222", 65);
        Passageiro passageiro3 = new Passageiro("Gabriel Vegeta", "333", 40);

        // Adquirindo passagens
        onibus1.adquirirPassagem(passageiro1);
        onibus1.adquirirPassagem(passageiro2);
        onibus1.adquirirPassagem(passageiro3);

        // Verificando informações da viagem
        System.out.println("Viagem do ônibus " + onibus1.getNumeroOnibus());
        System.out.println("Motorista: " + onibus1.getNomeMotorista());
        System.out.println("Origem: " + onibus1.getCidadePartida());
        System.out.println("Destino: " + onibus1.getCidadeDestino());
        System.out.println("Número de passageiros: " + onibus1.getNumeroPassageiros());
        System.out.println("Número de passagens inteiras: " + onibus1.getNumeroPassagensInteiras());
        System.out.println("Número de meia passagens: " + onibus1.getNumeroMeiaPassagens());
        System.out.println("Total arrecadado: R$" + onibus1.getTotalArrecadado());

        // Finalizando a viagem
        onibus1.finalizarViagem();
    }
}
