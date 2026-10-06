package erpmanagementsystems;

import javax.swing.SwingUtilities;

import erpmanagementsystems.gui.EmployeeGUI;


public class Start {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmployeeGUI::new);
    }
}
