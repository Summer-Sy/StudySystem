package com.nwnu.sign;

import java.awt.*;
import java.awt.event.*;  
  
import javax.swing.*;  
import javax.swing.table.*;

import com.nwnu.pojo.Query; 

public class Scan_sign extends JPanel implements ActionListener{
	DefaultTableModel update_table;  
    JTable table;  
    Query query;  
    JButton button;  
    Object a[][];  
    String b[];  
    public Scan_sign(){  
        setLayout(new FlowLayout());  
        setBackground(Color.orange);  
        query=new Query();  
        query.setTableName("sign");  
        a=query.getRecord();  
        b=query.getField();  
        update_table=new DefaultTableModel(a, b);  
        table=new JTable(update_table);  
        button=new JButton("更新");  
        button.addActionListener(this);  
        JScrollPane scrollPane = new JScrollPane(table);  
        scrollPane.setBounds(0,0,550,380);  
        table.setPreferredSize(new Dimension(scrollPane.getWidth() - 50, scrollPane.getHeight()*2));//使表格出现滑动条  
        add(scrollPane);  
        add(button);  
    }  
    public void actionPerformed(ActionEvent e){  
        a=null;b=null;  
        query=new Query();  
        query.setTableName("sign");  
        a=query.getRecord();  
        b=query.getField();  
        update_table.setDataVector(a, b);  
    }  
}
