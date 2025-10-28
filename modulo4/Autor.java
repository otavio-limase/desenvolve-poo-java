public class Autor extends Pessoa {
    private String nacionalidade;
    private boolean isUsuario; // novo campo

    public Autor(String nome, String nacionalidade, boolean isUsuario) {
        super(nome);
        this.nacionalidade = nacionalidade;
        this.isUsuario = isUsuario;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public boolean isUsuario() {
        return isUsuario;
    }

    public void setUsuario(boolean isUsuario) {
        this.isUsuario = isUsuario;
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

    @Override
    public String toString() {
        String tipo = isUsuario ? "Usuário" : "Autor Tradicional";
        return "Autor{" +
                "nome='" + getNome() + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
