package com.slb.sis.ratinglibrary.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "ratings", indexes = {@Index(name = "data_index", columnList = "data_id")})
public class RatingEntity {

    @Id
    @Column(name = "rating_id")
    Long id;

    @Column(name = "created_at", nullable = false)
    @CreationTimestamp
    Timestamp createdAt;

    @Column(name = "data_id", nullable = false)
    Long dataId;

    @Column(name = "grid_group_id", nullable = false)
    Long gridGroupId;

    @Column(name = "user_id", nullable = false)
    Long userId;

    @Column(name = "user_rating", nullable = false)
    int rating;

    @Column(name = "user_comment")
    String comment;

    @Override
    public String toString() {
        return "RatingEntity{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                ", dataId=" + dataId +
                ", gridGroupId=" + gridGroupId +
                ", userId=" + userId +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Long getDataId() {
        return dataId;
    }

    public void setDataId(Long dataId) {
        this.dataId = dataId;
    }

    public Long getGridGroupId() {
        return gridGroupId;
    }

    public void setGridGroupId(Long gridGroupId) {
        this.gridGroupId = gridGroupId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
