package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PhoneApp {

    public static void main(String[] args) throws IOException {
    	
    	
    	//인풋
    	InputStream in = new FileInputStream("C:\\javaStudy\\workspace\\minipro\\PhoneDB.txt");
    	InputStreamReader isr = new InputStreamReader(in, "UTF-8");
    	BufferedReader br = new BufferedReader(isr);
    	
    	//아웃풋
    	
    	
    	
    	ArrayList<Person> pList = new ArrayList<Person>();
    	
    	Scanner sc = new Scanner(System.in);
    	int i;
    	boolean x = true;
    	
    	System.out.println("************************************");
    	System.out.println("*          전화번호 관리 프로그램                      *");
    	System.out.println("************************************");
    	
    	
    	while(x) {
    		System.out.println("");
    		System.out.println("1.리스트 2.등록 3.삭제 4.검색 5.종료 ");
    		System.out.println("------------------------------------");
    		System.out.print(">메뉴번호");
    		i=sc.nextInt();
    		
    		switch(i) {
    			
    		case 1 : 
    			int count =1;
    			while(true) {
    				String str = br.readLine();
    				if(str == null) {break;}
    				
    				String[] splitInfo = str.split(",");
    				
    				Person person = new Person(splitInfo[0],splitInfo[1],splitInfo[2]);
    				pList.add(person);
    				
    			}
    			
    			for(Person p : pList) {
    				System.out.println(count + "");
    				p.showList();
    				count++;
    			}
    				break;
    			
    		case 2 : 
    			OutputStream out = new FileOutputStream("C:\\javaStudy\\workspace\\minipro\\PhoneDB.txt", true);
    	    	OutputStreamWriter ow = new OutputStreamWriter(out, "UTF-8");
    	    	BufferedWriter bw = new BufferedWriter(ow);
    			
    	    	
    			System.out.println("<2.등록>");
    			System.out.println(">이름: ");
    			String name = sc.next();
    			System.out.println(">휴대전화: ");
    			String hp = sc.next();
    			System.out.println(">회사전화: ");
    			String cp = sc.next();
    			
    			Person pp = new Person(name,hp,cp);
    			pList.add(pp);
    			
    			bw.write(name + "," + hp + "," + cp);
    			bw.newLine();
    			System.out.println("[등록되었습니다.]");
    			break;
    			
    			
    			
    		case 3 : 
    			OutputStream outd = new FileOutputStream("C:\\javaStudy\\workspace\\minipro\\PhoneDB.txt", true);
    	    	OutputStreamWriter owd = new OutputStreamWriter(outd, "UTF-8");
    	    	BufferedWriter bwd = new BufferedWriter(owd);
    			
    			
    			System.out.println("<3.삭제>");
    			System.out.println(">번호: ");
    			
    			int removeN = sc.nextInt();
    			pList.remove(removeN-1);
    			
    			 for(Person p: pList) {
      				bwd.write(p.getName()+","+p.getHp()+","+p.getCp());
      				bwd.newLine();
      			}
  			  System.out.println("[삭제되었습니다.]");
 			  
 			  bwd.close();
 			  
 			  break;
    			
    		case 4 :
    			System.out.println("<4.검색>");
    			System.out.println(">메뉴번호: ");
    			
    			String searCh = sc.nextLine();
    		
    		case 5 : 
    			System.out.println(">메뉴번호: ");
    			
   
    			
    			
    		}//switch
    	}//while
    	
    	
    	
    	
    	sc.close();
    
    	
    }

}