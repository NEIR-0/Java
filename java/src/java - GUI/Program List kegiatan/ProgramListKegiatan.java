/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;

//importan untuk membuat GUI
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//panggil JFrame
class Latihan_GUI extends JFrame implements ActionListener{
    
    //ukuran lebar dan tinggi
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    
    //letak posisi (x,y)
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    //empty untuk clear text
    private static final String EMPTY_STRING = "";
    
    //new line untuk membuat line baru/pemisah line
    private static final String NEWLINE = System.getProperty("line.separator");
    
    //jrame button dan text
    private JButton clearButton;
    private JButton addButton;
    private JTextField inputLine;
    private JTextArea textArea;
    
    
    public Latihan_GUI(){
        
        //untuk menapung /container
        Container contentPane;
        
        //setting properties frame
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("program latihan");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        textArea = new JTextArea();
        textArea.setColumns(22);
        textArea.setRows(8);
        textArea.setBorder(BorderFactory.createLineBorder(Color.RED));
        textArea.setEditable(false);
        contentPane.add(textArea);
        
        inputLine = new JTextField();
        inputLine.setColumns(22);
        contentPane.add(inputLine);
        inputLine.addActionListener(this);
        
        //membuat dua button ke dalam frame
        addButton = new JButton("ADD");
        contentPane.add(addButton);
        
        clearButton = new JButton("CLEAR");
        contentPane.add(clearButton);
        
        //membuat action listener unutk kedua button
        clearButton.addActionListener(this);
        addButton.addActionListener(this);
        
        //tutup form saat [x] diklik
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
        //setting event
        public void actionPerformed(ActionEvent event){
            if (event.getSource() instanceof JButton){
                JButton clickedButton = (JButton) event.getSource();
                if (clickedButton == addButton){
                    addText(inputLine.getText());
                }
                
                else{
                    clearText();
                }
                
            }
            
            else{
                 addText(inputLine.getText());       
                }               
        }
        
        private void addText(String newline){
            textArea.append(newline + NEWLINE);
            inputLine.setText("");
        }
        
        private void clearText(){
            textArea.setText(EMPTY_STRING);
            inputLine.setText(EMPTY_STRING);
        }

    
}