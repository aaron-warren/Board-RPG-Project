import javax.swing.*;

public class Frame extends JFrame{
    public Frame(){
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 850, 400);
        Menu initialMenu = new Menu();
        getContentPane().add(initialMenu);
//        getContentPane().add(new Game());
        setVisible(true);
    }
}