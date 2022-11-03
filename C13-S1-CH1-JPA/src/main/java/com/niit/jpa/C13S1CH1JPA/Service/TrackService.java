package com.niit.jpa.C13S1CH1JPA.Service;

import com.niit.jpa.C13S1CH1JPA.Domain.Track;

import java.util.List;

public interface TrackService {
    public Track addTrack(Track track);
    public List<Track> getTrack();
    public Track updateTrack(Track track,int trackId);
    public boolean deleteTrackById(int trackId);

}
