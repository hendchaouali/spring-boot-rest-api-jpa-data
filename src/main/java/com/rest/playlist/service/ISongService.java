package com.rest.playlist.service;

import com.rest.playlist.model.Song;

import java.util.Set;

public interface ISongService {

    Set<Song> getAllSongs();

    Set<Song> getSongsByCategory(String category);

    Set<Song> getSongsByArtistName(String artistName);

    Song getSongById(Long id);

    Song createSong(Song song);

    Song updateSong(Song song);

    void deleteSongById(Long id);
}
