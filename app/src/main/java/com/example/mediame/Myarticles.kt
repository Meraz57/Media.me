package com.example.mediame


import com.google.gson.annotations.SerializedName

data class Myarticles(
    @SerializedName("articles")
    val articles: List<Article?>?,
    @SerializedName("articlesCount")
    val articlesCount: Int?
) {
    data class Article(
        @SerializedName("author")
        val author: Author?,
        @SerializedName("body")
        val body: String?,
        @SerializedName("createdAt")
        val createdAt: String?,
        @SerializedName("description")
        val description: String?,
        @SerializedName("favorited")
        val favorited: Boolean?,
        @SerializedName("favoritesCount")
        val favoritesCount: Int?,
        @SerializedName("slug")
        val slug: String?,
        @SerializedName("tagList")
        val tagList: List<String?>?,
        @SerializedName("title")
        val title: String?,
        @SerializedName("updatedAt")
        val updatedAt: String?
    ) {
        data class Author(
            @SerializedName("bio")
            val bio: Any?,
            @SerializedName("following")
            val following: Boolean?,
            @SerializedName("image")
            val image: String?,
            @SerializedName("username")
            val username: String?
        )
    }
}