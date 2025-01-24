class WindowManager {
    private Window window;

    public WindowManager(Window window) {
        this.window = window;
    }

    public void draw() {
        System.out.println("Starting drawing process");
        window.draw();
    }
}