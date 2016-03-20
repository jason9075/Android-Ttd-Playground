package com.jason9075.androidttdplayground.network;

import com.jason9075.androidttdplayground.network.model.GithubUserDto;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by jason9075 on 2016/3/15.
 */
public class NetworkManager {
    public RequestCallbackListener callback;
    private GithubService githubService;

    @Inject
    public NetworkManager(GithubService githubService) {
        this.githubService = githubService;
    }

    public GithubUserDto userCheck(String userName) {
        Call<GithubUserDto> call = githubService.userCheck(userName);
        call.enqueue(new Callback<GithubUserDto>() {
            @Override
            public void onResponse(Call<GithubUserDto> call, Response<GithubUserDto> response) {
                GithubUserDto githubUserDto = response.body();
                callback.successCallBack(githubUserDto);
            }

            @Override
            public void onFailure(Call<GithubUserDto> call, Throwable t) {
                System.out.println(">>>request 失敗..");
            }
        });
        return null;
    }

    public interface RequestCallbackListener {
        GithubUserDto successCallBack(GithubUserDto githubUserDto);
    }
}

