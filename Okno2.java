import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Okno2 extends Frame implements WindowListener, ActionListener 
{
	Button przycisk1;
	Button przycisk2;
	Button przycisk3;
	Button przycisk4;
	Button przycisk5;
	Button przycisk6;
	Button przycisk7;
	Button przycisk8;
	Button przycisk9;
	Button przycisk0;
	Button przycisk_przec;
	Button przycisk_plus;
	Button przycisk_dodawanie;
	Button przycisk_odejmowanie;
	Button przycisk_mnozenie;
	Button przycisk_dzielenie;
	Button przycisk_rowna_sie;
	Button przycisk_czyszczenie;
	Button przycisk_pierwiastek;
	TextField text;
	String znaki="",przerwa="",znaki_wysw="";
	double pamiec=0,argument=0;
	String dzialanie;
	
	
	public Okno2(int x,int y,int width,int breadth) throws HeadlessException 
	{
		super();
		setBounds(x, y, width,breadth);
		setVisible(true);
		this.addWindowListener(this);
		//GridLayout experimentLayout = new GridLayout(2,2);
		przycisk7 = new Button("7");
	    przycisk8 = new Button("8");
		przycisk9 = new Button("9");
		przycisk4 = new Button("4");
	    przycisk5 = new Button("5");
		przycisk6 = new Button("6");
		przycisk1 = new Button("1");
	    przycisk2 = new Button("2");
		przycisk3 = new Button("3");
		przycisk0 = new Button("0");
		przycisk_przec = new Button(".");
		przycisk_plus = new Button("+/-");
		przycisk_dodawanie = new Button("+");
		przycisk_odejmowanie = new Button("-");
		przycisk_mnozenie = new Button("*");
		przycisk_dzielenie = new Button("/");
		przycisk_rowna_sie = new Button("=");
		przycisk_czyszczenie = new Button("C");
		przycisk_pierwiastek = new Button("SQRT");
		text = new TextField();
	    setLayout(null);
	    text.addActionListener(this);
	    text.setVisible(true);
	    text.setBounds(30, 30, this.getWidth()-50, 20);
	    this.add(text);
	    przycisk7.addActionListener(this);
		przycisk7.setVisible(true);
		przycisk7.setBounds(30,100,50,50);
		this.add(przycisk7);
		przycisk8.addActionListener(this);
		przycisk8.setVisible(true);
		przycisk8.setBounds(100,100,50,50);
		this.add(przycisk8);
		przycisk9.addActionListener(this);
		przycisk9.setVisible(true);
		przycisk9.setBounds(170,100,50,50);
		this.add(przycisk9);
		przycisk4.addActionListener(this);
		przycisk4.setVisible(true);
		przycisk4.setBounds(30,170,50,50);
		this.add(przycisk4);
		przycisk5.addActionListener(this);
		przycisk5.setVisible(true);
		przycisk5.setBounds(100,170,50,50);
		this.add(przycisk5);
		przycisk6.addActionListener(this);
		przycisk6.setVisible(true);
		przycisk6.setBounds(170,170,50,50);
		this.add(przycisk6);
		przycisk1.addActionListener(this);
		przycisk1.setVisible(true);
		przycisk1.setBounds(30,240,50,50);
		this.add(przycisk1);
		przycisk2.addActionListener(this);
		przycisk2.setVisible(true);
		przycisk2.setBounds(100,240,50,50);
		this.add(przycisk2);
		przycisk3.addActionListener(this);
		przycisk3.setVisible(true);
		przycisk3.setBounds(170,240,50,50);
		this.add(przycisk3);
		przycisk0.addActionListener(this);
		przycisk0.setVisible(true);
		przycisk0.setBounds(30,310,50,50);
		this.add(przycisk0);
		przycisk_przec.addActionListener(this);
		przycisk_przec.setVisible(true);
		przycisk_przec.setBounds(100,310,50,50);
		this.add(przycisk_przec);
		przycisk_plus.addActionListener(this);
		przycisk_plus.setVisible(true);
		przycisk_plus.setBounds(170,310,50,50);
		this.add(przycisk_plus);
		przycisk_dodawanie.addActionListener(this);
		przycisk_dodawanie.setVisible(true);
		przycisk_dodawanie.setBounds(240,100,50,50);
		this.add(przycisk_dodawanie);
		przycisk_odejmowanie.addActionListener(this);
		przycisk_odejmowanie.setVisible(true);
		przycisk_odejmowanie.setBounds(240,170,50,50);
		this.add(przycisk_odejmowanie);
		przycisk_mnozenie.addActionListener(this);
		przycisk_mnozenie.setVisible(true);
		przycisk_mnozenie.setBounds(240,240,50,50);
		this.add(przycisk_mnozenie);
		przycisk_dzielenie.addActionListener(this);
		przycisk_dzielenie.setVisible(true);
		przycisk_dzielenie.setBounds(240,310,50,50);
		this.add(przycisk_dzielenie);
		przycisk_rowna_sie.addActionListener(this);
		przycisk_rowna_sie.setVisible(true);
		przycisk_rowna_sie.setBounds(310,240,50,120);
		this.add(przycisk_rowna_sie);
		przycisk_czyszczenie.addActionListener(this);
		przycisk_czyszczenie.setVisible(true);
		przycisk_czyszczenie.setBounds(310,100,50,50);
		this.add(przycisk_czyszczenie);
		przycisk_pierwiastek.addActionListener(this);
		przycisk_pierwiastek.setVisible(true);
		przycisk_pierwiastek.setBounds(310,170,50,50);
		this.add(przycisk_pierwiastek);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{

		Object zrodlo = arg0.getSource();
		if (zrodlo==przycisk_pierwiastek)
		{
			przerwa="";
			double wynik = Math.sqrt(Double.parseDouble(znaki));
			znaki = Double.toString(wynik);
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			znaki="";
			
		}
		if (zrodlo==przycisk_czyszczenie)
		{
			przerwa="";
			for (int i=0 ; i<120;i++)
			{
				przerwa+="_";
			}		
			text.setText(przerwa);
			przerwa="";
			pamiec=0;
			argument=0;
			znaki="";
			
		}
		if (zrodlo==przycisk1)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="1";
			przerwa="";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;		
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk2)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="2";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk3)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="3";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk4)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="4";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk5)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="5";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk6)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="6";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk7)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="7";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk8)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="8";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk9)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="9";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk0)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+="0";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
			
		}
		if (zrodlo==przycisk_przec)
		{
			przerwa="";
			znaki_wysw="";
			text.setText("");
			znaki+=".";
			for (int i=0 ; i<(120-(znaki.length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+znaki;
			text.setText(znaki_wysw);
			
		}
		if (zrodlo==przycisk_dodawanie)
		{
			przerwa="";
			znaki_wysw="";
			dzialanie="dodawanie";
			pamiec+=Float.parseFloat(znaki);
			for (int i=0 ; i<(120-(Double.toString(pamiec).length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+Double.toString(pamiec);
			text.setText(znaki_wysw);
			znaki="";
			
		
		}
		if (zrodlo==przycisk_odejmowanie)
		{
			przerwa="";
			znaki_wysw="";
			dzialanie="odejmowanie";
			pamiec+=Float.parseFloat(znaki);
			znaki="";
			for (int i=0 ; i<(120-(Double.toString(pamiec).length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+Double.toString(pamiec);
			text.setText(znaki_wysw);
			znaki="";
			
		}
		if (zrodlo==przycisk_mnozenie)
		{
			przerwa="";
			znaki_wysw="";
			dzialanie="mnozenie";
			if (pamiec==0) pamiec=1;
			pamiec*=Float.parseFloat(znaki);
			znaki="";
			for (int i=0 ; i<(120-(Double.toString(pamiec).length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+Double.toString(pamiec);
			text.setText(znaki_wysw);		
		}
		if (zrodlo==przycisk_dzielenie)
		{
			przerwa="";
			znaki_wysw="";
			dzialanie="dzielenie";
			pamiec=Float.parseFloat(znaki);
			znaki="";
			for (int i=0 ; i<(120-(Double.toString(pamiec).length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+Double.toString(pamiec);
			text.setText(znaki_wysw);
		}
		if (zrodlo==przycisk_plus)
		{
			przerwa="";
			znaki_wysw="";
			pamiec+= (-1)*Float.parseFloat(znaki);
			znaki="";
			for (int i=0 ; i<(120-(Double.toString(pamiec).length()));i++)
			{
				przerwa+="_";
			}
			znaki_wysw=przerwa+Double.toString(pamiec);
			text.setText(znaki_wysw);
			przerwa="";
			znaki_wysw="";
			znaki="";
		}
		if (zrodlo==przycisk_rowna_sie)
		{
			przerwa="";
			argument=Float.parseFloat(znaki);
			if (dzialanie=="dodawanie")
			{
				double wynik = pamiec + argument;
				znaki = Double.toString(wynik);
				for (int i=0 ; i<(120-(znaki.length()));i++)
				{
					przerwa+="_";
				}
				znaki_wysw=przerwa+znaki;
				text.setText(znaki_wysw);
			}
			if (dzialanie=="odejmowanie")
			{
				przerwa="";
				znaki_wysw="";
				double wynik = pamiec - argument;
				znaki = Double.toString(wynik);
				for (int i=0 ; i<(120-(znaki.length()));i++)
				{
					przerwa+="_";
				}
				znaki_wysw=przerwa+znaki;
				text.setText(znaki_wysw);
			}
			if (dzialanie=="mnozenie")
			{
				przerwa="";
				znaki_wysw="";
				double wynik = pamiec*argument;
				znaki = Double.toString(wynik);
				for (int i=0 ; i<(120-(znaki.length()));i++)
				{
					przerwa+="_";
				}
				znaki_wysw=przerwa+znaki;
				text.setText(znaki_wysw);
			}
			if (dzialanie=="dzielenie")
			{
				przerwa="";
				znaki_wysw="";
				double wynik = pamiec/argument;
				znaki = Double.toString(wynik);
				for (int i=0 ; i<(120-(znaki.length()));i++)
				{
					przerwa+="_";
				}
				znaki_wysw=przerwa+znaki;
				text.setText(znaki_wysw);
			}
			przerwa="";
			pamiec=0;
			argument=0;
			znaki="";
		}
		
		//przycisk.setLocation(przycisk.getX()+70,przycisk.getY()+70);
		

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) 
	{
		System.exit(0);
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) 
	{
		Okno2 Okno = new Okno2(100,100,900,600);
		
	}

}
