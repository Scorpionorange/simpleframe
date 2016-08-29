import java.awt.*;
import javax.swing.*;
/**
 * Created by ScorpionOrange on 2016/08/21.
 */
public class SimpleFrameTest {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                SimpleFrame frame = new SimpleFrame();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
                frame.setTitle("空白的测试用窗口");
                frame.setResizable(true);
            }
        });
    }
}

class SimpleFrame extends JFrame{
    private static final int DEFAULT_WIDTH = 800;
    private static final int DEFAULT_HEIGHT = 600;

    public SimpleFrame(){
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}
