package Lecciones.Swing.JButton;

/*Confeccionar una ventana que contenga tres objetos de la clase JButton con las etiquetas "1", "2" y "3".
Al presionarse cambiar el título del JFrame indicando cuál botón se presionó.*/

import Lecciones.Swing.TresJLabel;

import java.awt.event.*;
import javax.swing.*;

public abstract class TresBotones extends JFrame implements ActionListener {

    private JButton boton1,boton2,boton3;

    public TresBotones(){
        setLayout(null);
        boton1=new JButton("1");
        boton1.setBounds(10,100,90,30);
        add(boton1);
        boton1.addActionListener(this);
        boton2=new JButton("2");
        boton2.setBounds(110,100,90,30);
        add(boton2);
        boton2.addActionListener(this);
        boton3= new JButton("3");
        boton3.setBounds(210,100,90,30);
        add(boton3);
        boton3.addActionListener(this);
    }

    public void antionPerformed(ActionEvent e){
        if(e.getSource()== boton1){
            setTitle("boton 1");
        }
        if(e.getSource()== boton2){
            setTitle("boton 2");
        }
        if(e.getSource()== boton3){
            setTitle("boton 3");
        }
    }

    public static void main(String[] args){
        TresJLabel tl=new TresJLabel();
        tl.setBounds(0,0,350,200);
        tl.setVisible(true);
        tl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
