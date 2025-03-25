package Lecciones.Swing;

/*Crear una ventana de 1024 píxeles por 800 píxeles. Luego no permitir que el operador modifique el tamaño de la ventana.
 Sabiendo que hacemos visible al JFrame llamando la método setVisible pasando el valor true, existe otro método llamado
 setResizable que también requiere como parámetro un valor true o false.*/

import javax.swing.*;

public class VentanaJFrame extends  JFrame {

    public VentanaJFrame(){
            setLayout(null); //para ubicar los controles visuales con coordenadas absolutas
    }

    public static void main(String[] args){
        VentanaJFrame f= new VentanaJFrame();
        f.setBounds(150,200,1024,800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
