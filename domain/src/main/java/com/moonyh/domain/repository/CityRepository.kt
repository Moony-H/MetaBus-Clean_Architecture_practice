package com.moonyh.domain.repository

import com.moonyh.domain.model.api.ApiResponse
import com.moonyh.domain.model.api.body.CitiesInfoBody
import com.moonyh.domain.model.api.query.CitiesInfoQuery

interface CityRepository : Repository {
    suspend fun getCities(cityQuery: CitiesInfoQuery): ApiResponse<CitiesInfoBody>
}