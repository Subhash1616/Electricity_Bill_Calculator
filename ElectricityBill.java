import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ElectricityBill {
    public JFrame jframe;
    public JTextField jtextfield1;
    public JTextField jtextfield2;
    public JTextField jtextfield3;

    public JTextArea jtextarea;
    public ElectricityBill(){
        jframe = new JFrame("Electricity Bill Calculator");
        jframe.setSize(600,400);
        jframe.setLayout(null);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);


        jtextfield1 = new JTextField();
        jtextfield1.setBounds(150, 70, 90, 20);
        jframe.add(jtextfield1);
        jtextfield1.setColumns(10);

        JLabel lblName = new JLabel("Customer Id: ");
        lblName.setBounds(45, 70, 100, 20);
        jframe.add(lblName);


        jtextfield2 = new JTextField();
        jtextfield2.setBounds(150, 115, 90, 20);
        jframe.add(jtextfield2);
        jtextfield2.setColumns(10);

        JLabel lblName1 = new JLabel("Customer Name: ");
        lblName1.setBounds(45, 115, 100, 20);
        jframe.add(lblName1);


        jtextfield3 = new JTextField();
        jtextfield3.setBounds(150, 160, 90, 20);
        jframe.add(jtextfield3);
        jtextfield3.setColumns(10);

        JLabel lblName2 = new JLabel("Units Consumed: ");
        lblName2.setBounds(45, 160, 100, 20);
        jframe.add(lblName2);


        jtextarea = new JTextArea();
        jtextarea.setBounds(300,70,250,200);
        jframe.add(jtextarea);


        JButton btn = new JButton("Calculate");
        btn.setBounds(45,215,100,20);
        jframe.add(btn);



        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = jtextfield3.getText();
                double amount=Double.parseDouble(s)*3.0;
                jtextarea.setText("\n\nElectricity Billing System\n\n\nCustomer ID: "+jtextfield1.getText()+"\nCustomer Name: "+jtextfield2.getText()+"\nUnits Consumed: "+jtextfield3.getText()+"\nAmount: "+amount+"\nThank You");
            }
        });
    }

}
