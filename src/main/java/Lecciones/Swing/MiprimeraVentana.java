package Lecciones.Swing;

import javax.swing.*;

public class MiprimeraVentana extends JFrame{
    private JFrame label1;

    public MiprimeraVentana(){
        setLayout(null);
        label1=new JFrame("Hola Mundo");
        label1.setBounds(10,20,200,30);
        add(label1);
    }

    public static void main(String[] args) {
        MiprimeraVentana formulario1= new MiprimeraVentana();
        formulario1.setBounds(10,10,400,300);
        formulario1.setVisible(true);
        formulario1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
