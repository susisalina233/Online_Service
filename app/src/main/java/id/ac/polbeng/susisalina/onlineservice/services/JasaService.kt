package id.ac.polbeng.susisalina.onlineservice.services

import id.ac.polbeng.susisalina.onlineservice.models.JasaResponse
import retrofit2.Call
import retrofit2.http.GET

interface JasaService {
    @GET("services")
    fun getJasa() : Call<JasaResponse>
}
