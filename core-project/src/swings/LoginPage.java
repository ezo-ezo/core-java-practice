package swings;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Pattern;

public class LoginPage extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private final String correctPassword = "helloworld";

    public LoginPage() {
        initializeComponents();
        configureFrame();
    }

    private void initializeComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Title
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        JLabel titleLabel = new JLabel("Login Page", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(titleLabel, gbc);

        // Email Label and Field
        gbc.gridy++;
        gbc.gridwidth = 1;
        add(new JLabel("Email:"), gbc);
        gbc.gridx = 1;
        emailField = new JTextField(20);
        add(emailField, gbc);

        // Password Label and Field
        gbc.gridx = 0;
        gbc.gridy++;
        add(new JLabel("Password:"), gbc);
        gbc.gridx = 1;
        passwordField = new JPasswordField(20);
        add(passwordField, gbc);

        // Login Button
        gbc.gridy++;
        gbc.gridx = 1;
        gbc.gridwidth = 1;
        JButton loginButton = new JButton("Login");
        add(loginButton, gbc);

        // Forgot Password Button
        gbc.gridy++;
        JButton forgotButton = new JButton("Forgot Password?");
        add(forgotButton, gbc);

        // Event Listeners
        loginButton.addActionListener(e -> validateLogin());
        forgotButton.addActionListener(e -> showForgotPassword());
    }

    private void validateLogin() {
        String email = emailField.getText().trim();
        String password = new String(passwordField.getPassword());

        if (email.isEmpty() || password.isEmpty()) {
            showError("Please enter both email and password.");
            return;
        }

        // Basic email pattern check
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        if (!emailPattern.matcher(email).matches()) {
            showError("Invalid email format.");
            return;
        }

        // Password check
        if (!password.equals(correctPassword)) {
            showError("Incorrect password.");
            return;
        }

        // Success
        JOptionPane.showMessageDialog(this, "Login Successful!", "Welcome", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showForgotPassword() {
        JOptionPane.showMessageDialog(this,
                "Hint: The password is 'helloworld'.", "Forgot Password", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Login Failed", JOptionPane.ERROR_MESSAGE);
    }

    private void configureFrame() {
        setTitle("Login Page");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginPage::new);
    }
}
