package com.example.compose_api.service

import com.example.compose_api.model.Endereco
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import java.nio.file.attribute.AclEntryPermission

interface EnderecoService {

    //
    @GET("ws/{cep}/json/")
    fun getEnderecoByCep(@Path("cep")cep: String): Call<Endereco>

    //https://viacep.com.br/ws/RS/Porto Alegre/Domingos/json/
    @GET("{uf}/{cidade}/{rua}/json/")
    fun getEnderecosByUfCidadeRua(
        @Path("uf")uf: String,
        @Path("cidade")cidade: String,
        @Path("rua")rua: String
    ): Call<List<Endereco>>
}