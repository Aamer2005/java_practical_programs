/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package myfirstgui;

import java.util.Stack;


/**
 *
 * @author aamer
 */
public class Claculator extends javax.swing.JFrame {

    /**
     * Creates new form Claculator
     */
    public Claculator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equalButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        plusButton = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        digit1 = new javax.swing.JButton();
        digit2 = new javax.swing.JButton();
        digit3 = new javax.swing.JButton();
        digit4 = new javax.swing.JButton();
        digit5 = new javax.swing.JButton();
        digit6 = new javax.swing.JButton();
        multiButton = new javax.swing.JButton();
        digit7 = new javax.swing.JButton();
        digit8 = new javax.swing.JButton();
        digit9 = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        AcButton = new javax.swing.JButton();
        digit0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        equalButton.setBackground(new java.awt.Color(102, 0, 255));
        equalButton.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        equalButton.setForeground(new java.awt.Color(255, 255, 255));
        equalButton.setText("=");
        equalButton.setToolTipText("Enter To Get Answer");
        equalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalButtonActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Liberation Serif", 1, 24)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(153, 153, 255));
        plusButton.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        plusButton.setText("+");
        plusButton.setToolTipText("Perform Adition");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(153, 153, 255));
        minusButton.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        minusButton.setText("-");
        minusButton.setToolTipText("Perform Substraction");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        digit1.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit1.setText("1");
        digit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit1ActionPerformed(evt);
            }
        });

        digit2.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit2.setText("2");
        digit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit2ActionPerformed(evt);
            }
        });

        digit3.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit3.setText("3");
        digit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit3ActionPerformed(evt);
            }
        });

        digit4.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit4.setText("4");
        digit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit4ActionPerformed(evt);
            }
        });

        digit5.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit5.setText("5");
        digit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit5ActionPerformed(evt);
            }
        });

        digit6.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit6.setText("6");
        digit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit6ActionPerformed(evt);
            }
        });

        multiButton.setBackground(new java.awt.Color(153, 153, 255));
        multiButton.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        multiButton.setText("*");
        multiButton.setToolTipText("Perform Multiplication");
        multiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiButtonActionPerformed(evt);
            }
        });

        digit7.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit7.setText("7");
        digit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit7ActionPerformed(evt);
            }
        });

        digit8.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit8.setText("8");
        digit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit8ActionPerformed(evt);
            }
        });

        digit9.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit9.setText("9");
        digit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit9ActionPerformed(evt);
            }
        });

        divisionButton.setBackground(new java.awt.Color(153, 153, 255));
        divisionButton.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        divisionButton.setText("/");
        divisionButton.setToolTipText("Perform Division");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        AcButton.setBackground(new java.awt.Color(255, 0, 51));
        AcButton.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        AcButton.setForeground(new java.awt.Color(255, 255, 255));
        AcButton.setText("AC");
        AcButton.setToolTipText(" Press To Clear");
        AcButton.setBorder(new javax.swing.border.MatteBorder(null));
        AcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcButtonActionPerformed(evt);
            }
        });

        digit0.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digit0.setText("0");
        digit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digit0ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Calculator");

        jLabel2.setText("Developed by : Md Aamer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(digit4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                        .addComponent(digit1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                    .addComponent(digit7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(digit0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(divisionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(digit8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(digit5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(digit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(digit3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(digit9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(digit6, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(multiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(equalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(AcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 6, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AcButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(divisionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(digit0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digit9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(digit7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digit8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digit5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digit6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digit4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(digit1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digit2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digit3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {digit8, digit9});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void digit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit1ActionPerformed
        // TODO add your handling code here:
         displayString += digit1.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit1ActionPerformed

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusButtonActionPerformed
        // TODO add your handling code here:
         displayString+= plusButton.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_plusButtonActionPerformed

    private void equalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalButtonActionPerformed
        // TODO add your handling code here:
        String result = getSolution(displayString)+"";
        jTextField1.setText(result);
    }//GEN-LAST:event_equalButtonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void digit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit2ActionPerformed
        // TODO add your handling code here:
        displayString += digit2.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit2ActionPerformed

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusButtonActionPerformed
        // TODO add your handling code here:
         displayString += minusButton.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_minusButtonActionPerformed

    private void digit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit4ActionPerformed
        // TODO add your handling code here:
         displayString += digit4.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit4ActionPerformed

    private void digit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit5ActionPerformed
        // TODO add your handling code here:
         displayString += digit5.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit5ActionPerformed

    private void multiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiButtonActionPerformed
        // TODO add your handling code here:
         displayString += multiButton.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_multiButtonActionPerformed

    private void digit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit7ActionPerformed
        // TODO add your handling code here:
         displayString += digit7.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit7ActionPerformed

    private void digit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit8ActionPerformed
        // TODO add your handling code here:
         displayString += digit8.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit8ActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed
        // TODO add your handling code here:
         displayString += divisionButton.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void digit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit3ActionPerformed
        // TODO add your handling code here:
         displayString += digit3.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit3ActionPerformed

    private void digit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit6ActionPerformed
        // TODO add your handling code here:
         displayString += digit6.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit6ActionPerformed

    private void digit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit9ActionPerformed
        // TODO add your handling code here:
         displayString += digit9.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit9ActionPerformed

    private void AcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcButtonActionPerformed
        // TODO add your handling code here:
        displayString="";
        jTextField1.setText(displayString);

    }//GEN-LAST:event_AcButtonActionPerformed

    private void digit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digit0ActionPerformed
        // TODO add your handling code here:
        displayString += digit0.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digit0ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Claculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Claculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Claculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Claculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Claculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcButton;
    private javax.swing.JButton digit0;
    private javax.swing.JButton digit1;
    private javax.swing.JButton digit2;
    private javax.swing.JButton digit3;
    private javax.swing.JButton digit4;
    private javax.swing.JButton digit5;
    private javax.swing.JButton digit6;
    private javax.swing.JButton digit7;
    private javax.swing.JButton digit8;
    private javax.swing.JButton digit9;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiButton;
    private javax.swing.JButton plusButton;
    // End of variables declaration//GEN-END:variables

    private String displayString="";
    

public static boolean isDigit(char c)
{
	if(c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'||c=='0')
	{
		return true;
	}
	else
	{
		return false;
	}
}

public static int precedence(char c)
{
	switch(c)
	{
		case '+' : return 1;
		case '-' : return 1;
		case '*' : return 2;
		case '/' : return 2;
		case '%' : return 3;
	}
	return 0;
}

public static double operation(double a,double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '%':
                return a % b;
        }
        return 0;
    }

public static double getSolution(String str) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        double num = 0d;
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            /*if(c=='.')
            {
                int temp1 = Integer.parseInt(str.charAt(i-1)+"");
                int temp2  = Integer.parseInt(str.charAt(i+1)+"");
                
                operands.push(temp1+(0.1*temp2));
                System.out.println(operands.peek());
                i++;
                continue;
            }*/
            
            if(isDigit(c)) {
                num = num * 10 + (c - '0');
            } else {
                operands.push(num);
                num = 0;
                
                while(!operators.isEmpty() && precedence(operators.peek()) >= precedence(c)) {
                    double b = operands.pop();
                   double a = operands.pop();
                    char op = operators.pop();
                    operands.push(operation(a, b, op));
                }
                operators.push(c);
            }
        }
        operands.push(num);
        
        while(!operators.isEmpty()) {
            double b = operands.pop();
           double a = operands.pop();
            char op = operators.pop();
            operands.push(operation(a, b, op));
        }
        
        return operands.pop();
    }

		


}
