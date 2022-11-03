package com.example.jpachallenge.challenge1.service;

import com.example.jpachallenge.challenge1.domain.Track;
import com.example.jpachallenge.challenge1.repository.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService{

    private TrackRepository trackRepository;

    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }

    @Override
    public Track add(Track track) {
        return trackRepository.save(track);
    }

    @Override
    public List<Track> getTrack() {
        return trackRepository.findAll();
    }

    @Override
    public Track getByTrackId(int trackId) {
        return trackRepository.findByTrackId(trackId);
    }

    @Override
    public boolean deleteByTrackId(int trackId) {
        trackRepository.deleteById(trackId);
        return true;
    }

    @Override
    public Track getByTrackArtist(String trackArtist) {
        return trackRepository.findByTrackArtist(trackArtist);
    }

    @Override
    public Track updateTrackDetails(Track track, int trackId) {
        Optional<Track> optionalTrack = trackRepository.findById(trackId);
        if (optionalTrack.isEmpty()){
            return null;
        }
        Track track1 = optionalTrack.get();
        if (track.getTrackArtist()!=null){
            track1.setTrackArtist(track.getTrackArtist());
        }
        if (track.getTrackComment()!=null){
            track1.setTrackComment(track.getTrackComment());
        }
        if (track.getTrackName()!=null){
            track1.setTrackName(track.getTrackName());
        }
        if (track.getRating()!= 0){
            track1.setRating(track.getRating());
        }
        return trackRepository.save(track1);
    }
}
