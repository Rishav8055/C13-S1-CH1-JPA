package com.niit.jpa.C13S1CH1JPA.Repository;

import com.niit.jpa.C13S1CH1JPA.Domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackRepo extends JpaRepository<Track ,Integer> {
    public List<Track> findByTrackId(int trackId);
    public List<Track> findByTrackName(String trackName);

}
