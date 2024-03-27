class EmprestimoLongoPrazo extends Emprestimo {
    public EmprestimoLongoPrazo(Material material, double taxaMulta) {
        super(material, taxaMulta);
    }
    @Override
    public double calcularMulta(int diasAtraso) {
        return super.calcularMulta(diasAtraso) * 2; // Exemplo: a multa é o dobro para empréstimos de longo prazo
    }
}
