/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan_3_Manajemen_Layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Hafid
 */
public class Border1941723009Hafid extends JFrame{
    public static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JPanel mPanel;
    
    public Border1941723009Hafid(){
        mPanel= new JPanel();
        mPanel.setLayout(new BorderLayout());
        
        mPanel.add(new JButton("1"), BorderLayout.NORTH);
        mPanel.add(new JButton("2"), BorderLayout.WEST);
        mPanel.add(new JButton("3"), BorderLayout.CENTER);
        mPanel.add(new JButton("4"), BorderLayout.EAST);
        mPanel.add(new JButton("5"), BorderLayout.SOUTH);
        
        add(mPanel);
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Border Layout Demo");
    }
}
