public class Autor extends Pessoa {
    private String nacionalidade;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return livros;
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        if (livros == null) return new Livro[0];
        return java.util.Arrays.stream(livros)
                .filter(l -> l.getGenero().equalsIgnoreCase(genero))
                .toArray(Livro[]::new);
    }
}
