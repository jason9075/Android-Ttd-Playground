package com.jason9075.androidttdplayground.network;

import com.jason9075.androidttdplayground.network.model.GithubUserDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by jason9075 on 2016/3/15.
 */
public interface GithubService {
    @GET("/users/{user}")
    Call<GithubUserDto> userCheck(@Path("user") String user);

}
