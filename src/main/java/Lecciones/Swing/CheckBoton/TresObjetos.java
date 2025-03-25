package Lecciones.Swing.CheckBoton;

/*Confeccionar un programa que muestre 3 objetos de la clase JCheckBox con etiquetas de tres idiomas. Cuando se lo
selecciona mostrar en el título del JFrame todos los JCheckBox seleccionados hasta el momento.*/

import Lecciones.Swing.JButton.TresBotones;

import javax.swing.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class TresObjetos extends JFrame implements ChangeListener {

    private JCheckBox check1,check2,check3;

    public TresObjetos(){
        setLayout(null);
        check1= new JCheckBox("Ingles");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);
        check2=new JCheckBox("Francés");
        check2.setBounds(10,50,150,30);
        check2.addChangeListener(this);
        add(check2);
        check3= new JCheckBox("Alemán");
        check3.setBounds(10,90,150,30);
        check3.addChangeListener(this);
        add(check3);
    }

    public void stateChanged(ChangeEvent changeEvent){
        String cad="";
        if(check1.isSelected()== true){
            cad=cad+"Inglés-";
        }
        if(check2.isSelected()== true){
            cad=cad + "Portugués";
        }
        if(check3.isSelected()==true){
            cad = cad + "Alemán";
        }
        setTitle(cad);
    }

    public static void main(String[] args){
        TresObjetos to= new TresObjetos();
        to.setBounds(0,0,300,200);
        to.setVisible(true);
        to.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
