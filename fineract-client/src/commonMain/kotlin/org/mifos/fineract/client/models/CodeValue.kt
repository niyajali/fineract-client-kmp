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

import kotlinx.serialization.Serializable

/**
 *
 *
 * @param active
 * @param code
 * @param description
 * @param id
 * @param label
 * @param mandatory
 * @param new
 * @param position
 */

@Serializable
data class CodeValue(

    val active: kotlin.Boolean? = null,

    val code: Code? = null,

    val description: kotlin.String? = null,

    val id: kotlin.Long? = null,

    val label: kotlin.String? = null,

    val mandatory: kotlin.Boolean? = null,

    val new: kotlin.Boolean? = null,

    val position: kotlin.Int? = null,

)
