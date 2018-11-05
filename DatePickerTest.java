import java.time.LocalDate;
import javafx.scene.control.DatePicker;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javafx.embed.swing.JFXPanel;

import javafx.scene.*;

public class DatePickerTest {

  public static void main(String[] args) throws Exception {

    JFXPanel panel = new JFXPanel();
    Group root = new Group();
    DatePicker datePicker = new DatePicker(LocalDate.now());
    root.getChildren().add(datePicker);
    Scene scene = new Scene(root);
    panel.setScene(scene);
    JPanel jp = new JPanel();
    jp.add(panel);
    int res = JOptionPane.showConfirmDialog(null, panel, "Choose",
                                            JOptionPane.OK_CANCEL_OPTION);//,
    LocalDate localDate = datePicker.getValue();
    System.out.println(localDate);
  }
}
