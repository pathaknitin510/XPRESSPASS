/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xpresspass.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;


public class SplashpaneHod extends JPanel {
    	 JProgressBar progressBar;

	public SplashpaneHod() {
		setLayout(new BorderLayout());
		setBorder(BorderFactory.createLineBorder(new Color(255,0,0),1));
		Icon icon = new ImageIcon(getClass().getResource("/images/xpresspass.png"));
		add(new JLabel(icon), BorderLayout.CENTER);
		progressBar = new JProgressBar(1, 100);
                progressBar.setPreferredSize(new Dimension(25,25));
		progressBar.setForeground(new Color(255,0,0));
		
                add(progressBar, BorderLayout.SOUTH);
	}

	public void setProgress(int progress) {
		progressBar.setValue(progress);
	}

	public static void main(String args[]) {
	  
       	
            SplashpaneHod sp = new SplashpaneHod();
		JWindow win = new JWindow();
		win.setContentPane(sp);
		win.pack();
		win.setLocationRelativeTo(null);
		win.setVisible(true);
		try {
			for (int i = 1; i <= 100; i++) {
                           
				Thread.sleep(20);
				sp.setProgress(i);
                                
			}
		} 
                catch (Exception e) {
                    e.printStackTrace();
		}
		win.setVisible(false);
		win.dispose();
              WelcomeHod u = new WelcomeHod();
              u.setVisible(true);
               
                
	}
}
