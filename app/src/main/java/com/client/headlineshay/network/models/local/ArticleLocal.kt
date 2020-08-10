package com.client.headlineshay.network.models.local

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ArticleLocal(

    var sourceId : String?,

    var sourceName : String?,

    var author : String,

    var title : String,

    var description : String,

    var url : String,

    var urlToImage : String,

    var publishedAt : String,

    var content : String

    ){

}