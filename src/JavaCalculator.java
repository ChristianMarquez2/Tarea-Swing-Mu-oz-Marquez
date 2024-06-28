import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private JPanel JavaCalculator;
    private JTextField textField1;
    private JButton raizButton;
    private JButton btnNine;
    private JButton btnFive;
    private JButton btnOne;
    private JButton senButton;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPoint;
    private JButton cosButton;
    private JButton tanButton;
    private JButton btnExp;
    private JButton btnEight;
    private JButton btnZero;
    private JButton btnSix;
    private JButton btnThree;
    private JButton btnTwo;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnMultiply;
    private JButton btDivide;
    private JButton btnEquals;
    private JButton btnClear;

    public JavaCalculator() {

        addNumberButtonListener(btnZero);
        addNumberButtonListener(btnOne);
        addNumberButtonListener(btnTwo);
        addNumberButtonListener(btnThree);
        addNumberButtonListener(btnFour);
        addNumberButtonListener(btnFive);
        addNumberButtonListener(btnSix);
        addNumberButtonListener(btnSeven);
        addNumberButtonListener(btnEight);
        addNumberButtonListener(btnNine);
    }

    private void addNumberButtonListener(JButton button) {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonText = textField1.getText() + button.getText();
                textField1.setText(buttonText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}