package Unite17;

import java.sql.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JApplet;

/* 编程练习1 */
public class Java_1 extends JApplet {
    private int amount[] = new int [5];
    private int sum=0;
    private static final long serialVersionUID = 2322130592726740649L;
    private final int imageHeight = 400;// 柱状图的默认高度
    private final int histogramWidth = 15;// 柱形图的宽度
    private final int histogramPitch = 10;// 柱形图的间距
    private float scaling = 1f;// 缩放的比例
    private int maxStrWidth = 0; // 字符串需要的最大宽度

    @Override
    public void init() {
        String url = "jdbc:mysql://localhost:3306/studentdata?serverTimezone=UTC";
        String sql = "select score from scorelog";

        try {
            Connection con = DriverManager.getConnection(url,"root","19990827");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery(sql);

            while((rs.next())) {
                int score = rs.getByte("score");
                if(score>=90) {
                    amount[4]++;
                }
                else if(score>=80) {
                    amount[3]++;
                }
                else if(score>=70) {
                    amount[2]++;
                }
                else if(score >=60) {
                    amount[1]++;
                }
                else {
                    amount[0]++;
                }
            }

            for(int i=0;i<5;i++) {
                sum+=amount[i];
            }

            //算比例
            for(int i=0;i<5;i++) {
                amount[i]=(int)(amount[i]*100/sum);
            }
        }catch(SQLException e){}
    }

    @Override
    public void paint(Graphics g) {
        paintPlaneHistogram(g, "柱状图", amount,
                new String[] { "60以下", " 60-70", "70-80", "80-90", "90-100" }, new Color[] {
                        Color.RED, Color.GREEN, Color.BLUE, Color.cyan,
                        Color.BLACK });
    }

    /**
     * <pre>
     *   参数b[i]和str[i]必须对应
     * </pre>
     *
     * @param g
     * @param title
     * @param b
     * @param str
     * @param color
     *            可以为空
     */
    private void paintPlaneHistogram(Graphics g, String title, int[] b,
                                     String[] str, Color[] color) {
        FontMetrics metrics = null;

        // 调用calculateImageSize()计算出图片的高度和宽度
        setSize(calculateImageSize(g.getFontMetrics(new Font(null, Font.PLAIN,
                12)), str, b));

        g.setFont(new Font(null, Font.BOLD, 18));
        g.setColor(Color.RED);
        // 画标题
        g.drawString(title, (this.getWidth() - g.getFontMetrics().stringWidth(
                title)) >> 1, 30);
        g.setFont(new Font(null, Font.PLAIN, 12));
        g.setColor(Color.BLACK);
        // 画Y坐标
        g.drawLine(10, 0, 10, this.getHeight() - 15);
        // 画X坐标
        g.drawLine(10, this.getHeight() - 15, this.getWidth(),
                this.getHeight() - 15);

        metrics = g.getFontMetrics();
        for (int i = 0; i < b.length; ++i) {
            if (color != null){
                // 设置前景色
                g.setColor(color[i]);
            }
            else{
                g.setColor(Color.RED);
            }
            // 计算出X坐标
            int x = 20 + i
                    * (histogramPitch + histogramWidth + (maxStrWidth >> 1));
            // 计算出Y坐标
            int y = this.getHeight() - 16 - (int) (b[i] * scaling);

            // 画占的比例
            g.drawString(b[i] + "",
                    x - ((metrics.stringWidth(b[i] + "") - histogramWidth) >> 1),
                    y);
            // 画平面的柱状图
            g.drawRect(x, y, histogramWidth, (int) (b[i] * scaling));
            g.fillRect(x, y, histogramWidth, (int) (b[i] * scaling));
            // 画每一项表示的东西
            g.drawString(str[i],
                    x - ((metrics.stringWidth(str[i]) - histogramWidth) >> 1),
                    this.getHeight() - 2);
        }
    }

    /**
     * 计算实际需要显示的高度和宽度
     *
     * @param metrics
     * @param str
     * @param b
     * @return Dimension
     */
    private Dimension calculateImageSize(FontMetrics metrics, String[] str,
                                         int[] b) {
        int len = str.length;
        maxStrWidth = -1; // 字符串需要的最大宽度

        for (int i = 0; i < len; ++i) {
            int strwidth = metrics.stringWidth(str[i]); // 计算出该字符串需要占据的宽度
            if (strwidth > maxStrWidth){
                maxStrWidth = strwidth;
            }
        }

        int maxHeight = -1;
        for (int i = 0; i < len; ++i) {
            if (b[i] > maxHeight)
                maxHeight = b[i];
        }

        // 算出需要的宽度
        int width = ((maxStrWidth >> 1) + histogramPitch + histogramWidth) * len;
        int height = imageHeight;
        if (maxHeight > height) {
            // 当给的最大的比例值大于了默认的高度就算个比例
            scaling = (float) height / maxHeight;
            height += 30;
        } else{
            height = maxHeight + 80;
        }

        return new Dimension(width + 15, height);
    }
}

