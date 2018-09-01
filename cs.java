package javashisxun;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cs extends JFrame implements ActionListener{
	String imAddress[]={"d:\\01.jpg","d:\\02.jpg","d:\\03.jpg","d:\\04.jpg","d:\\05.jpg","d:\\06.jpg","d:\\07.jpg","d:\\08.jpg","d:\\09.jpg"};
	String idiom[]={"��_��_","��_��_","��_��_","��_��_","��_��_","_����_","��_��_","��_ɽ_","��_��_"};
	String answ[]= {"������һ","��������","��������","�������","��ⱦ��","�Ի�����","��������","����ɽ��","��ɽ��ˮ"};
	int m=0,n=0;
	JButton sure;
	JButton cancel;
	JButton next;
	JLabel l1;
	JLabel l2;
	JLabel photo;
	JTextField t1;
	JPanel j1,j2;
	
	public cs() {
		  sure=new JButton("ȷ��");
		  cancel=new JButton("ȡ��");
		  next=new JButton("��һ��");
		  t1=new JTextField(5);
		  photo=new JLabel();
		  photo.setIcon(new ImageIcon(imAddress[0]));
		  l1=new JLabel("�밴����ʾ������");
		  l2=new JLabel(idiom[0]);
		  j1=new JPanel();
		  j2=new JPanel();
		  
		  j1.add(photo);
		  j1.add(l2);
		  j1.add(next);
		  j2.add(l1);
		  j2.add(t1);
		  j2.add(sure);
		  j2.add(cancel);
		  next.addActionListener(this);
		  sure.addActionListener(this);
		  cancel.addActionListener(this);
		  		  
		  this.setTitle("�³���");
		  this.setSize(413, 320);
		  this.setLocationRelativeTo(null);  
		  this.add(photo,BorderLayout.NORTH);
		  this.add(j1,BorderLayout.CENTER);
		  this.add(j2,BorderLayout.SOUTH);
		  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  this.setResizable(false);
		  this.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next){
			n=(n+1)%idiom.length;
			l2.setText(idiom[n]);
		}
		if(e.getSource()==cancel){
			t1.setText(null);
		}
		if(e.getSource()==sure){
			if(t1.getText().equals(answ[n])){
				t1.setText("");
				n=(n+1)%idiom.length;
				l2.setText(idiom[n]);
				m=(m+1)%imAddress.length;
		        photo.setIcon(new ImageIcon(imAddress[m]));
			}			
			else {			
				JOptionPane.showMessageDialog(null, "�������");
			}
		}		
	}
	public static void main(String[] args) {
		new cs();
	}
}
