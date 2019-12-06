package com.cals.doctorcita.servicio;

import com.cals.doctorcita.entidad.Cita;
import com.cals.doctorcita.entidad.Horario;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Servicio_Cita {


    @GET("citas.php")
    Call<List<Cita>> getCitaPaciente(@Query("idPaciente") int idPaciente, @Query("fechaCita") String fechaCita);

    @GET("citas.php")
    Call<List<Cita>> getCitaMedico(@Query("idMedico") int idMedico,@Query("fechaCita") String fechaCita);

}
