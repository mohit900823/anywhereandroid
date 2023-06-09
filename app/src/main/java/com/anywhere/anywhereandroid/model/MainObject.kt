package com.anywhere.anywhereandroid.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class MainObject(

    var RelatedTopics: ArrayList<RelatedTopics> = arrayListOf(),


    )


data class Icon(

    var Height: String? = null,
    var URL: String? = null,
    var Width: String? = null
)

data class RelatedTopics(
    var FirstURL: String? = null,
    var Icon: Icon? = Icon(),
    var Result: String? = null,
    var Text: String? = null
)






