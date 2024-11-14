
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adam Harris
 */
public class CalculatorAdamv2 extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorAdamv2
     */
    double Numenter1;
    double Numenter2;
    double result;
    
    String Op;
    public CalculatorAdamv2() {
        initComponents();
        Image i = new ImageIcon(this.getClass().getResource("/image.jpg")).getImage();
        this.setIconImage(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    private void Enternumbers(String q){
        String Nums = JTFresult.getText() + q;
        JTFresult.setText(Nums);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        Digit1 = new javax.swing.JButton();
        Digit2 = new javax.swing.JButton();
        Digit3 = new javax.swing.JButton();
        Pluss = new javax.swing.JButton();
        Digit4 = new javax.swing.JButton();
        Digit5 = new javax.swing.JButton();
        Digit6 = new javax.swing.JButton();
        Minuss = new javax.swing.JButton();
        Digit7 = new javax.swing.JButton();
        Digit8 = new javax.swing.JButton();
        Digit9 = new javax.swing.JButton();
        Multiple = new javax.swing.JButton();
        Digit0 = new javax.swing.JButton();
        Dot = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        JTFresult = new javax.swing.JTextField();
        JBaction = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kira Sendiri");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(0, 51, 51));

        jButton4.setBackground(new java.awt.Color(255, 153, 51));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setText("C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        Digit1.setBackground(new java.awt.Color(255, 255, 51));
        Digit1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit1.setText("1");
        Digit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit1ActionPerformed(evt);
            }
        });

        Digit2.setBackground(new java.awt.Color(255, 255, 51));
        Digit2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit2.setText("2");
        Digit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit2ActionPerformed(evt);
            }
        });

        Digit3.setBackground(new java.awt.Color(255, 255, 51));
        Digit3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit3.setText("3");
        Digit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit3ActionPerformed(evt);
            }
        });

        Pluss.setBackground(new java.awt.Color(255, 153, 51));
        Pluss.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Pluss.setText("+");
        Pluss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlussActionPerformed(evt);
            }
        });

        Digit4.setBackground(new java.awt.Color(255, 255, 51));
        Digit4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit4.setText("4");
        Digit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit4ActionPerformed(evt);
            }
        });

        Digit5.setBackground(new java.awt.Color(255, 255, 51));
        Digit5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit5.setText("5");
        Digit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit5ActionPerformed(evt);
            }
        });

        Digit6.setBackground(new java.awt.Color(255, 255, 51));
        Digit6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit6.setText("6");
        Digit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit6ActionPerformed(evt);
            }
        });

        Minuss.setBackground(new java.awt.Color(255, 153, 51));
        Minuss.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Minuss.setText("-");
        Minuss.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinussActionPerformed(evt);
            }
        });

        Digit7.setBackground(new java.awt.Color(255, 255, 51));
        Digit7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit7.setText("7");
        Digit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit7ActionPerformed(evt);
            }
        });

        Digit8.setBackground(new java.awt.Color(255, 255, 51));
        Digit8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit8.setText("8");
        Digit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit8ActionPerformed(evt);
            }
        });

        Digit9.setBackground(new java.awt.Color(255, 255, 51));
        Digit9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit9.setText("9");
        Digit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit9ActionPerformed(evt);
            }
        });

        Multiple.setBackground(new java.awt.Color(255, 153, 51));
        Multiple.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Multiple.setText("x");
        Multiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultipleActionPerformed(evt);
            }
        });

        Digit0.setBackground(new java.awt.Color(255, 255, 51));
        Digit0.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Digit0.setText("0");
        Digit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Digit0ActionPerformed(evt);
            }
        });

        Dot.setBackground(new java.awt.Color(255, 255, 51));
        Dot.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Dot.setText(".");
        Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotActionPerformed(evt);
            }
        });

        equals.setBackground(new java.awt.Color(255, 255, 51));
        equals.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        equals.setText("=");
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });

        Divide.setBackground(new java.awt.Color(255, 153, 51));
        Divide.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Divide.setText("÷");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        JTFresult.setBackground(new java.awt.Color(255, 0, 0));
        JTFresult.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        JBaction.setBackground(new java.awt.Color(255, 153, 51));
        JBaction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        JBaction.setText("<--");
        JBaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactionActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 51));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setText("CE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTFresult, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Digit4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Digit1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Digit0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Digit7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Digit5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Digit2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Digit8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(JBaction)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Digit6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Digit3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Digit9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pluss, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Minuss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(JTFresult, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBaction, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Digit1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Digit2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Pluss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Digit3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Digit4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Digit5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minuss, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Digit6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Digit7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Digit8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Digit9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Digit0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equals, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Digit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit9ActionPerformed
        // TODO add your handling code here:
        Enternumbers("9");
    }//GEN-LAST:event_Digit9ActionPerformed

    private void Digit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit1ActionPerformed
        // TODO add your handling code here:
        Enternumbers("1");
        
        
    }//GEN-LAST:event_Digit1ActionPerformed

    private void Digit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit2ActionPerformed
        // TODO add your handling code here:
        Enternumbers("2");
    }//GEN-LAST:event_Digit2ActionPerformed

    private void Digit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit3ActionPerformed
        // TODO add your handling code here:
        Enternumbers("3");
    }//GEN-LAST:event_Digit3ActionPerformed

    private void Digit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit4ActionPerformed
        // TODO add your handling code here:
        Enternumbers("4");
    }//GEN-LAST:event_Digit4ActionPerformed

    private void Digit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit5ActionPerformed
        // TODO add your handling code here:
        Enternumbers("5");
    }//GEN-LAST:event_Digit5ActionPerformed

    private void Digit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit6ActionPerformed
        // TODO add your handling code here:
        Enternumbers("6");
    }//GEN-LAST:event_Digit6ActionPerformed

    private void Digit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit7ActionPerformed
        // TODO add your handling code here:
        Enternumbers("7");
    }//GEN-LAST:event_Digit7ActionPerformed

    private void Digit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit8ActionPerformed
        // TODO add your handling code here:
        Enternumbers("8");
    }//GEN-LAST:event_Digit8ActionPerformed

    private void Digit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Digit0ActionPerformed
        // TODO add your handling code here:
        Enternumbers("0");
    }//GEN-LAST:event_Digit0ActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        // TODO add your handling code here:
        Numenter1 = Double.parseDouble(JTFresult.getText());
        JTFresult.setText("");
        Op ="/";
    }//GEN-LAST:event_DivideActionPerformed

    private void MultipleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultipleActionPerformed
        // TODO add your handling code here:
        Numenter1 = Double.parseDouble(JTFresult.getText());
        JTFresult.setText("");
        Op ="*";
    }//GEN-LAST:event_MultipleActionPerformed

    private void MinussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinussActionPerformed
        // TODO add your handling code here:
        Numenter1 = Double.parseDouble(JTFresult.getText());
        JTFresult.setText("");
        Op ="-";
    }//GEN-LAST:event_MinussActionPerformed

    private void PlussActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlussActionPerformed
        // TODO add your handling code here:
        Numenter1 = Double.parseDouble(JTFresult.getText());
        JTFresult.setText("");
        Op ="+";
    }//GEN-LAST:event_PlussActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JTFresult.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed

        // TODO add your handling code here:
        Numenter2 = Double.parseDouble(JTFresult.getText());
        
        // Format NumEnter1 and NumEnter2 based on whether they are whole numbers or not
    String formattedNumEnter1 = (Numenter1 % 1 == 0) ? String.format("%.0f", Numenter1) : String.format("%.2f", Numenter1);
    String formattedNumEnter2 = (Numenter2 % 1 == 0) ? String.format("%.0f", Numenter2) : String.format("%.2f", Numenter2);

    // Prepare the expression string with the formatted numbers
    String expression = formattedNumEnter1 + " " + Op + " " + formattedNumEnter2;
    
        switch (Op) {
            case "+":
                result = Numenter1 + Numenter2;
                break;
            case "-":
                result = Numenter1 - Numenter2;
                break;
            case "*":
                result = Numenter1 * Numenter2;
                break;
            case "/":
            // Handle division by zero
            if (Numenter2 == 0) {
                JTFresult.setText("Cannot divide by zero");
                return;
            }
            result = Numenter1 / Numenter2;
            break;
        default:
            // Invalid operator case
            JTFresult.setText("Error: Invalid operation");
            return;
                
        }
        
        String formattedresult = (result % 1 == 0) ? String.format("%.0f", result) : String.format("%.2f", result);
        
        
        String output = expression + " = " + formattedresult;
        
        JTFresult.setText(output);
        
        Numenter1 = result;
        
        Op = "";
        
    }//GEN-LAST:event_equalsActionPerformed

    private void DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotActionPerformed
        // TODO add your handling code here:
        if (! JTFresult.getText().contains(".")){
            JTFresult.setText(JTFresult.getText() + Dot.getText());
            
        }
    }//GEN-LAST:event_DotActionPerformed

    private void JBactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactionActionPerformed
        // TODO add your handling code here:
        String backSp = null;
        
        if (JTFresult.getText().length() > 0)
        {
            StringBuilder sb = new StringBuilder(JTFresult.getText());
            sb.deleteCharAt(JTFresult.getText().length() - 1);
            backSp = sb.toString();
            JTFresult.setText(backSp);
        }
    }//GEN-LAST:event_JBactionActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JTFresult.setText("");
        
        String Fn, Sn;
    
    Fn= String.valueOf(Numenter1);
    Sn= String.valueOf(Numenter2);
    
    Fn ="";
    Sn="";
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorAdamv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorAdamv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorAdamv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorAdamv2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorAdamv2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Digit0;
    private javax.swing.JButton Digit1;
    private javax.swing.JButton Digit2;
    private javax.swing.JButton Digit3;
    private javax.swing.JButton Digit4;
    private javax.swing.JButton Digit5;
    private javax.swing.JButton Digit6;
    private javax.swing.JButton Digit7;
    private javax.swing.JButton Digit8;
    private javax.swing.JButton Digit9;
    private javax.swing.JButton Divide;
    private javax.swing.JButton Dot;
    private javax.swing.JButton JBaction;
    private javax.swing.JTextField JTFresult;
    private javax.swing.JButton Minuss;
    private javax.swing.JButton Multiple;
    private javax.swing.JButton Pluss;
    private javax.swing.JButton equals;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
