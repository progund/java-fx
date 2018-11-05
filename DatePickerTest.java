import java.time.LocalDate;
import javafx.scene.control.DatePicker;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javafx.embed.swing.JFXPanel;

import javafx.scene.*;

public class DatePickerTest {

  public static void main(String[] args) throws Exception {

    JFXPanel jFXPanel = new JFXPanel();
    Group group = new Group();
    DatePicker datePicker = new DatePicker(LocalDate.now());
    group.getChildren().add(datePicker);
    Scene scene = new Scene(group);
    jFXPanel.setScene(scene);
    JPanel jPanel = new JPanel();
    jPanel.add(jFXPanel);
    int res = JOptionPane.showConfirmDialog(null, jPanel, "Choose",
                                            JOptionPane.OK_CANCEL_OPTION);
    LocalDate localDate = datePicker.getValue();
    System.out.println(localDate);
  }
}
