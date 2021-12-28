package com.rest.playlist.repository;

import com.rest.playlist.enums.SongCategory;
import com.rest.playlist.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@EnableJpaAuditing
public interface SongRepository extends JpaRepository<Song, Long> {
    Set<Song> findSongsByCategory(SongCategory category);

    Set<Song> findSongsByArtistName(String artistName);
}
