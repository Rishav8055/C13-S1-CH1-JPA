package com.niit.jpa.C13S1CH1JPA.Service;

import com.niit.jpa.C13S1CH1JPA.Domain.Track;
import com.niit.jpa.C13S1CH1JPA.Repository.TrackRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrackServiceImpl implements TrackService{
    TrackRepo trackRepo;

    public TrackServiceImpl(TrackRepo trackRepo) {
        this.trackRepo = trackRepo;
    }

    @Override
    public Track addTrack(Track track) {
        return trackRepo.save(track);
    }

    @Override
    public List<Track> getTrack() {
        return trackRepo.findAll();
    }

    @Override
    public Track updateTrack(Track track, int trackId) {
        Optional<Track> optionalTrack=trackRepo.findById(trackId);
        if (optionalTrack.isEmpty()){
            return null;
        }
        Track existingTrack = optionalTrack.get();
        if (track.getTrackName()!=null){
            existingTrack.setTrackName(track.getTrackName());
        }
        if (track.getTrackArtist()!=null){
            existingTrack.setTrackArtist(track.getTrackArtist());
        }
        if (track.getTrackComments()!=null){
            existingTrack.setTrackComments(track.getTrackComments());
        }
        if (track.getTrackRating()!=null){
            existingTrack.setTrackRating(track.getTrackRating());
        }

        return trackRepo.save(track);
    }

    @Override
    public boolean deleteTrackById(int trackId) {
        trackRepo.deleteById(trackId);
        return true;
    }
}
