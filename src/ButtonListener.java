import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ButtonListener implements ActionListener {
    private int option;
    public ButtonListener(int option) {
        this.option = option;
    }
    @Override
    public void actionPerformed(ActionEvent e) { // method for when the button is clicked
        if(this.option==0) {
            Main.newPlaylist();
        } else if(this.option==1) {
            Main.editPlaylist();
        } else if(this.option==2) {
            Main.shufflePlaylist();
        } else if(this.option==3) {
            try {
                Main.exit();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if(this.option==4) {

        }
    }
}
