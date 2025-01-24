import java.util.ArrayList;
import java.util.List;

abstract class WindowComponent {
    protected String name;
    protected List<WindowComponent> nestedComponents = new ArrayList<>();

    public WindowComponent(String name) {
        this.name = name;
    }

    public void draw() {
        for (WindowComponent element : nestedComponents) {
            element.draw();
        }
    }

    public void addComponent(WindowComponent component) {
        nestedComponents.add(component);
    }

    public void removeComponent(String name) {
        for (int i = 0; i < nestedComponents.size(); i++) {
            if (nestedComponents.get(i).name.equals(name)) {
                nestedComponents.remove(i);
                i--; // Adjust index after removal
            }
        }
    }
}
