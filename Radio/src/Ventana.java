import java.awt.Font;

import javax.swing.*;
 
public class Ventana extends JFrame{

    JButton boton1,boton2,boton3,boton4,boton5,boton6, AM, FM,izquierda,derecha;
    JLabel Estaciones;
    public Ventana(){
        setLayout(null);
        boton1= new JButton("1");
        boton1.setBounds(75,250,50,30);
        add(boton1);

        
        boton2= new JButton("2");
        boton2.setBounds(125,250,50,30);
        add(boton2);

        boton3= new JButton("3");
        boton3.setBounds(175,250,50,30);
        add(boton3);

        boton4= new JButton("4");
        boton4.setBounds(225,250,50,30);
        add(boton4);

        boton5= new JButton("5");
        boton5.setBounds(275,250,50,30);
        add(boton5);
        
        boton6= new JButton("6");
        boton6.setBounds(325,250,50,30);
        add(boton6);

        AM= new JButton("AM");
        AM.setBounds(325,150,100,30);
        add(AM);

        FM= new JButton("FM");
        FM.setBounds(325,200,100,30);
        add(FM);

        izquierda= new JButton("←");
        izquierda.setBounds(325,50,45,30);
        add(izquierda);

        derecha= new JButton("→");
        derecha.setBounds(375,50,45,30);
        add(derecha);

        Estaciones = new JLabel("530");
        Estaciones.setBounds(175,100,200,100);
        Estaciones.setFont(new Font("Calibri",Font.BOLD,50));
        add(Estaciones);
        
    }


    public static void main(String[] args) {
        Ventana ventana = new Ventana();
        ventana.setBounds(0,0,450,350);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}