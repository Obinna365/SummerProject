package Application;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {

    private JTextField jTextField1;
    private JPasswordField jPasswordField1;
    private JLabel jLabel1;
    private JButton jButton2;
    private JLabel jLabel2;
    private JMenuBar jMenuBar1;
    private JMenu LogInMenu = new JMenu("LogIn");
    private JMenu SignUpMenu = new JMenu("SignUp");
    private JMenuItem AccountLogin = new JMenuItem("Sign In");
    private JMenuItem AccountCreation = new JMenuItem("Create Account");

    public Main() {
        initComponents();
    }

    private void initComponents() {
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jLabel1 = new JLabel("Enter Username");
        jButton2 = new JButton("Sign In");
        jLabel2 = new JLabel("Enter Password");
        jMenuBar1 = new JMenuBar();



        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 400);
        setTitle("LogIn Page");
        setLayout(null);  // Set layout to null for absolute positioning

        // Set bounds for components (x, y, width, height)
        jLabel1.setBounds(140, 20, 120, 30);
        jTextField1.setBounds(50, 60, 300, 30);
        jLabel2.setBounds(140, 100, 120, 30);
        jPasswordField1.setBounds(50, 140, 300, 30);
        jButton2.setBounds(150, 180, 100, 30);

        // Add components to the frame
        add(jLabel1);
        add(jTextField1);
        add(jLabel2);
        add(jPasswordField1);
        add(jButton2);



        // Add action listeners
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        LogInMenu.add(AccountLogin);
        SignUpMenu.add(AccountCreation);

        // Add menus to menu bar
        jMenuBar1.add(LogInMenu);
        jMenuBar1.add(SignUpMenu);

        // Set menu bar for the frame
        setJMenuBar(jMenuBar1);

        AccountLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("AccountLogin Pressed");

JOptionPane.showMessageDialog(Main.this, "You are on The Login Page!");            }
        });
        AccountCreation.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Accountcreation Pressed");
                JFrame frame = new JFrame("Sign Up");
                frame.setSize(400, 400);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);



            }
        });
    }



    private void jButton2ActionPerformed(ActionEvent evt) {
        // Code to execute when Sign In button is clicked
        String username = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        System.out.println("Username: " + username + "\n" + "Password: " + password);
    }


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
}