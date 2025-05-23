/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mifos-mobile/LICENSE.md
 */
@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport",
)

package org.mifos.fineract.client.models

import kotlinx.datetime.LocalDate
import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

/**
 *
 *
 * @param accountId
 * @param accountNumber
 * @param chartSlabs
 * @param fromDate
 * @param id
 * @param periodTypes
 */

@Serializable
data class GetRecurringDepositAccountsAccountChart(

    val accountId: kotlin.Long? = null,

    val accountNumber: kotlin.Long? = null,

    val chartSlabs: kotlin.collections.Set<GetRecurringDepositAccountsChartSlabs>? = null,

    @Contextual
    val fromDate: LocalDate? = null,

    val id: kotlin.Long? = null,

    val periodTypes: kotlin.collections.Set<GetRecurringDepositAccountsPeriodTypes>? = null,

)
