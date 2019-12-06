package com.cals.doctorcita.servicio;

import com.cals.doctorcita.entidad.Medico;
import com.cals.doctorcita.entidad.Usuario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Servicio_Medico {

    /*@GET("medico.php")
    Call<List<Medico>> getMedicos();
    */

    @GET("medico.php")
    Call<List<Medico>> getMedico(@Query("idEspecialidad") int idEspecialidad);

}
