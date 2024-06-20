package LojaBolos.Repository;

public class BoloPronto extends Bolo{
    private String sabor;
    private String cobertura;
    
    public BoloPronto(int id, String nome, double preco, String sabor, String cobertura) {
        super(id, nome, preco);
        this.sabor = sabor;
        this.cobertura = cobertura;
    }

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
    
    @Override
    public String toString() {
        return super.toString() + ", sabor=" + sabor + ", cobertura=" + cobertura + "]";
    }
	
    @Override
    public String getDescricao() {
        return "Bolo sabor de " + sabor + " e cobertura de " + cobertura;
    }
}
