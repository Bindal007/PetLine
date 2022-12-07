/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waypoint;

import java.awt.Cursor;
import java.awt.Dimension;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author vicke
 */
public class ButtonWaypoint extends JButton{
    
    String iconPackage = "./../icon/pin.png";
    String icon = "pin.png";
    String iconWindowsRoot = "C:\\Users\\vicke\\Desktop\\icon\\pin.png";
    String iconMacRoot = "/Users/vicken/Pictures/pin.png";
    
    // Actually adds the waypoint to the map
    // Curently not working because icon file location is "null"
    public ButtonWaypoint(){
        setContentAreaFilled(false);
        setIcon(new ImageIcon(this.getClass().getResource(icon)));        
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setSize(new Dimension(24, 24));
        
        // ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("./pin.png"));
        // setIconImage(img.getImage());
        
        // setIconImages(new ImageIcon(getClass().getResource(icon)).getImage());
        
        //URL iconURL = getClass().getResource(iconPackage);
        //ImageIcon icon = new ImageIcon(iconURL);
        //frame.setIconImage(icon.getImage());
    }
}
