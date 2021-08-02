package xyz.teja.jsonunittesterror

import org.json.JSONObject

class Pojo {
    fun a() {
        val jsonObject = JSONObject("{ }")
        print(jsonObject.toString())
    }
}