package com.jason9075.androidttdplayground.network;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by jason9075 on 2016/3/15.
 */
public class NetworkManagerTest {

    NetworkManager networkManager;
    GithubService githubService;

    @Before
    public void setUp() {
        githubService = mock(GithubService.class);
        networkManager = new NetworkManager(githubService);
    }

    @Test
    public void verifyUserCheckTest() throws InterruptedException {
        networkManager.userCheck();
        verify(githubService).userCheck();
    }
}
