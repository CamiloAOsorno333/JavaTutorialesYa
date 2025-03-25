package Lecciones.Swing.JComboBox;

/*cargar en un JComboBox los nombres de varios colores. Al seleccionar alguno mostrar en la barra de título del JFrame
el String seleccionado.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public  class BotonList extends JFrame implements ItemListener {

    private JComboBox<String> combo1;

    public BotonList(){
        setLayout(null);
        combo1= new JComboBox<String>();
        combo1.setBounds(10,10,80,20);
        add(combo1);
        combo1.addItem("Rojo");
        combo1.addItem("Azul");
        combo1.addItem("Amarillo");
        combo1.addItem("Verde");
        combo1.addItem("Negro");
        combo1.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == combo1){
            String seleccionado= (String)combo1.getSelectedItem();
            setTitle(seleccionado);
        }
    }

    public static void main(String[] args){
        BotonList bl= new BotonList();
        bl.setBounds(0,0,200,150);
        bl.setVisible(true);
        bl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
