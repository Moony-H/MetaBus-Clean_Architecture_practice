package com.moonyh.domain.usecase.base

import com.moonyh.domain.model.normal.ApiBody
import com.moonyh.domain.model.normal.ApiResponse
import com.moonyh.domain.model.normal.ApiQuery
import com.moonyh.domain.model.normal.MetaData

interface ApiUseCase<T : ApiQuery, A : ApiBody<MetaData, Any>> {
    suspend operator fun invoke(query: T): ApiResponse<A>
}