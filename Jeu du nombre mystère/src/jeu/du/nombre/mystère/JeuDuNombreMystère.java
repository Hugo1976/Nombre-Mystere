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
        // Initialisation des variables
    byte nombrMystere = 0; //initialisation de la variable aleatoire
    byte essai = 0; //initialisation de la réponse du joueur
    char reponse = 'o'; //initialisation de la condition de boucle
    
        // Présentation du jeu
     System.out.println("Bonjour,");
     System.out.println("Jouons ensemble au jeu du nombre mystère.");
     System.out.println("Je choisi un nombre compris entre 1 et 100");
     System.out.println("saura-tu le retrouver?");
     
     Scanner sc = new Scanner(System.in); //Objet scanner
 
     do{ // tant que la reponse est "o" nous restons dans la boucle principale
         nombrMystere = (byte) (Math.random()*100); // generation du nombre mystère
         
         System.out.println("debug:" + nombrMystere);// code temporaire pour visualiser le nombre mystere
            
         do{ // Tant que le joueur n'a pas trouvé le nombre mystère nous restons dans la boucle
             System.out.println("Ta réponse?");
                
             do{ //contrôle des entrées clavier (compris entre 0 et 100)
                    essai = 0;
                    essai = sc.nextByte();
                    if(essai < 0 && essai > 100)
                    System.out.println("entrée incorrete! veuillez saisir un nombre compris entre 0 et 100");
                }while(essai < 0 || essai > 100);
   
                sc.nextLine(); //vidage de la ligne lue
                    
                if(essai > nombrMystere) //Teste si le nombre est plus grand
                     System.out.println("Nombre trop grand."); //le switch aurai ici pu être utilisé
                
                else if(essai < nombrMystere)
                     System.out.println("Nombre trop petit."); //Teste si le nombre est plus petit
                
                        else       
                            System.out.println("Bien joué! On recommence? (o/n)"); // Rejouer?                                
                                
            }while(essai != nombrMystere); //condition de sortie de la boucle = trouver le nombre  
        
            do{ // contrôle entrée clavier (o/n)
                reponse = 'o';
                reponse = sc.nextLine().charAt(0);//possibilité de mette ici une boucle de contrôle des entrées clavier (o/n)
                sc.nextLine(); //vidage de la ligne lue
                if(reponse != 'o' && reponse != 'n')
                System.out.println("entrée incorrete! veuillez saisir o ou n");    
            }while(reponse != 'o' && reponse != 'n');
                 
        }while(reponse == 'o'); // Condition de sortie du programme
     
    System.out.println("Merci d'avoir joué avec moi.");
    System.out.println("Au revoir ... ;-)");
    // Fin du programme
    }
}
