// <applet code="applet_counter.class" width="500" height="500"></applet>
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class applet_counter extends Applet implements ActionListener{
    int c1=0,c2=0;
    int flag=0;
    Button count1,count2,reset1,reset2;

    public void init(){
        count1 = new Button("counter1");
        count2 = new Button("counter2");
        reset1 = new Button("reset1");
        reset2 = new Button("reset2");

        // this.setLayout(new FlowLayout());
        this.add(count1);
        this.add(count2);
        this.add(reset1);
        this.add(reset2);

        count1.addActionListener(this);
        count2.addActionListener(this);
        reset1.addActionListener(this);
        reset2.addActionListener(this);
    }
    // public void actionPerformed(ActionEvent e){
    //     String s = e.getActionCommand();
    //     if(s.equals("counter1")){
    //         //clicked twice then increment counter
    //         c1++; 
    //         showStatus("c1="+(c1/2)+",c2="+c2);
    //     }
    //     else if(s.equals("counter2")){
    //         //clicked once then increment counter
    //         showStatus("c1="+(c1/2)+",c2="+(++c2));
    //     }
    //     else if(s.equals("reset1")){
    //         //reset counter1
    //         c1=0;
    //         showStatus("c1="+c1+",c2="+c2);
    //     }
    //     else{
    //         //reset counter2
    //         c2=0;
    //         showStatus("c1="+(c1/2)+",c2="+c2);
    //     }
    // }

    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if(s.equals("counter1")){
            //clicked twice then increment counter
            if(flag==0){
                flag=1;
            }
            else{
                c1++;
                flag = 0; 
            }
            showStatus("c1="+c1+",c2="+c2);
        }
        else if(s.equals("counter2")){
            //clicked once then increment counter
            showStatus("c1="+c1+",c2="+(++c2));
        }
        else if(s.equals("reset1")){
            //reset counter1
            c1=0;
            showStatus("c1="+c1+",c2="+c2);
        }
        else{
            //reset counter2
            c2=0;
            showStatus("c1="+c1+",c2="+c2);
        }
    }
}
