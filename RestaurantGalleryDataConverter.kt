package com.sarang.torang.di.restaurant_gallery_di

import com.sarang.torang.BuildConfig
import com.sarang.torang.data.RestaurantDetail
import com.sarang.torang.data.RestaurantImage
import com.sarang.torang.data.remote.response.RestaurantDetailApiModel

fun RestaurantDetailApiModel.toRestaurantImages(): List<RestaurantImage> {
    return this.pictures.map {
        RestaurantImage(
            id = it.picture_id,
            url = BuildConfig.REVIEW_IMAGE_SERVER_URL + it.picture_url
        )
    }
}
