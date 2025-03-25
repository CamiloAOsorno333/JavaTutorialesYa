package Lecciones.Swing;

import javax.swing.*;

public class Formulario extends JFrame {

    private JLabel label1,label2,label3;

    public Formulario(){
        setLayout(null);
        label1= new JLabel("Sistema de Facturación.");
        label1.setBounds(10,20,300,30);
        add(label1);
        label2= new JLabel("Version 1.0");
        label2.setBounds(10,100,100,30);
        add(label2);
    }

    public static void main(String[] args) {
        Formulario jl= new Formulario();
        jl.setBounds(0,0,300,200);
        jl.setResizable(false);
        jl.setVisible(true);
        jl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
