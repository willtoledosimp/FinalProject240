import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SongButtonListener implements ActionListener {
    private Song song;
    private JTextField title;
    private JTextField artist;
    private JTextField rating;
    private Playlist playlist;
    private int option;
    public SongButtonListener(Playlist p, Song s,int o) {
        this.playlist = p;
        this.song = s;
        this.option = o;
    }
    public SongButtonListener(Playlist p, JTextField t, JTextField a, JTextField r,int o) {
        this.playlist = p;
        this.title = t;
        this.artist = a;
        this.rating = r;
        this.option = o;
    }
    @Override
    public void actionPerformed(ActionEvent e) { // method for when the button is clicked
        playlist.addSong(new Song(title.getText(),artist.getText(),Integer.parseInt(rating.getText())));
        try {
            playlist.save();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}