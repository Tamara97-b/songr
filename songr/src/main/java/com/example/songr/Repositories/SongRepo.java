package com.example.songr.Repositories;

import com.example.songr.model.Album;
import com.example.songr.model.Songs;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SongRepo extends CrudRepository<Songs,Integer> {
    public List<Songs> findByTitleAndAlbum(String title, Album albumSong);
}
