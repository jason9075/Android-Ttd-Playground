package com.jason9075.androidttdplayground.network;

import com.jason9075.androidttdplayground.network.model.GithubUserDto;

/**
 * Created by jason9075 on 2016/3/15.
 */
public class NetworkManager {
    private GithubService githubService;

    public NetworkManager(GithubService githubService) {
        this.githubService = githubService;
    }

    public GithubUserDto userCheck(String userName) {
        githubService.userCheck(userName);
        return null;
    }
}
