import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldListener implements ActionListener {
    private int option;
    private JTextField textField; // variable for text field
    public TextFieldListener(JTextField t, int option, JFrame f) { //constructor
        textField = t;
        option = option;
    }
    @Override
    public void actionPerformed(ActionEvent e) { // method for when the button is clicked
        if(this.option==0) {
            String playlistName = textField.getText();
            JOptionPane.showMessageDialog(null,playlistName+ " has been created");
            Main.playlists.add(new Playlist(playlistName));
            Main.newPlaylistFrame.dispose();
        } else if(this.option==1) {
            Main.editPlaylist();
        }
    }
}
