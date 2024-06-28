import javax.swing.*;

public class JavaCalculator {

    private JPanel JavaCalculator;
    private JTextField textField1;
    private JButton button1;
    private JButton btnNine;
    private JButton btnFive;
    private JButton btnOne;
    private JButton button5;
    private JButton btnFour;
    private JButton btnSeven;
    private JButton btnPoint;
    private JButton button9;
    private JButton button10;
    private JButton button11;
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

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
