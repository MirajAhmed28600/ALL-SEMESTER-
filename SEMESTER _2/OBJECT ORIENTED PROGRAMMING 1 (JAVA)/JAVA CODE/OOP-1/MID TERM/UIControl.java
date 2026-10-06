

public class UIControl {
    private boolean isEnabled = true; // Field

    public UIControl() {
        System.out.println("UIControl"); // Constructors
    }

    public void enable() { // Method
        isEnabled = true;
    }

    public void disable() { // Method
        isEnabled = false;
    }

    public boolean isEnabled() { // Method
        return isEnabled;
    }
}
