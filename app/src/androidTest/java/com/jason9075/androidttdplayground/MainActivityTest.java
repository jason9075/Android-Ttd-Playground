package com.jason9075.androidttdplayground;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class);

    @Before
    public void initValidString() {
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
        onView(withId(R.id.account_edittext))
                .perform(replaceText(""));
        onView(withId(R.id.submit_button))
                .perform(click());
        onView(withId(R.id.submit_result_textview))
                .check(matches(withText("account is empty!")));
    }
}