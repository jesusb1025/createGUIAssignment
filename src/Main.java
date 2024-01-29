import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;


public class Main {
  public static void main(String[] args) {
    String text = "";
    JFrame frame = new JFrame();
    frame.setSize(500,500);

    JPanel panel = new JPanel();
    JLabel label = new JLabel("Celsius to farenheit converter!");
    JLabel img = new JLabel();
    JLabel label2 = new JLabel("");
    JButton button = new JButton("Convert");
    JButton button2 = new JButton();
    JTextField textField = new JTextField();
    ImageIcon originalIcon = new ImageIcon("celsius.png");
    Image originalImage = originalIcon.getImage();
    Image resizedImage = originalImage.getScaledInstance(300, 100, Image.SCALE_SMOOTH);
    ImageIcon resizedIcon = new ImageIcon(resizedImage);

    label2.setIcon(resizedIcon);

    textField.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        text = textField.getText();


      }

    });

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e){
        double celsius = Double.parseDouble(text);
        double farenheit = (celsius * 1.8) + 32;
        label2.setText("Farenheit: " + farenheit);


      }

    });




    panel.setLayout(new BorderLayout());
    panel.add(label, BorderLayout.NORTH);;
    panel.add(label2, BorderLayout.CENTER);
    panel.add(img, FlowLayout.CENTER);
    panel.add(button2, BorderLayout.WEST);
    panel.add(button, BorderLayout.EAST);
    panel.add(textField, BorderLayout.SOUTH);
    frame.add(panel);
    panel.setBackground(Color.pink);

    frame.setVisible(true);

  }
}
