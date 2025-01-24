public class Main {
    public static void main(String[] args) {
        Window w1 = new Window("Window 1", "window", 1920, 1020);
        VerticalLayout l1 = new VerticalLayout( "layout",1200, 800);
        Button button1 = new Button("button1", "click", "User/desktop/1123.jpg");
        Button button2 = new Button("button2", "click", "User/desktop/aaaaaadas.png");

        l1.addComponent(button1);
        l1.addComponent(button2);
        w1.addComponent(l1);

        WindowManager manager = new WindowManager(w1);
        manager.draw();
    }
}
