/******************************************************
Cours:  LOG121
Projet: laboratoire 4
Nom du fichier: PanneauImage.java
Date cr��: 2014-03-15

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou,
 *@date Hiver 2014
 *******************************************************/


package Vue;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Observable;

import javax.swing.JComponent;



public class PanneauImage extends JComponent implements Controleur.Observer {
	
	/**
	 * Attributs de PanneauImage
	 */
	public FenetrePrincipale fenetrePrincipale;
	private static final String CHEMIN_REP = System.getProperty("user.dir").replace("src", "");
	
	public Modele.Image image;
	
	public PanneauImage(FenetrePrincipale fenetre){
		
		this.fenetrePrincipale=fenetre;
		
		this.setVisible(true);
		
	}
	
	/**
	 * Methode qui va permettre de dessiner
	 * l'image sur le panneau image
	 */
	
	public void paint(Graphics g){
		
		super.paintComponent(g);
		
		//TEST
		Image image2 = getToolkit().getImage(CHEMIN_REP+"\\carteDuMonde.png");
		
		if(image != null) 
		g.drawImage(image2, 200, 20, this);
	}
	
	
	public void setImage(){
		image = Modele.FabriqueImage.fabriqueImage();
	}
	
	/**
	 * Methode qui permet de rafraichir 
	 * le panneauImage
	 */
	public void rafraichirPanneauImage(){
		this.validate();
		this.repaint();
	}
	
	
	/**
	 * Methode qui va permettre de mettre a jour
	 * le panneau image selon les variations de 
	 * perspective
	 */
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	
}
