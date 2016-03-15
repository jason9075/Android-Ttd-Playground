package com.jason9075.androidttdplayground.network;

/**
 * Created by jason9075 on 2016/3/15.
 */
public class NetworkManager {
    private GithubService githubService;

    public NetworkManager(GithubService githubService) {
        this.githubService = githubService;
    }

    public void userCheck() {
        githubService.userCheck();
    }
}
