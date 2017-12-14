package model;

public class GameModel {
	
	private String nom1; 
	private String nom2;
	
	public GameModel(String nom1, String nom2) {
		this.nom1=nom1; 
		this.nom2=nom2;
	}
	
	public GameModel() {
	}
	
	public String getNom1() {
		return nom1;
	}
	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}
	public String getNom2() {
		return nom2;
	}
	public void setNom2(String nom2) {
		this.nom2 = nom2;
	} 
	
	private static final int LARGEUR=7; 
	private static final int HAUTEUR=6; 
	
	public int[][] tableau = new int[HAUTEUR][LARGEUR];

	public int[][] getTableau() {
		return tableau;
	}

	public void setTableau(int[][] tableau) {
		this.tableau = tableau;
	} 
	

}
