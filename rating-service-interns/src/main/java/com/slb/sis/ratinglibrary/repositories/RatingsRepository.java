package com.slb.sis.ratinglibrary.repositories;

import com.slb.sis.ratinglibrary.entities.RatingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingsRepository extends JpaRepository<RatingEntity, Long> {
}
