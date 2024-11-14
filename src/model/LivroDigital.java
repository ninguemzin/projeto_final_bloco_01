package model;

public class LivroDigital extends Livro {

    private float preco;

    public LivroDigital(int id, String titulo, String editora, String autor, int ano, int formato, String genero, String descricao, int numeropaginas, float preco) {
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
        System.out.println("Livro Digital: " + getTitulo() + ", Preço: R$" + preco);
    }
}