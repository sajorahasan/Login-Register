package com.sajorahasan.login_register;

import com.sajorahasan.login_register.models.ServerRequest;
import com.sajorahasan.login_register.models.ServerResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Sajora on 23-12-2016.
 */

public interface RequestInterface {

    @POST("login-register/")
    Call<ServerResponse> operation(@Body ServerRequest request);

}
