package br.com.saphira.beans;

public enum Genero {
	Fantasia(1),
	FiccaoCientifica(2),
	Aventura(3),
	Horror(4),
	Romance(5),
	Infantil(6);
		
	private int id;
	
	private Genero(int id) {
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	
	
	
}
