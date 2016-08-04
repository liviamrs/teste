package hotel;

public class Animal {
	private String nome, tipo;
	private int idade;
	
	public Animal(String nome, String tipo, int idade)throws Exception{
		if(nome == null || nome.trim().equals("")){
			throw new Exception("Nome de um animal nao pode ser nulo ou vazio");
		}
		this.nome = nome;
		this.tipo = tipo;
		this.idade = idade;
	}

}
