import javax.swing.JOptionPane;
public class BMI {
    public static void main(String args[]) {
        float w = Float.parseFloat(JOptionPane.showInputDialog("Enter your weight in pounds."));
        float h = Float.parseFloat(JOptionPane.showInputDialog("Enter your height in inches."));
        JOptionPane.showMessageDialog(null, "Your Body Mass Index is " + ((w*0.453592) / (Math.pow((h*0.0254), 2))));
    }
}