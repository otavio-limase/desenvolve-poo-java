public class Main {
    public static void main(String[] args) {
        Autor autorTradicional = new Autor("Machado de Assis", "Brasileiro", false);
        Autor autorUsuario = new Autor("João Silva", "Brasileiro", true);

        System.out.println("Autor Tradicional: " + autorTradicional);
        System.out.println("Autor Usuário: " + autorUsuario);

        Artigo artigo = new Artigo("Entendendo Compiladores", autorUsuario, "tecnologia", true);
        System.out.println("Artigo criado: " + artigo);
    }
}
