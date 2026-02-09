package com.sarang.torang.di.restaurant_gallery_di

import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.sarang.torang.compose.type.RestaurantGalleryImageLoader
import com.sarang.torang.di.image.TorangAsyncImageData
import com.sarang.torang.di.image.provideTorangAsyncImage

val restaurantGalleryImageLoader: RestaurantGalleryImageLoader = { modifier, url, width, height, scale ->
    // 여기서 실제 이미지 로딩 구현 예시
    provideTorangAsyncImage().invoke(
        TorangAsyncImageData(
        modifier, url,
            width ?: 30.dp,
            height?: 30.dp,
            scale ?: ContentScale.None
        )
    )
}