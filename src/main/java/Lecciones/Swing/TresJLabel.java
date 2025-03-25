package Lecciones.Swing;

import javax.swing.*;

/*Crear tres objetos de la clase JLabel, ubicarlos uno debajo de otro y mostrar nombres de colores.*/

public class TresJLabel extends JFrame {

    private JLabel label1,label2,label3;

    public TresJLabel(){
        setLayout(null);
        label1=new JLabel("Ventana 1");
        label1.setBounds(10,20,100,30);
        add(label1);
        label2= new JLabel("Ventana 2");
        label2.setBounds(10,60,100,30);
        add(label2);
        label3=new JLabel("Ventana 3");
        label2.setBounds(10,100,100,30);
        add(label3);
    }

    public static void main(String[] args) {
        TresJLabel t= new TresJLabel();
        t.setBounds(0,0,300,200);
        //t.setResizable(false);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
