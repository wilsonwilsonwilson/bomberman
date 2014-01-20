package fr.bomberman.model;



public class Carte {

	final char BLOCK='X';
	final char LIBRE ='.';
	
	private char[][]map;
	
	public Carte(){
		map=new char[11][11];
		for(int i=0; i<map.length;i++){
			for(int j=0;j<map.length;j++){
				if(i%2 != 0 && j%2 != 0){
					map[i][j]=BLOCK;
				}else{
				map[i][j]=LIBRE;
				}
			}
		}		
	}
	
	public char[][] getMap() {
		return map;
	}
	
	public char getCase(int x,int y){
		return map[x][y];
		
	}
	public void setCase(int x, int y, char res){
		map[x][y]=res;
	}
	
	
	@Override
	public String toString() {
		String coordonnée="   0 1 2 3 4 5 6 7 8 9 10";
		String bordure="  _______________________";
		String resultat=coordonnée+"\n"+bordure+ "\n";
		
		for(int i=0; i<map.length;i++){
			if(i==10){
				resultat=resultat+i+"|";
			}else{
			resultat=resultat+i+" "+"|";
			}
			for(int j=0;j<map.length;j++){
				if(i%2 != 0 && j%2 != 0){
					
				}
				resultat=resultat+map[i][j]+" ";
			}
			resultat=resultat+"|"+"\n";
		}
		
		
		resultat=resultat+bordure;
		return resultat;
		
	}

	public static void main(String[] args) {
		Carte c= new Carte();
		System.out.println(c.toString());

	}

}
