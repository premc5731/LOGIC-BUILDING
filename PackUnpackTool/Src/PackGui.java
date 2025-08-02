package Src;
import PackerUnpacker.Packer;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import PackerUnpacker.Packer;

import javax.swing.*;

class PackMainWindow extends JFrame implements ActionListener {
    JLabel folderLabel;
    JLabel fileLabel;
    JTextField folderText;
    JTextField fileText;
    JLabel status;
    JButton Pack, Back;

    PackMainWindow() {
        

        // Labels
        folderLabel = new JLabel("Folder Name:");
        fileLabel = new JLabel("File Name:");

        folderLabel.setBounds(50, 30, 100, 30);
        fileLabel.setBounds(50, 80, 100, 30);

        // Text Fields
        folderText = new JTextField();
        fileText = new JTextField();

        folderText.setBounds(160, 30, 280, 30);
        fileText.setBounds(160, 80, 280, 30);

        // Buttons
        Pack = new JButton("Pack");
        Back = new JButton("Back");

        Pack.setBounds(120, 140, 100, 40);
        Back.setBounds(260, 140, 100, 40);

        Pack.setBackground(Color.GREEN);
        Back.setBackground(Color.GREEN);

        Pack.setForeground(Color.BLACK);
        Back.setForeground(Color.BLACK);

        Pack.addActionListener(this);
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
        add(folderLabel);
        add(fileLabel);
        add(folderText);
        add(fileText);
        add(Pack);
        add(Back);
        add(status);

        getContentPane().setBackground(Color.cyan);
        setTitle("Pack");
        setSize(500, 300);
        setLocation(450, 250);  
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        status.setText("Packing...");

        String PackName = fileText.getText();
        String DirName = folderText.getText();

        try {
            Packer mobj = new Packer(PackName, DirName);
            int iRet = mobj.PackingActivity();

            if(iRet == 0)
            {
                status.setText("Files are Packed Successfully");
            }
            else
            {
                status.setText("There is an error; look into log");   
            }
        } catch (Exception ex) {
            status.setText("Packing Failed!");
            ex.printStackTrace();
        }
    }
}

public class PackGui {
    public static void main(String[] args) {
        new PackMainWindow();
    }
}
