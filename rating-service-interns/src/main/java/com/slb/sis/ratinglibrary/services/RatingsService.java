package com.slb.sis.ratinglibrary.services;

import com.slb.sis.ratinglibrary.entities.RatingEntity;
import com.slb.sis.ratinglibrary.repositories.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RatingsService {

    @Autowired
    RatingsRepository ratingsRepo;

    public List<RatingEntity> getRatingsList(List<Long> idList) {
        return ratingsRepo.findAllById(idList);
    }

    public Optional<RatingEntity> getRating(Long id) {
        return ratingsRepo.findById(id);
    }
}
