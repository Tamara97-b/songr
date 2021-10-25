package com.example.songr.controler;

import com.example.songr.model.Album;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AlbumsArt {

    @GetMapping("/album")
    public String albums(Model model){
        ArrayList<Album> listForAlbums =new ArrayList<>();

        listForAlbums.add(new Album("salleme", "naseif", 333, 10, "https://i.pinimg.com/originals/39/00/d1/3900d1a27f9b4c9f7ceee205de33730c.jpg"));

        listForAlbums.add(new Album("ya 3asal", "naseif", 10, 15,"https://www.l7nlyrics.com/wp-content/uploads/2020/10/%D9%8A%D8%A7-%D8%B9%D8%B3%D9%84-%D9%86%D8%A7%D8%B5%D9%8A%D9%81-%D8%B2%D9%8A%D8%AA%D9%88%D9%86.jpg"));
        listForAlbums.add(new Album("msh gd al hawa", "sheren", 15, 14,"https://i1.sndcdn.com/artworks-frztQERHtyW0j8dx-mx4q6w-t500x500.jpg"));

        model.addAttribute("albums",listForAlbums);
        return "Album";
    }


}
