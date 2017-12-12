/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.du.nombre.mystère;

import static java.lang.Math.random;
import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class JeuDuNombreMystère {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Présentation du jeu
     System.out.println("Bonjour,");
     System.out.println("Jouons ensemble au jeu du nombre mystère.");
     System.out.println("Je choisi un nombre compris entre 1 et 100");
     System.out.println("saura-tu le retrouver?");
     byte nombrMystere = 0; //initialisation de la variable aleatoire
     byte essai = 0; //initialisation de la réponse du joueur
     char reponse = 'o'; //initialisation de la condition de boucle
     Scanner sc = new Scanner(System.in); //
     do{ nombrMystere = (byte) (Math.random()*100);
         System.out.println("debug:"+ nombrMystere);
            do{ System.out.println("Ta réponse?");
                essai = sc.nextByte();
                    if(essai > nombrMystere) //Teste si le nombre est plus grand
                     System.out.println("Nombre trop grand.");
                    else if (essai < nombrMystere)
                     System.out.println("Nombre trop petit."); //Teste si le nombre est plus petit
                    else {                                
                     System.out.println("Bien joué! On recommence? (o/n)"); // Rejouer?
                     reponse = sc.nextLine().charAt(0);}
            }while(essai == nombrMystere); //condition de sortie de la boucle = trouver le nombre               
        }while(reponse == 'o'); // Condition de sortie du programme
    System.out.println("Merci d'avoir joué avec moi.");
    System.out.println("Au revoir ...");
    }
}
