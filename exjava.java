public class ExceptionExample {

    public static void readFile(String filePath) throws FileNotFoundException {
        if (filePath == null) {
            // Lançando uma exceção não verificada
            throw new IllegalArgumentException("O caminho do arquivo não pode ser nulo.");
        }
        
        File file = new File(filePath);
        if (!file.exists()) {
            // Lançando uma exceção verificada
            throw new FileNotFoundException("Arquivo não encontrado: " + filePath);
        }

        System.out.println("Arquivo lido com sucesso.");
    }

    public static void main(String[] args) {
        try {
            readFile(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            readFile("caminho/invalido.txt");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            readFile("caminho/valido.txt");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
