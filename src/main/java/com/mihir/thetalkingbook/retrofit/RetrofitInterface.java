package com.mihir.thetalkingbook.retrofit;

import com.mihir.thetalkingbook.modal.ListResponseModel;
import com.mihir.thetalkingbook.modal.RequestModel;
import com.mihir.thetalkingbook.modal.SoundResponseModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @POST("/")
    Call<SoundResponseModel> getSound(@Body RequestModel requestModel);

    @POST("/text")
    Call<ListResponseModel> getList(@Body RequestModel requestModel);

    @POST("/report")
    Call<Object> postWord(@Body RequestModel requestModel);
}
