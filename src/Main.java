import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Button List Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(new FlowLayout());

        String[] groupNames = {"Т50-11-23", "П50-11-23", "Т50-11-22"};

        for (String groupName : groupNames) {
            JButton button = new JButton(groupName);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFrame groupFrame = new JFrame("Group Info");
                    JLabel label = new JLabel(groupName, JLabel.CENTER);
                    groupFrame.add(label);
                    groupFrame.setSize(200, 100);
                    groupFrame.setVisible(true);
                }
            });
            frame.add(button);
        }

        frame.setVisible(true);
    }
}
