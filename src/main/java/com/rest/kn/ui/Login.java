package com.rest.kn.ui;

import javax.swing.JOptionPane;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 91790
 */
@Component
public class Login extends javax.swing.JFrame {

	/**
	 * Creates new form Login
	 */
	
	@Autowired
	Home home;
	public Login() {
		initComponents();
		setLocationRelativeTo(null);
		System.out.println(home);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		btnReset = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		txtUsername = new javax.swing.JTextField();
		btnLogin = new javax.swing.JButton();
		btnClose = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		txtPassword = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		jPanel1.setBackground(new java.awt.Color(153, 153, 153));

		jLabel3.setText("Password : ");

		btnReset.setText("Reset");
		btnReset.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnResetActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
		jLabel1.setText("Welcome!");

		btnLogin.setText("Login");
		btnLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnLoginActionPerformed(evt);
			}
		});

		btnClose.setText("Close");
		btnClose.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnCloseActionPerformed(evt);
			}
		});

		jLabel2.setText("Username : ");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup().addGap(127, 127, 127).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(jLabel3).addComponent(jLabel2))
								.addComponent(btnLogin))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel1Layout.createSequentialGroup().addGap(13, 13, 13)
												.addComponent(btnReset).addGap(18, 18, 18).addComponent(btnClose))
										.addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 225,
												Short.MAX_VALUE)
										.addComponent(txtUsername))))
						.addContainerGap(43, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel1)
						.addGap(78, 78, 78)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2).addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel3).addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnLogin).addComponent(btnReset).addComponent(btnClose))
						.addGap(51, 51, 51)));

		getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 370, 360));

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-background.PNG"))); // NOI18N
		getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnLoginActionPerformed
		// TODO add your handling code here:
		String username=txtUsername.getText();
		String pwd=txtPassword.getText();
		
		if (StringUtils.isNotBlank(username)&& StringUtils.isNotBlank(pwd)) {
			if (username.equalsIgnoreCase("admin")&&pwd.equalsIgnoreCase("admin")) {
//				JOptionPane.showMessageDialog(null, "Going into home page");
				setVisible(false);
				home.setVisible(true);
			}else {
				JOptionPane.showMessageDialog(null, "Username or Password Incorrect.");
			}
		}else {
			JOptionPane.showMessageDialog(null, "Please fill mandatory fields");
		}
		clearAllFields();
	}// GEN-LAST:event_btnLoginActionPerformed

	private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnResetActionPerformed
		// TODO add your handling code here:
		clearAllFields();
	}// GEN-LAST:event_btnResetActionPerformed

	private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCloseActionPerformed
		this.dispose();
	}// GEN-LAST:event_btnCloseActionPerformed
	
	private void clearAllFields() {
		txtUsername.setText("");
		txtPassword.setText("");
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnClose;
	private javax.swing.JButton btnLogin;
	private javax.swing.JButton btnReset;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField txtPassword;
	private javax.swing.JTextField txtUsername;
	// End of variables declaration//GEN-END:variables
}
