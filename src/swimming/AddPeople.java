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
        try{
        String gender;          //getting male as default gender if not selected
        if (player1NameText.getText().length()!=0 ) {
            gender = player1FemaleRadioButton.isSelected() ? "Female" : "Male";
            Swimmer swimmer1 = new Swimmer(player1NameText.getText(), Integer.parseInt(player1AgeText.getText()), gender);
            persons.add(swimmer1);
        }
        if (player2NameText.getText().length()!=0) {
            gender = player2FemaleRadioButton.isSelected() ? "Female" : "Male";
            Swimmer swimmer2 = new Swimmer(player2NameText.getText(), Integer.parseInt(player2AgeText.getText()), gender);
            persons.add(swimmer2);
        }

        if (player3NameText.getText().length()!=0) {
            gender = player3FemaleRadioButton.isSelected() ? "Female" : "Male";
            Swimmer swimmer3 = new Swimmer(player3NameText.getText(), Integer.parseInt(player3AgeText.getText()), gender);
            persons.add(swimmer3);
        }

        if (player4NameText.getText().length()!=0) {
            gender = player4FemaleRadioButton.isSelected() ? "Female" : "Male";
            Swimmer swimmer4 = new Swimmer(player4NameText.getText(), Integer.parseInt(player4AgeText.getText()), gender);
            persons.add(swimmer4);
        }

        if (player5NameText.getText().length()!=0) {
            gender = player5FemaleRadioButton.isSelected() ? "Female" : "Male";
            Swimmer swimmer5 = new Swimmer(player5NameText.getText(), Integer.parseInt(player5AgeText.getText()), gender);
            persons.add(swimmer5);
        }
        }catch(NumberFormatException ageNoIntError){
            System.out.println("input error. please add an integer to age text field");
        }
    }
    
    private void createJudge(){
        if (judgeNameText.getText().length()!=0){
            Judge judge=new Judge(judgeNameText.getText());
            persons.add(judge);
        }
    
    }

    private void createSpectators() {
        String gender;
        if (spectator1NameText.getText() != "" && (sp1male.isSelected() || spectator1FemaleRadioButton.isSelected())) {
            gender = spectator1FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator1 = new Spectator(spectator1NameText.getText(), gender);
            persons.add(spectator1);
        }

        if (spectator2NameText.getText() != "" && (sp2male.isSelected() || spectator2FemaleRadioButton.isSelected())) {
            gender = spectator2FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator2 = new Spectator(spectator2NameText.getText(), gender);
            persons.add(spectator2);
        }

        if (spectator3NameText.getText() != "" && (sp3male.isSelected() || spectator3FemaleRadioButton.isSelected())) {
            gender = spectator3FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator3 = new Spectator(spectator3NameText.getText(), gender);
            persons.add(spectator3);
        }
        if (spectator4NameText.getText() != "" && (sp4male.isSelected() || spectator4FemaleRadioButton.isSelected())) {
            gender = spectator4FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator4 = new Spectator(spectator4NameText.getText(), gender);
            persons.add(spectator4);
        }
        if (spectator5NameText.getText() != "" && (sp5male.isSelected() || spectator5FemaleRadioButton.isSelected())) {
            gender = spectator5FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator5 = new Spectator(spectator5NameText.getText(), gender);
            persons.add(spectator5);
        }
        if (spectator6NameText.getText() != "" && (sp6male.isSelected() || spectator6FemaleRadioButton.isSelected())) {
            gender = spectator6FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator6 = new Spectator(spectator6NameText.getText(), gender);
            persons.add(spectator6);
        }
        if (spectator7NameText.getText() != "" && (sp7male.isSelected() || spectator7FemaleRadioButton.isSelected())) {
            gender = spectator7FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator7 = new Spectator(spectator7NameText.getText(), gender);
            persons.add(spectator7);
        }
        if (spectator8NameText.getText() != "" && (sp8male.isSelected() || spectator8FemaleRadioButton.isSelected())) {
            gender = spectator8FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator8 = new Spectator(spectator8NameText.getText(), gender);
            persons.add(spectator8);
        }
        if (spectator9NameText.getText() != "" && (sp9male.isSelected() || spectator9FemaleRadioButton.isSelected())) {
            gender = spectator9FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator9 = new Spectator(spectator9NameText.getText(), gender);
            persons.add(spectator9);
        }
        if (spectator10NameText.getText() != "" && (sp10male.isSelected() || spectator10FemaleRadioButton.isSelected())) {
            gender = spectator10FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator10 = new Spectator(spectator10NameText.getText(), gender);
            persons.add(spectator10);
        }
        if (spectator11NameText.getText() != "" && (sp11male.isSelected() || spectator11FemaleRadioButton.isSelected())) {
            gender = spectator11FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator11 = new Spectator(spectator11NameText.getText(), gender);
            persons.add(spectator11);
        }
        if (spectator12NameText.getText() != "" && (sp12male.isSelected() || spectator12FemaleRadioButton.isSelected())) {
            gender = spectator12FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator12 = new Spectator(spectator12NameText.getText(), gender);
            persons.add(spectator12);
        }
        if (spectator13NameText.getText() != "" && (sp13male.isSelected() || spectator13FemaleRadioButton.isSelected())) {
            gender = spectator13FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator13 = new Spectator(spectator13NameText.getText(), gender);
            persons.add(spectator13);
        }
        if (spectator14NameText.getText() != "" && (sp14male.isSelected() || spectator14FemaleRadioButton.isSelected())) {
            gender = spectator14FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator14 = new Spectator(spectator14NameText.getText(), gender);
            persons.add(spectator14);
        }
        if (spectator15NameText.getText() != "" && (sp15male.isSelected() || spectator15FemaleRadioButton.isSelected())) {
            gender = spectator15FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator15 = new Spectator(spectator15NameText.getText(), gender);
            persons.add(spectator15);
        }
        if (spectator16NameText.getText() != "" && (sp16male.isSelected() || spectator16FemaleRadioButton.isSelected())) {
            gender = spectator16FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator16 = new Spectator(spectator16NameText.getText(), gender);
            persons.add(spectator16);
        }
        if (spectator17NameText.getText() != "" && (sp17male.isSelected() || spectator17FemaleRadioButton.isSelected())) {
            gender = spectator17FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator17 = new Spectator(spectator17NameText.getText(), gender);
            persons.add(spectator17);
        }
        if (spectator18NameText.getText() != "" && (sp18male.isSelected() || spectator18FemaleRadioButton.isSelected())) {
            gender = spectator18FemaleRadioButton.isSelected() ? "Female" : "Male";
            Spectator spectator18 = new Spectator(spectator18NameText.getText(), gender);
            persons.add(spectator18);
        }
    }


    private void createSupportingStaff() {
        if (staff1NameText.getText().length()!=0) {
            SupportingStaff supportingStaff1 = new SupportingStaff(staff1NameText.getText());
            persons.add(supportingStaff1);
        }
        if (staff2NameText.getText().length()!=0) {
            SupportingStaff supportingStaff2 = new SupportingStaff(staff2NameText.getText());
            persons.add(supportingStaff2);
        }

        if (staff3NameText.getText().length()!=0) {
            SupportingStaff supportingStaff3 = new SupportingStaff(staff3NameText.getText());
            persons.add(supportingStaff3);
        }

        if (staff4NameText.getText().length()!=0) {
            SupportingStaff supportingStaff4 = new SupportingStaff(staff4NameText.getText());
            persons.add(supportingStaff4);
        }

        if (staff5NameText.getText().length()!=0) {
            SupportingStaff supportingStaff5 = new SupportingStaff(staff5NameText.getText());
            persons.add(supportingStaff5);
        }

        if (staff6NameText.getText().length()!=0) {
            SupportingStaff supportingStaff6 = new SupportingStaff(staff6NameText.getText());
            persons.add(supportingStaff6);
        }
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
        player1FemaleRadioButton = new javax.swing.JRadioButton();
        p2mRadioButton = new javax.swing.JRadioButton();
        player2FemaleRadioButton = new javax.swing.JRadioButton();
        player3FemaleRadioButton = new javax.swing.JRadioButton();
        p3mRadioButton = new javax.swing.JRadioButton();
        p4mRadioButton = new javax.swing.JRadioButton();
        player4FemaleRadioButton = new javax.swing.JRadioButton();
        judgeNameText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        player5NameText = new javax.swing.JTextField();
        player5AgeText = new javax.swing.JTextField();
        p5mRadioButton = new javax.swing.JRadioButton();
        player5FemaleRadioButton = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        spectator1NameText = new javax.swing.JTextField();
        sp1male = new javax.swing.JRadioButton();
        spectator1FemaleRadioButton = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        spectator2NameText = new javax.swing.JTextField();
        sp2male = new javax.swing.JRadioButton();
        spectator2FemaleRadioButton = new javax.swing.JRadioButton();
        spectator3NameText = new javax.swing.JTextField();
        sp3male = new javax.swing.JRadioButton();
        spectator3FemaleRadioButton = new javax.swing.JRadioButton();
        spectator4NameText = new javax.swing.JTextField();
        sp4male = new javax.swing.JRadioButton();
        spectator4FemaleRadioButton = new javax.swing.JRadioButton();
        spectator5NameText = new javax.swing.JTextField();
        sp5male = new javax.swing.JRadioButton();
        spectator5FemaleRadioButton = new javax.swing.JRadioButton();
        spectator6NameText = new javax.swing.JTextField();
        sp6male = new javax.swing.JRadioButton();
        spectator6FemaleRadioButton = new javax.swing.JRadioButton();
        spectator8NameText = new javax.swing.JTextField();
        sp8male = new javax.swing.JRadioButton();
        spectator8FemaleRadioButton = new javax.swing.JRadioButton();
        spectator9NameText = new javax.swing.JTextField();
        sp9male = new javax.swing.JRadioButton();
        spectator9FemaleRadioButton = new javax.swing.JRadioButton();
        spectator10NameText = new javax.swing.JTextField();
        sp10male = new javax.swing.JRadioButton();
        spectator10FemaleRadioButton = new javax.swing.JRadioButton();
        spectator11NameText = new javax.swing.JTextField();
        sp11male = new javax.swing.JRadioButton();
        spectator11FemaleRadioButton = new javax.swing.JRadioButton();
        spectator12NameText = new javax.swing.JTextField();
        sp12male = new javax.swing.JRadioButton();
        spectator12FemaleRadioButton = new javax.swing.JRadioButton();
        spectator13NameText = new javax.swing.JTextField();
        sp13male = new javax.swing.JRadioButton();
        spectator15FemaleRadioButton = new javax.swing.JRadioButton();
        spectator15NameText = new javax.swing.JTextField();
        sp15male = new javax.swing.JRadioButton();
        spectator13FemaleRadioButton = new javax.swing.JRadioButton();
        spectator16NameText = new javax.swing.JTextField();
        sp16male = new javax.swing.JRadioButton();
        spectator16FemaleRadioButton = new javax.swing.JRadioButton();
        spectator17NameText = new javax.swing.JTextField();
        sp17male = new javax.swing.JRadioButton();
        spectator17FemaleRadioButton = new javax.swing.JRadioButton();
        spectator18NameText = new javax.swing.JTextField();
        sp18male = new javax.swing.JRadioButton();
        spectator18FemaleRadioButton = new javax.swing.JRadioButton();
        spectator7NameText = new javax.swing.JTextField();
        sp7male = new javax.swing.JRadioButton();
        spectator7FemaleRadioButton = new javax.swing.JRadioButton();
        spectator14NameText = new javax.swing.JTextField();
        sp14male = new javax.swing.JRadioButton();
        spectator14FemaleRadioButton = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        staff1NameText = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        staff2NameText = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        staff3NameText = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        staff4NameText = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        staff5NameText = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        staff6NameText = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD PEOPLE");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Player 1");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
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

        buttonGroup1.add(player1FemaleRadioButton);
        player1FemaleRadioButton.setText("Female");
        player1FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1FemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup2.add(p2mRadioButton);
        p2mRadioButton.setText("Male");

        buttonGroup2.add(player2FemaleRadioButton);
        player2FemaleRadioButton.setText("Female");
        player2FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2FemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(player3FemaleRadioButton);
        player3FemaleRadioButton.setText("Female");
        player3FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player3FemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup3.add(p3mRadioButton);
        p3mRadioButton.setText("Male");

        buttonGroup4.add(p4mRadioButton);
        p4mRadioButton.setText("Male");

        buttonGroup4.add(player4FemaleRadioButton);
        player4FemaleRadioButton.setText("Female");
        player4FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player4FemaleRadioButtonActionPerformed(evt);
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

        buttonGroup5.add(player5FemaleRadioButton);
        player5FemaleRadioButton.setText("Female");
        player5FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player5FemaleRadioButtonActionPerformed(evt);
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(judgeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(p1mRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(player1FemaleRadioButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(p2mRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(player2FemaleRadioButton))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(p3mRadioButton)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(player3FemaleRadioButton)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(p4mRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(player4FemaleRadioButton))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(p5mRadioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(player5FemaleRadioButton)))))))
                        .addGap(0, 0, Short.MAX_VALUE))
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
                    .addComponent(player1FemaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(player2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player2AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p2mRadioButton)
                    .addComponent(player2FemaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(player3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player3AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p3mRadioButton)
                    .addComponent(player3FemaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(player4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player4AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p4mRadioButton)
                    .addComponent(player4FemaleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(player5NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(player5AgeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5mRadioButton)
                    .addComponent(player5FemaleRadioButton))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(judgeNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        buttonGroup22.add(sp1male);
        sp1male.setText("male");

        buttonGroup22.add(spectator1FemaleRadioButton);
        spectator1FemaleRadioButton.setText("female");
        spectator1FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectator1FemaleRadioButtonActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Name");

        jLabel13.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Gender");

        spectator2NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectator2NameTextActionPerformed(evt);
            }
        });

        buttonGroup21.add(sp2male);
        sp2male.setText("male");
        sp2male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sp2maleActionPerformed(evt);
            }
        });

        buttonGroup21.add(spectator2FemaleRadioButton);
        spectator2FemaleRadioButton.setText("female");

        buttonGroup20.add(sp3male);
        sp3male.setText("male");

        buttonGroup20.add(spectator3FemaleRadioButton);
        spectator3FemaleRadioButton.setText("female");

        buttonGroup19.add(sp4male);
        sp4male.setText("male");

        buttonGroup19.add(spectator4FemaleRadioButton);
        spectator4FemaleRadioButton.setText("female");

        spectator5NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectator5NameTextActionPerformed(evt);
            }
        });

        buttonGroup18.add(sp5male);
        sp5male.setText("male");

        buttonGroup18.add(spectator5FemaleRadioButton);
        spectator5FemaleRadioButton.setText("female");
        spectator5FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectator5FemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup17.add(sp6male);
        sp6male.setText("male");

        buttonGroup17.add(spectator6FemaleRadioButton);
        spectator6FemaleRadioButton.setText("female");

        buttonGroup15.add(sp8male);
        sp8male.setText("male");

        buttonGroup15.add(spectator8FemaleRadioButton);
        spectator8FemaleRadioButton.setText("female");

        buttonGroup14.add(sp9male);
        sp9male.setText("male");

        buttonGroup14.add(spectator9FemaleRadioButton);
        spectator9FemaleRadioButton.setText("female");
        spectator9FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectator9FemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup13.add(sp10male);
        sp10male.setText("male");

        buttonGroup13.add(spectator10FemaleRadioButton);
        spectator10FemaleRadioButton.setText("female");

        buttonGroup12.add(sp11male);
        sp11male.setText("male");

        buttonGroup12.add(spectator11FemaleRadioButton);
        spectator11FemaleRadioButton.setText("female");
        spectator11FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectator11FemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup11.add(sp12male);
        sp12male.setText("male");

        buttonGroup11.add(spectator12FemaleRadioButton);
        spectator12FemaleRadioButton.setText("female");

        buttonGroup10.add(sp13male);
        sp13male.setText("male");

        buttonGroup8.add(spectator15FemaleRadioButton);
        spectator15FemaleRadioButton.setText("female");

        buttonGroup8.add(sp15male);
        sp15male.setText("male");

        buttonGroup10.add(spectator13FemaleRadioButton);
        spectator13FemaleRadioButton.setText("female");
        spectator13FemaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spectator13FemaleRadioButtonActionPerformed(evt);
            }
        });

        buttonGroup7.add(sp16male);
        sp16male.setText("male");

        buttonGroup7.add(spectator16FemaleRadioButton);
        spectator16FemaleRadioButton.setText("female");

        buttonGroup6.add(sp17male);
        sp17male.setText("male");

        buttonGroup6.add(spectator17FemaleRadioButton);
        spectator17FemaleRadioButton.setText("female");

        buttonGroup23.add(sp18male);
        sp18male.setText("male");

        buttonGroup23.add(spectator18FemaleRadioButton);
        spectator18FemaleRadioButton.setText("female");

        buttonGroup16.add(sp7male);
        sp7male.setText("male");

        buttonGroup16.add(spectator7FemaleRadioButton);
        spectator7FemaleRadioButton.setText("female");

        buttonGroup9.add(sp14male);
        sp14male.setText("male");

        buttonGroup9.add(spectator14FemaleRadioButton);
        spectator14FemaleRadioButton.setText("female");

        jLabel22.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("ADD SPECTATORS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
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
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(spectator4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(sp4male)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spectator4FemaleRadioButton))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(spectator9NameText, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                        .addComponent(spectator8NameText))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(spectator7NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp8male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spectator8FemaleRadioButton))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp7male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spectator7FemaleRadioButton))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp9male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spectator9FemaleRadioButton))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(spectator6NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(spectator5NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp5male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spectator5FemaleRadioButton))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp6male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spectator6FemaleRadioButton))))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(spectator3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(sp3male)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spectator3FemaleRadioButton))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(sp2male)
                                                    .addComponent(sp1male, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(spectator1FemaleRadioButton)
                                                    .addComponent(spectator2FemaleRadioButton))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spectator2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spectator1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(spectator18NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp18male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spectator18FemaleRadioButton))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(spectator13NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp13male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spectator13FemaleRadioButton))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(spectator14NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp14male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spectator14FemaleRadioButton))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(spectator16NameText)
                                        .addComponent(spectator15NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(sp15male)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spectator15FemaleRadioButton))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(sp16male)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(spectator16FemaleRadioButton))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(spectator17NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29)
                                    .addComponent(sp17male)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spectator17FemaleRadioButton))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(sp11male)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(spectator12NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(29, 29, 29)
                                            .addComponent(sp12male))
                                        .addComponent(sp10male))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(spectator12FemaleRadioButton)
                                        .addComponent(spectator11FemaleRadioButton)
                                        .addComponent(spectator10FemaleRadioButton))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(spectator10NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(spectator11NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)))
                        .addGap(83, 83, 83))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp1male)
                            .addComponent(spectator1FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp2male)
                            .addComponent(spectator2FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp3male)
                            .addComponent(spectator3FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp4male)
                            .addComponent(spectator4FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spectator5NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(sp5male)
                                .addComponent(spectator5FemaleRadioButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator6NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp6male)
                            .addComponent(spectator6FemaleRadioButton))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator7NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp7male)
                            .addComponent(spectator7FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(spectator8NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(sp8male, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(spectator8FemaleRadioButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator9NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp9male)
                            .addComponent(spectator9FemaleRadioButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator10NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp10male)
                            .addComponent(spectator10FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator11NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp11male)
                            .addComponent(spectator11FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator12NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp12male)
                            .addComponent(spectator12FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator13NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp13male)
                            .addComponent(spectator13FemaleRadioButton))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator14NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp14male)
                            .addComponent(spectator14FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator15NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp15male)
                            .addComponent(spectator15FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator16NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp16male)
                            .addComponent(spectator16FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator17NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp17male)
                            .addComponent(spectator17FemaleRadioButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spectator18NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sp18male)
                            .addComponent(spectator18FemaleRadioButton))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 204));

        jLabel14.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Supporting Staff 1");

        jLabel15.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Name");

        jLabel16.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Supporting Staff 2");

        jLabel17.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Supporting Staff 3");

        jLabel18.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Supporting Staff 4");

        jLabel19.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Supporting Staff 5");

        jLabel20.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Supporting Staff 6");

        jLabel21.setBackground(new java.awt.Color(102, 255, 204));
        jLabel21.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("ADD SUPPORTING STAFF");

        jLabel23.setFont(new java.awt.Font("sansserif", 2, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Name");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staff1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staff2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staff3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staff4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staff5NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(staff6NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(staff1NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(staff2NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(staff3NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(staff4NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(staff5NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(staff6NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jButton1.setFont(new java.awt.Font("sansserif", 3, 36)); // NOI18N
        jButton1.setText("Next>>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void player1FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player1FemaleRadioButtonActionPerformed

    private void player2FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player2FemaleRadioButtonActionPerformed

    private void player3FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player3FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player3FemaleRadioButtonActionPerformed

    private void player4FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player4FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player4FemaleRadioButtonActionPerformed

    private void player4AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player4AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player4AgeTextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        persons = new ArrayList<>();
        createSwimmers();
        createSpectators();
        createJudge();
        createSupportingStaff();
        
        new SwimGUI(persons).setVisible(true);

        Spectator.getNumber();
        Swimmer.getNumber();
        Judge.getNumber();
        SupportingStaff.getNumber();

        AddPeople.this.dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void player5AgeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player5AgeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player5AgeTextActionPerformed

    private void player5FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player5FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player5FemaleRadioButtonActionPerformed

    private void spectator11FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectator11FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spectator11FemaleRadioButtonActionPerformed

    private void spectator9FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectator9FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spectator9FemaleRadioButtonActionPerformed

    private void spectator5FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectator5FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spectator5FemaleRadioButtonActionPerformed

    private void spectator5NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectator5NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spectator5NameTextActionPerformed

    private void sp2maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sp2maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sp2maleActionPerformed

    private void spectator2NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectator2NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spectator2NameTextActionPerformed

    private void spectator1FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectator1FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spectator1FemaleRadioButtonActionPerformed

    private void spectator13FemaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spectator13FemaleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spectator13FemaleRadioButtonActionPerformed

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
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField judgeNameText;
    private javax.swing.JRadioButton p1mRadioButton;
    private javax.swing.JRadioButton p2mRadioButton;
    private javax.swing.JRadioButton p3mRadioButton;
    private javax.swing.JRadioButton p4mRadioButton;
    private javax.swing.JRadioButton p5mRadioButton;
    private javax.swing.JTextField player1AgeText;
    private javax.swing.JRadioButton player1FemaleRadioButton;
    private javax.swing.JTextField player1NameText;
    private javax.swing.JTextField player2AgeText;
    private javax.swing.JRadioButton player2FemaleRadioButton;
    private javax.swing.JTextField player2NameText;
    private javax.swing.JTextField player3AgeText;
    private javax.swing.JRadioButton player3FemaleRadioButton;
    private javax.swing.JTextField player3NameText;
    private javax.swing.JTextField player4AgeText;
    private javax.swing.JRadioButton player4FemaleRadioButton;
    private javax.swing.JTextField player4NameText;
    private javax.swing.JTextField player5AgeText;
    private javax.swing.JRadioButton player5FemaleRadioButton;
    private javax.swing.JTextField player5NameText;
    private javax.swing.JRadioButton sp10male;
    private javax.swing.JRadioButton sp11male;
    private javax.swing.JRadioButton sp12male;
    private javax.swing.JRadioButton sp13male;
    private javax.swing.JRadioButton sp14male;
    private javax.swing.JRadioButton sp15male;
    private javax.swing.JRadioButton sp16male;
    private javax.swing.JRadioButton sp17male;
    private javax.swing.JRadioButton sp18male;
    private javax.swing.JRadioButton sp1male;
    private javax.swing.JRadioButton sp2male;
    private javax.swing.JRadioButton sp3male;
    private javax.swing.JRadioButton sp4male;
    private javax.swing.JRadioButton sp5male;
    private javax.swing.JRadioButton sp6male;
    private javax.swing.JRadioButton sp7male;
    private javax.swing.JRadioButton sp8male;
    private javax.swing.JRadioButton sp9male;
    private javax.swing.JRadioButton spectator10FemaleRadioButton;
    private javax.swing.JTextField spectator10NameText;
    private javax.swing.JRadioButton spectator11FemaleRadioButton;
    private javax.swing.JTextField spectator11NameText;
    private javax.swing.JRadioButton spectator12FemaleRadioButton;
    private javax.swing.JTextField spectator12NameText;
    private javax.swing.JRadioButton spectator13FemaleRadioButton;
    private javax.swing.JTextField spectator13NameText;
    private javax.swing.JRadioButton spectator14FemaleRadioButton;
    private javax.swing.JTextField spectator14NameText;
    private javax.swing.JRadioButton spectator15FemaleRadioButton;
    private javax.swing.JTextField spectator15NameText;
    private javax.swing.JRadioButton spectator16FemaleRadioButton;
    private javax.swing.JTextField spectator16NameText;
    private javax.swing.JRadioButton spectator17FemaleRadioButton;
    private javax.swing.JTextField spectator17NameText;
    private javax.swing.JRadioButton spectator18FemaleRadioButton;
    private javax.swing.JTextField spectator18NameText;
    private javax.swing.JRadioButton spectator1FemaleRadioButton;
    private javax.swing.JTextField spectator1NameText;
    private javax.swing.JRadioButton spectator2FemaleRadioButton;
    private javax.swing.JTextField spectator2NameText;
    private javax.swing.JRadioButton spectator3FemaleRadioButton;
    private javax.swing.JTextField spectator3NameText;
    private javax.swing.JRadioButton spectator4FemaleRadioButton;
    private javax.swing.JTextField spectator4NameText;
    private javax.swing.JRadioButton spectator5FemaleRadioButton;
    private javax.swing.JTextField spectator5NameText;
    private javax.swing.JRadioButton spectator6FemaleRadioButton;
    private javax.swing.JTextField spectator6NameText;
    private javax.swing.JRadioButton spectator7FemaleRadioButton;
    private javax.swing.JTextField spectator7NameText;
    private javax.swing.JRadioButton spectator8FemaleRadioButton;
    private javax.swing.JTextField spectator8NameText;
    private javax.swing.JRadioButton spectator9FemaleRadioButton;
    private javax.swing.JTextField spectator9NameText;
    private javax.swing.JTextField staff1NameText;
    private javax.swing.JTextField staff2NameText;
    private javax.swing.JTextField staff3NameText;
    private javax.swing.JTextField staff4NameText;
    private javax.swing.JTextField staff5NameText;
    private javax.swing.JTextField staff6NameText;
    // End of variables declaration//GEN-END:variables
}
