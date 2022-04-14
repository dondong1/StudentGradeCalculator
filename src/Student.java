import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField studentName;
    private JTextField midterm;
    private JTextField prelim;
    private JTextField finalTerm;
    private JTextField average;
    private JTextField result;
    private JButton calculateButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int p, m, f;
                double avg;

                p = Integer.parseInt(prelim.getText());
                m = Integer.parseInt(midterm.getText());
                f = Integer.parseInt(finalTerm.getText());

                avg = (p + m + f) / 3;
                average.setText(String.valueOf(avg));
                if(avg >50) {
                    result.setText("Congratulation!, You Passed!!!");
                }
                else {
                    result.setText("Failed");
                }



            }
        });
    }
}
