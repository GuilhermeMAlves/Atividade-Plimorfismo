package model;

public abstract class Animal {
	private String Nome;
	private int Idade;
	
	protected Animal() {
		Nome = "sem nome";
		Idade = 0;
	}
	protected Animal(String nome, int idade){
		Nome = nome;
		Idade = idade;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public int getIdade() {
		return Idade;
	}
	
	public void setIdade(int idade) {
		this.Idade = idade;
	}
	
	abstract public void emitirSom();
}