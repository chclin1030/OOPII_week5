import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class calculator extends JFrame{

    JPanel top,down;
    JTextField text; 
    JButton[] numberButton;

    public calculator(){

        super("Calculator");
        setLayout(new BorderLayout());

        top = new JPanel();
        text = new JTextField(20);
        text.setEditable(false);
        text.setBackground(Color.WHITE);
        top.add(text);
        add(top,BorderLayout.NORTH);

        down = new JPanel(new GridLayout(5,3,5,5));
        numberButton = new JButton[10];

		for(int i = 1 ; i < 4 ; i++) {
			numberButton[i] = new JButton(""+i);
			down.add(numberButton[i]);
		}
        for(int i = 4 ; i < 7 ; i++) {
			numberButton[i] = new JButton(""+i);
			down.add(numberButton[i]);
		}
        for(int i = 7 ; i < 10 ; i++) {
			numberButton[i] = new JButton(""+i);
			down.add(numberButton[i]);
		}
        JButton add = new JButton("+");
		down.add(add);
        JButton zero = new JButton("0");
		down.add(zero);
        JButton minus = new JButton("-");
		down.add(minus);
        JButton mul = new JButton("*");
		down.add(mul);
        JButton equal = new JButton("=");
		down.add(equal);
        JButton div = new JButton("/");
		down.add(div);
        
        add(down,BorderLayout.CENTER);
    }


    public static void main(String[] args) throws Exception{
        calculator cal = new calculator();
        cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cal.setBounds(100,200,250,350);
        cal.setVisible(true);

    }
}