class Emprestimo {
    protected Material material;
    protected double taxaMulta;

    public Emprestimo(Material material, double taxaMulta) {
        this.material = material;
        this.taxaMulta = taxaMulta;
    }

    public double calcularMulta(int diasAtraso) {
        return diasAtraso * taxaMulta;
    }
}
