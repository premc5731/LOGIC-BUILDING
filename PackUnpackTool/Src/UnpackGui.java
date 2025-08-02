package Src;
import PackerUnpacker.Unpacker;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import PackerUnpacker.Unpacker;

import javax.swing.*;

class UnpackMainWindow extends JFrame implements ActionListener {
    JLabel fileLabel;
    JTextField fileText;
    JLabel status;
    JButton Unpack, Back;

    UnpackMainWindow() {
        
        // Label
        fileLabel = new JLabel("File Name:");
        fileLabel.setBounds(50, 80, 100, 30);

        // Text Field
        fileText = new JTextField();
        fileText.setBounds(160, 80, 280, 30);

        // Buttons
        Unpack = new JButton("Unpack");
        Back = new JButton("Back");

        Unpack.setBounds(120, 140, 100, 40);
        Back.setBounds(260, 140, 100, 40);

        Unpack.setBackground(Color.GREEN);
        Back.setBackground(Color.GREEN);

        Unpack.setForeground(Color.BLACK);
        Back.setForeground(Color.BLACK);

        Unpack.addActionListener(this);
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new MainWindow();
            }
        }); 

        // Status Label
        status = new JLabel("");
        status.setBounds(170, 200, 200, 30);
        status.setForeground(Color.BLUE);

        // Add components
        add(fileLabel);
        add(fileText);
        add(Unpack);
        add(Back);
        add(status);

        setTitle("Unpack");
        setSize(500, 300);
        setLocation(450, 250);  
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.cyan);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        status.setText("Packing...");

        String PackName = fileText.getText();

        try {
            Unpacker mobj = new Unpacker(PackName);
            int iRet = mobj.UnpackingActivity();

            if(iRet == 0)
            {
                status.setText("Files are Unpacked Successfully");
            }
            else
            {
                status.setText("There is an error; look into log");   
            }
        } catch (Exception ex) {
            status.setText("Unpacking Failed!");
            ex.printStackTrace();
        }
    }
}

public class UnpackGui {
    public static void main(String[] args) {
        new UnpackMainWindow();
    }
}
