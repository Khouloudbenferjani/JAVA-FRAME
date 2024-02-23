package GUIFRAMEMETHOD1;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
public class Main { 

public static void main(String[] args) { 

    // JFrame = a GUI window to add components to 

    JFrame frame = new JFrame(); //creates a frame 
    frame.setVisible(true); //make frame visible 
    frame.setTitle("JFrame title goes here"); //sets title of frame 
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    frame.setResizable(false); //prevent frame from being resized 
    frame.setSize(420,420); //sets the x-dimension, and y-dimension of frame 
    ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon 
    frame.setIconImage(image.getImage()); //change icon of frame
    frame.getContentPane().setBackground(new Color(0x123456)); //change color WITH ITS CSS of background 
    //frame.getContentPane().setBackground(Color.blue); //change STANDARD color of background

 }}