package swimming;

import java.util.ArrayList;

public class AddPeople extends javax.swing.JFrame {

    private ArrayList<Person> persons;
    private Judge judge;

    /**
     * Creates new form AddPlayers
     */
    public AddPeople() {
        initComponents();
    }

    private void createSwimmers() {
        String gender;
        if (p1mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer1 = new Swimmer(player1NameText.getText(), Integer.parseInt(player1AgeText.getText()), gender);
        persons.add(swimmer1);

        if (p2mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer2 = new Swimmer(player2NameText.getText(), Integer.parseInt(player2AgeText.getText()), gender);
        persons.add(swimmer2);
        if (p3mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer3 = new Swimmer(player3NameText.getText(), Integer.parseInt(player3AgeText.getText()), gender);
        persons.add(swimmer3);
        if (p4mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer4 = new Swimmer(player4NameText.getText(), Integer.parseInt(player4AgeText.getText()), gender);
        persons.add(swimmer4);
        if (p5mRadioButton.isSelected()) {
            gender = "Male";
        } else {
            gender = "Female";
        }
        Swimmer swimmer5 = new Swimmer(player5NameText.getText(), Integer.parseInt(player5AgeText.getText()), gender);
        persons.add(swimmer5);
    }

    private void createSpectators() {
        String gender;
        if (sp1name.getText() != "" && (sp1male.isSelected() || sp1female.isSelected())) {
            if (sp1male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator1 = new Spectator(sp1name.getText(), gender);
            persons.add(spectator1);
        }

        if (sp2name.getText() != "" && (sp2male.isSelected() || sp2female.isSelected())) {
            if (sp2male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator2 = new Spectator(sp2name.getText(), gender);
            persons.add(spectator2);
        }

        if (sp3name.getText() != "" && (sp3male.isSelected() || sp3female.isSelected())) {
            if (sp3male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator3 = new Spectator(sp3name.getText(), gender);
            persons.add(spectator3);
        }
        if (sp4name.getText() != "" && (sp4male.isSelected() || sp4female.isSelected())) {
            if (sp4male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator4 = new Spectator(sp4name.getText(), gender);
            persons.add(spectator4);
        }
        if (sp5name.getText() != "" && (sp5male.isSelected() || sp5female.isSelected())) {
            if (sp5male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator5 = new Spectator(sp5name.getText(), gender);
            persons.add(spectator5);
        }
        if (sp6name.getText() != "" && (sp6male.isSelected() || sp6female.isSelected())) {
            if (sp6male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator6 = new Spectator(sp6name.getText(), gender);
            persons.add(spectator6);
        }
        if (sp7name.getText() != "" && (sp7male.isSelected() || sp7female.isSelected())) {
            if (sp7male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator7 = new Spectator(sp7name.getText(), gender);
            persons.add(spectator7);
        }
        if (sp8name.getText() != "" && (sp8male.isSelected() || sp8female.isSelected())) {
            if (sp8male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator8 = new Spectator(sp8name.getText(), gender);
            persons.add(spectator8);
        }
        if (sp9name.getText() != "" && (sp9male.isSelected() || sp9female.isSelected())) {
            if (sp9male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator9 = new Spectator(sp9name.getText(), gender);
            persons.add(spectator9);
        }
        if (sp10name.getText() != "" && (sp10male.isSelected() || sp10female.isSelected())) {
            if (sp10male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator10 = new Spectator(sp10name.getText(), gender);
            persons.add(spectator10);
        }
        if (sp11name.getText() != "" && (sp11male.isSelected() || sp11female.isSelected())) {
            if (sp11male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator11 = new Spectator(sp11name.getText(), gender);
            persons.add(spectator11);
        }
        if (sp12name.getText() != "" && (sp12male.isSelected() || sp12female.isSelected())) {
            if (sp12male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator12 = new Spectator(sp12name.getText(), gender);
            persons.add(spectator12);
        }
        if (sp13name.getText() != "" && (sp13male.isSelected() || sp13female.isSelected())) {
            if (sp13male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator13 = new Spectator(sp13name.getText(), gender);
            persons.add(spectator13);
        }
        if (sp14name.getText() != "" && (sp14male.isSelected() || sp14female.isSelected())) {
            if (sp1male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator14 = new Spectator(sp14name.getText(), gender);
            persons.add(spectator14);
        }
        if (sp15name.getText() != "" && (sp15male.isSelected() || sp15female.isSelected())) {
            if (sp15male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator15 = new Spectator(sp15name.getText(), gender);
            persons.add(spectator15);
        }
        if (sp16name.getText() != "" && (sp16male.isSelected() || sp16female.isSelected())) {
            if (sp16male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator16 = new Spectator(sp16name.getText(), gender);
            persons.add(spectator16);
        }
        if (sp17name.getText() != "" && (sp17male.isSelected() || sp17female.isSelected())) {
            if (sp17male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator17 = new Spectator(sp17name.getText(), gender);
            persons.add(spectator17);
        }
        if (sp18name.getText() != "" && (sp18male.isSelected() || sp18female.isSelected())) {
            if (sp18male.isSelected()) {
                gender = "Male";
            } else {
                gender = "Female";
            }
            Spectator spectator18 = new Spectator(sp18name.getText(), gender);
            persons.add(spectator18);
        }
    }
   

    private void createJudge() {
        judge = new Judge(judgeNameText.getText());
        persons.add(judge);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        buttonGroup13 = new javax.swing.ButtonGroup();
        buttonGroup14 = new javax.swing.ButtonGroup();
        buttonGroup15 = new javax.swing.ButtonGroup();
        buttonGroup16 = new javax.swing.ButtonGroup();
        buttonGroup17 = new javax.swing.ButtonGroup();
        buttonGroup18 = new javax.swing.ButtonGroup();
        buttonGroup19 = new javax.swing.ButtonGroup();
        buttonGroup20 = new javax.swing.ButtonGroup();
        buttonGroup21 = new javax.swing.ButtonGroup();
        buttonGroup22 = new javax.swing.ButtonGroup();
        buttonGroup23 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        player1NameText = new javax.swing.JTextField();
        player2NameText = new javax.swing.JTextField();
        player3NameText = new javax.swing.JTextField();
        player4NameText = new javax.swing.JTextField();
        player1AgeText = new javax.swing.JTextField();
        player2AgeText = new javax.swing.JTextField();
        player4AgeText = new javax.swing.JTextField();
        player3AgeText = new javax.swing.JTextField();
        p1mRadioButton = new javax.swing.JRadioButton();
        p1fRadioButton = new javax.swing.JRadioButton();
        p2mRadioButton = new javax.swing.JRadioButton();
        p2fRadioButton = new javax.swing.JRadioButton();
        p3fRadioButton = new javax.swing.JRadioButton();
        p3mRadioButton = new javax.swing.JRadioButton();
        p4mRadioButton = new javax.swing.JRadioButton();
        p4fRadioButton = new javax.swing.JRadioButton();
        judgeNameText = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        player5NameText = new javax.swing.JTextField();
        player5AgeText = new javax.swing.JTextField();
        p5mRadioButton = new javax.swing.JRadioButton();
        p5fRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        sp1name = new javax.swing.JTextField();
        sp1male = new javax.swing.JRadioButton();
        sp1female = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sp2name = new javax.swing.JTextField();
        sp2male = new javax.swing.JRadioButton();
        sp2female = new javax.swing.JRadioButton();
        sp3name = new javax.swing.JTextField();
        sp3male = new javax.swing.JRadioButton();
        sp3female = new javax.swing.JRadioButton();
        sp4name = new javax.swing.JTextField();
        sp4male = new javax.swing.JRadioButton();
        sp4female = new javax.swing.JRadioButton();
        sp5name = new javax.swing.JTextField();
        sp5male = new javax.swing.JRadioButton();
        sp5female = new javax.swing.JRadioButton();
        sp6name = new javax.swing.JTextField();
        sp6male = new javax.swing.JRadioButton();
        sp6female = new javax.swing.JRadioButton();
        sp8name = new javax.swing.JTextField();
        sp8male = new javax.swing.JRadioButton();
        sp8female = new javax.swing.JRadioButton();
        sp9name = new javax.swing.JTextField();
        sp9male = new javax.swing.JRadioButton();
        sp9female = new javax.swing.JRadioButton();
        sp10name = new javax.swing.JTextField();
        sp10male = new javax.swing.JRadioButton();
        sp10female = new javax.swing.JRadioButton();
        sp11name = new javax.swing.JTextField();
        sp11male = new javax.swing.JRadioButton();
        sp11female = new javax.swing.JRadioButton();
        sp12name = new javax.swing.JTextField();
        sp12male = new javax.swing.JRadioButton();
        sp12female = new javax.swing.JRadioButton();
        sp13name = new javax.swing.JTextField();
        sp13male = new javax.swing.JRadioButton();
        sp15female = new javax.swing.JRadioButton();
        sp15name = new javax.swing.JTextField();
        sp15male = new javax.swing.JRadioButton();
        sp13female = new javax.swing.JRadioButton();
        sp16name = new javax.swing.JTextField();
        sp16male = new javax.swing.JRadioButton();
        sp16female = new javax.swing.JRadioButton();
        sp17name = new javax.swing.JTextField();
        sp17male = new javax.swing.JRadioButton();
        sp17female = new javax.swing.JRadioButton();
        sp18name = new javax.swing.JTextField();
        sp18male = new javax.swing.JRadioButton();
        sp18female = new javax.swing.JRadioButton();
        sp7name = new javax.swing.JTextField();
        sp7male = new javax.swing.JRadioButton();
        sp7female = new javax.swing.JRadioButton();
        sp14name = new javax.swing.JTextField();
        sp14male = new javax.swing.JRadioButton();
        sp14female = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player 1");

        jLabel2.setFont(new java.awt.Font("sansserif", 2, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ADD PLAYERS");

        jLabel3.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player 2");

        jLabel4.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Player 3");

        jLabel5.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Player 4");

        jLabel6.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Judge");

        jLabel7.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Name");

        jLabel8.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Age");

        jLabel9.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Gender");

        player4AgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player4AgeTextActionPerformed(evt);
            }
        });

        buttonGroup1.add(p1mRadioButton);
        p1mRadioButton.setText("Male");

        buttonGroup1.add(p1fRadioButton);
        p1fRadioButton.setText("Female");
        p1fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1fRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(p2mRadioButton);
        p2mRadioButton.setText("Male");

        buttonGroup2.add(p2fRadioButton);
        p2fRadioButton.setText("Female");
        p2fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2fRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(p3fRadioButton);
        p3fRadioButton.setText("Female");
        p3fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3fRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(p3mRadioButton);
        p3mRadioButton.setText("Male");

        buttonGroup4.add(p4mRadioButton);
        p4mRadioButton.setText("Male");

        buttonGroup4.add(p4fRadioButton);
        p4fRadioButton.setText("Female");
        p4fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4fRadioButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        jButton1.setText("Next>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Player 5");

        player5AgeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player5AgeTextActionPerformed(evt);
            }
        });

        buttonGroup5.add(p5mRadioButton);
        p5mRadioButton.setText("Male");

        buttonGroup5.add(p5fRadioButton);
        p5fRadioButton.setText("Female");
        p5fRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5fRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(296, 296, 296)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(judgeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(player5NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                                .addComponent(player5AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(player2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(player3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(player4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(player1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(player2AgeText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                                    .addComponent(player3AgeText)
                                                    .addComponent(player1AgeText)
                                                    .addComponent(player4AgeText))))
                                        .addGap(44, 44, 44)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(p4mRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(p4fRadioButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(p3mRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(p3fRadioButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(p2mRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(p2fRadioButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(p1mRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(p1fRadioButton)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(p5mRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(p5fRadioButton)
                                                .addGap(4, 4, 4)))))))
                        .addGap(0, 7, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(player1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player1AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p1mRadioButton)
                    .addComponent(p1fRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(player2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2mRadioButton)
                    .addComponent(p2fRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(player3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player3AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3mRadioButton)
                    .addComponent(p3fRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(player4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player4AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4mRadioButton)
                    .addComponent(p4fRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(player5NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player5AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5mRadioButton)
                    .addComponent(p5fRadioButton))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(judgeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Add Spectators");

        buttonGroup22.add(sp1male);
        sp1male.setText("male");

        buttonGroup22.add(sp1female);
        sp1female.setText("female");
        sp1female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp1femaleActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Gender");

        sp2name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp2nameActionPerformed(evt);
            }
        });

        buttonGroup21.add(sp2male);
        sp2male.setText("male");

        buttonGroup21.add(sp2female);
        sp2female.setText("female");

        buttonGroup20.add(sp3male);
        sp3male.setText("male");

        buttonGroup20.add(sp3female);
        sp3female.setText("female");

        buttonGroup19.add(sp4male);
        sp4male.setText("male");

        buttonGroup19.add(sp4female);
        sp4female.setText("female");

        sp5name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp5nameActionPerformed(evt);
            }
        });

        buttonGroup18.add(sp5male);
        sp5male.setText("male");

        buttonGroup18.add(sp5female);
        sp5female.setText("female");
        sp5female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp5femaleActionPerformed(evt);
            }
        });

        buttonGroup17.add(sp6male);
        sp6male.setText("male");

        buttonGroup17.add(sp6female);
        sp6female.setText("female");

        buttonGroup15.add(sp8male);
        sp8male.setText("male");

        buttonGroup15.add(sp8female);
        sp8female.setText("female");

        buttonGroup14.add(sp9male);
        sp9male.setText("male");

        buttonGroup14.add(sp9female);
        sp9female.setText("female");
        sp9female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp9femaleActionPerformed(evt);
            }
        });

        buttonGroup13.add(sp10male);
        sp10male.setText("male");

        buttonGroup13.add(sp10female);
        sp10female.setText("female");

        buttonGroup12.add(sp11male);
        sp11male.setText("male");

        buttonGroup12.add(sp11female);
        sp11female.setText("female");
        sp11female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp11femaleActionPerformed(evt);
            }
        });

        buttonGroup11.add(sp12male);
        sp12male.setText("male");

        buttonGroup11.add(sp12female);
        sp12female.setText("female");

        buttonGroup10.add(sp13male);
        sp13male.setText("male");

        buttonGroup8.add(sp15female);
        sp15female.setText("female");

        buttonGroup8.add(sp15male);
        sp15male.setText("male");

        buttonGroup10.add(sp13female);
        sp13female.setText("female");

        buttonGroup7.add(sp16male);
        sp16male.setText("male");

        buttonGroup7.add(sp16female);
        sp16female.setText("female");

        buttonGroup6.add(sp17male);
        sp17male.setText("male");

        buttonGroup6.add(sp17female);
        sp17female.setText("female");

        buttonGroup23.add(sp18male);
        sp18male.setText("male");

        buttonGroup23.add(sp18female);
        sp18female.setText("female");

        buttonGroup16.add(sp7male);
        sp7male.setText("male");

        buttonGroup16.add(sp7female);
        sp7female.setText("female");

        buttonGroup9.add(sp14male);
        sp14male.setText("male");

        buttonGroup9.add(sp14female);
        sp14female.setText("female");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp1name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp2name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(sp1male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sp2male)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp1female)
                                    .addComponent(sp2female))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(sp4name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(sp4male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sp4female))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(sp9name, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                            .addComponent(sp8name))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGap(80, 80, 80)
                                                .addComponent(sp8female))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sp9female))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(sp7name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sp8male)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp7male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sp7female))
                                            .addComponent(sp9male)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(sp3name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(sp3male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sp3female))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(sp6name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sp5name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp5male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sp5female))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp6male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(sp6female)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(sp18name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp18male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sp18female))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(sp13name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp13male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sp13female))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(sp14name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp14male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sp14female))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sp16name)
                                        .addComponent(sp15name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(sp15male)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sp15female))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(sp16male)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(sp16female))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(sp17name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp17male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sp17female))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sp11male)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(sp12name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(sp12male))
                                        .addComponent(sp10male))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sp12female)
                                        .addComponent(sp11female)
                                        .addComponent(sp10female))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(sp10name, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp11name, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)))
                        .addGap(83, 83, 83))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp1female)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sp1name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sp1male)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp2female)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sp2name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sp2male)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp3name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp3male)
                            .addComponent(sp3female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp4name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp4male)
                            .addComponent(sp4female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sp5name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp5male)
                            .addComponent(sp5female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp6name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp6male)
                            .addComponent(sp6female))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp7name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp7male)
                            .addComponent(sp7female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sp8name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sp8female))
                            .addComponent(sp8male, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp9name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp9male)
                            .addComponent(sp9female)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp10name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp10male)
                            .addComponent(sp10female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp11name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp11male)
                            .addComponent(sp11female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp12name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp12male)
                            .addComponent(sp12female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp13name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp13male)
                            .addComponent(sp13female))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp14name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp14male)
                            .addComponent(sp14female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp15name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp15male)
                            .addComponent(sp15female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp16name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp16male)
                            .addComponent(sp16female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp17name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp17male)
                            .addComponent(sp17female))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp18name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp18male)
                            .addComponent(sp18female))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p1fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1fRadioButtonActionPerformed

    private void p2fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p2fRadioButtonActionPerformed

    private void p3fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p3fRadioButtonActionPerformed

    private void p4fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p4fRadioButtonActionPerformed

    private void player4AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player4AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player4AgeTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        persons = new ArrayList<>();
        createSwimmers();
        createSpectators();
        createJudge();
        new SwimGUI(persons).setVisible(true);
        Spectator.spectatorNumber();
        AddPeople.this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void player5AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player5AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player5AgeTextActionPerformed

    private void p5fRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5fRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p5fRadioButtonActionPerformed

    private void sp5nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp5nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp5nameActionPerformed

    private void sp2nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp2nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp2nameActionPerformed

    private void sp9femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp9femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp9femaleActionPerformed

    private void sp11femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp11femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp11femaleActionPerformed

    private void sp1femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp1femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp1femaleActionPerformed

    private void sp5femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp5femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp5femaleActionPerformed

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
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPeople.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPeople().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup13;
    private javax.swing.ButtonGroup buttonGroup14;
    private javax.swing.ButtonGroup buttonGroup15;
    private javax.swing.ButtonGroup buttonGroup16;
    private javax.swing.ButtonGroup buttonGroup17;
    private javax.swing.ButtonGroup buttonGroup18;
    private javax.swing.ButtonGroup buttonGroup19;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup20;
    private javax.swing.ButtonGroup buttonGroup21;
    private javax.swing.ButtonGroup buttonGroup22;
    private javax.swing.ButtonGroup buttonGroup23;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField judgeNameText;
    private javax.swing.JRadioButton p1fRadioButton;
    private javax.swing.JRadioButton p1mRadioButton;
    private javax.swing.JRadioButton p2fRadioButton;
    private javax.swing.JRadioButton p2mRadioButton;
    private javax.swing.JRadioButton p3fRadioButton;
    private javax.swing.JRadioButton p3mRadioButton;
    private javax.swing.JRadioButton p4fRadioButton;
    private javax.swing.JRadioButton p4mRadioButton;
    private javax.swing.JRadioButton p5fRadioButton;
    private javax.swing.JRadioButton p5mRadioButton;
    private javax.swing.JTextField player1AgeText;
    private javax.swing.JTextField player1NameText;
    private javax.swing.JTextField player2AgeText;
    private javax.swing.JTextField player2NameText;
    private javax.swing.JTextField player3AgeText;
    private javax.swing.JTextField player3NameText;
    private javax.swing.JTextField player4AgeText;
    private javax.swing.JTextField player4NameText;
    private javax.swing.JTextField player5AgeText;
    private javax.swing.JTextField player5NameText;
    private javax.swing.JRadioButton sp10female;
    private javax.swing.JRadioButton sp10male;
    private javax.swing.JTextField sp10name;
    private javax.swing.JRadioButton sp11female;
    private javax.swing.JRadioButton sp11male;
    private javax.swing.JTextField sp11name;
    private javax.swing.JRadioButton sp12female;
    private javax.swing.JRadioButton sp12male;
    private javax.swing.JTextField sp12name;
    private javax.swing.JRadioButton sp13female;
    private javax.swing.JRadioButton sp13male;
    private javax.swing.JTextField sp13name;
    private javax.swing.JRadioButton sp14female;
    private javax.swing.JRadioButton sp14male;
    private javax.swing.JTextField sp14name;
    private javax.swing.JRadioButton sp15female;
    private javax.swing.JRadioButton sp15male;
    private javax.swing.JTextField sp15name;
    private javax.swing.JRadioButton sp16female;
    private javax.swing.JRadioButton sp16male;
    private javax.swing.JTextField sp16name;
    private javax.swing.JRadioButton sp17female;
    private javax.swing.JRadioButton sp17male;
    private javax.swing.JTextField sp17name;
    private javax.swing.JRadioButton sp18female;
    private javax.swing.JRadioButton sp18male;
    private javax.swing.JTextField sp18name;
    private javax.swing.JRadioButton sp1female;
    private javax.swing.JRadioButton sp1male;
    private javax.swing.JTextField sp1name;
    private javax.swing.JRadioButton sp2female;
    private javax.swing.JRadioButton sp2male;
    private javax.swing.JTextField sp2name;
    private javax.swing.JRadioButton sp3female;
    private javax.swing.JRadioButton sp3male;
    private javax.swing.JTextField sp3name;
    private javax.swing.JRadioButton sp4female;
    private javax.swing.JRadioButton sp4male;
    private javax.swing.JTextField sp4name;
    private javax.swing.JRadioButton sp5female;
    private javax.swing.JRadioButton sp5male;
    private javax.swing.JTextField sp5name;
    private javax.swing.JRadioButton sp6female;
    private javax.swing.JRadioButton sp6male;
    private javax.swing.JTextField sp6name;
    private javax.swing.JRadioButton sp7female;
    private javax.swing.JRadioButton sp7male;
    private javax.swing.JTextField sp7name;
    private javax.swing.JRadioButton sp8female;
    private javax.swing.JRadioButton sp8male;
    private javax.swing.JTextField sp8name;
    private javax.swing.JRadioButton sp9female;
    private javax.swing.JRadioButton sp9male;
    private javax.swing.JTextField sp9name;
    // End of variables declaration//GEN-END:variables
}
