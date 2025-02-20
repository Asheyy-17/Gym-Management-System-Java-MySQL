package Gym_Management;

import java.awt.*;
// import java.awt.event.*;
// import java.sql.*;
import javax.swing.*;

public class Abs_Exercises extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10;
    JPanel p1, p2;

    Abs_Exercises() {
        super("Cardio Exercise Images");
        setSize(1600, 900);

        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c1.jpg"));
        Image imag = img.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l1 = new JLabel(new ImageIcon(imag));

        ImageIcon img1 = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c2.jpg"));
        Image imag1 = img1.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l2 = new JLabel(new ImageIcon(imag1));

        ImageIcon img2 = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c3.jpg"));
        Image imag2 = img2.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l3 = new JLabel(new ImageIcon(imag2));

        ImageIcon img3 = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c4.jpg"));
        Image imag3 = img3.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l4 = new JLabel(new ImageIcon(imag3));

        ImageIcon img4 = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c5.jpg"));
        Image imag4 = img4.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l5 = new JLabel(new ImageIcon(imag4));

        ImageIcon img5 = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c6.jpg"));
        Image imag5 = img5.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l6 = new JLabel(new ImageIcon(imag5));

        ImageIcon img6 = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c7.jpg"));
        Image imag6 = img6.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l7 = new JLabel(new ImageIcon(imag6));

        ImageIcon img7 = new ImageIcon(ClassLoader.getSystemResource("Gym_Management/icons/c8.jpg"));
        Image imag7 = img7.getImage().getScaledInstance(300, 350, Image.SCALE_DEFAULT);
        l8 = new JLabel(new ImageIcon(imag7));

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.setBackground(Color.BLACK);
        p1.add(l1);
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);

        add(p1);
    }

    public static void main(String args[]) {
        new Abs_Exercises().setVisible(true);
    }
}
