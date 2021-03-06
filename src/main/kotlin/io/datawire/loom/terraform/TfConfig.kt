package io.datawire.loom.terraform

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonIgnore


data class TfConfig(
        @JsonIgnore val type: String,
        @get:JsonAnyGetter val params: Map<String, String>)
