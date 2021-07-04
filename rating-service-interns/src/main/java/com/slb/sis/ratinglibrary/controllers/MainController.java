package com.slb.sis.ratinglibrary.controllers;

import com.slb.sis.ratinglibrary.constants.APIConstants;
import com.slb.sis.ratinglibrary.entities.RatingEntity;
import com.slb.sis.ratinglibrary.models.*;
import com.slb.sis.ratinglibrary.models.Error;
import com.slb.sis.ratinglibrary.services.RatingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    RatingsService ratingsService;

    @GetMapping("/ratings/get-list")
    @CrossOrigin("*")
    ResponseEntity<GetRatingsListResponseModel> getRatingsList(@RequestBody(required = true) GetRatingsListRequestModel reqBody) {
        GetRatingsListResponseModel resp = new GetRatingsListResponseModel();
        if (reqBody == null || reqBody.getIdentifiers() == null || reqBody.getIdentifiers().size() == 0){
            resp.setStatus(APIConstants.ERROR);
            resp.setError(new Error("INVALID_REQUEST", "Invalid request body or missing rating Ids."));
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(resp);
        }
        resp.setData(ratingsService.getRatingsList(reqBody.getIdentifiers()));
        if (resp.getData().size() > 0){
            resp.setStatus(APIConstants.SUCCESS);
            return ResponseEntity.status(HttpStatus.OK).body(resp);
        }
        resp.setStatus(APIConstants.ERROR);
        resp.setData(null);
        resp.setError(new Error("DATA_NOT_FOUND", "Ratings data not found for the supplied ids."));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(resp);
    }

    @GetMapping("/ratings/{id}")
    @CrossOrigin("*")
    RatingEntity getRating(@PathVariable(required = true) long id) {
        return ratingsService.getRating(id).orElse(null);
    }

    @PostMapping("/ratings")
    @CrossOrigin("*")
    RatingEntity insertRating(@RequestBody(required = true) RatingEntity reqBody){
        return reqBody;
    }
}
