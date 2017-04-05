/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.lonestar.tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author BillSmith
 */
public class TicTacToeGrid extends JFrame
  {
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGTH = 500;
    
    private JRadioButton playerX;
    private JRadioButton playerO;
    private JLabel lblSpace;
   
    private ImageIcon blank = new ImageIcon("LSC_Vertical.jpg");
    public ImageIcon X = new ImageIcon("Player_X.png");
    public ImageIcon O = new ImageIcon("Player_O.png");
    
    public JButton btnSq11;
    public JButton btnSq12;
    public JButton btnSq13;
    public JButton btnSq21;
    public JButton btnSq22;
    public JButton btnSq23;
    public JButton btnSq31;
    public JButton btnSq32;
    public JButton btnSq33;
    
    private boolean isWinner = false;
    
    private boolean[] played = new boolean[9];
    
    
    
    public TicTacToeGrid()
    {
        setTitle("Tic Tac Toe Game");
        setSize(WINDOW_WIDTH,WINDOW_HEIGTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Dimension bigSpace = new Dimension(200,50);
        Dimension bigBtn = new Dimension(100,50);
        Font radFont = new Font("Sans Serif", Font.BOLD, 20);
        
        JPanel pnlTop = new JPanel();
        playerX = new JRadioButton("Player X", true);
        playerO = new JRadioButton("Player O");
        playerX.setForeground(Color.BLUE);
        playerO.setForeground(Color.RED);
        playerX.setFont(radFont);
        playerO.setFont(radFont);
       
        lblSpace = new JLabel(" ");
        lblSpace.setPreferredSize(bigSpace);
        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(playerX);
        bg1.add(playerO);
        pnlTop.add(playerX);
        pnlTop.add(lblSpace);
        pnlTop.add(playerO);
        
        int i;
        for(i = 0; i < played.length; i++)
            { 
              played[i] = false; 
            }
        
        btnSq11 = new JButton(blank);
        btnSq12 = new JButton(blank);
        btnSq13 = new JButton(blank);
        btnSq21 = new JButton(blank);
        btnSq22 = new JButton(blank);
        btnSq23 = new JButton(blank);
        btnSq31 = new JButton(blank);
        btnSq32 = new JButton(blank);
        btnSq33 = new JButton(blank);
        
        btnSq11.addActionListener(new ButtonListener());
        btnSq12.addActionListener(new ButtonListener());
        btnSq13.addActionListener(new ButtonListener());
        btnSq21.addActionListener(new ButtonListener());
        btnSq22.addActionListener(new ButtonListener());
        btnSq23.addActionListener(new ButtonListener());
        btnSq31.addActionListener(new ButtonListener());
        btnSq32.addActionListener(new ButtonListener());
        btnSq33.addActionListener(new ButtonListener());
        
        JPanel pnlNineSq = new JPanel();
        
        GridLayout nineSquare = new GridLayout(3,3);
        
        pnlNineSq.setLayout(nineSquare);
    
        pnlNineSq.add(btnSq11);
        pnlNineSq.add(btnSq12);
        pnlNineSq.add(btnSq13);
        pnlNineSq.add(btnSq21);
        pnlNineSq.add(btnSq22);
        pnlNineSq.add(btnSq23);
        pnlNineSq.add(btnSq31);
        pnlNineSq.add(btnSq32);
        pnlNineSq.add(btnSq33);
        
        JPanel pnlBottom = new JPanel();
        JButton btnReset = new JButton("New Game");
        btnReset.addActionListener(new ResetListener());
        
        
        btnReset.setPreferredSize(bigBtn);
        btnReset.setOpaque(true);
        btnReset.setBackground(Color.GREEN);
        pnlBottom.add(btnReset);
        
        add(pnlTop, BorderLayout.NORTH);
        add(pnlNineSq, BorderLayout.CENTER);
        add(pnlBottom, BorderLayout.SOUTH);
        
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
   private class ButtonListener implements ActionListener
    {  
       CheckForWinner check = new CheckForWinner();
      
      public void actionPerformed(ActionEvent e)
      {
        
       if(playerX.isSelected())
         {
           if(isWinner == true)
             {
               JOptionPane.showMessageDialog(null, "Click the New Game button to play again.", 
                       "", JOptionPane.ERROR_MESSAGE);
               return;
             }
           if(e.getSource() == btnSq11)
             {
               if(btnSq11.getIcon()!=blank){return;}
               else {btnSq11.setIcon(X);}
              }
           if(e.getSource() == btnSq12)
             {
               if(btnSq12.getIcon()!=blank){return;}
               else {btnSq12.setIcon(X);}
              }
           if(e.getSource() == btnSq13)
             {
               if(btnSq13.getIcon()!=blank){return;}
               else {btnSq13.setIcon(X);}
              }
           if(e.getSource() == btnSq21)
             {
               if(btnSq21.getIcon()!=blank){return;}
               else {btnSq21.setIcon(X);}
              }
           if(e.getSource() == btnSq22)
             {
               if(btnSq22.getIcon()!=blank){return;}
               else {btnSq22.setIcon(X);}
              }
           if(e.getSource() == btnSq23)
             {
               if(btnSq23.getIcon()!=blank){return;}
               else {btnSq23.setIcon(X);}
              }
           if(e.getSource() == btnSq31)
             {
               if(btnSq31.getIcon()!=blank){return;}
               else {btnSq31.setIcon(X);}
              }
           if(e.getSource() == btnSq32)
             {
               if(btnSq32.getIcon()!=blank){return;}
               else {btnSq32.setIcon(X);}
              }
           if(e.getSource() == btnSq33)
             {
               if(btnSq33.getIcon()!=blank){return;}
               else {btnSq33.setIcon(X);}
              }
           
             
           playerO.doClick();
           check.scanBoard();
         }
       
       else
         {
           if(isWinner==true)
             {
               JOptionPane.showMessageDialog(null, "Click the New Game button to play again.", 
                       "", JOptionPane.ERROR_MESSAGE);
               return;
             }
           if(e.getSource() == btnSq11)
             {
               if(btnSq11.getIcon()!=blank){return;}
               else {btnSq11.setIcon(O);}
              }
           if(e.getSource() == btnSq12)
             {
               if(btnSq12.getIcon()!=blank){return;}
               else {btnSq12.setIcon(O);}
              }
           if(e.getSource() == btnSq13)
             {
               if(btnSq13.getIcon()!=blank){return;}
               else {btnSq13.setIcon(O);}
              }
           if(e.getSource() == btnSq21)
             {
               if(btnSq21.getIcon()!=blank){return;}
               else {btnSq21.setIcon(O);}
              }
           if(e.getSource() == btnSq22)
             {
               if(btnSq22.getIcon()!=blank){return;}
               else {btnSq22.setIcon(O);}
              }
           if(e.getSource() == btnSq23)
             {
               if(btnSq23.getIcon()!=blank){return;}
               else {btnSq23.setIcon(O);}
              }
           if(e.getSource() == btnSq31)
             {
               if(btnSq31.getIcon()!=blank){return;}
               else {btnSq31.setIcon(O);}
              }
           if(e.getSource() == btnSq32)
             {
               if(btnSq32.getIcon()!=blank){return;}
               else {btnSq32.setIcon(O);}
              }
           if(e.getSource() == btnSq33)
             {
               if(btnSq33.getIcon()!=blank){return;}
               else {btnSq33.setIcon(O);}
              }
           
           playerX.doClick();
           check.scanBoard();
         }   
      }
    }
   private class ResetListener implements ActionListener
     {
        
       public void actionPerformed(ActionEvent e)
         {
           isWinner=false;
           playerX.doClick();
           btnSq11.setIcon(blank);
           btnSq12.setIcon(blank);
           btnSq13.setIcon(blank);
           btnSq21.setIcon(blank);
           btnSq22.setIcon(blank);
           btnSq23.setIcon(blank);
           btnSq31.setIcon(blank);
           btnSq32.setIcon(blank);
           btnSq33.setIcon(blank);
         }
     }
  
   public class CheckForWinner
     {
    
      public void scanBoard()
      {
          if(btnSq11.getIcon()==X && btnSq12.getIcon()==X && btnSq13.getIcon()==X 
           ||btnSq21.getIcon()==X && btnSq22.getIcon()==X && btnSq23.getIcon()==X
           ||btnSq31.getIcon()==X && btnSq32.getIcon()==X && btnSq33.getIcon()==X
           ||btnSq11.getIcon()==X && btnSq22.getIcon()==X && btnSq33.getIcon()==X
           ||btnSq13.getIcon()==X && btnSq22.getIcon()==X && btnSq31.getIcon()==X
           ||btnSq11.getIcon()==X && btnSq21.getIcon()==X && btnSq31.getIcon()==X
           ||btnSq12.getIcon()==X && btnSq22.getIcon()==X && btnSq32.getIcon()==X
           ||btnSq13.getIcon()==X && btnSq23.getIcon()==X && btnSq33.getIcon()==X)
          {  
            JOptionPane.showMessageDialog(null, "    Player X\n"
                    + "is the Winner!", "", JOptionPane.WARNING_MESSAGE);
            isWinner=true;
          
          }
          if(btnSq11.getIcon()==O && btnSq12.getIcon()==O && btnSq13.getIcon()==O 
           ||btnSq21.getIcon()==O && btnSq22.getIcon()==O && btnSq23.getIcon()==O
           ||btnSq31.getIcon()==O && btnSq32.getIcon()==O && btnSq33.getIcon()==O
           ||btnSq11.getIcon()==O && btnSq22.getIcon()==O && btnSq33.getIcon()==O
           ||btnSq13.getIcon()==O && btnSq22.getIcon()==O && btnSq31.getIcon()==O
           ||btnSq11.getIcon()==O && btnSq21.getIcon()==O && btnSq31.getIcon()==O
           ||btnSq12.getIcon()==O && btnSq22.getIcon()==O && btnSq32.getIcon()==O
           ||btnSq13.getIcon()==O && btnSq23.getIcon()==O && btnSq33.getIcon()==O)
          {  
            JOptionPane.showMessageDialog(null, "    Player O\n"
                    + "is the Winner!", "", JOptionPane.WARNING_MESSAGE);
            isWinner=true;
            
          }
           if(isWinner!=true)
            {
               if(btnSq11.getIcon()!=blank && btnSq12.getIcon()!=blank && btnSq13.getIcon()!=blank 
               && btnSq21.getIcon()!=blank && btnSq22.getIcon()!=blank && btnSq23.getIcon()!=blank
               && btnSq31.getIcon()!=blank && btnSq32.getIcon()!=blank && btnSq33.getIcon()!=blank)
                   {  
                    JOptionPane.showMessageDialog(null, "  Cat's Game!\n",
                            "", JOptionPane.WARNING_MESSAGE);
                    isWinner=true;
                   }
            
            }
      }
  }

 
   
   public static void main(String args[])
      {
        new TicTacToeGrid();
      }
  }