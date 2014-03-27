/******************************************************
Cours:  LOG121
Projet: laboratoire 4
Nom du fichier: OriginatoPerspective.java
Date cr��: 2014-03-15

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou,
 *@date Hiver 2014
 *******************************************************/

package Modele;


public class Perspective extends Modele.Observable {
	private double zoom;
	public Gardien sauvegardes;

	private int hauteurImage;
	private int largeurImage;
	private int positionX;
	private int positionY;

    public Perspective(int largeurImageR, int hauteurImageR){
		
		hauteurImage = hauteurImageR;
		largeurImage= largeurImageR;
		
		positionX =0;
		positionY =0;
		this.zoom = 1.00;
        this.sauvegardes = new Gardien();

		
	}
    public Perspective(int largeurRecu, int hauteurRecu, double zoom){

        this.positionX = hauteurRecu;
        this.zoom = zoom;
        positionX = 0;
        positionY = 0;
    }

	


    public double getZoom(){
        return zoom;
    }
    
    
    
    public void incrementeZoom(){
    	
    	if(zoom>0.050)
    		this.zoom=this.zoom-0.050;
  
    	  Notify();
    }
    public void decrementeZoom(){
    	
    	this.zoom=this.zoom+0.050;
    	  Notify();
    }

    public int getHauteurImage(){
        return this.hauteurImage;
    }

    public int getLargeurImage(){
        return this.largeurImage;
    }
    
    //------------------------GESTION DU DEPLACEMENT DE L'IMAGE---------------------
    /**
     * Permet de modifier la position
     * de l'image en X
     * @param deplacementRecuX
     */
    public void setPositionX(int deplacementRecuX){
        positionX += deplacementRecuX;
        Notify();

    }
    
    /**
     * Permet de modifier la position
     * de l'image en Y
     * @param deplacementRecuY
     */
    public void setPositionY(int deplacementRecuY){

        positionY += deplacementRecuY;
        Notify();
    }

    /**
     * Permet de retourner la position de l'image selon X
     * @return (int)
     */
    public int getPositionX(){
    	return this.positionX;
    }
    
    /**
     * Permet de retourner la position de l'image selon Y
     * @return (int)
     */
    public int getPositionY(){
    	return this.positionY;
    }
    
    public int recupereCentreXDImage(){
    	return this.positionY /2;
    }
    public int recupereCentreYDImage(){
    	return this.hauteurImage/2;
    }
    
    


}
