package com.jason9075.androidttdplayground.network;

import com.jason9075.androidttdplayground.network.model.GithubUserDto;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import retrofit2.Call;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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

    @Test // 檢查 執行networkManager.userCheck() 時, githubService 的userCheck() 是否確實執行
    public void verifyServiceUserCheckTest() throws IOException {
        @SuppressWarnings("unchecked")
        Call<GithubUserDto> call = mock(Call.class);
        when(githubService.userCheck("username")).thenReturn(call);

        networkManager.userCheck("username");
        verify(githubService).userCheck("username");
    }

}
