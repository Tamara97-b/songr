package com.example.songr.Repositories;

import com.example.songr.model.Album;
import org.springframework.data.repository.CrudRepository;

public  interface AlbumRepositories extends CrudRepository<Album,Integer> {
}
