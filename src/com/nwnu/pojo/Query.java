//Scan_stu���õ�Query���Һ���
package com.nwnu.pojo;

import java.sql.*; 

public class Query {
	 Object a[][]=null;  
	    String b[]=null;  
	    String tableName="";  
	    int p;//�ֶθ���  
	    public Query(){  
	        try{  
	            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
	        }  
	        catch(ClassNotFoundException e){  
	            System.out.println(e);  
	        }  
	    }  
	    public Object[][] getRecord(){//���������  
	        a=null;  
	        b=null;  
	        Connection con;  
	        Statement sql;  
	        ResultSet rs;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:sqlserver://localhost:1433;DatabaseName=Student";  
	            userName="sa";  
	            userPwd="Lsy991022.";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            int p=getZiDuan();  
	            int n=getAmount();  
	            a=new Object[n][p];  
	            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);  
	            rs=sql.executeQuery("select * from "+tableName);  
	            int m=0;  
	            while(rs.next()){  
	                for(int k=1;k<=p;k++){  
	                    a[m][k-1]=rs.getString(k);  
	                }  
	                System.out.println();  
	                m++;  
	            }  
	            con.close();  
	        }  
	        catch(SQLException e){  
	            System.out.println("��������ȷ�ı���"+e);  
	        }  
	        return a;  
	    }  
	    public int getAmount(){//��������ж�����  
	        Connection con;  
	        Statement sql;  
	        ResultSet rs;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:sqlserver://localhost:1433;DatabaseName=Student";  
	            userName="sa";  
	            userPwd="Lsy991022.";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);  
	            rs=sql.executeQuery("select * from "+tableName);  
	            rs.last();  
	            int rows=rs.getRow();  
	            return rows;  
	        }  
	        catch(SQLException exp){  
	            System.out.println(""+exp);  
	            return 0;  
	        }  
	    }  
	    public String[] getField(){//���ֶ�����  
	        Connection con;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:sqlserver://localhost:1433;DatabaseName=Student";  
	            userName="sa";  
	            userPwd="Lsy991022.";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            DatabaseMetaData metadata=con.getMetaData();  
	            ResultSet rs1=metadata.getColumns(null, null, tableName, null);  
	            int p=getZiDuan();  
	            b=new String[p];  
	            int k=0;  
	            while(rs1.next()){  
	                b[k]=rs1.getString(4);  
	                k++;  
	            }  
	            con.close();          
	        }  
	        catch(SQLException e){  
	            System.out.println(e);  
	        }  
	        return b;  
	    }  
	    public void setTableName(String s){//���Ա���  
	        tableName=s.trim();  
	    }  
	    public int getZiDuan(){//���ֶθ���  
	        Connection con;  
	        PreparedStatement sql;  
	        ResultSet rs;  
	        try{  
	            String url,userName,userPwd;  
	            url="jdbc:sqlserver://localhost:1433;DatabaseName=Student";  
	            userName="sa";  
	            userPwd="Lsy991022.";  
	            con=DriverManager.getConnection(url,userName,userPwd);  
	            DatabaseMetaData metadata=con.getMetaData();  
	            ResultSet rs1=metadata.getColumns(null, null, tableName, null);  
	            p=0;  
	            while(rs1.next())  
	                p++;  
	        }  
	        catch(SQLException e){  
	            System.out.println(e);  
	        }  
	        return p;  
	    }  
}
