package com.example.jpachallenge.challenge1.service;

import com.example.jpachallenge.challenge1.domain.Track;

import java.util.List;

public interface TrackService {

    public Track add(Track track);

    public List<Track> getTrack();

    public Track getByTrackId(int trackId);

    public boolean deleteByTrackId(int trackId);

    public Track getByTrackArtist(String trackArtist);

    public Track updateTrackDetails(Track track,int trackId);
}
