import Controller.StockController;
import Model.StockModel;
import View.StockView;

public class Main {
    public static void main(String[] args) {
        String apiKey = "00HNW70PDMP0OC56"; // Reemplaza con tu clave de API
        StockModel model = new StockModel(apiKey);
        StockView view = new StockView();
        StockController controller = new StockController(model, view);

        view.setVisible(true);
    }
}
