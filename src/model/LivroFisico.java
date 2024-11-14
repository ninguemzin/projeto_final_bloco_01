package model;

public class LivroFisico extends Livro {

    private float preco;

    public LivroFisico(int id, String titulo, String editora, String autor, int ano, int formato, String genero, String descricao, int numeropaginas, float preco) {
        super(id, titulo, editora, autor, ano, formato, genero, descricao, numeropaginas);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public void visualizarLivro() {
        System.out.println("Livro Físico: " + getTitulo() + ", Preço: R$" + preco);
    }
}