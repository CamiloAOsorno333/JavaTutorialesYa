package Lecciones.Swing.JButton;

/*Confeccionar una ventana que muestre un botón. Cuando se presione finalizar la ejecución del programa Java.*/

import javax.swing.*;
import java.awt.event.*;

public  class UnBoton extends  JFrame implements ActionListener {

    JButton boton1;

    public UnBoton(){
        setLayout(null);
        boton1= new JButton("Finalizar");
        boton1.setBounds(300,250,100,30);
        add(boton1);
        boton1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()== boton1){
            System.exit(0);
        }
    }

    public static void main(String[] args){
        UnBoton bt= new UnBoton();
        bt.setBounds(0,0,450,350);
        bt.setVisible(true);
        bt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


}
