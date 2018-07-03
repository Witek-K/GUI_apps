package Ramka1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFahrenheitJCheckBox extends JFrame implements ActionListener {

    private JLabel lCelsius, lFahrenheit;
    private JTextField tCelsius, tFahrenheit;
    private JButton bKonwertuj;
    private ButtonGroup bgRozmiar;
    private JRadioButton rbMaly, rbSredni, rbDuzy;
    private JCheckBox chWielkie;
    private double tempCelsius, tempFahrenheit;

    public CelsiusToFahrenheitJCheckBox(){

        setSize(400,250);
        setTitle("Przeliczanie stopni Celsiusza na Fahrenheita");
        setLayout(null);

        lCelsius = new JLabel("Stopnie Celsiusza:");
        lCelsius.setBounds(20,20,150,20);
        add(lCelsius);

        tCelsius = new JTextField("");
        tCelsius.setBounds(170,20,150,20);
        add(tCelsius);
        tCelsius.addActionListener(this);
        tCelsius.setToolTipText("Podaj temperaturę w stopniach Celsiusza");

        lFahrenheit = new JLabel("Stopnie Fahrenheita:");
        lFahrenheit.setBounds(20,70,150,20);
        add(lFahrenheit);

        tFahrenheit = new JTextField("");
        tFahrenheit.setBounds(170,70,150,20);
        add(tFahrenheit);

        bKonwertuj = new JButton("Konwertuj");
        bKonwertuj.setBounds(100,120,150,20);
        add(bKonwertuj);
        bKonwertuj.addActionListener(this);

        /* chWielkie = new JCheckBox("Wielkie litery");
        chWielkie.setBounds(250,120,150,20);
        add(chWielkie);
        chWielkie.addActionListener(this); */

        bgRozmiar = new ButtonGroup();
        rbMaly = new JRadioButton("Mały", true);
        rbMaly.setBounds(50,150,100,20);
        bgRozmiar.add(rbMaly);
        add(rbMaly);
        rbMaly.addActionListener(this);

        rbSredni = new JRadioButton("Średni", false);
        rbSredni.setBounds(150,150,100,20);
        bgRozmiar.add(rbSredni);
        add(rbSredni);
        rbSredni.addActionListener(this);

        rbDuzy = new JRadioButton("Duży", false);
        rbDuzy.setBounds(250,150,100,20);
        bgRozmiar.add(rbDuzy);
        add(rbDuzy);
        rbDuzy.addActionListener(this);

    }


    public void actionPerformed(ActionEvent e) {

        Object zrodlo = e.getSource();
        if (zrodlo==bKonwertuj||zrodlo==tCelsius) {
            tempCelsius = Double.parseDouble(tCelsius.getText());
            tempFahrenheit = 32 + (9.0 / 5) * tempCelsius;
            tFahrenheit.setText(String.valueOf(tempFahrenheit));
        }
        /*else if (zrodlo==chWielkie){
            if (chWielkie.isSelected()==true){
                tFahrenheit.setFont(new Font("SansSerif", Font.BOLD,18));
            }
            else {
                tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN,12));
            }
        }*/

        else if (zrodlo==rbMaly){
            tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN,12));
        }

        else if (zrodlo==rbSredni){
            tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN,16));
        }

        else if (zrodlo==rbDuzy){
            tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN,18));
        }


    }

    public static void main(String[] args) {

        CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);

    }
}
