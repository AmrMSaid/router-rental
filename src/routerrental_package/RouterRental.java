package routerrental_package;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import static routerrental_package.RouterRental.reservationsList;

public class RouterRental extends javax.swing.JFrame {

    public static ArrayList<Router> routersList = new ArrayList<>();
    ArrayList<String> s = new ArrayList<>();
    public static ArrayList<Reservation> reservationsList = new ArrayList<>();
    public static ArrayList<Invoice> invoiceslList = new ArrayList<>();
    public static ArrayList<String> feedbacksList = new ArrayList<>();

    public static JOptionPane j = new JOptionPane();

    Customer customer;
    Router router;
    Reservation reservation;

    public RouterRental() {
        initComponents();
        menuPanel.setVisible(false);
        rentPanel.setVisible(false);
        cancelPanel.setVisible(false);
        extendPanel.setVisible(false);
        changePanel.setVisible(false);
        reportPanel.setVisible(false);

        Router a = new Router(41, "A", 3, true, 5);
        Router b = new Router(42, "B", 4, true, 8);
        Router c = new Router(43, "C", 5, true, 10);

        routersList.add(a);
        routersList.add(b);
        routersList.add(c);

//        s.add("No(" + a.getSerialNumber() + ") Model(" + a.getModel() + ") (" + a.getNoOfPorts() + ")Ports .. 300 EGP");
//        s.add("No(" + b.getSerialNumber() + ") Model(" + b.getModel() + ") (" + b.getNoOfPorts() + ")Ports .. 350 EGP");
//        s.add("No(" + c.getSerialNumber() + ") Model(" + c.getModel() + ") (" + c.getNoOfPorts() + ")Ports .. 400 EGP");
//
//        routersComboBox.addItem(s.get(0));
//        routersComboBox.addItem(s.get(1));
//        routersComboBox.addItem(s.get(2));
        updateRoutersComboBox();

        resTypeComboBox.addItem("Daily");
        resTypeComboBox.addItem("Weekly");
        resTypeComboBox.addItem("Monthly");
    }

    public void updateRoutersComboBox() {
        routersComboBox.removeAllItems();
        routersComboBox1.removeAllItems();
        for (int i = 0; i < routersList.size(); i++) {
            Router router = routersList.get(i);
            if (router.isIsAvailable()) {
                routersComboBox.addItem("No(" + router.getSerialNumber() + ") Model(" + router.getModel() + ") (" + router.getNoOfPorts() + ")Ports .. " + router.getCostPerDay() + " EGP");
                routersComboBox1.addItem("No(" + router.getSerialNumber() + ") Model(" + router.getModel() + ") (" + router.getNoOfPorts() + ")Ports .. " + router.getCostPerDay() + " EGP");
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        resRadioBtn = new javax.swing.JRadioButton();
        forRadioBtn = new javax.swing.JRadioButton();
        ContinueBtn = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        rentBtn = new javax.swing.JButton();
        extendBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        changeBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        rentPanel = new javax.swing.JPanel();
        routersComboBox = new javax.swing.JComboBox<>();
        dateChooser = new com.toedter.calendar.JDateChooser();
        resTypeComboBox = new javax.swing.JComboBox<>();
        durationTxt = new javax.swing.JTextField();
        rentBtn2 = new javax.swing.JButton();
        cancelPanel = new javax.swing.JPanel();
        cancelResNoTxt = new javax.swing.JTextField();
        cancelBtn2 = new javax.swing.JButton();
        extendPanel = new javax.swing.JPanel();
        extendResNoTxt = new javax.swing.JTextField();
        noOfDaysTxt = new javax.swing.JTextField();
        extendBtn2 = new javax.swing.JButton();
        changePanel = new javax.swing.JPanel();
        changeResNoTxt = new javax.swing.JTextField();
        routersComboBox1 = new javax.swing.JComboBox<>();
        changeBtn2 = new javax.swing.JButton();
        reportPanel = new javax.swing.JPanel();
        reportTxt = new javax.swing.JTextField();
        reportResNoTxt = new javax.swing.JTextField();
        sendBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Router Rental");

        buttonGroup1.add(resRadioBtn);
        resRadioBtn.setText("Resident");

        buttonGroup1.add(forRadioBtn);
        forRadioBtn.setText("Foreigner");
        forRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forRadioBtnActionPerformed(evt);
            }
        });

        ContinueBtn.setText("Continue");
        ContinueBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContinueBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(resRadioBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addComponent(forRadioBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ContinueBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(resRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forRadioBtn)
                    .addComponent(ContinueBtn)))
        );

        rentBtn.setText("Rent a Router");
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });

        extendBtn.setText("Extend Duration");
        extendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extendBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel a Rent");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        changeBtn.setText("Change Model");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt);
            }
        });

        reportBtn.setText("Report a Technical Issue /  Feedback");
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(extendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(rentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(changeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(cancelBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rentBtn)
                    .addComponent(cancelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extendBtn)
                    .addComponent(changeBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportBtn))
        );

        routersComboBox.setToolTipText("Routers Available");

        dateChooser.setToolTipText("Select Date");

        resTypeComboBox.setToolTipText("Reservation Type");
        resTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resTypeComboBoxActionPerformed(evt);
            }
        });

        durationTxt.setToolTipText("Renting Duration");

        rentBtn2.setText("Rent");
        rentBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rentPanelLayout = new javax.swing.GroupLayout(rentPanel);
        rentPanel.setLayout(rentPanelLayout);
        rentPanelLayout.setHorizontalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rentPanelLayout.createSequentialGroup()
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(durationTxt))
                            .addGroup(rentPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rentBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(resTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(rentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(routersComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rentPanelLayout.setVerticalGroup(
            rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rentPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(routersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(durationTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rentBtn2)))
        );

        cancelResNoTxt.setToolTipText("Reservation Number");
        cancelResNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelResNoTxtActionPerformed(evt);
            }
        });

        cancelBtn2.setText("Cancel Rent");
        cancelBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cancelPanelLayout = new javax.swing.GroupLayout(cancelPanel);
        cancelPanel.setLayout(cancelPanelLayout);
        cancelPanelLayout.setHorizontalGroup(
            cancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        cancelPanelLayout.setVerticalGroup(
            cancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(cancelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelBtn2)))
        );

        extendResNoTxt.setToolTipText("Reservation Number");
        extendResNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extendResNoTxtActionPerformed(evt);
            }
        });

        noOfDaysTxt.setToolTipText("Number of Days");
        noOfDaysTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfDaysTxtActionPerformed(evt);
            }
        });

        extendBtn2.setText("Extend Duration");
        extendBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extendBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout extendPanelLayout = new javax.swing.GroupLayout(extendPanel);
        extendPanel.setLayout(extendPanelLayout);
        extendPanelLayout.setHorizontalGroup(
            extendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extendPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(extendResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noOfDaysTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(extendBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        extendPanelLayout.setVerticalGroup(
            extendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(extendPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(extendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extendResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noOfDaysTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extendBtn2)))
        );

        changeResNoTxt.setToolTipText("Reservation Number");
        changeResNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeResNoTxtActionPerformed(evt);
            }
        });

        routersComboBox1.setToolTipText("Routers Available");

        changeBtn2.setText("Change Router Model");
        changeBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout changePanelLayout = new javax.swing.GroupLayout(changePanel);
        changePanel.setLayout(changePanelLayout);
        changePanelLayout.setHorizontalGroup(
            changePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(changePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(changePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(routersComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(changePanelLayout.createSequentialGroup()
                        .addComponent(changeResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        changePanelLayout.setVerticalGroup(
            changePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, changePanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(routersComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(changePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changeResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeBtn2))
                .addGap(6, 6, 6))
        );

        reportTxt.setToolTipText("Report a Techincal Issue or Give a Feedback");

        reportResNoTxt.setToolTipText("Reservation Number");
        reportResNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportResNoTxtActionPerformed(evt);
            }
        });

        sendBtn.setText("Send");
        sendBtn.setToolTipText("Thank You <3");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout reportPanelLayout = new javax.swing.GroupLayout(reportPanel);
        reportPanel.setLayout(reportPanelLayout);
        reportPanelLayout.setHorizontalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reportTxt)
                    .addGroup(reportPanelLayout.createSequentialGroup()
                        .addComponent(reportResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sendBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        reportPanelLayout.setVerticalGroup(
            reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(reportPanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(reportTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(reportPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportResNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendBtn)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(extendPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(changePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reportPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cancelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rentPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cancelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extendPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reportPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forRadioBtnActionPerformed
    }//GEN-LAST:event_forRadioBtnActionPerformed

    private void ContinueBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContinueBtnActionPerformed
        mainPanel.setVisible(false);
        menuPanel.setVisible(true);

        if (resRadioBtn.isSelected()) {
            customer = new Resident();
        } else if (forRadioBtn.isSelected()) {
            customer = new Foreigner();
        }
    }//GEN-LAST:event_ContinueBtnActionPerformed

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtnActionPerformed
        extendPanel.setVisible(false);
        cancelPanel.setVisible(false);
        changePanel.setVisible(false);
        reportPanel.setVisible(false);
        rentPanel.setVisible(true);
    }//GEN-LAST:event_rentBtnActionPerformed

    private void resTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resTypeComboBoxActionPerformed
    }//GEN-LAST:event_resTypeComboBoxActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        rentPanel.setVisible(false);
        extendPanel.setVisible(false);
        changePanel.setVisible(false);
        reportPanel.setVisible(false);
        cancelPanel.setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void cancelResNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelResNoTxtActionPerformed
    }//GEN-LAST:event_cancelResNoTxtActionPerformed

    private void extendResNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extendResNoTxtActionPerformed
    }//GEN-LAST:event_extendResNoTxtActionPerformed

    private void noOfDaysTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfDaysTxtActionPerformed
    }//GEN-LAST:event_noOfDaysTxtActionPerformed

    private void extendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extendBtnActionPerformed
        rentPanel.setVisible(false);
        cancelPanel.setVisible(false);
        changePanel.setVisible(false);
        reportPanel.setVisible(false);
        extendPanel.setVisible(true);
    }//GEN-LAST:event_extendBtnActionPerformed

    private void rentBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtn2ActionPerformed
        String s = routersComboBox.getSelectedItem().toString();

        for (int i = 0; i < routersList.size(); i++) {
            if (s.substring(13, 14).equals(routersList.get(i).getModel())) {
                routersList.get(i).setIsAvailable(false);
                customer.rentRouter(resTypeComboBox.getSelectedIndex(), durationTxt.getText(), dateChooser.getCalendar(), routersList.get(i));
                break;
            }
        }
        updateRoutersComboBox();
    }//GEN-LAST:event_rentBtn2ActionPerformed

    private void changeResNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeResNoTxtActionPerformed
    }//GEN-LAST:event_changeResNoTxtActionPerformed

    private void changeBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtn2ActionPerformed
        String s = routersComboBox1.getSelectedItem().toString();

        for (int i = 0; i < reservationsList.size(); i++) {
            if (Integer.parseInt(changeResNoTxt.getText()) == reservationsList.get(i).getReservationNo()) {
                reservationsList.get(i).getRouter().setIsAvailable(true);
                break;
            }
        }
        for (int i = 0; i < routersList.size(); i++) {
            if (s.substring(13, 14).equals(routersList.get(i).getModel())) {
                routersList.get(i).setIsAvailable(false);
                customer.changeModel(changeResNoTxt.getText(), routersList.get(i));
                break;
            }
        }
        updateRoutersComboBox();
    }//GEN-LAST:event_changeBtn2ActionPerformed

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeBtnActionPerformed
        rentPanel.setVisible(false);
        cancelPanel.setVisible(false);
        extendPanel.setVisible(false);
        reportPanel.setVisible(false);
        changePanel.setVisible(true);
    }//GEN-LAST:event_changeBtnActionPerformed

    private void reportResNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportResNoTxtActionPerformed
    }//GEN-LAST:event_reportResNoTxtActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        rentPanel.setVisible(false);
        cancelPanel.setVisible(false);
        extendPanel.setVisible(false);
        changePanel.setVisible(false);
        reportPanel.setVisible(true);
    }//GEN-LAST:event_reportBtnActionPerformed

    private void cancelBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtn2ActionPerformed
        customer.cancelRent(cancelResNoTxt.getText());
        updateRoutersComboBox();
    }//GEN-LAST:event_cancelBtn2ActionPerformed

    private void extendBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extendBtn2ActionPerformed
        customer.extendDuration(Integer.parseInt(noOfDaysTxt.getText()), extendResNoTxt.getText());
    }//GEN-LAST:event_extendBtn2ActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        customer.feedback(reportResNoTxt.getText(), reportTxt.getText());
    }//GEN-LAST:event_sendBtnActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RouterRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RouterRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RouterRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RouterRental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RouterRental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ContinueBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton cancelBtn2;
    private javax.swing.JPanel cancelPanel;
    private javax.swing.JTextField cancelResNoTxt;
    private javax.swing.JButton changeBtn;
    private javax.swing.JButton changeBtn2;
    private javax.swing.JPanel changePanel;
    private javax.swing.JTextField changeResNoTxt;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JTextField durationTxt;
    private javax.swing.JButton extendBtn;
    private javax.swing.JButton extendBtn2;
    private javax.swing.JPanel extendPanel;
    private javax.swing.JTextField extendResNoTxt;
    private javax.swing.JRadioButton forRadioBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JTextField noOfDaysTxt;
    private javax.swing.JButton rentBtn;
    private javax.swing.JButton rentBtn2;
    private javax.swing.JPanel rentPanel;
    private javax.swing.JButton reportBtn;
    private javax.swing.JPanel reportPanel;
    private javax.swing.JTextField reportResNoTxt;
    private javax.swing.JTextField reportTxt;
    private javax.swing.JRadioButton resRadioBtn;
    private javax.swing.JComboBox<String> resTypeComboBox;
    private javax.swing.JComboBox<String> routersComboBox;
    private javax.swing.JComboBox<String> routersComboBox1;
    private javax.swing.JButton sendBtn;
    // End of variables declaration//GEN-END:variables
}

class Router {

    private int serialNumber;
    private String model;
    private int noOfPorts;
    private boolean isAvailable;
    private double costPerDay;

    public Router(int serialNumber, String model, int noOfPorts, boolean isAvailable, double costPerDay) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.noOfPorts = noOfPorts;
        this.isAvailable = isAvailable;
        this.costPerDay = costPerDay;
    }

    public Router() {
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNoOfPorts() {
        return noOfPorts;
    }

    public void setNoOfPorts(int noOfPorts) {
        this.noOfPorts = noOfPorts;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = 1;
    }

}

enum resType {
    Daily, Weekly, Monthly;
}

class Reservation {

    private static int reservationNo = 0;
    private Calendar resDate;
    private Calendar startDate;
    private resType type;
    private Calendar dueDate;
    private int duration;
    private Router router;
    private double total;
    private int noOfDays;

    public Reservation(int number, Calendar resDate, Calendar startDate, resType type, int duration) {
        this.resDate = resDate;
        this.startDate = startDate;
        this.type = type;
        setDueDate();
        this.duration = duration;
    }

    public Reservation() {
    }

    public int getReservationNo() {
        return reservationNo;
    }

    public void setReservationNo() {
        this.reservationNo = reservationNo + 1;

    }

    public Calendar getResDate() {
        return resDate;
    }

    public void setResDate(Calendar resDate) {
        this.resDate = resDate;
    }

    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public resType getType() {
        return type;
    }

    public void setType(resType type) {
        this.type = type;
    }

    public Calendar getDueDate() {
        return dueDate;
    }

    public void setDueDate() {
        //int noOfDays;
        switch (type) {
            case Daily:
                noOfDays = duration * 1;
                //setNoOfDays(duration * 1);
                break;
            case Weekly:
                noOfDays = duration * 7;
                //setNoOfDays(duration * 7);
                break;
            default:
                noOfDays = duration * 30;
                break;
        }
        dueDate = (Calendar) startDate.clone();;
        dueDate.add(Calendar.DAY_OF_MONTH, getNoOfDays());
    }

    public Router getRouter() {
        return router;
    }

    public void setRouter(Router router) {
        this.router = router;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public void extendDuration(int noOfDays) {
        dueDate.add(Calendar.DAY_OF_MONTH, noOfDays);
    }
}

class Invoice {

    private int serialNo;
    private int resNo;
    private double rentingFees;

    public Invoice(int serialNo, int resNo, int rentingFees) {
        this.serialNo = serialNo;
        this.resNo = resNo;
        this.rentingFees = rentingFees;
    }

    public Invoice() {
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public int getResNo() {
        return resNo;
    }

    public void setResNo(int resNo) {
        this.resNo = resNo;
    }

    public double getRentingFees() {
        return rentingFees;
    }

    public void setRentingFees(int rentingFees) {
        this.rentingFees = rentingFees;
    }

}

abstract class Customer {

    public Customer() {
    }

    public void rentRouter(int resTypeIndex, String duration, Calendar startDate, Router router) {

        Reservation reservation = new Reservation();

        switch (resTypeIndex) {
            case 0:
                reservation.setType(resType.Daily);
                break;
            case 1:
                reservation.setType(resType.Weekly);
                break;
            case 2:
                reservation.setType(resType.Monthly);
                break;
            default:
                break;
        }
        reservation.setReservationNo();
        reservation.setDuration(Integer.parseInt(duration));
        reservation.setResDate(Calendar.getInstance());
        reservation.setStartDate(startDate);
        reservation.setDueDate();
        reservation.setRouter(router);
        reservation.setTotal(router.getCostPerDay() * reservation.getNoOfDays());

        RouterRental.reservationsList.add(reservation);

        Invoice invoice = new Invoice(reservation.getRouter().getSerialNumber(), reservation.getReservationNo(), (int) reservation.getTotal());

        RouterRental.invoiceslList.add(invoice);

        JOptionPane.showMessageDialog(new JOptionPane(), "Router Serial Number: " + invoice.getSerialNo()
                + "\nReservation Number:   " + invoice.getResNo() + "\nReservation Date: " + reservation.getResDate().getTime()
                + "\nStart Date:               " + reservation.getStartDate().getTime() + "\nDue Date:                "
                + reservation.getDueDate().getTime() + "\nCost Per Day: " + router.getCostPerDay() + " EGP\nTotal Cost:      "
                + invoice.getRentingFees() + " EGP", "Invoice", JOptionPane.INFORMATION_MESSAGE);
    }

    public void cancelRent(String resNo) {
        for (int i = 0; i < reservationsList.size(); i++) {
            if (Integer.parseInt(resNo) == reservationsList.get(i).getReservationNo()) {
                reservationsList.get(i).getRouter().setIsAvailable(true);
                break;
            }
        }
        for (int i = 0; i < reservationsList.size(); i++) {
            if (resNo.equals(reservationsList.get(i).getReservationNo())) {
                reservationsList.remove(i);
            }
        }
        JOptionPane.showMessageDialog(new JOptionPane(), "Rent is cancelled successfully.", "Cancel Rent", JOptionPane.INFORMATION_MESSAGE);
    }

    public void extendDuration(int noOfDays, String resNo) {
        for (int i = 0; i < reservationsList.size(); i++) {
            Reservation reservation = reservationsList.get(i);
            if (Integer.parseInt(resNo) == (reservation.getReservationNo())) {
                reservation.extendDuration(noOfDays);
                reservation.setTotal(reservation.getRouter().getCostPerDay() * reservation.getNoOfDays() + reservation.getRouter().getCostPerDay() * noOfDays);

                JOptionPane.showMessageDialog(new JOptionPane(), "Router Serial Number: " + reservation.getRouter().getSerialNumber()
                        + "\nReservation Number:   " + reservation.getReservationNo() + "\nReservation Date: " + reservation.getResDate().getTime()
                        + "\nStart Date:               " + reservation.getStartDate().getTime() + "\nNew Due Date:      "
                        + reservation.getDueDate().getTime() + "\nCost Per Day: " + reservation.getRouter().getCostPerDay() + " EGP\nNew Cost:       "
                        + reservation.getTotal() + " EGP", "Extend Invoice", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    public void changeModel(String resNo, Router router) {
        for (int i = 0; i < reservationsList.size(); i++) {
            Reservation reservation = reservationsList.get(i);
            if (Integer.parseInt(resNo) == (reservation.getReservationNo())) {
                reservation.setRouter(router);
                reservation.setTotal(reservation.getRouter().getCostPerDay() * reservation.getNoOfDays());

                JOptionPane.showMessageDialog(new JOptionPane(), "Router Serial Number: " + reservation.getRouter().getSerialNumber()
                        + "\nReservation Number:   " + reservation.getReservationNo() + "\nReservation Date: " + reservation.getResDate().getTime()
                        + "\nStart Date:               " + reservation.getStartDate().getTime() + "\nNew Due Date:      "
                        + reservation.getDueDate().getTime() + "\nCost Per Day: " + reservation.getRouter().getCostPerDay() + " EGP\nNew Cost:       "
                        + reservation.getTotal() + " EGP", "Change Invoice", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }

    public void feedback(String resNo, String feedback) {
        for (int i = 0; i < reservationsList.size(); i++) {
            Reservation reservation = reservationsList.get(i);
            if (Integer.parseInt(resNo) == (reservation.getReservationNo())) {
                RouterRental.feedbacksList.add(feedback);
                break;
            }
        }
        JOptionPane.showMessageDialog(new JOptionPane(), "Thank you for your feedback.", "Sent", JOptionPane.INFORMATION_MESSAGE);
    }
}

class Resident extends Customer {

    final static double discount = 0.25;

    public Resident() {
    }

    public static double getDiscount() {
        return discount;
    }
}

class Foreigner extends Customer {

    public Foreigner() {
    }
}
