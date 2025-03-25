package Lecciones.Swing.TextArea;

import javax.swing.*;


/*Confeccionar un programa que permita ingresar un mail en un control de tipo JTextField y el cuerpo del mail en un
control de tipo JTextArea.*/

public class AreaTexto extends JFrame  {

    private JTextField textfield1;
    private JTextArea textarea1;

    public AreaTexto(){
        setLayout(null);
        textfield1=new JTextField("");
        textfield1.setBounds(10,10,200,30);
        add(textfield1);
        textarea1= new JTextArea();
        textarea1.setBounds(10,50,400,300);
        add(textarea1);
    }

    public static void main(String[] args){
        AreaTexto at= new AreaTexto();
        at.setBounds(0,0,540,400);
        at.setVisible(true);
        at.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
