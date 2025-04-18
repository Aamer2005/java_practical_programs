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
public class Calculator extends javax.swing.JFrame {

    /**
     * Creates new form Claculator
     */
    public Calculator() {
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
        digitdot = new javax.swing.JButton();
        backspaceButton = new javax.swing.JButton();
        previosAnswer = new javax.swing.JButton();

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
        jTextField1.setFont(new java.awt.Font("Liberation Serif", 1, 36)); // NOI18N
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

        digitdot.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        digitdot.setText(".");
        digitdot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                digitdotActionPerformed(evt);
            }
        });

        backspaceButton.setBackground(new java.awt.Color(255, 102, 0));
        backspaceButton.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        backspaceButton.setForeground(new java.awt.Color(255, 255, 255));
        backspaceButton.setText("C");
        backspaceButton.setToolTipText("Press to backspace");
        backspaceButton.setBorder(new javax.swing.border.MatteBorder(null));
        backspaceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceButtonActionPerformed(evt);
            }
        });

        previosAnswer.setBackground(new java.awt.Color(0, 0, 0));
        previosAnswer.setFont(new java.awt.Font("Liberation Serif", 1, 18)); // NOI18N
        previosAnswer.setForeground(new java.awt.Color(255, 255, 255));
        previosAnswer.setText("Prev. Ans");
        previosAnswer.setToolTipText("Press To Get Just Previous Answer");
        previosAnswer.setBorder(new javax.swing.border.MatteBorder(null));
        previosAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previosAnswerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(digit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(digit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(digit7, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                    .addComponent(digit0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(digit8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(digit5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(digit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(digitdot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(previosAnswer))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(digit3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(digit9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(digit6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(divisionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(backspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(multiButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(equalButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(plusButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(minusButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                    .addComponent(AcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AcButton, backspaceButton, digit0, digit1, digit2, digit3, digit4, digit5, digit6, digit7, digit8, digit9, digitdot, divisionButton, equalButton, minusButton, multiButton, plusButton, previosAnswer});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backspaceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(previosAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digit0, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(digitdot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(divisionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digit9, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(digit7, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(digit8, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(digit4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digit5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(digit6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(digit3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(digit1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(digit2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(equalButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {digit8, digit9});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AcButton, backspaceButton, previosAnswer});

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
        previousString = result;
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

    private void digitdotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_digitdotActionPerformed
        // TODO add your handling code here:
        displayString += digitdot.getText();
        jTextField1.setText(displayString);
    }//GEN-LAST:event_digitdotActionPerformed

    private void backspaceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceButtonActionPerformed
        // TODO add your handling code here:
                if(displayString.isEmpty()==false)
                displayString = displayString.substring(0,displayString.length()-1);
                
                jTextField1.setText(displayString);
    }//GEN-LAST:event_backspaceButtonActionPerformed

    private void previosAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previosAnswerActionPerformed
        // TODO add your handling code here:
        jTextField1.setText(previousString);
    }//GEN-LAST:event_previosAnswerActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcButton;
    private javax.swing.JButton backspaceButton;
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
    private javax.swing.JButton digitdot;
    private javax.swing.JButton divisionButton;
    private javax.swing.JButton equalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JButton previosAnswer;
    // End of variables declaration//GEN-END:variables

    private String displayString="";
    private String previousString = "0";



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
public static boolean isOperator(String str)
{
    int charValue = str.charAt(0);
    if(charValue=='*'||charValue=='+'||charValue=='-'||charValue=='/')
    {
        return true;
    }
    else
    {
        return false;
    }
}

public static double getSolution(String str) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();
        double num = 0d;
        
        String[] stringArray = str.splitWithDelimiters("[/+*-]",-1);
        
        for(int i = 0; i < stringArray.length; i++) {
            
            //check if any element of string array is empty or not 
            if(stringArray[i].trim().isEmpty())
            {
                continue;
            }
            
            if(isOperator(stringArray[i])==false && stringArray[i].equals("")==false) {
                num=Double.parseDouble(stringArray[i]);
                operands.push(num);
                
            } else if(stringArray[i].equals("")==false){
                
                while(!operators.isEmpty() && precedence(operators.peek()) >= precedence(stringArray[i].charAt(0))) {
                    double b = operands.pop();
                   double a = operands.pop();
                    char op = operators.pop();
                    operands.push(operation(a, b, op));
                }
                operators.push(stringArray[i].charAt(0));
            }
            
        }
        
        while(!operators.isEmpty() ) {
            
            double b = operands.pop();
            double a = operands.pop();
            char op = operators.pop();
            operands.push(operation(a, b, op));
            
        }
        
        return operands.pop();
    }

		


}
