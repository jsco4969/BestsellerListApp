package com.codepath.bestsellerlistapp

import com.google.gson.annotations.SerializedName

/**
 * The Model for storing a single book from the NY Times API
 *
 * SerializedName tags MUST match the JSON response for the
 * object to correctly parse with the gson library.
 */
data class BestSellerBook(
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("rank_last_week")
    val rankLastWeek: Int,
    @SerializedName("weeks_on_list")
    val weeksOnList: Int,
    @SerializedName("primary_isbn10")
    val primaryIsbn10: String,
    @SerializedName("primary_isbn13")
    val primaryIsbn13: String,
    @SerializedName("publisher")
    val publisher: String,
    @SerializedName("description")
    var description: String? = null, // Nullable String for description with default value of null
    @SerializedName("price")
    val price: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("author")
    val author: String,
    @SerializedName("book_image")
    var bookImageUrl: String? = null // Nullable String for book image URL with default value of null

)
