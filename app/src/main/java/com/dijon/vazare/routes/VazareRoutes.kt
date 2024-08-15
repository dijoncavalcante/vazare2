package com.dijon.vazare.routes

class VazareRoutes() {

    enum class VazareRoutes(val rootValue: String) {
        VAZARE("vazareRoute")
    }

    companion object {
        fun findByValue(value: String?): VazareRoutes {
            return enumValues<VazareRoutes>().firstOrNull {
                it.rootValue.equals(value, true)
            } ?: VazareRoutes.VAZARE
        }
    }
}