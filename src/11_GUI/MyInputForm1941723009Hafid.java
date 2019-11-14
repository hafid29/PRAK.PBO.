/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_2_Menangani_Input_Pada_GUI;

/**
 *
 * @author Hafid
 */
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyInputForm1941723009Hafid extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JLabel mDLabel;
    private JTextField mAField;
    private JTextField mBField;
    private JButton mButton;
    private JButton mButton2;
    private JPanel mPanel;
    
    public MyInputForm1941723009Hafid(){
        createTextField();
        createButton();
        createButton2();
        createPanel();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
    }

    private void createTextField() {
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai C: ");
        mCLabel = new JLabel("Hasil: ");
        mDLabel = new JLabel("Hasil: ");
        final int FIELD_WIDTH = 10;
        mAField = new JTextField(FIELD_WIDTH);
        mAField.setText("0");
        mBField = new JTextField(FIELD_WIDTH);
        mBField.setText("0");
    }

    private void createButton() {
        mButton = new JButton("Calculate");//untuk membuat tombol "Calculateee"
        class AddInterestListener implements ActionListener{
        //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(mAField.getText());//menganbil inputan textbox 
                int b = Integer.valueOf(mBField.getText());
                int c = a * b;
                mCLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener = new AddInterestListener();
        mButton.addActionListener(listener);
    }
    private void createButton2() {
        mButton2 = new JButton("Jumlah");//untuk membuat tombol "Calculateee"
        class AddInterestListener2 implements ActionListener{
        //untuk event klik
            @Override
            public void actionPerformed(ActionEvent event) {
                int a = Integer.valueOf(mAField.getText());//menganbil inputan textbox 
                int b = Integer.valueOf(mBField.getText());
                int c = a + b;
                mDLabel.setText("Hasil: " + c);
            }
        }
        ActionListener listener2 = new AddInterestListener2();
        mButton2.addActionListener(listener2);
    }
    
    

    private void createPanel(){
        mPanel=new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAField);
        mPanel.add(mBLabel);
        mPanel.add(mBField);
        mPanel.add(mButton);
        mPanel.add(mButton2);
        mPanel.add(mCLabel);
        mPanel.add(mDLabel);
        add(mPanel);
        }
}
