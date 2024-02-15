package TrainReservation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PayerIHM extends javax.swing.JFrame {

    private double totalPrice;
    private String departureTime;
    private String loggedInUsername;


    public PayerIHM(double totalPrice, String departureTime, String loggedInUsername) {
        this.totalPrice = totalPrice;
        this.departureTime = departureTime;
        this.loggedInUsername = loggedInUsername;
        initComponents();
        updateUI();
    }

    private void updateUI() {
        prixLabel.setText("Prix à payer : " + totalPrice + " MAD");
        heureDepartLabel.setText(departureTime);

        payerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implement the logic for payment confirmation here
                JOptionPane.showMessageDialog(PayerIHM.this, "Payment successful!");
                // You can add further logic, such as updating the database or generating a ticket.
                // For now, just close the PayerIHM.
                dispose();
            }
        });

        // Add ActionListener to "Retourner" button
        retournerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle the "Retourner" button click
                // Create an instance of UserIHM and make it visible
                UserIHM userIHM = new UserIHM(loggedInUsername);
                userIHM.setVisible(true);
                
                // Close the current window
                dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {
        retournerButton = new JButton("Retourner");
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        prixLabel = new javax.swing.JLabel();
        heureDepartLabel = new javax.swing.JLabel();
        payerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Paiement");

        jLabel2.setText("Veuillez confirmer votre paiement pour le trajet sélectionné.");

        prixLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        heureDepartLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        payerButton.setText("Payer");

        // Set the layout for the content pane
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        // Set auto-create gaps to true for automatic gap creation between components
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Create horizontal group
        GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
        hGroup.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(prixLabel)
                .addComponent(heureDepartLabel)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(payerButton)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(retournerButton)
                )
        );
        
        layout.setHorizontalGroup(hGroup);

        // Create vertical group
        GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
        vGroup.addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prixLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(heureDepartLabel)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(payerButton)
                    .addComponent(retournerButton)
                );
        
        layout.setVerticalGroup(vGroup);

        pack();
    }// </editor-fold>

 

    // Variables declaration - do not modify
    private JButton retournerButton;
    private JLabel heureDepartLabel;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel prixLabel;
    private JButton payerButton;
    // End of variables declaration
}
