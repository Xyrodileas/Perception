/******************************************************
Cours:  LOG121
Projet: laboratoire 4
Nom du fichier: SingletonCommande.java
Date creer le: 2014-03-15

 *******************************************************
 *@author Alexis Vuillaume, David Murat, Idriss Aissou,
 *@date Hiver 2014
 *******************************************************/
package Controleur;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import Vue.PanneauImage;

public class PopMenuClicDroit extends JPopupMenu {
	
	
	//ATTRIBUTS DE LA CLASSE PoPMenuClicDroit
	private JPopupMenu menuClicDroit;
	private JMenuItem menu1;
	private JMenuItem menu2;
	private static PanneauImage panneauImage;
	private int [] perspective;
	
	public PopMenuClicDroit(PanneauImage panneauR){
		
		panneauImage=panneauR;
		perspective = new int[3];
		
		
		menuClicDroit = new JPopupMenu();

		menu1 = new JMenuItem("Copier Perspective");
		menu1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				perspective[0] = panneauImage.getPerspective().getPositionX();
						perspective[1] = panneauImage.getPerspective().getPositionY();
								perspective[2] = (int)panneauImage.getPerspective().getZoom();
		    }
	    });
	    
	    menu2 = new JMenuItem("Coller Perspective");
		menu2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				
				SingletonCommande.execution(3, perspective, panneauImage);
		    }
	    });
	  
	    menuClicDroit.add(menu1);
	    menuClicDroit.add(menu2);
 
		
	}
	
	/**
	 * Permet d'afficher le menu clic droit selon la position de la souris
	 * @param comp
	 * @param x
	 * @param y
	 */
	public void declancheMenu(Component comp,int x,int y){
		menuClicDroit.show(comp,x, y);
	}
}
