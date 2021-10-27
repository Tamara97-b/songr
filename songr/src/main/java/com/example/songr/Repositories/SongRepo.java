package com.example.songr.Repositories;

import com.example.songr.model.Songs;
import org.springframework.data.repository.CrudRepository;

public interface SongRepo extends CrudRepository<Songs,Integer> {
}
