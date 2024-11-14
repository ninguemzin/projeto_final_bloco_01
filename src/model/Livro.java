package model;

public abstract class Livro {
	
	private int id;   
	private String titulo;       
	private String editora;      
	private String autor;       
	private int ano;              
	private String formato;       
	private String genero;        
	private String descricao;    
	private int numeropaginas;
	
	public Livro(int id, String titulo, String editora, String autor, int ano, String formato, String genero,
			String descricao, int numeropaginas) {
		this.id = id;
		this.titulo = titulo;
		this.editora = editora;
		this.autor = autor;
		this.ano = ano;
		this.formato = formato;
		this.genero = genero;
		this.descricao = descricao;
		this.numeropaginas = numeropaginas;
	}    
}
