package idv.jlchntoz;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class MainFrame {

	public static void main(String[] args) {
		JFrame jf = new JFrame ("CustomSkinLoader-GUI");  
		Container con = jf.getContentPane();
		con.setLayout(null);
		//setBounds(x,y,width,height)
        jf.setBounds(400, 200, 400, 300);
        
        Font boldCourier=new Font("Courier", Font.BOLD, 30);
        
        JLabel title=new JLabel();
        title.setText("CustomSkinLoader Index");
        title.setFont(boldCourier);
        title.setBounds(15, 5, 370, 30);
        con.add(title);
        
        if(args.length>0 && args[0].equalsIgnoreCase("f")){
        JLabel tip1=new JLabel();
        tip1.setText("It's your first time use CustomSkinLoader!");
        tip1.setBounds(30, 55, 370, 15);
        con.add(tip1);
        
        JLabel tip2=new JLabel();
        tip2.setText("Please click buttons below to modify config!");
        tip2.setBounds(30, 70, 370, 15);
        con.add(tip2);
        }
        
        JButton skinBtn=new JButton();
        skinBtn.setText("Skin Load List");
        skinBtn.setBounds(15, 180, 370, 30);
        con.add(skinBtn);
        skinBtn.addActionListener(new ActionListener(){                                                                 //�����¼� 
            @Override
            public void actionPerformed (ActionEvent e){
            	String[] aa={};
                SkinFrame.main(aa);
            };  
        });
        
        JButton clokeBtn=new JButton();
        clokeBtn.setText("Cloak Load List");
        clokeBtn.setBounds(15, 215, 370, 30);
        con.add(clokeBtn);
        clokeBtn.addActionListener(new ActionListener(){                                                                 //�����¼� 
            @Override
            public void actionPerformed (ActionEvent e){
            	String[] aa={};
                CloakFrame.main(aa);
            };  
        });
        
        
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setResizable(false); 

	}

}
