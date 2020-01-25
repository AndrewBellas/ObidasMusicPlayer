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

/**
 * Performs a system check before allowing access to the software.
 * Should the system fail the check due to lacking facilities, an error message will be displayed.
 */
public class SystemChecker {
    public Boolean checkJavaVersion(){
        String javaVersionCheck = System.getProperty("java.version");
        
        String check = javaVersionCheck.split("\\.")[0]; //Parse and find first integer to check for system support
        
       Integer convCheck = Integer.parseInt(check);
        
        Boolean checkValidator = false;
        
        if (convCheck >= 13){
            checkValidator = true;
        }
        
        if (convCheck < 13){
            checkValidator = false;
        }
        
        return checkValidator;
    }
}
