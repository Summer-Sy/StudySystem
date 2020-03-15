//һ���������д��ڵĿ�Ƭʽ���֣���ΪCommFrame
package com.nwnu.pojo;

import javax.swing.*;

import com.nwnu.g.Insert_g;
import com.nwnu.g.Scan_g;
import com.nwnu.g.Search_g;
import com.nwnu.g.Update_g;
import com.nwnu.health.Insert_health;
import com.nwnu.health.Scan_health;
import com.nwnu.health.Search_health;
import com.nwnu.health.Update_health;

import com.nwnu.sign.Insert_sign;
import com.nwnu.sign.Scan_sign;
import com.nwnu.sign.Search_sign;

import com.nwnu.student.Delete_stu;
import com.nwnu.student.Insert_stu;
import com.nwnu.student.Scan_stu;
import com.nwnu.student.Search_stu;
import com.nwnu.student.Update_stu;

import java.awt.*;  
import java.awt.event.*; 

public class CommFrame extends JFrame implements ActionListener {

	    JMenuBar bar; 
	    JMenu menu,menu1,menu2,menu3;  
	    JMenuItem scanItem,deleteItem,updateItem,insertItem,searchItem;
	    JMenuItem scanItem1,deleteItem1,updateItem1,insertItem1,searchItem1; 
	    JMenuItem scanItem2,deleteItem2,updateItem2,insertItem2,searchItem2;
	    JMenuItem scanItem3,deleteItem3,updateItem3,insertItem3,searchItem3;
	    
	    Scan_stu scan;    //�鿴����ѧ����Ϣ  
	    Delete_stu delete;//ɾ��ѧ����Ϣ  
	    Update_stu update;//����ѧ����Ϣ  
	    Insert_stu insert;//����ѧ����Ϣ  
	    Search_stu search;//����ѧ����Ϣ  
	    
	    Scan_g scan_g;    //�鿴������Ϣ
	    //Delete_g delete_g;//ɾ��������Ϣ
	    Update_g update_g;//���¸�����Ϣ
	    Insert_g insert_g;//���������Ϣ
	    Search_g search_g;//���Ҹ�����Ϣ
	    
	    Scan_health scan_health;    //�鿴����ѧ��������Ϣ  
	    //Delete_health delete_health;//ɾ��ѧ��������Ϣ  
	    Update_health update_health;//����ѧ��������Ϣ  
	    Insert_health insert_health;//����ѧ��������Ϣ  
	    Search_health search_health;//����ѧ��������Ϣ  
	    
	    Scan_sign scan_sign;    //�鿴����ѧ��ǩ����Ϣ 
	    //Delete_sign delete_sign;//ɾ��ѧ��ǩ����Ϣ 
	    //Update_sign update_sign;//����ѧ��ǩ����Ϣ 
	    Insert_sign insert_sign;//����ѧ��ǩ����Ϣ  
	    Search_sign search_sign;//����ѧ��ǩ����Ϣ 
	    
	    CardLayout card=null;  
	    
	    JPanel pCenter;  
	    CommFrame(){  
	        setLayout(new FlowLayout());  
	        scanItem=new JMenuItem("���ȫ����Ϣ");  
	        deleteItem=new JMenuItem("ɾ����Ϣ");  
	        updateItem=new JMenuItem("�޸���Ϣ");  
	        insertItem=new JMenuItem("�����Ϣ");  
	        searchItem=new JMenuItem("�߼�����");  
	        
	        scanItem1=new JMenuItem("���");  
	        //deleteItem1=new JMenuItem("ɾ��");  
	        updateItem1=new JMenuItem("�޸�");  
	        insertItem1=new JMenuItem("���");  
	        searchItem1=new JMenuItem("����");  
	        
	        scanItem2=new JMenuItem("�鿴����");  
	        //deleteItem2=new JMenuItem("ɾ��");  
	        updateItem2=new JMenuItem("�޸�");  
	        insertItem2=new JMenuItem("������Ϣ");  
	        searchItem2=new JMenuItem("�����������"); 
	        
	        scanItem3=new JMenuItem("��Ϣͳ��");  
	        //deleteItem3=new JMenuItem("ɾ��");  
	        //updateItem3=new JMenuItem("�޸�");  
	        insertItem3=new JMenuItem("�û���");  
	        searchItem3=new JMenuItem("������ѯ");  
	        
	        bar=new JMenuBar(); 
	          
	        menu=new JMenu("��Ϣ����");
	        menu1=new JMenu("������Ϣ");
	        menu2=new JMenu("����������������");
	        menu3=new JMenu("�����ϱ�");
   
	        menu.add(scanItem);  
	        menu.add(deleteItem);  
	        menu.add(updateItem);  
	        menu.add(insertItem);  
	        menu.add(searchItem);  
	        
	        menu1.add(scanItem1);  
	        //menu1.add(deleteItem1);  
	        menu1.add(updateItem1);  
	        menu1.add(insertItem1);  
	        menu1.add(searchItem1); 
	        
	        menu2.add(scanItem2);  
	        //menu2.add(deleteItem2);  
	        menu2.add(updateItem2);  
	        menu2.add(insertItem2);  
	        menu2.add(searchItem2); 
	        
	        menu3.add(scanItem3);  
	       //menu3.add(deleteItem3);  
	       //menu3.add(updateItem3);  
	        menu3.add(insertItem3);  
	        menu3.add(searchItem3);
	        
	        //��Ӳ˵�
	        bar.add(menu);  
	        bar.add(menu1);  
	        bar.add(menu2);
	        bar.add(menu3); 
	        setJMenuBar(bar);  
	        scanItem.addActionListener(this);  
	        deleteItem.addActionListener(this);  
	        updateItem.addActionListener(this);  
	        insertItem.addActionListener(this);  
	        searchItem.addActionListener(this);  
	        
	        scanItem1.addActionListener(this);  
	        //deleteItem1.addActionListener(this);  
	        updateItem1.addActionListener(this);  
	        insertItem1.addActionListener(this);  
	        searchItem1.addActionListener(this);
	        
	        scanItem2.addActionListener(this);  
	        //deleteItem2.addActionListener(this);  
	        updateItem2.addActionListener(this);  
	        insertItem2.addActionListener(this);  
	        searchItem2.addActionListener(this); 
	        
	        scanItem3.addActionListener(this);  
	        //deleteItem3.addActionListener(this);  
	        //updateItem3.addActionListener(this);  
	        insertItem3.addActionListener(this);  
	        searchItem3.addActionListener(this); 
	        
	        scan=new Scan_stu();  
	        update=new Update_stu();  
	        delete=new Delete_stu();  
	        insert=new Insert_stu();  
	        search=new Search_stu();  
	        card=new CardLayout();  
	        
	        scan_g=new Scan_g();  
	        update_g=new Update_g();  
	        //delete_g=new Delete_g();  
	        insert_g=new Insert_g();  
	        search_g=new Search_g();  
	        card=new CardLayout();  
	        
	        scan_health=new Scan_health();  
	        update_health=new Update_health();  
	        //delete_health=new Delete_health();  
	        insert_health=new Insert_health();  
	        search_health=new Search_health();  
	        card=new CardLayout();
	        
	        scan_sign=new Scan_sign();  
	        //update_sign=new Update_sign();  
	        //delete_sign=new Delete_sign();  
	        insert_sign=new Insert_sign();  
	        search_sign=new Search_sign();  
	        card=new CardLayout();
	        
	        pCenter=new JPanel();  
	        pCenter.setLayout(card);  
	        pCenter.add("scanItem", scan);  
	        pCenter.add("deleteItem",delete);  
	        pCenter.add("updateItem",update);  
	        pCenter.add("insertItem",insert);  
	        pCenter.add("searchItem",search);  
	 
	        pCenter.add("scanItem1", scan_g);  
	        //pCenter.add("deleteItem1",delete_g);  
	        pCenter.add("updateItem1",update_g);  
	        pCenter.add("insertItem1",insert_g);  
	        pCenter.add("searchItem1",search_g); 
	        
	        pCenter.add("scanItem2", scan_health);  
	        //pCenter.add("deleteItem2",delete_health);  
	        pCenter.add("updateItem2",update_health);  
	        pCenter.add("insertItem2",insert_health);  
	        pCenter.add("searchItem2",search_health); 
	        
	        pCenter.add("scanItem3", scan_sign);  
	        //pCenter.add("deleteItem3",delete_sign);  
	        //pCenter.add("updateItem3",update_sign);  
	        pCenter.add("insertItem3",insert_sign);  
	        pCenter.add("searchItem3",search_sign); 
	        
	        
	        add(pCenter,BorderLayout.SOUTH);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	        setVisible(true);  
	        setBounds(400,150,600,600);  
	        setTitle("����ʦ����ѧ�����ϱ�ϵͳ");  
	        validate();  
	    }  
	    

	    
	    public void actionPerformed(ActionEvent e){  
	        if(e.getSource()==scanItem)  
	            card.show(pCenter, "scanItem");  
	        else if(e.getSource()==deleteItem)  
	            card.show(pCenter, "deleteItem");     
	        else if(e.getSource()==updateItem)  
	            card.show(pCenter, "updateItem");  
	        else if(e.getSource()==insertItem)  
	            card.show(pCenter, "insertItem");  
	        else if(e.getSource()==searchItem)  
	            card.show(pCenter, "searchItem");  
	        
	        if(e.getSource()==scanItem1)  
	            card.show(pCenter, "scanItem1");  
	        //else if(e.getSource()==deleteItem1)  
	          //  card.show(pCenter, "deleteItem1");     
	        else if(e.getSource()==updateItem1)  
	            card.show(pCenter, "updateItem1");  
	        else if(e.getSource()==insertItem1)  
	            card.show(pCenter, "insertItem1");  
	        else if(e.getSource()==searchItem1)  
	            card.show(pCenter, "searchItem1"); 
	        
	        if(e.getSource()==scanItem2)  
	            card.show(pCenter, "scanItem2");  
	        //else if(e.getSource()==deleteItem2)  
	            //card.show(pCenter, "deleteItem2");     
	        else if(e.getSource()==updateItem2)  
	            card.show(pCenter, "updateItem2");  
	        else if(e.getSource()==insertItem2)  
	            card.show(pCenter, "insertItem2");  
	        else if(e.getSource()==searchItem2)  
	            card.show(pCenter, "searchItem2");
	        
	        if(e.getSource()==scanItem3)  
	            card.show(pCenter, "scanItem3");  
	        //else if(e.getSource()==deleteItem3)  
	          //  card.show(pCenter, "deleteItem3");     
	        //else if(e.getSource()==updateItem3)  
	          //  card.show(pCenter, "updateItem3");  
	        else if(e.getSource()==insertItem3)  
	            card.show(pCenter, "insertItem3");  
	        else if(e.getSource()==searchItem3)  
	            card.show(pCenter, "searchItem3");
	    }  
	  
}
