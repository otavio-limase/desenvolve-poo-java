public class Pessoa {
    protected String nome;
    protected Livro[] livros;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Livro[] getLivros() {
        return livros;
    }
}
