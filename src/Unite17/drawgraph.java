package Unite17;
/* 综合样例 */
import java.awt.*;
import java.sql.*;
import java.text.DecimalFormat;

public class drawgraph extends Frame {
    public drawgraph(){
        int amount[]=new int[5];
        setBackground(Color.white);
        int sum=0;
        int myangle[]={0,0,0,0,0,0};
        String url="jdbc:mysql://localhost:3306/studentdata?serverTimezone=UTC";
        String sql="select score from scorelog";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(java.lang.ClassNotFoundException e){}
        try{
            Connection con=DriverManager.getConnection(url,"root","19990827");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()){
                int score=rs.getByte("score");
                if(score>=90)
                    amount[4]++;
                else if(score>=80)
                    amount[3]++;
                else if(score>=70)
                    amount[2]++;
                else if(score>=60)
                    amount[1]++;
                else
                    amount[0]++;
            }
            for(int i=0;i<amount.length;i++)
                sum=sum+amount[i];
            for(int i=0;i<amount.length;i++)
                myangle[i]=(int)(amount[i]*360/sum);
        }catch(SQLException ex){}
        setLayout(new BorderLayout());
        myArc canvas=new myArc(myangle);
        add("Center",canvas);
        setSize(600,350);
        setVisible(true);
    }
    public static void main(String args[]){
        new drawgraph();
    }
}
class myArc extends Canvas{
    String descript[]={"0-59","60-69","70-79","80-89","90-100"};
    int c[][]={{25,25,250},{223,24,123},{30,145,69},
            {244,80,70},{80,200,180}};
    int angle[];
    myArc(int angle[]){
        this.angle=angle;
    }
    public void paint(Graphics g){
        int startangle=0;
        for(int i=0;i<c.length;i++){
            g.setColor(new Color(c[i][0],c[i][1],c[i][2]));
            g.fillArc(30,30,200,200,startangle,angle[i]);
            startangle += angle[i];
        }
        g.setFont(new Font("Arial",Font.BOLD,20));
        g.setColor(Color.black);
        g.drawString("score",340,45);
        g.drawString("  %   ",460,45);
        for(int i=0;i<descript.length;i++){
            g.setColor(new Color(c[i][0],c[i][1],c[i][2]));
            g.drawString(descript[i],340,80+i*30);
        }
        g.setColor(Color.blue);
        DecimalFormat precision=new DecimalFormat("0.0");
        for(int i=0;i<descript.length;i++){
            float x=(angle[i])*100.0f/360.0f;
            g.drawString(""+precision.format(x),470,80+i*30);
        }
    }
}


