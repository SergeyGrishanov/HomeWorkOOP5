

public class Presenter {
    private final Model model;
    private final View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void buttonClicked() {
        view.showWelcomeMessage();
        String operation = view.getUserOperation();
        if (!operation.matches("[1234]")) {
            view.showError("Неправильный оператор");
            return;
        }
        double num1 = view.getUserNumber("число а: ");
        double num2 = view.getUserNumber("число b: ");
        try {
            switch (operation) {
                case "1": // +
                    view.getResult(model.add(num1, num2));
                    break;
                case "2": // -
                    view.getResult(model.subtract(num1, num2));
                    break;
                case "3": // *
                    view.getResult(model.multiply(num1, num2));
                    break;
                case "4": // /
                    view.getResult(model.divide(num1, num2));
                    break;
            }
        } catch (IllegalArgumentException e) {
            view.showError(e.getMessage());
        }
    }
}
