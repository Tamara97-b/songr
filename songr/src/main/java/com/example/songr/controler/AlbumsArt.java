package com.example.songr.controler;

import com.example.songr.Repositories.AlbumRepositories;
import com.example.songr.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;

@Controller
public class AlbumsArt {

    @Autowired
    AlbumRepositories albumRepositories;

    @GetMapping("/albums")
    public String albums(Model model){
        model.addAttribute("album" ,albumRepositories.findAll());
        return "allAlbums";
    }
    @GetMapping("/addAlbumsForm")
    public String albumForm(Model model) {
        model.addAttribute("Album", new Album());
        return "form";
    }


    @PostMapping("/addAlbumsForm")
    public String addAlbumsForm(@ModelAttribute Album album, Model model) {

            albumRepositories.save(album);
            model.addAttribute("Album", album);
            return "Result";

    }


}
