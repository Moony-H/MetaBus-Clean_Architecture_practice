package com.moonyh.domain.usecase

import com.moonyh.domain.model.api.ApiResponse
import com.moonyh.domain.model.api.body.CitiesInfoBody
import com.moonyh.domain.model.api.query.CitiesInfoQuery
import com.moonyh.domain.repository.CityRepository
import com.moonyh.domain.usecase.base.ApiUseCase


abstract class GetCitiesUseCase : ApiUseCase<CitiesInfoQuery, CitiesInfoBody> {
    abstract override suspend operator fun invoke(query: CitiesInfoQuery): ApiResponse<CitiesInfoBody>
}

class GetCitiesUseCaseImpl(private val cityRepository: CityRepository) : GetCitiesUseCase() {
    override suspend operator fun invoke(query: CitiesInfoQuery): ApiResponse<CitiesInfoBody> {
        return cityRepository.getCities(query)
    }

}