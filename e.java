import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
public class e extends Applet implements ActionListener
{
    private boolean first=true;
    Label l1,l2,l3,l4;
    TextField t1,t2,t3;
    Button b1,b2;
    Choice m;
    String msg="",name,roll,ad,c;
    public void init()
    {
        l1 = new Label("Name");
        l2 = new Label("Roll No.");
        l3 = new Label("Address");
        l4 = new Label("Gender");
        t1 = new TextField(20);
        t2 = new TextField(20);
        t3 = new TextField(20);
        b1 = new Button("Register");
        b2 = new Button("Cancel");
        m = new Choice();
        m.add("Male");
        m.add("Female");
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);

        add(l4);add(m);
        add(b1);add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);
        //setLayout(new GridLayout(7,2))
    }
    public void actionPerformed(ActionEvent e)
    {
        if(((t1.getText()).equals(""))||((t2.getText()).equals(""))||((t3.getText()).equals("")))
        {
            JOptionPane.showMessageDialog(this,"Wrong Input");
            return ;
        }

        String str = e.getActionCommand();
        if(str.equals("Register"))
        {
            msg="Congratulations! You are Successfully Registered";

        }

        else if(str.equals("Cancel"))
        {
            msg="Sorry You are not Registered";
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        repaint();
    }
    public void paint(Graphics g)
    {
        if(first)
        {
            first=false;
            return ;
        }
        name = t1.getText();
        roll = t2.getText();
        ad  = t3.getText();
        c = m.getSelectedItem();
        g.drawString(msg,6,200);
        g.drawString("Name: "+name,10,100);
        g.drawString("Roll No.: "+ roll,10,120);
        g.drawString("Address: "+ ad,10,140);
        g.drawString("Gender: "+ c,10,160);
    }

}
