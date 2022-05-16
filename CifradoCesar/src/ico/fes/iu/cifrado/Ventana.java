/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.iu.cifrado;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author arman
 */
public class Ventana extends JFrame implements ActionListener{
    Font awtfont = new Font("", 6, 18);
    Color colores = new Color(230, 210, 80); //colores para botones, me marca error si pongo un color mayor a 250 
    JLabel jl1 = new JLabel(" Cifrado Cesar "); //titulo
    JLabel jl2 = new JLabel("Llave"); //key
    JButton boton_uno = new JButton();
    JButton boton_dos = new JButton();
    JTextField jtf = new JTextField();
    JTextArea texto = new JTextArea(" Ingresa un mensaje... ", 8, 22); //Mensaje que se va a introducir para  cifrar
    JTextArea tArea = new JTextArea(8, 22);
    CodigoCesar Ccesar = new CodigoCesar();
    public Ventana() {
        setSize(700, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        init();
     }
    
    private void init()
    {
       jl1.setFont(awtfont);
       jl1.setBounds(280, 0, 140, 40); //medidas para el titulo
       jl2.setBounds(120, 40, 55, 30); //medidas del boton llave
       boton_uno.setText("Cifrar"); //boton para hacer el cifrado 
       boton_uno.setBackground(colores);
       boton_uno.setBounds(305, 515, 100, 25);
       boton_uno.addActionListener(this);
       boton_dos.addActionListener(this);   
       boton_dos.setText("Descifrar"); //boton para hacer el cambio
       boton_dos.setBackground(colores);
       boton_dos.setBounds(475, 42, 115, 28);
       texto.setBounds(50, 75, 270 , 420);
       texto.setLineWrap(true);
       tArea.setBounds(385, 75, 270, 420);
       tArea.setLineWrap(true); 
       jtf.setBounds(165, 45, 60, 26);
       add(jl1);
       add(boton_uno);
       add(boton_dos);
       add(texto);
       add(tArea);
       add(jtf);
       add(jl2);
       getContentPane().setBackground(new Color(250, 200, 240)); //colores del fondo, me marca un error si pongo por encima de 250 
       getContentPane().setLayout(null);
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == boton_uno){
           Ccesar.setCodigo(Integer.parseInt(jtf.getText()));
           Ccesar.secret(texto.getText());
           tArea.setText(Ccesar.Cadenas);
           getContentPane().repaint();
    }
    if (e.getSource() == boton_dos){
           Ccesar.setCodigo(Integer.parseInt(jtf.getText()));
           Ccesar.unsecret(texto.getText());
           tArea.setText(Ccesar.Cadenas);
           getContentPane().repaint();
    }
  }

    
    
}
