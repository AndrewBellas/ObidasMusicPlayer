/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obidasmusicplayer;

/**
 *
 * @author Andrew Bellas
 */
public class ObidasMusicPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SystemChecker sc = new SystemChecker();
        
        System.out.println(sc.checkJavaVersion());
    }
    
}
