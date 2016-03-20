package com.jason9075.androidttdplayground;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.EditText;

import com.jason9075.androidttdplayground.network.NetworkManager;
import com.jason9075.androidttdplayground.network.model.GithubUserDto;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest extends InstrumentationTestCase {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);
    NetworkManager networkManager;

    @Before
    public void setUp() throws Exception {
        networkManager = mock(NetworkManager.class);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void changeText_sameActivity() {
        onView(withId(R.id.result_textview))
                .check(matches(withText("Hello World!")));
        onView(withId(R.id.change_text_button))
                .perform(click());
        onView(withId(R.id.result_textview))
                .check(matches(withText("Yo!")));
    }

    @Test
    public void githubUserEmptyCheckTest() {
        onView(withId(R.id.submit_button))
                .perform(click());
        onView(withId(R.id.submit_result_textview))
                .check(matches(withText("account is empty!")));
    }

    @Test
    public void validUserCheckTest() throws Exception {
        EditText accountEditText = (EditText) mActivityRule.getActivity().findViewById(R.id.account_edittext);
        String USER_NAME = "jason9075";

        when(networkManager.userCheck(accountEditText.getText().toString()))
                .thenReturn(new GithubUserDto(accountEditText.getText().toString(), 123, null));
        onView(withId(R.id.account_edittext))
                .perform(typeText(USER_NAME), closeSoftKeyboard());
        onView(withId(R.id.submit_button))
                .perform(click());
//        GithubUserDto githubUserDto = networkManager.userCheck(accountEditText.getText().toString());
//        assertEquals(githubUserDto.getLogin(), USER_NAME);
        onView(withId(R.id.submit_result_textview))
                .check(matches(withText("find it!")));
    }
}