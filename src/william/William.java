/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package william;

/**
 *
 * @author william
 */
public class William {
    static int i = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello world");
        Lapin theLapin = new Lapin("bob", 4); 
        while (i<=10){
           theLapin.crie();
           i = i+ 1; 
        }
        
    }
    
}

