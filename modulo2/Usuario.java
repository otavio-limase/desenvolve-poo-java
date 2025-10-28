public class Usuario extends Pessoa {
    private int idade;
    private Emprestimo[] historicoEmprestimos;

    public Usuario(String nome, int idade) {
        super(nome);
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public Emprestimo[] getHistoricoEmprestimos() {
        return historicoEmprestimos;
    }

    public void adicionarEmprestimo(Emprestimo emprestimo) {
        if (historicoEmprestimos == null) {
            historicoEmprestimos = new Emprestimo[] { emprestimo };
        } else {
            Emprestimo[] novoArray = new Emprestimo[historicoEmprestimos.length + 1];
            System.arraycopy(historicoEmprestimos, 0, novoArray, 0, historicoEmprestimos.length);
            novoArray[historicoEmprestimos.length] = emprestimo;
            historicoEmprestimos = novoArray;
        }
    }
}
