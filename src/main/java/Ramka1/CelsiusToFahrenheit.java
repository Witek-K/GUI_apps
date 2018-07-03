package Ramka1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFahrenheit extends JFrame implements ActionListener {

    private JLabel lCelsius, lFahrenheit;
    private JTextField tCelsius, tFahrenheit;
    private JButton bKonwertuj;
    private ButtonGroup bgRozmiar;
    //private JRadioButton rbMaly, rbSredni, rbDuzy;
    //private JCheckBox chWielkie;
    private JRadioButton rbCtoF, rbFtoC;
    private ButtonGroup radioPanel;



    private double tempCelsius, tempFahrenheit;

    public CelsiusToFahrenheit(){

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
        tFahrenheit.addActionListener(this);

        bKonwertuj = new JButton("Konwertuj");
        bKonwertuj.setBounds(100,120,150,20);
        add(bKonwertuj);
        bKonwertuj.addActionListener(this);

        /* chWielkie = new JCheckBox("Wielkie litery");
        chWielkie.setBounds(250,120,150,20);
        add(chWielkie); */
        // chWielkie.addActionListener(this);

        radioPanel = new ButtonGroup();
        rbCtoF = new JRadioButton("Celsius to Fahrenfeit");
        rbCtoF.setBounds(50,150,150,20);
        rbCtoF.setSelected(true);

        rbFtoC = new JRadioButton("Fahrenheit to Celsius");
        rbFtoC.setBounds(200,150,150,20);

        radioPanel.add(rbCtoF);
        radioPanel.add(rbFtoC);

        add(rbCtoF);
        add(rbFtoC);

    }


    public void actionPerformed(ActionEvent e) {

        Object zrodlo = e.getSource();
        //if (zrodlo==bKonwertuj||zrodlo==tCelsius) {
        if (zrodlo==bKonwertuj) {
            if (rbCtoF.isSelected()){

                tempCelsius = Double.parseDouble(tCelsius.getText());
                tempFahrenheit = 32 + (9.0 / 5) * tempCelsius;
                tFahrenheit.setText(String.valueOf(tempFahrenheit));

            }
            else if (rbFtoC.isSelected()){
                tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
                tempCelsius = (tempFahrenheit - 32.0) * (5.0/9.0);
                tCelsius.setText(String.valueOf(tempCelsius));

            }
        }

        if (zrodlo==tCelsius){

            tempCelsius = Double.parseDouble(tCelsius.getText());
            tempFahrenheit = 32 + (9.0 / 5) * tempCelsius;
            tFahrenheit.setText(String.valueOf(tempFahrenheit));
        }
        else if (zrodlo==tFahrenheit){

            tempFahrenheit = Double.parseDouble(tFahrenheit.getText());
            tempCelsius = (tempFahrenheit - 32.0) * (5.0/9.0);
            tCelsius.setText(String.valueOf(tempCelsius));
        }

            /* if (chWielkie.isSelected()==true){
                tFahrenheit.setFont(new Font("SansSerif", Font.BOLD,18));
            }
            else {
                tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN,12));
            }
            tempCelsius = Double.parseDouble(tCelsius.getText());
            tempFahrenheit = 32 + (9.0 / 5) * tempCelsius;
            tFahrenheit.setText(String.valueOf(tempFahrenheit));
        } */
        /*else if (zrodlo==chWielkie){
            if (chWielkie.isSelected()==true){
                tFahrenheit.setFont(new Font("SansSerif", Font.BOLD,18));
            }
            else {
                tFahrenheit.setFont(new Font("SansSerif", Font.PLAIN,12));
            }
        }*/



    }

    public static void main(String[] args) {

        CelsiusToFahrenheit aplikacja = new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);

    }
}
