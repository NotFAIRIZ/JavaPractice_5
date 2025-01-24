class VerticalLayout extends WindowComponent {
    private int width;
    private int height;

    public VerticalLayout(String name, int width, int height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing VerticalLayout: " + name);
        System.out.println("Width: " + width + ", Height: " + height);
        for (WindowComponent component : nestedComponents) {
            component.draw();
        }
    }
}
