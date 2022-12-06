import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MeraGui extends JFrame{
    JPanel p;
    JButton b1,b2,b3,b4,b5;
    JTextField t1,t2;
    JLabel l1,l2,l3,l4;
    
    MeraGui(){
        setTitle("Mini Calci");
        setLocationRelativeTo(null);
        setSize(400,300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);
        getContentPane().setBackground(Color.YELLOW);
        
        Font font1=new Font(Font.SANS_SERIF, Font.BOLD, 16);
        Font font2=new Font(Font.MONOSPACED, Font.BOLD, 16);
        
        p=new JPanel();
        p.setBackground(Color.BLUE);
        p.setBounds(30,20,330,170);
        add(p);
        p.setLayout(null);
        
        l1=new JLabel("Enter 1st No:");
        l1.setForeground(Color.WHITE);
        l1.setFont(font1);
        l1.setBounds(20,20,130,30);
        p.add(l1);
        
        t1=new JTextField();
        t1.setForeground(Color.RED);
        t1.setFont(font2);
        t1.setBounds(200,20,100,30);
        p.add(t1);
        
        l2=new JLabel("Enter 2nd No:");
        l2.setForeground(Color.WHITE);
        l2.setFont(font1);
        l2.setBounds(20,60,130,30);
        p.add(l2);
        
        t2=new JTextField();
        t2.setForeground(Color.RED);
        t2.setFont(font2);
        t2.setBounds(200,60,100,30);
        p.add(t2);
        
        b1=new JButton("+");
        b1.addActionListener( (e)-> {
                try{
                    String s1=t1.getText();
                    String s2=t2.getText();
                    int n1=Integer.parseInt(s1);
                    int n2=Integer.parseInt(s2);
                    int n=n1+n2;
                    l4.setText(n+"");  //l4.setText(String.valueOf(n));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid Data!");
                }
            } 
        );
        b1.setFont(font1);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.YELLOW);
        b1.setBounds(20,110,50,40);
        p.add(b1);
        b2=new JButton("-");
        b2.addActionListener( (e)-> {
                try{
                    String s1=t1.getText();
                    String s2=t2.getText();
                    int n1=Integer.parseInt(s1);
                    int n2=Integer.parseInt(s2);
                    int n=n1-n2;
                    l4.setText(n+"");  //l4.setText(String.valueOf(n));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid Data!");
                }
            } 
        );
        b2.setFont(font1);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.YELLOW);
        b2.setBounds(75,110,50,40);
        p.add(b2);
        b3=new JButton("*");
        b3.addActionListener( (e)-> {
                try{
                    String s1=t1.getText();
                    String s2=t2.getText();
                    int n1=Integer.parseInt(s1);
                    int n2=Integer.parseInt(s2);
                    int n=n1*n2;
                    l4.setText(n+"");  //l4.setText(String.valueOf(n));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid Data!");
                }
            } 
        );
        b3.setFont(font1);
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.YELLOW);
        b3.setBounds(130,110,50,40);
        p.add(b3);
        b4=new JButton("/");
        b4.addActionListener( (e)-> {
                try{
                    String s1=t1.getText();
                    String s2=t2.getText();
                    int n1=Integer.parseInt(s1);
                    int n2=Integer.parseInt(s2);
                    int n=n1/n2;
                    l4.setText(n+"");  //l4.setText(String.valueOf(n));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid Data!");
                }
            } 
        );
        b4.setFont(font1);
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.YELLOW);
        b4.setBounds(185,110,50,40);
        p.add(b4);
        b5=new JButton("%");
        b5.addActionListener( (e)-> {
                try{
                    String s1=t1.getText();
                    String s2=t2.getText();
                    int n1=Integer.parseInt(s1);
                    int n2=Integer.parseInt(s2);
                    int n=n1%n2;
                    l4.setText(n+"");  //l4.setText(String.valueOf(n));
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Invalid Data!");
                }
            } 
        );
        b5.setFont(font1);
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.YELLOW);
        b5.setBounds(240,110,50,40);
        p.add(b5);
        
        l3=new JLabel("Answer:");
        l3.setFont(font2);
        l3.setBounds(40,200,80,30);
        add(l3);
        l4=new JLabel("----------");
        l4.setForeground(Color.BLUE);
        l4.setFont(font2);
        l4.setBounds(150,200,100,30);
        add(l4);
    }
}

//public class MiniCalciWithEventHandlingUsingLambda {
    public class mini_handling {
    public static void main(String[] args) {
        MeraGui g=new MeraGui();
        g.setVisible(true);
    }
}

	


