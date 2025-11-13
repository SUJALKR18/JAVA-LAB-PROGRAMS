import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 
public class CareerPointsForm extends JFrame { 
    private final JTextField nameField = new JTextField(20); 
    private final JTextArea addressArea = new JTextArea(3, 20); 
    private JTextField t10Field = new JTextField(6); 
    private JTextField t12Field = new JTextField(6); 
    private JTextField degreeField = new JTextField(6); 
    private JTextField masterField = new JTextField(6); 
    private JLabel resultLabel = new JLabel("Total Points: 0"); 
    public CareerPointsForm() { 
        setTitle("Application Form"); 
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setLayout(new BorderLayout()); 
        JPanel form = new JPanel(new GridBagLayout()); 
        GridBagConstraints c = new GridBagConstraints(); 
        c.insets = new Insets(6,6,6,6); 
        c.anchor = GridBagConstraints.WEST; 
        c.gridx = 0; c.gridy = 0; form.add(new JLabel("Name:"), c); 
        c.gridx = 1; form.add(nameField, c); 
        c.gridx = 0; c.gridy = 1; form.add(new JLabel("Address:"), c); 
        c.gridx = 1; JScrollPane sp = new JScrollPane(addressArea); form.add(sp, c); 
        c.gridx = 0; c.gridy = 2; form.add(new JLabel("10th Percentage:"), c); 
        c.gridx = 1; form.add(t10Field, c); 
        c.gridx = 0; c.gridy = 3; form.add(new JLabel("12th Percentage:"), c); 
        c.gridx = 1; form.add(t12Field, c); 
        c.gridx = 0; c.gridy = 4; form.add(new JLabel("Degree Percentage:"), c); 
        c.gridx = 1; form.add(degreeField, c); 
        c.gridx = 0; c.gridy = 5; form.add(new JLabel("Master Degree Percentage:"), c); 
        c.gridx = 1; form.add(masterField, c); 
 
        JPanel bottom = new JPanel(); 
        JButton submit = new JButton("Submit"); 
        bottom.add(submit); 
        bottom.add(resultLabel); 
        add(form, BorderLayout.CENTER); 
        add(bottom, BorderLayout.SOUTH); 
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
                try { 
                    double p10 = parsePercent(t10Field.getText()); 
                    double p12 = parsePercent(t12Field.getText()); 
                    double pDeg = parsePercent(degreeField.getText()); 
                    double pMas = parsePercent(masterField.getText()); 
                    int total = points(p10) + points(p12) + points(pDeg) + points(pMas); 
                    resultLabel.setText("Total Points: " + total); 
                } 
                catch (NumberFormatException ex) { 
                    JOptionPane.showMessageDialog(CareerPointsForm.this, "Please enter valid numeric percentages (0-100).", "Input Error", JOptionPane.ERROR_MESSAGE); 
                } 
            } 
        }); 
 
        pack(); 
        setLocationRelativeTo(null); 
        setVisible(true); 
    } 
 
    private double parsePercent(String s) { 
        s = s.trim(); 
        if (s.isEmpty()) return 0.0; 
        double v = Double.parseDouble(s); 
        if (v < 0 || v > 100) throw new NumberFormatException(); 
        return v; 
    } 
    private int points(double p) { 
        if (p >= 90) return 10; 
        if (p >= 80) return 8; 
        if (p >= 70) return 6; 
        if (p >= 60) return 4; 
        return 0; 
    } 
    public static void main(String[] args) { 
        SwingUtilities.invokeLater(new Runnable() { 
            @Override
            public void run() { 
                new CareerPointsForm(); 
            } 
        }); 
    } 
}