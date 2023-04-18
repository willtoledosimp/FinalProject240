import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MenuButtonListener implements ActionListener {
    private String buttonName;
    private int option;
    public MenuButtonListener(int option) {
        this.option = option;
    }
    @Override
    public void actionPerformed(ActionEvent e) { // method for when the button is clicked
        if(this.option==0) {
            Main.newPlaylist();
        } else if(this.option==1) {
            Main.choosePlaylist();
        } else if(this.option==2) {
            Main.shufflePlaylist();
        } else if(this.option==3) {
            try {
                Main.exit();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}