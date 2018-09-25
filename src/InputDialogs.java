import javax.swing.*;

public class InputDialogs {
    public static void main(String[] args) {
        double length, breadth, totalArea, totalCost, costPer2;
        String name, lengthAsString, breadthAsString, costPer2AsString;

        name = JOptionPane.showInputDialog("Enter name: ");

        lengthAsString = JOptionPane.showInputDialog("Enter length of room: ");
        length = Double.parseDouble(lengthAsString);

        breadthAsString = JOptionPane.showInputDialog("Enter breadth of room: ");
        breadth = Double.parseDouble(breadthAsString);

        totalArea = length*breadth;

        costPer2AsString = JOptionPane.showInputDialog("Enter the cost per square metre of carpet: ");
        costPer2 = Double.parseDouble(costPer2AsString);

        totalCost = totalArea*costPer2;

        JTextArea area = new JTextArea(String.format("%-20s%-20s\n%-20s%.2f\n%-20s%.2f\n%-20s%.2f\n%-20s%.2f\n%-20s%.2f","Quotation for ", name, "\nLength of room: ", length, "\nBreadth of room: ", breadth,
            "\nTotal area of the room: ", totalArea, "\nCost per square metre of carpet: ", costPer2, "\nTotal cost of carpet: ", totalCost));

        JOptionPane.showMessageDialog(null, area);
    }
}
