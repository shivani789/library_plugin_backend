package com.slb.sis.ratinglibrary.models;

import com.slb.sis.ratinglibrary.entities.RatingEntity;

public class InsertRatingResponseModel {
    RatingEntity data;

    public InsertRatingResponseModel(RatingEntity data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "InsertRatingResponseModel{" +
                "data=" + data.toString() +
                '}';
    }
}
