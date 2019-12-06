package com.cals.doctorcita.servicio;

import com.cals.doctorcita.entidad.Usuario;
import com.cals.doctorcita.entidad.Usuarios;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Servicio_Usuario {

//UsuariosControlador.php?op=2

    //@GET("usuarios.php")
    @GET("UsuariosControlador.php?op=2")
    Call<List<Usuario>> getUsuarios();

    //Login
    /*@GET("login.php")
    Call<List<Usuario>> getUsuario(@Query("usuario") String usuario, @Query("contrasena") String contrasena);
    */

    @GET("UsuariosControlador.php?op=1")
    Call<List<Usuario>> getUsuario(@Query("usuario") String usuario, @Query("password") String password);

    //https://citamedicautp.000webhostapp.com/CONTROLADOR/UsuariosControlador.php?op=1&usuario=admin&password=123
    //https://citamedicautp.000webhostapp.com/login.php?usuario=admin&contrasena=123

    @GET("login.php")
    Call <Usuario> getUser(@Query("usuario") String usuario, @Query("contrasena") String contrasena);


    @FormUrlEncoded
    @POST("guardar.php")
    Call <Usuarios> GuardarUsuario(
                                    @Field("idPersona") String idPersona,
                                    @Field("usuario") String usuario,
                                    @Field("contrasena") String contrasena,
                                    @Field("nivel") String nivel,
                                    @Field("estado") String estado
    );

}

//https://citamedicautp.000webhostapp.com/especialidad.php