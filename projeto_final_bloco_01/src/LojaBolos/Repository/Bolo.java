package LojaBolos.Repository;

public abstract class Bolo {
    private int id;
    private String nome;
    private double preco;
	public Bolo(int id, String nome, double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
    
    @Override
    public String toString() {
        return "Bolo [id=" + id + ", nome=" + nome + ", preco=" + preco + "]";
    }
	
    public abstract String getDescricao();
}
