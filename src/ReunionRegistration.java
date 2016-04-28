import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

// Programmer: Sean DePotter
// Filename: ReunionRegistration.java
// Due Date: 04/29/2016
// Description: Java Applet for Individual Assignment #4

public class ReunionRegistration extends JFrame {

    private JPanel westPanel, centerPanel, eastPanel, northPanel, southPanel, panel1, panel2, panel3, panel4, panel5, panel6
            //panels for textfields
            , panel7, panel8, panel9, panel10, panel11, panel12;
    private JLabel firstNameLabel, lastNameLabel, streetLabel, cityLabel, stateLabel, zipLabel, titleLabel, hotelLabel, optionalMemorabiliaLabel, optionalPartipcipantLabel;
    private ButtonGroup participantGroup, registrationGroup;
    private JButton clearButton, registerButton;
    private JTextField firstNameField, lastNameField, streetField, cityField, stateField, zipField;
    private JRadioButton standardRoomRadioButton, deluxeRoomRadioButton, noneRadioButton, alumnusRadioButton, facultyRadioButton, adminRadioButton, otherRadioButton;
    private JCheckBox printedBookBox, cdBox, spouseGuestBox;

    //registration defaults
    final private int STANDARD_ROOM_RATE = 75;
    final private int DELUXE_ROOM_RATE = 95;
    final private int PRINTED_BOOK_RATE = 25;
    final private int CD_RATE = 15;

    //participant defaults
    final private int ALUMNUM_COST = 100;
    final private int FACULTY_COST = 125;
    final private int ADMINISTRATIVE_COST = 150;
    final private int OTHER_COST = 150;
    final private int SPOUSE_GUEST_COST = 100;


    public ReunionRegistration() {
        setTitle("PLACEHOLDER");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setResizable(false);

        centerPanel = new JPanel();
        eastPanel = new JPanel();
        westPanel = new JPanel();
        southPanel = new JPanel();
        northPanel = new JPanel();

        eastPanel.setLayout(new GridLayout(2, 1));

        buildPanel1();
        buildPanel2();
        buildPanel3();
        buildPanel4();
        buildPanel5();
        buildPanel6();

        centerPanel.add(panel1);

        eastPanel.add(panel2);
        eastPanel.add(panel3);

        westPanel.add(panel4);

        southPanel.add(panel5);

        northPanel.add(panel6);


        westPanel.setBorder(BorderFactory.createTitledBorder("Participant Type"));
        eastPanel.setBorder(BorderFactory.createTitledBorder("Registration Options"));
        centerPanel.setBorder(BorderFactory.createTitledBorder("Registrant Information"));

        add(centerPanel, BorderLayout.CENTER);
        add(eastPanel, BorderLayout.EAST);
        add(westPanel, BorderLayout.WEST);
        add(southPanel, BorderLayout.SOUTH);
        add(northPanel, BorderLayout.NORTH);

        pack();
        setVisible(true);
    }

    //center panel
    public void buildPanel1() {
//        buildLabelTextPanel("First name:",panel1,firstNameField,firstNameLabel);
        panel1 = new JPanel();

        //wrapper to hold a resizeable textfield, rename wrapper?
        panel7 = new JPanel(new FlowLayout(0, 0, FlowLayout.LEADING));
        panel8 = new JPanel(new FlowLayout(0, 0, FlowLayout.LEADING));
        panel9 = new JPanel(new FlowLayout(0, 0, FlowLayout.LEADING));
        panel10 = new JPanel(new FlowLayout(0, 0, FlowLayout.LEADING));
        panel11 = new JPanel(new FlowLayout(0, 0, FlowLayout.LEADING));
        panel12 = new JPanel(new FlowLayout(0, 0, FlowLayout.LEADING));

        panel1.setLayout(new GridLayout(6, 2, 15,0));

        firstNameLabel = new JLabel("First Name:");
        firstNameField = new JTextField();

        lastNameLabel = new JLabel("Last Name:");
        lastNameField = new JTextField();

        streetLabel = new JLabel("Street Address:");
        streetField = new JTextField();

        cityLabel = new JLabel("City:");
        cityField = new JTextField();

        stateLabel = new JLabel("State:");
        stateField = new JTextField();

        zipLabel = new JLabel("Zip Code:");
        zipField = new JTextField();

        firstNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        lastNameLabel.setHorizontalAlignment(JLabel.RIGHT);
        streetLabel.setHorizontalAlignment(JLabel.RIGHT);
        cityLabel.setHorizontalAlignment(JLabel.RIGHT);
        stateLabel.setHorizontalAlignment(JLabel.RIGHT);
        zipLabel.setHorizontalAlignment(JLabel.RIGHT);



        firstNameField.setPreferredSize(new Dimension(125, 24));
        lastNameField.setPreferredSize(new Dimension(150, 24));
        streetField.setPreferredSize(new Dimension(175, 24));
        cityField.setPreferredSize(new Dimension(150, 24));
        stateField.setPreferredSize(new Dimension(40, 24));
        zipField.setPreferredSize(new Dimension(60, 24));


        panel7.add(firstNameField);
        panel8.add(lastNameField);
        panel9.add(streetField);
        panel10.add(cityField);
        panel11.add(stateField);
        panel12.add(zipField);


        panel1.add(firstNameLabel);
        panel1.add(panel7);
        panel1.add(lastNameLabel);
        panel1.add(panel8);
        panel1.add(streetLabel);
        panel1.add(panel9);
        panel1.add(cityLabel);
        panel1.add(panel10);
        panel1.add(stateLabel);
        panel1.add(panel11);
        panel1.add(zipLabel);
        panel1.add(panel12);


    }

    //east panel
    public void buildPanel2() {
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(4, 1));

        registrationGroup = new ButtonGroup();

        hotelLabel = new JLabel("Hotel Reservation");

        standardRoomRadioButton = new JRadioButton("Standard Room ($" + STANDARD_ROOM_RATE + ")");
        deluxeRoomRadioButton = new JRadioButton("Deluxe Room ($" + DELUXE_ROOM_RATE + ")");
        noneRadioButton = new JRadioButton("None");

        standardRoomRadioButton.setSelected(true);

        registrationGroup.add(standardRoomRadioButton);
        registrationGroup.add(deluxeRoomRadioButton);
        registrationGroup.add(noneRadioButton);

        panel2.add(hotelLabel);
        panel2.add(standardRoomRadioButton);
        panel2.add(deluxeRoomRadioButton);
        panel2.add(noneRadioButton);

    }

    //second east
    public void buildPanel3() {
        panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3, 1));

        optionalMemorabiliaLabel = new JLabel("Optional Memorabilia");

        printedBookBox = new JCheckBox("Printed Book ($" + PRINTED_BOOK_RATE + ")");
        cdBox = new JCheckBox("CD-ROM Disk ($" + CD_RATE + ")");

        panel3.add(optionalMemorabiliaLabel);
        panel3.add(printedBookBox);
        panel3.add(cdBox);


    }

    //west panel
    public void buildPanel4() {
        panel4 = new JPanel();
        panel4.setLayout(new GridLayout(6, 1)); //PLACEHOLDER #'s

        participantGroup = new ButtonGroup();

        optionalPartipcipantLabel = new JLabel("Optional Participant");

        alumnusRadioButton = new JRadioButton("Alumnus ($" + ALUMNUM_COST + ")");
        facultyRadioButton = new JRadioButton("Faculty ($" + FACULTY_COST + ")");
        adminRadioButton = new JRadioButton("Administrator ($" + ADMINISTRATIVE_COST + ")");
        otherRadioButton = new JRadioButton("Other ($" + OTHER_COST + ")");

        alumnusRadioButton.setSelected(true);

        spouseGuestBox = new JCheckBox("Spouse/Guest ($" + SPOUSE_GUEST_COST + ")");

        participantGroup.add(alumnusRadioButton);
        participantGroup.add(facultyRadioButton);
        participantGroup.add(adminRadioButton);
        participantGroup.add(otherRadioButton);

        panel4.add(alumnusRadioButton);
        panel4.add(facultyRadioButton);
        panel4.add(adminRadioButton);
        panel4.add(otherRadioButton);
        panel4.add(optionalPartipcipantLabel);
        panel4.add(spouseGuestBox);

    }

    //south panel
    public void buildPanel5() {
        panel5 = new JPanel();

        clearButton = new JButton("Clear");
        registerButton = new JButton("Register");

        registerButton.setMnemonic(KeyEvent.VK_R);
        clearButton.setMnemonic(KeyEvent.VK_C);

        registerButton.setToolTipText("Click to submit your registration");
        clearButton.setToolTipText("Click to restart your registration");

        clearButton.addActionListener(new ClearButtonListener());
        registerButton.addActionListener(new RegisterButtonListener());

        panel5.add(clearButton);
        panel5.add(registerButton);
    }

    //north panel
    public void buildPanel6() {
        panel6 = new JPanel();

        titleLabel = new JLabel("MHS Reunion Registration");
        titleLabel.setFont(new Font("Sans Serif", Font.BOLD, 20));

        panel6.add(titleLabel);

    }

    private class ClearButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //clear fields
            firstNameField.setText("");
            lastNameField.setText("");
            streetField.setText("");
            cityField.setText("");
            stateField.setText("");
            zipField.setText("");

            //set default radio buttons
            alumnusRadioButton.setSelected(true);
            standardRoomRadioButton.setSelected(true);

            //uncheck checkboxes
            spouseGuestBox.setSelected(false);
            printedBookBox.setSelected(false);
            cdBox.setSelected(false);

        }
    }

    private class RegisterButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            //total value, reset to 0 after each
            int Total = getTotal();

            // checks if bad format or empty fields exist, if no then checks for bad formatting. If none of both then give final message.
            if (emptyFields()) {
                }
            else if (!badFormat()) {
            } else {
                JOptionPane.showMessageDialog(null, "Registration is confirmed for:\n"
                        + firstNameField.getText() + " " + lastNameField.getText() + "\n"
                        + streetField.getText() + "\n" + cityField.getText() + ", " + stateField.getText() + " " + zipField.getText() + "\n"
                        + "Total Registration Fee: $" + Total);
            }
        }
    }

    public static void main(String[] args) {
        new ReunionRegistration();
    }


    public boolean emptyFields() {

        boolean isEmpty = false;

        if (!firstNameField.getText().isEmpty() && !lastNameField.getText().isEmpty() && !streetField.getText().isEmpty()
                && !cityField.getText().isEmpty() && !stateField.getText().isEmpty() && !zipField.getText().isEmpty()) {
        } else {
            isEmpty = true; //  field is empty, trigger the message dialog
        }

        if (isEmpty){
            JOptionPane.showMessageDialog(null, "Registrant information must be entered completely.", "Missing Information", JOptionPane.WARNING_MESSAGE);
        }
        return isEmpty;
    }

    public boolean badFormat(){
        boolean correctFormat = true;

        if (correctFormat){
            if(stateField.getDocument().getLength() == 2 && stateField.getText().matches("[a-zA-Z]+")){
            } else{
                JOptionPane.showMessageDialog(null,"State information must be entered as two letters.","Incorrect State Format",JOptionPane.ERROR_MESSAGE);
                correctFormat = false;
            }
        }

        if (correctFormat) {
            if(!zipField.getText().matches("[a-zA-Z]+") && zipField.getDocument().getLength() == 5){
            } else{
                JOptionPane.showMessageDialog(null,"Zip Code information must be entered as five digits.","Incorrect Zip Code Format",JOptionPane.ERROR_MESSAGE);
                correctFormat = false;
            }
        }
        return correctFormat;
    }

    public int getTotal() {
        int Total = 0;

        //checking participant type costs
        if (alumnusRadioButton.isSelected()) {
            Total += ALUMNUM_COST;
        } else if (facultyRadioButton.isSelected()) {
            Total += FACULTY_COST;
        } else if (adminRadioButton.isSelected()) {
            Total += ADMINISTRATIVE_COST;
        } else if (otherRadioButton.isSelected()) {
            Total += OTHER_COST;
        }

        //check optional participant costs
        if (spouseGuestBox.isSelected()) {
            Total += SPOUSE_GUEST_COST;
        }

        //check registration options
        if (standardRoomRadioButton.isSelected()) {
            Total += STANDARD_ROOM_RATE;
        } else if (deluxeRoomRadioButton.isSelected()) {
            Total += DELUXE_ROOM_RATE;
        }

        //check optional memorabilia costs
        if (printedBookBox.isSelected()) {
            Total += PRINTED_BOOK_RATE;
        }

        if (cdBox.isSelected()) {
            Total += CD_RATE;
        }

        return Total;
    }

}

