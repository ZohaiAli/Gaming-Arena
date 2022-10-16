/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamingarena;
import javax.swing.*;

public class wall extends JFrame{

    wall(){
         
        GamePlay gamePlay = new GamePlay();
      setBounds(10,20,700,600);
        setTitle("Best of RC");
       
        setResizable(false);
        add(gamePlay);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }

    public static void main(String[] args){
        new wall().setVisible(true);
    }
 }

    

   
    



