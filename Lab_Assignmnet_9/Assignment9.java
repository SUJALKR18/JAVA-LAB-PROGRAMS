import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
public class Assignment9 { 
    public static void main(String[] args) { 
        JFrame frame = new JFrame("Assignment 9 - Job Application (Eligibility Check)"); 
        frame.setSize(550, 720); 
        frame.setLayout(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setResizable(false); 
 
        JLabel nameLabel = new JLabel("Name:"); 
        nameLabel.setBounds(50, 30, 150, 25); 
        frame.add(nameLabel); 
 
        JTextField nameField = new JTextField(); 
        nameField.setBounds(200, 30, 250, 25); 
        frame.add(nameField); 
 
        JLabel ageLabel = new JLabel("Age:"); 
        ageLabel.setBounds(50, 70, 150, 25); 
        frame.add(ageLabel); 
 
        JTextField ageField = new JTextField(); 
        ageField.setBounds(200, 70, 250, 25); 
        frame.add(ageField); 
 
        JLabel qualLabel = new JLabel("Qualification:"); 
        qualLabel.setBounds(50, 110, 150, 25); 
        frame.add(qualLabel); 
 
        String[] qualifications = {"B.Tech", "M.Tech", "BCA", "MCA", "B.Sc", "M.Sc", "Diploma", "Other"}; 
        JComboBox<String> qualBox = new JComboBox<>(qualifications); 
        qualBox.setBounds(200, 110, 250, 25); 
        frame.add(qualBox); 
 
        JLabel specLabel = new JLabel("Specialization:"); 
        specLabel.setBounds(50, 150, 150, 25); 
        frame.add(specLabel); 
 
        String[] specs = {"CSE", "IT", "ECE", "EEE", "ME", "Civil", "AI/ML", "Other"}; 
        JComboBox<String> specBox = new JComboBox<>(specs); 
        specBox.setBounds(200, 150, 250, 25); 
        frame.add(specBox); 
 
        JLabel cgpaLabel = new JLabel("CGPA:"); 
        cgpaLabel.setBounds(50, 190, 150, 25); 
        frame.add(cgpaLabel); 
 
        JTextField cgpaField = new JTextField(); 
        cgpaField.setBounds(200, 190, 250, 25); 
        frame.add(cgpaField); 
 
        JLabel tenthLabel = new JLabel("10th Percentage:"); 
        tenthLabel.setBounds(50, 230, 150, 25); 
        frame.add(tenthLabel); 
 
        JTextField tenthField = new JTextField(); 
        tenthField.setBounds(200, 230, 250, 25); 
        frame.add(tenthField); 
 
        JLabel twelfthLabel = new JLabel("12th Percentage:"); 
        twelfthLabel.setBounds(50, 270, 150, 25); 
        frame.add(twelfthLabel); 
 
        JTextField twelfthField = new JTextField(); 
        twelfthField.setBounds(200, 270, 250, 25); 
        frame.add(twelfthField); 
 
        JLabel skillsLabel = new JLabel("Technical Skills:"); 
        skillsLabel.setBounds(50, 310, 150, 25); 
        frame.add(skillsLabel); 
 
        JCheckBox java = new JCheckBox("Java"); 
        java.setBounds(200, 310, 80, 25); 
        JCheckBox python = new JCheckBox("Python"); 
        python.setBounds(280, 310, 80, 25); 
        JCheckBox cpp = new JCheckBox("C++"); 
        cpp.setBounds(360, 310, 80, 25); 
        JCheckBox web = new JCheckBox("Web Dev"); 
        web.setBounds(200, 340, 100, 25); 
        JCheckBox db = new JCheckBox("SQL/DBMS"); 
        db.setBounds(300, 340, 120, 25); 
        JCheckBox ml = new JCheckBox("Machine Learning"); 
        ml.setBounds(200, 370, 200, 25); 
        frame.add(java); frame.add(python); frame.add(cpp); 
        frame.add(web); frame.add(db); frame.add(ml); 
 
        JLabel softLabel = new JLabel("Soft Skills:"); 
        softLabel.setBounds(50, 410, 150, 25); 
        frame.add(softLabel); 
 
        JCheckBox comm = new JCheckBox("Communication"); 
        comm.setBounds(200, 410, 150, 25); 
        JCheckBox team = new JCheckBox("Teamwork"); 
        team.setBounds(350, 410, 120, 25); 
        JCheckBox lead = new JCheckBox("Leadership"); 
        lead.setBounds(200, 440, 120, 25); 
        JCheckBox prob = new JCheckBox("Problem Solving"); 
        prob.setBounds(320, 440, 150, 25); 
        frame.add(comm); frame.add(team); frame.add(lead); frame.add(prob); 
 
        JButton checkBtn = new JButton("Check Eligibility"); 
        checkBtn.setBounds(160, 500, 200, 40); 
        frame.add(checkBtn); 
 
        JLabel resultLabel = new JLabel(""); 
        resultLabel.setBounds(50, 570, 450, 25); 
        resultLabel.setForeground(Color.BLUE); 
        frame.add(resultLabel); 
 
        checkBtn.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                try { 
                    String name = nameField.getText(); 
                    double cgpa = Double.parseDouble(cgpaField.getText()); 
                    double tenth = Double.parseDouble(tenthField.getText()); 
                    double twelfth = Double.parseDouble(twelfthField.getText()); 
 
                    int techCount = 0; 
                    if (java.isSelected()) techCount++; 
                    if (python.isSelected()) techCount++; 
                    if (cpp.isSelected()) techCount++; 
                    if (web.isSelected()) techCount++; 
                    if (db.isSelected()) techCount++; 
                    if (ml.isSelected()) techCount++; 
 
                    int softCount = 0; 
                    if (comm.isSelected()) softCount++; 
                    if (team.isSelected()) softCount++; 
                    if (lead.isSelected()) softCount++; 
                    if (prob.isSelected()) softCount++; 
 
                    if (cgpa >= 8.0 && tenth >= 85 && twelfth >= 80 && techCount >= 3 && softCount >= 2) 
                        resultLabel.setText(name + " - Eligible for the job"); 
                    else 
                        resultLabel.setText(name + " - Not Eligible for the job"); 
                }  
                catch (Exception ex) { 
                    resultLabel.setText("Please enter valid numeric values in all fields."); 
                } 
            } 
        }); 
 
        frame.setVisible(true); 
    } 
} 
 