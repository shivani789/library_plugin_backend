package com.slb.sis.ratinglibrary.models;

import com.slb.sis.ratinglibrary.entities.RatingEntity;

public class GetRatingResponseModel {

    RatingEntity rating;

    public RatingEntity getRating() {
        return rating;
    }

    public void setRating(RatingEntity rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "GetRatingResponseModel{" +
                "rating=" + rating.toString() +
                '}';
    }
}
