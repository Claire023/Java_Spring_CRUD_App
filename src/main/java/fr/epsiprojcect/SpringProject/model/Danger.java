package fr.epsiprojcect.SpringProject.model;


public enum Danger {
	Facile("ez"),
	Normal("nm"),
	Difficile("di"),
	Hardcore("hd");
	
	Danger(String symbol) {
		this.symbol = symbol;
	}
	
	private String symbol;
	
	public String getSymbol() {
		return symbol;
	}
}
