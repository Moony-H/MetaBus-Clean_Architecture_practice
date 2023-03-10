package com.moonyh.data.model.response

import com.google.gson.annotations.SerializedName
import com.moonyh.data.common.Header
import com.moonyh.data.model.item.BusInfoItem
import com.moonyh.domain.model.api.body.BusInStationInfoBody
import com.moonyh.domain.model.api.MetaData

data class BusInStationResponseData(
    @SerializedName("response")
    val response:Response

) : BusInStationInfoBody {

    override val metaData: MetaData
        get() = object : MetaData {
            override val resultCode: String
                get() = response.header.resultCode
            override val resultMessage: String
                get() = response.header.resultMessage
            override val nowPageCount: Int
                get() = response.body.nowPageCount
            override val totalItemCount: Int
                get() = response.body.totalPageCount

        }
    override val items: ArrayList<BusInfoItem>
        get() = response.body.items.item

    data class Response(
        @SerializedName("header")
        val header: Header,
        @SerializedName("body")
        val body: Body
    ){
        data class Body(
            @SerializedName("items")
            val items: Item,
            @SerializedName("numOfRows")
            val itemCount: Int,
            @SerializedName("pageNo")
            val nowPageCount: Int,
            @SerializedName("totalCount")
            val totalPageCount: Int
        ) {
            data class Item(
                @SerializedName("item")
                val item: ArrayList<BusInfoItem>
            )
        }
    }

}