package com.example.jpachallenge.challenge1.controller;

import com.example.jpachallenge.challenge1.domain.Track;
import com.example.jpachallenge.challenge1.service.TrackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class TrackController {

    public TrackServiceImpl trackServiceImpl;

    @Autowired
    public TrackController(TrackServiceImpl trackServiceImpl) {
        this.trackServiceImpl = trackServiceImpl;
    }

    @PostMapping("/track")
    public ResponseEntity<?> save(@RequestBody Track track){
        return new ResponseEntity<>(trackServiceImpl.add(track), HttpStatus.CREATED);
    }

    @GetMapping("/trackdetails")
    public ResponseEntity<?> getTrack(){
        return new ResponseEntity<>(trackServiceImpl.getTrack(),HttpStatus.FOUND);
    }

    @GetMapping("/trackdetails/{trackId}")
    public ResponseEntity<?> gettrackById(@PathVariable int trackId){
        return new ResponseEntity<>(trackServiceImpl.getByTrackId(trackId),HttpStatus.FOUND);
    }

    @GetMapping("/trackdetail/{trackArtist}")
    public ResponseEntity<?> gettrackByArtist(@PathVariable String trackArtist){
        return new ResponseEntity<>(trackServiceImpl.getByTrackArtist(trackArtist),HttpStatus.FOUND);
    }

    @DeleteMapping("/track/{trackId}")
    public ResponseEntity<?> deleteById(@PathVariable int trackId){
        return new ResponseEntity<>(trackServiceImpl.deleteByTrackId(trackId),HttpStatus.OK);
    }

    @PutMapping("/track/{trackId}")
    public ResponseEntity<?> updateById(@RequestBody Track track,@PathVariable int trackId){
        return  new ResponseEntity<>(trackServiceImpl.updateTrackDetails(track,trackId),HttpStatus.OK);
    }

}
