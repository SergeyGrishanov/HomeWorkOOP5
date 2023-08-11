// Конструируем калькулятор, применяя архитектуру MVP (Model-View-Presenter), 
// с возможностью выполнения базовых математических операций, 
// таких как сложение, вычитание, умножение и деление, работающий с дробными числами.

public class Main {
    public static void main(String[] args) {
             
        Presenter present = new Presenter(new Model(), new View());
        present.buttonClicked();

    }
}
