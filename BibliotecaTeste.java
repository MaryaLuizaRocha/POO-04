
public class BibliotecaTeste {

    public static void main(String[] args) {
        Material livro = new Material("Harry Potter", 2001);
        Emprestimo emprestimoCurtoPrazo = new EmprestimoCurtoPrazo(livro, 0.5);
        Emprestimo emprestimoLongoPrazo = new EmprestimoLongoPrazo(livro, 1.5);

        int diasAtraso = 3;

        //Multa para empréstimo de curto prazo
        double multaCurtoPrazo = emprestimoCurtoPrazo.calcularMulta(diasAtraso);
        System.out.println("Multa para empréstimo de curto prazo: " + multaCurtoPrazo);

        //Multa para empréstimo de longo prazo
        double multaLongoPrazo = emprestimoLongoPrazo.calcularMulta(diasAtraso);
        System.out.println("Multa para empréstimo de longo prazo: " + multaLongoPrazo);
    }
}
