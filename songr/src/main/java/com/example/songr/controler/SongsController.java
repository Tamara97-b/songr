package com.example.songr.controler;

import com.example.songr.Repositories.AlbumRepositories;
import com.example.songr.Repositories.SongRepo;
import com.example.songr.model.Album;
import com.example.songr.model.Songs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Queue;
@Controller
public class SongsController {
    @Autowired
    SongRepo songRepo;
    @Autowired
    AlbumRepositories albumRepositories;
    @GetMapping("/song/{id}")
    public String getAllSong(@PathVariable Integer id, Model model){
        Album album = albumRepositories.findById(id).get();
        model.addAttribute("album", album);
        return "song";
    }

    @PostMapping("/song/addSong/")
    public  RedirectView addSong(String title , int length, int trackNumber, String album){
        List<Album> songAlbum = albumRepositories.findByTitle(album);
        Songs newSong = new Songs(title, length, trackNumber, songAlbum.get(0));
        songRepo.save(newSong);
        List<Songs> song = songRepo.findByTitleAndAlbum(
                newSong.getTitle(),
                newSong.getAlbum()
        );
        return new RedirectView("/song/" + song.get(0).getAlbum().getId());


    }

}
