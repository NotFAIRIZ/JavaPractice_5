class Button extends WindowComponent {
    private String text;
    private String imagePath;

    public Button(String name, String text, String imagePath) {
        super(name);
        this.text = text;
        this.imagePath = imagePath;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Button: " + text);
        if (imagePath != null && !imagePath.isEmpty()) {
            System.out.println("Image Path: " + imagePath);
        }
    }

    @Override
    public void addComponent(WindowComponent component) {
        throw new UnsupportedOperationException("Cannot add components to a Button.");
    }

    @Override
    public void removeComponent(String name) {
        throw new UnsupportedOperationException("Cannot remove components from a Button.");
    }
}
