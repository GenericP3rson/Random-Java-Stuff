import javax.swing.JOptionPane;

public class MilesPerGallon {
    public static void main(String args[]) {
        String inp = JOptionPane.showInputDialog("Enter the miles driven: ");
        Double mi  = Double.parseDouble(inp);
        JOptionPane.showMessageDialog(null, "The miles-per-gallon is " + mi);
    }
}