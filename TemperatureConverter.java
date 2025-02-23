import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverter extends JFrame {
    private JTextField celsiusField;
    private JButton convertButton;
    private JLabel resultLabel;

    public TemperatureConverter() {

        setTitle("Celsius to Fahrenheit Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel celsiusLabel = new JLabel("Enter temperature in Celsius:");
        celsiusField = new JTextField(10);
        convertButton = new JButton("Convert");
        resultLabel = new JLabel("Fahrenheit: ");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertTemperature();
            }
        });

        add(celsiusLabel);
        add(celsiusField);
        add(convertButton);
        add(resultLabel);
    }

    private void convertTemperature() {
        try {
            double celsius = Double.parseDouble(celsiusField.getText());
            double fahrenheit = (celsius * 9/5) + 32;
            resultLabel.setText(String.format("Fahrenheit: %.2f", fahrenheit));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureConverter converter = new TemperatureConverter();
            converter.setVisible(true);
        });
    }
}
