import javax.swing.*;

public class ForLoop {
    public static void main(String[] args) {

        JTextArea area = new JTextArea("Yards Inches\n");

        for(int i=1;i<=10;i++)
        {
            int inches, yards=i;

            inches = yards*36;

            area.append(yards + "      " + inches + "\n");
        }

        JOptionPane.showMessageDialog(null,area);
    }
}
