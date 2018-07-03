package Ramka1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MojeOkno extends JFrame implements ActionListener {

    JButton bPodajDate, bWyjscie;
    JLabel lWyswietlDate;

    public MojeOkno() {
        setSize(300,200);
        setTitle("Takie sobie okno");
        setLayout(null);
        bPodajDate = new JButton("Podaj datę");
        bPodajDate.setBounds(50,50,100,20);
        add(bPodajDate);
        bPodajDate.addActionListener(this);

        bWyjscie = new JButton("Wyjście");
        bWyjscie.setBounds(150,50,100,20);
        add(bWyjscie);
        bWyjscie.addActionListener(this);

        lWyswietlDate = new JLabel("Data:");
        lWyswietlDate.setBounds(50,100,250,20);
        lWyswietlDate.setForeground(new Color(0,0,255));
        lWyswietlDate.setFont(new Font("SansSerif", Font.BOLD, 14));
        add(lWyswietlDate);

    }

    public static void main(String[] args) {

        MojeOkno okno = new MojeOkno();
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        Object zrodlo = e.getSource();
        if (zrodlo==bPodajDate) {
            lWyswietlDate.setText(new Date().toString());
            //System.out.println(new Date());
        }
        else if (zrodlo==bWyjscie){
            dispose();
        }
    }
}
