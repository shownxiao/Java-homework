package Unite11;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.MalformedURLException;

/* 编程练习2 */
public class Java_2 extends Frame {
    JButton openFile;
    JButton pauseButton;
    JButton playButton;
    File selectedFile;
    Label filePath;
    AudioClip audioClip;
    public Java_2(){
        super("控制音频文件播放");
        setLayout(new FlowLayout());
        JButton j1 = getOpenFile();
        JButton j2 = getPlayButton();
        JButton j3 = getPauseButton();
        add(j1);
        add(j2);
        add(j3);
        setSize(500, 200);
        show();
    }
    private JButton getOpenFile(){
        if(openFile == null){
            openFile = new JButton();
            openFile.setText("选择文件");
            openFile.addActionListener(
                    new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser fileChooser = new JFileChooser();
                        fileChooser.setFileFilter(new FileNameExtensionFilter(
                                "支持的音频文件（*.mid、*.wav、*.au、*mp3","wav","au","mid","mp3"));
                        fileChooser.showOpenDialog(Java_2.this);
                        selectedFile = fileChooser.getSelectedFile();
                        filePath.setText(selectedFile.getAbsolutePath());
                    }
            });
        }
        return openFile;
    }
    private JButton getPlayButton(){
        if(playButton == null){
            playButton = new JButton();
            playButton.setText("播放");
            playButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(selectedFile != null){
                        try {
                            if(audioClip != null){
                                audioClip.stop();
                            }
                            audioClip = Applet.newAudioClip(selectedFile.toURL());
                            audioClip.play();
                        }catch (MalformedURLException e1){
                            e1.printStackTrace();
                        }
                    }
                }
            });
        }
        return playButton;
    }
    private JButton getPauseButton(){
        if(pauseButton == null){
            pauseButton = new JButton();
            pauseButton.setText("暂停");
        }
        return pauseButton;
    }
    public static void main(String args[]){
        Java_2 app = new Java_2();
        app.addWindowFocusListener(
                new WindowAdapter() {
                    public void windowClosing(WindowEvent e){
                        System.exit(0);
                    }
                }
        );
    }
}
