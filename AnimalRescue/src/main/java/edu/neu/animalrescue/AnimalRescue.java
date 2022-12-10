/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edu.neu.animalrescue;
import login.LoginForm;
import login.Splash;
/**
 *
 * @author nikhilbindal
 */
public class AnimalRescue {
    public static void main(String[] args) {
        Splash MySplash = new Splash();
        MySplash.setVisible(true);
        try{
            for(int i = 0; i <= 100; i++)
            {
                Thread.sleep(80);
                MySplash.setProgress(i);

            }
        }catch(Exception e)
        {

        }
        new LoginForm().setVisible(true);
        MySplash.dispose();
    }
}
