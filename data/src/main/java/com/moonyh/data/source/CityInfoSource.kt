package com.moonyh.data.source

import com.moonyh.data.model.response.CitiesResponseData
import com.moonyh.data.service.CityInfoService
import com.moonyh.domain.model.api.ApiResponse
import com.moonyh.domain.model.api.query.CitiesInfoQuery
import javax.inject.Inject

interface CityInfoSource {
    suspend fun getCities(citiesInfoQuery: CitiesInfoQuery): ApiResponse<CitiesResponseData>
}

class CityInfoSourceImpl @Inject constructor(private val cityInfoService: CityInfoService):CityInfoSource{
    override suspend fun getCities(citiesInfoQuery: CitiesInfoQuery): ApiResponse<CitiesResponseData> {
        return cityInfoService.getCities(citiesInfoQuery.key, "json")
    }

}