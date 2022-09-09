package com.example.idsystem.data.remote

import com.example.idsystem.domain.Cadastro
import retrofit2.http.GET
import retrofit2.http.Path

interface RetrofitService {

    @GET("pessoa/usuario/{telefone}")
    suspend fun findTelefone(@Path("telefone") accountHolderTelefone:String):List<Cadastro>


}