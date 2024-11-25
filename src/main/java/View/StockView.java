package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class StockView extends JFrame {
    private JTextField symbolField;
    private JTextField quantityField;
    private JTextField purchasePriceField;
    private JTextField purchaseDateField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public StockView() {
        setTitle("Stock Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        add(new JLabel("Símbolo de la acción:"));
        symbolField = new JTextField();
        add(symbolField);

        add(new JLabel("Cantidad de acciones:"));
        quantityField = new JTextField();
        add(quantityField);

        add(new JLabel("Precio de compra por acción:"));
        purchasePriceField = new JTextField();
        add(purchasePriceField);

        add(new JLabel("Fecha de compra (YYYY-MM-DD):"));
        purchaseDateField = new JTextField();
        add(purchaseDateField);

        calculateButton = new JButton("Calcular");
        add(calculateButton);

        resultLabel = new JLabel("Resultado: ");
        add(resultLabel);
    }

    public String getSymbol() {
        return symbolField.getText();
    }

    public double getQuantity() {
        return Double.parseDouble(quantityField.getText());
    }

    public double getPurchasePrice() {
        return Double.parseDouble(purchasePriceField.getText());
    }

    public String getPurchaseDate() {
        return purchaseDateField.getText();
    }

    public void setResult(String result) {
        resultLabel.setText(result);
    }

    public void addCalculateButtonListener(ActionListener listener) {
        calculateButton.addActionListener(listener);
    }
}
