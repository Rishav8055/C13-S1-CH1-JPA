package com.niit.jpa.C13S1CH1JPA.Controller;

import com.niit.jpa.C13S1CH1JPA.Domain.Track;
import com.niit.jpa.C13S1CH1JPA.Service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/track/v1")
public class TrackController {
    TrackService trackService;
    @Autowired
    public TrackController(TrackService trackService) {
        this.trackService = trackService;
    }
    @GetMapping("/tracks")
    public ResponseEntity<?> getAllTracks(){
        return new ResponseEntity<>(trackService.getTrack(), HttpStatus.FOUND);
    }
    @PostMapping("/tracks/post")
    public ResponseEntity<?> saveTrack(@RequestBody Track track){
        return new ResponseEntity<>(trackService.addTrack(track),HttpStatus.CREATED);
    }
    @PutMapping("/tracks/put")
    public ResponseEntity<?> updateTrack(@PathVariable Track track,int trackId){
        return new ResponseEntity<>(trackService.updateTrack(track,trackId),HttpStatus.CREATED);
    }

}
