/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package waypoint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

/**
 *
 * @author vicke
 */
public class MyWaypoint extends DefaultWaypoint{
    
    private String name;
    private JButton button;
    
    public MyWaypoint(){
        
    }
    
    public MyWaypoint(String name, EventWaypoint event, GeoPosition coord){
        super(coord);
        this.name = name;
        initButton(event);
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public JButton getButton(){
        return button;
    }
    public void setButton(JButton button){
        this.button = button;
    }
     
    private void initButton(EventWaypoint event){
        button = new ButtonWaypoint();
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                event.selected(MyWaypoint.this);
            }
        });
    }
}
