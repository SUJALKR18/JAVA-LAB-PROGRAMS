import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class QuizForm extends JFrame {
    private String[] questions = {
        "1. What is encapsulation in object-oriented programming?",
        "2. Which keyword is used for class inheritance in Java?",
        "3. What does polymorphism allow in Java?",
        "4. Which statement about abstract classes in Java is true?",
        "5. What does decidability mean in theory of computation?",
        "6. What does DFA stand for?",
        "7. Which language class is accepted by a pushdown automaton?",
        "8. What is method overriding in Java?",
        "9. Which access level restricts a member to the same package (package-private)?",
        "10. The pumping lemma for regular languages is primarily used to:"
    };
    private String[][] options = {
        {"Hiding implementation details","Inheriting properties","Overloading methods","Running code"},
        {"implement","extends","inherits","super"},
        {"Compile time binding","Different behaviors via same interface","Only single inheritance","Automatic memory management"},
        {"Can be instantiated","May contain abstract methods","Only has concrete methods","Must be final"},
        {"A problem solvable by an algorithm","Requires infinite memory","Always unsolvable","Irrelevant to computation"},
        {"Deterministic Finite Automaton","Directed Finite Algorithm","Deterministic Function Automaton","Dual Finite Automaton"},
        {"Regular languages","Context-free languages","Context-sensitive languages","Recursive languages"},
        {"Same method name, same signature in subclass","Same name but different signature in same class","Different name in subclass","Method defined only once"},
        {"private","public","protected","Default (no modifier)"},
        {"Prove a language is regular","Prove a language is not regular","Optimize finite automata","Parse context-free grammars"}
    };

    private int[] answers = {0,1,1,1,0,0,1,0,3,1};
    private JRadioButton[][] btns = new JRadioButton[10][4];
    public QuizForm() {
        setTitle("CSE Fundamentals Quiz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));
        main.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        for (int i = 0; i < 10; i++) {
            JPanel qPanel = new JPanel();
            qPanel.setLayout(new BoxLayout(qPanel, BoxLayout.Y_AXIS));
            qPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
            qPanel.add(new JLabel(questions[i]));
            ButtonGroup g = new ButtonGroup();
            for (int j = 0; j < 4; j++) {
                btns[i][j] = new JRadioButton(options[i][j]);
                g.add(btns[i][j]);
                qPanel.add(btns[i][j]);
            }
            qPanel.setBorder(BorderFactory.createEmptyBorder(8,8,8,8));
            main.add(qPanel);
        }
        JPanel bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton submit = new JButton("Submit");
        JButton reset = new JButton("Reset");
        bottom.add(submit);
        bottom.add(reset);
        main.add(bottom);
        JScrollPane sp = new JScrollPane(main);
        sp.setPreferredSize(new Dimension(650, 600));
        add(sp);

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int score = 0;
                for (int i = 0; i < 10; i++) {
                    int selected = -1;
                    for (int j = 0; j < 4; j++) {
                        if (btns[i][j].isSelected()) {
                            selected = j;
                            break;
                        }
                    }
                    if (selected == answers[i]) score++;
                }
                JOptionPane.showMessageDialog(QuizForm.this, "You scored " + score + " out of 10");
            }
        });
        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 10; i++)
                    for (int j = 0; j < 4; j++)
                        btns[i][j].setSelected(false);
            }
        });
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new QuizForm();
            }
        });
    }
}
