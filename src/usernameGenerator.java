import com.github.javafaker.Faker;

import javax.swing.*;

public class usernameGenerator {
    private JButton generateButton;
    private JTextField textField1;
    private JPanel panel1;

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch(Exception ignored){}
        JFrame frame = new JFrame("Username Generator");
        frame.setContentPane(new usernameGenerator().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public String generateUsername() {

        Faker faker = new Faker();
        String superhero = faker.superhero().prefix();
        String firstname = faker.name().firstName();
        String address = faker.address().buildingNumber();

        return superhero+firstname+address;
    }

    public usernameGenerator() {

        generateButton.addActionListener(e -> {
            textField1.setText(generateUsername());
        });
    }
}