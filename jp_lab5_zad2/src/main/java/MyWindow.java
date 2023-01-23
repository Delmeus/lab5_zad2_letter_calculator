import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Locale;

public class MyWindow implements MouseListener {

    private JTextField textField1;
    private JButton buttonABC;
    private JButton buttonGHI;
    private JButton buttonMNO;
    private JButton buttonSTUV;
    private JButton buttonDEF;
    private JButton buttonJKL;
    private JButton buttonPQR;
    private JButton buttonWXYZ;
    private JButton buttonDM;
    private JButton buttonCE;
    private JButton buttonC;
    private JButton buttonPlus;
    private JButton buttonMinus;
    private JButton buttonSlash;
    private JButton buttonEquals;
    private JPanel jPanel;

    private final ArrayList<JButton> letterButtons = new ArrayList<>();
    private final ArrayList<JButton> actionButtons = new ArrayList<>();

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zadanie 2");
        frame.setContentPane(new MyWindow().jPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MyWindow(){
        letterButtons.add(buttonABC);
        letterButtons.add(buttonDEF);
        letterButtons.add(buttonGHI);
        letterButtons.add(buttonJKL);
        letterButtons.add(buttonMNO);
        letterButtons.add(buttonPQR);
        letterButtons.add(buttonSTUV);
        letterButtons.add(buttonWXYZ);

        for(JButton button : letterButtons) button.addMouseListener(this);

        actionButtons.add(buttonDM);
        actionButtons.add(buttonCE);
        actionButtons.add(buttonC);
        actionButtons.add(buttonPlus);
        actionButtons.add(buttonMinus);
        actionButtons.add(buttonSlash);
        actionButtons.add(buttonEquals);

        for(JButton button : actionButtons) button.addMouseListener(this);

    }

    public boolean isCapital(){
        return buttonABC.getText().matches("ABC");
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        for(int i = 0; i <= 7; i++){
            StringBuilder builder = new StringBuilder(textField1.getText());
            if(letterButtons.get(i) == e.getSource() && i != 6 && i != 7) { // abc - pqr

                if (e.getClickCount() == 1) {
                    if (isCapital()) textField1.setText(textField1.getText() + (char) (65 + 3 * i));
                    else textField1.setText(textField1.getText() + (char) (97 + 3 * i));
                }

                if (e.getClickCount() != 1 && e.getClickCount() % 3 == 1) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if (isCapital()) textField1.setText(builder.toString() + (char) (65 + 3 * i));
                    else textField1.setText(builder.toString() + (char) (97 + 3 * i));

                } else if (e.getClickCount() != 1 && e.getClickCount() % 3 == 2) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if (isCapital()) textField1.setText(builder.toString() + (char) (66 + 3 * i));
                    else textField1.setText(builder.toString() + (char) (98 + 3 * i));

                } else if (e.getClickCount() != 1 && e.getClickCount() % 3 == 0) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if (isCapital()) textField1.setText(builder.toString() + (char) (67 + 3 * i));
                    else textField1.setText(builder.toString() + (char) (99 + 3 * i));

                }
            } // abc - pqr

            else if(letterButtons.get(i) == e.getSource() && i == 6){ //stuv

                if (e.getClickCount() == 1) {
                    if (isCapital()) textField1.setText(textField1.getText() + "S");
                    else textField1.setText(textField1.getText() + "s");
                }

                if (e.getClickCount() != 1 && e.getClickCount() % 4 == 1) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "S");
                    else textField1.setText(builder + "s");

                } else if (e.getClickCount() != 1 && e.getClickCount() % 4 == 2) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "T");
                    else textField1.setText(builder + "t");


                } else if (e.getClickCount() != 1 && e.getClickCount() % 4 == 3) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "U");
                    else textField1.setText(builder + "u");


                } else if (e.getClickCount() != 1 && e.getClickCount() % 4 == 0) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "V");
                    else textField1.setText(builder + "v");


                }
            } //stuv

            else if(letterButtons.get(i) == e.getSource() && i == 7){ //wxyz
                if (e.getClickCount() == 1) {
                    if (isCapital()) textField1.setText(textField1.getText() + "W");
                    else textField1.setText(textField1.getText() + "w");
                }

                if (e.getClickCount() != 1 && e.getClickCount() % 4 == 1) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "W");
                    else textField1.setText(builder + "w");

                } else if (e.getClickCount() != 1 && e.getClickCount() % 4 == 2) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "X");
                    else textField1.setText(builder + "x");


                } else if (e.getClickCount() != 1 && e.getClickCount() % 4 == 3) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "Y");
                    else textField1.setText(builder + "y");


                } else if (e.getClickCount() != 1 && e.getClickCount() % 4 == 0) {

                    try {
                        builder.deleteCharAt(textField1.getText().length() - 1);
                    }catch (IndexOutOfBoundsException ignored){}

                    if(isCapital()) textField1.setText(builder + "Z");
                    else textField1.setText(builder + "z");


                }
            } //wxyz
        }

        if(actionButtons.get(0) == e.getSource()){
            if(letterButtons.get(0).getText().matches("abc")) {
                for (JButton button : letterButtons) {
                    button.setText(button.getText().toUpperCase(Locale.ROOT));
                }
            }
            else{
                for (JButton button : letterButtons) {
                    button.setText(button.getText().toLowerCase(Locale.ROOT));
                }
            }
        } // DM

        if(actionButtons.get(1) == e.getSource()){
            if(!textField1.getText().isEmpty()) {
                StringBuilder builder = new StringBuilder(textField1.getText());
                builder.deleteCharAt(textField1.getText().length() - 1);
                textField1.setText(builder.toString());
            }
        } //CE

        if(actionButtons.get(2) == e.getSource()){
            textField1.setText("");
        }//C

        if(actionButtons.get(3) == e.getSource()){
            if(actionSymbolLast(textField1.getText())){
                StringBuilder builder = new StringBuilder(textField1.getText());
                builder.deleteCharAt(textField1.getText().length() - 1);
                textField1.setText(builder.toString());
            }
            textField1.setText(textField1.getText() + "+");
        }//+

        if(actionButtons.get(4) == e.getSource()){

            if(actionSymbolLast(textField1.getText())){
                StringBuilder builder = new StringBuilder(textField1.getText());
                builder.deleteCharAt(textField1.getText().length() - 1);
                textField1.setText(builder.toString());
            }
            textField1.setText(textField1.getText() + "-");
        }//-

        if(actionButtons.get(5) == e.getSource()){
            if(actionSymbolLast(textField1.getText())){
                StringBuilder builder = new StringBuilder(textField1.getText());
                builder.deleteCharAt(textField1.getText().length() - 1);
                textField1.setText(builder.toString());
            }
            textField1.setText(textField1.getText() + "/");
        }// /

        if(actionButtons.get(6) == e.getSource()){
            textField1.setText(calculate(textField1.getText()));
        }// =
    }

    public String calculate(String string){

        String[] splitStrings = string.split("[-.+/]");
        if (string.contains("+") && splitStrings.length == 2) {
            return addStrings(splitStrings[0], splitStrings[1]);
        }

        if (string.contains("-") && splitStrings.length == 2) {
            return subtractStrings(splitStrings[0], splitStrings[1]);
        }

        if (string.contains("/") && splitStrings.length == 2) {
            return divideStrings(splitStrings[0], splitStrings[1]);
        }

        else if(splitStrings.length < 2) JOptionPane.showMessageDialog(jPanel, "There is no operation symbol");
        else JOptionPane.showMessageDialog(jPanel, "Too many operations");

        return textField1.getText();
    }

    public String addStrings(String s1, String s2){
        return s1 + s2;
    }

    public String subtractStrings(String s1, String s2){

        StringBuilder builder = new StringBuilder(s1);

        for(int i = 0; i < s2.length(); i++){
            for(int j = 0; j < s1.length(); j++){
                if(s1.charAt(j) == s2.charAt(i)) builder.setCharAt(j, ' ');
            }
        }

        for(int i = builder.length() - 1; i >= 0; i--){
            if(builder.charAt(i) == ' ') builder.deleteCharAt(i);
        }
        return builder.toString();
    }

    public String divideStrings(String s1, String s2){

        char [] chars1 = s1.toCharArray();
        char [] chars2 = s2.toCharArray();
        StringBuilder builder = new StringBuilder(s2);
        int index = 0;
        boolean occurred = false;

        for (char c2 : chars2) {
            for (char c1 : chars1) {
                if (c2 == c1 && !occurred) {
                    builder.setCharAt(index, c2);
                    index++;
                    occurred = true;
                }
            }
            occurred = false;

        }

        if(index < builder.length()){
            for (int i = builder.length() - 1; i >= index; i--){
                builder.deleteCharAt(i);
            }
        }

        return builder.toString();
    }

    public boolean actionSymbolLast(String s){
        return s.charAt(s.length() - 1) == '+' || s.charAt(s.length() - 1) == '-' || s.charAt(s.length() - 1) == '/';
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
