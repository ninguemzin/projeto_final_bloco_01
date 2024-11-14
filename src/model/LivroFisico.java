package model;

public class LivroFisico extends Livro {

    public LivroFisico(int numero, String titulo, String autor, int ano, int formato, String genero, int numeropaginas, float preco) {
        super(numero, titulo, autor, ano, formato, genero, numeropaginas, preco);
    }

    @Override
    public void visualizarLivro() {
    	System.out.println("Livro Digital: ");
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + getAutor());
        System.out.println("Ano: " + getAno());
        System.out.println("Formato: " + (getFormato() == 1 ? "Físico" : "Digital"));
        System.out.println("Gênero: " + getGenero());
        System.out.println("Número de Páginas: " + getNumeropaginas());
        System.out.println("Preço: R$ " + getPreco());
    }
}