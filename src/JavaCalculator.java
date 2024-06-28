import javax.swing.*;
import java.awt.*;
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

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator(btnPlus.getText());
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator(btnMinus.getText());
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
                // Corrección: Añadido el switch para manejar las operaciones
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
        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField1.getText();
                if (!text.contains(".")) {
                    textField1.setText(text + ".");
                }
            }
        });
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

    private void getOperator(String button_text) {
        total1 = Double.parseDouble(textField1.getText());
        operator = button_text;
        textField1.setText("");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400, 500);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        JavaCalculator = new JPanel(new BorderLayout());

        textField1 = new JTextField();
        textField1.setFont(new Font("Arial", Font.BOLD, 24));
        textField1.setHorizontalAlignment(JTextField.RIGHT);
        JavaCalculator.add(textField1, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(6, 4, 5, 5));

        btnSeven = new JButton("7");
        btnEight = new JButton("8");
        btnNine = new JButton("9");
        btDivide = new JButton("÷");
        btnFour = new JButton("4");
        btnFive = new JButton("5");
        btnSix = new JButton("6");
        btnMultiply = new JButton("*");
        btnOne = new JButton("1");
        btnTwo = new JButton("2");
        btnThree = new JButton("3");
        btnMinus = new JButton("-");
        btnZero = new JButton("0");
        btnPoint = new JButton(".");
        btnPlus = new JButton("+");
        btnEquals = new JButton("=");
        btnClear = new JButton("C");
        raizButton = new JButton("√");
        senButton = new JButton("sin");
        cosButton = new JButton("cos");
        tanButton = new JButton("tan");
        btnExp = new JButton("^");

        buttonPanel.add(btnSeven);
        buttonPanel.add(btnEight);
        buttonPanel.add(btnNine);
        buttonPanel.add(btDivide);
        buttonPanel.add(btnFour);
        buttonPanel.add(btnFive);
        buttonPanel.add(btnSix);
        buttonPanel.add(btnMultiply);
        buttonPanel.add(btnOne);
        buttonPanel.add(btnTwo);
        buttonPanel.add(btnThree);
        buttonPanel.add(btnMinus);
        buttonPanel.add(btnZero);
        buttonPanel.add(btnPoint);
        buttonPanel.add(btnPlus);
        buttonPanel.add(btnEquals);
        buttonPanel.add(btnClear);
        buttonPanel.add(raizButton);
        buttonPanel.add(senButton);
        buttonPanel.add(cosButton);
        buttonPanel.add(tanButton);
        buttonPanel.add(btnExp);

        JavaCalculator.add(buttonPanel, BorderLayout.CENTER);
    }
}
