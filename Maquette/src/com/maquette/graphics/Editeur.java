package com.maquette.graphics;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Editeur extends JFrame {

	private JPanel Panel_Haut = new JPanel();
	
	private JPanel Panel_Bas = new JPanel();
	private JPanel Panel_Bas_Gauche = new JPanel();
	private JPanel Panel_Bas_GaucheC = new JPanel();
	private JPanel Panel_Bas_Centre = new JPanel();
	private JPanel Panel_Bas_CentreC = new JPanel();
	
	
	private JPanel Container = new JPanel();
	
	
	public Editeur(String titre, int largeur, int hauteur) {
		// TODO Auto-generated constructor stub
		
		super();
		
		this.setTitle(titre);
		this.setSize(largeur, hauteur);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Panel_Haut.setLayout(new BorderLayout());
		Panel_Haut.setPreferredSize(new Dimension(1300, 100));
		Panel_Haut.setBorder(BorderFactory.createTitledBorder("XXXXXXX"));
		
		Panel_Bas.setLayout(new BorderLayout());
		Panel_Bas_Gauche.setLayout(new BorderLayout());
		Panel_Bas_Gauche.setBorder(BorderFactory.createTitledBorder("A classer..."));
		Panel_Bas_Gauche.setPreferredSize(new Dimension(200, 650));
		Panel_Bas_Gauche.add(Panel_Bas_GaucheC, BorderLayout.CENTER);
		//Panel_Bas_GaucheC.setBackground(Color.WHITE);
		Panel_Bas_Centre.setLayout(new BorderLayout());
		Panel_Bas_Centre.setBorder(BorderFactory.createTitledBorder("Groupes"));
		Panel_Bas_Centre.setPreferredSize(new Dimension(1100, 600));
		Panel_Bas_Centre.add(Panel_Bas_CentreC, BorderLayout.CENTER);
		//Panel_Bas_CentreC.setBackground(Color.WHITE);
		
		Panel_Bas.add(Panel_Bas_Gauche, BorderLayout.WEST);
		Panel_Bas.add(Panel_Bas_Centre, BorderLayout.CENTER);
			
		Container.add(Panel_Haut, BorderLayout.NORTH);
		Container.add(Panel_Bas, BorderLayout.CENTER);
	
		this.getContentPane().add(Container);
		
		this.setVisible(true);
	}



	public static void main(String[] args)
	{
		Editeur monEditeur = new Editeur("Classeur - Maquette", 1300, 790);
	}
}
