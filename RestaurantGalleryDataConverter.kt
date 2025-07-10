package com.sarang.torang.di.restaurant_gallery_di

import com.sarang.torang.BuildConfig
import com.sarang.torang.data.RestaurantDetail
import com.sarang.torang.data.RestaurantImage

fun RestaurantDetail.toRestaurantImages(): List<RestaurantImage> {
    return this.pictures.map {
        RestaurantImage(
            id = it.picture_id,
            url = BuildConfig.REVIEW_IMAGE_SERVER_URL + it.picture_url
        )
    }
}
