package com.pruebas123.petagram.restApiFirebase;

import com.pruebas123.petagram.restApiFirebase.model.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface EndpointsRestApiFirebase {

    @FormUrlEncoded
    @POST(ConstantesRestApiFirebase.KEY_POST_ID_TOKEN)
    Call<UsuarioResponse> registrarTokenID(@Field("token") String token);

    @FormUrlEncoded
    @POST(ConstantesRestApiFirebase.KEY_POST_ID_TOKEN)
    Call<UsuarioResponse> registrarUsuario(@Field("token") String token, @Field("userid") String userid);
    
}
