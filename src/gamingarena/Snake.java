/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamingarena;
import javax.swing.*;

public class Snake extends JFrame{

    Snake(){
        super("Snake Game");
        add(new Board());
        pack();
        
        setLocationRelativeTo(null);
//        setTitle("Snake Game");
        setResizable(false);
      
    }
    
    public static void main(String[] args){
        new Snake().setVisible(true);
    }
}