package com.example.songr.Repositories;

import com.example.songr.model.Album;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public  interface AlbumRepositories extends CrudRepository<Album,Integer> {
    public List<Album> findByTitle(String albumSong);
}
