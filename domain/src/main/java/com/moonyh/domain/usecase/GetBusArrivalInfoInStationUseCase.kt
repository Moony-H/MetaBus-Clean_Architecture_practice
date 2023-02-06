package com.moonyh.domain.usecase

import com.moonyh.domain.model.body.BusArrivalInStationInfoBody
import com.moonyh.domain.model.normal.ApiResponse
import com.moonyh.domain.model.query.BusArrivalInfoInStationQuery
import com.moonyh.domain.repository.ArrivalInfoRepository

abstract class GetBusArrivalInfoInStationUseCase :
    UseCase<BusArrivalInfoInStationQuery, BusArrivalInStationInfoBody> {
    abstract override suspend fun invoke(query: BusArrivalInfoInStationQuery): ApiResponse<BusArrivalInStationInfoBody>

}
class GetBusArrivalInfoInStationUseCaseImpl(private val arrivalInfoRepository: ArrivalInfoRepository) :
    GetBusArrivalInfoInStationUseCase() {
    override suspend fun invoke(query: BusArrivalInfoInStationQuery): ApiResponse<BusArrivalInStationInfoBody> {
        return arrivalInfoRepository.getBusArrivalInfoInStation(query)
    }

}