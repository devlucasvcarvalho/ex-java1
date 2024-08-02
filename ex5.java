import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Informe seu nome completo: ");
                String nomeCompleto = scanner.nextLine().trim();
                
                if (nomeCompleto.isEmpty()) {
                    throw new IllegalArgumentException("O nome completo não pode ser vazio.");
                }
                
                System.out.print("Informe o DDD (2 dígitos): ");
                String ddd = scanner.nextLine().trim();
                
                if (ddd.length() != 2 || !ddd.matches("\\d{2}")) {
                    throw new IllegalArgumentException("O DDD deve conter exatamente 2 dígitos.");
                }
                
                System.out.print("Informe o número do telefone (8 ou 9 dígitos): ");
                String numero = scanner.nextLine().trim();
                
                if (!(numero.length() == 8 || numero.length() == 9) || !numero.matches("\\d{8,9}")) {
                    throw new IllegalArgumentException("O número de telefone deve conter 8 ou 9 dígitos.");
                }
                
                System.out.println("Cadastro realizado com sucesso!");
                System.out.println("Nome Completo: " + nomeCompleto);
                System.out.println("Telefone: (" + ddd
