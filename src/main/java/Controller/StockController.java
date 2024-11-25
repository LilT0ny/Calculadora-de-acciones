package Controller;

import Model.StockModel;
import View.StockView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StockController {
    private StockModel model;
    private StockView view;

    public StockController(StockModel model, StockView view) {
        this.model = model;
        this.view = view;

        this.view.addCalculateButtonListener(new CalculateButtonListener());
    }

    class CalculateButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String symbol = view.getSymbol();
            double quantity = view.getQuantity();
            double purchasePrice = view.getPurchasePrice();

            double currentPrice = model.obtenerPrecioActual(symbol);
            if (currentPrice != -1) {
                double[] result = model.calcularGananciaPerdida(purchasePrice, currentPrice, quantity);
                double percentageGain = result[0];
                double dollarGain = result[1];

                String resultText = String.format("<html><p>Equivalente en dólares: $%.2f</p><p>Ganancia/Pérdida: %.2f%%</p></html>",
                        dollarGain, percentageGain);


                view.setResult(resultText);
            } else {
                view.setResult("No se pudo obtener el precio actual.");
            }
        }
    }
}
