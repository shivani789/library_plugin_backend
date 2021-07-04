package com.slb.sis.ratinglibrary.models;

import com.slb.sis.ratinglibrary.entities.RatingEntity;
import org.springframework.lang.Nullable;

import java.util.List;

public class GetRatingsListResponseModel {

    @Nullable
    List<RatingEntity> data;
    @Nullable
    Error error;

    String status;

    public void setData(List<RatingEntity> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetRatingsListResponseModel{" +
                "data=" + data +
                '}';
    }

    public List<RatingEntity> getData() {
        return data;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
