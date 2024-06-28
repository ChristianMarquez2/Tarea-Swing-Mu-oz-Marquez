import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private String operator = "";

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

        // Operadores
        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                operator = "+";
                textField1.setText("");
            }
        });
        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                operator = "-";
                textField1.setText("");
            }
        });
        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                operator = "*";
                textField1.setText("");
            }
        });
        btDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                operator = "/";
                textField1.setText("");
            }
        });
        btnExp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                operator = "^";
                textField1.setText("");
            }
        });
        raizButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(Math.sqrt(total1)));
                total1 = 0;
            }
        });
        senButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(Math.sin(Math.toRadians(total1))));
                total1 = 0;
            }
        });
        cosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(Math.cos(Math.toRadians(total1))));
                total1 = 0;
            }
        });
        tanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(Math.tan(Math.toRadians(total1))));
                total1 = 0;
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Double.parseDouble(textField1.getText());
                switch (operator) {
                    case "+":
                        textField1.setText(Double.toString(total1 + total2));
                        break;
                    case "-":
                        textField1.setText(Double.toString(total1 - total2));
                        break;
                    case "*":
                        textField1.setText(Double.toString(total1 * total2));
                        break;
                    case "/":
                        if (total2 != 0) {
                            textField1.setText(Double.toString(total1 / total2));
                        } else {
                            textField1.setText("Error");
                        }
                        break;
                    case "^":
                        textField1.setText(Double.toString(Math.pow(total1, total2)));
                        break;
                }
                total1 = 0;
                total2 = 0;
                operator = "";
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0;
                total2 = 0;
                operator = "";
                textField1.setText("");
            }
        });
    }

    // Método para añadir ActionListener a los botones numéricos
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
