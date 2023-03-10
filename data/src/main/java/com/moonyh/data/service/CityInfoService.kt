package com.moonyh.data.service

import com.moonyh.data.model.response.CitiesResponseData
import com.moonyh.domain.model.api.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CityInfoService {
    //base url: http://apis.data.go.kr/1613000/ArvlInfoInqireService/
    @GET("getCtyCodeList")
    suspend fun getCities(
        @Query("serviceKey")
        key:String,
        @Query("_type")
        type:String="json"
    ): ApiResponse<CitiesResponseData>
}