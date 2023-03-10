
package App.Helpers;

import java.awt.Color;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author win10
 */
public class Datavalidator {

    public static void validateEmpty(JTextField field, StringBuffer sb, String errorMessage) {
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.YELLOW);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }

    public static void validateEmpty(JPasswordField field, StringBuffer sb, String errorMessage) {
        String s = new String(field.getPassword());
        if (s.equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.YELLOW);
            field.requestFocus();
        } else {
            field.setBackground(Color.WHITE);
        }
    }
}

   

 