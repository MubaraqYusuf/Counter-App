package com.example.counterapp;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;

@RunWith(AndroidJUnit4.class)
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void setup() throws InterruptedException {
        Thread.sleep(1200);  // Let activity fully load
    }

    @Test
    public void initialResult_isDefault() {
        onView(withId(R.id.txtResult))
                .check(matches(withText("Result:")));
    }

    @Test
    public void countWords_correctResult() throws InterruptedException {
        onView(withId(R.id.txtInput)).perform(typeText("I love Android Testing"));
        closeSoftKeyboard();

        onView(withId(R.id.spnMetric)).perform(click());
        onView(withText("Words")).perform(click());

        onView(withId(R.id.btnCount)).perform(click());

        Thread.sleep(300); // allow UI update
        onView(withId(R.id.txtResult)).check(matches(withText("Result: 4")));
    }

    @Test
    public void countSentences_correctResult() throws InterruptedException {
        onView(withId(R.id.txtInput)).perform(typeText("Hello World. This is Great!"));
        closeSoftKeyboard();

        onView(withId(R.id.spnMetric)).perform(click());
        onView(withText("Sentences")).perform(click());

        onView(withId(R.id.btnCount)).perform(click());

        Thread.sleep(300);
        onView(withId(R.id.txtResult)).check(matches(withText("Result: 2")));
    }

    @Test
    public void countChars_correctResult() throws InterruptedException {
        onView(withId(R.id.txtInput)).perform(typeText("Hi"));
        closeSoftKeyboard();

        onView(withId(R.id.spnMetric)).perform(click());
        onView(withText("Characters")).perform(click());

        onView(withId(R.id.btnCount)).perform(click());

        Thread.sleep(300);
        onView(withId(R.id.txtResult)).check(matches(withText("Result: 2")));
    }

    @Test
    public void countNumbers_correctResult() throws InterruptedException {
        onView(withId(R.id.txtInput)).perform(typeText("There are 2 Dogs and 55 Cats"));
        closeSoftKeyboard();

        onView(withId(R.id.spnMetric)).perform(click());
        onView(withText("Numbers")).perform(click());

        onView(withId(R.id.btnCount)).perform(click());

        Thread.sleep(300);
        onView(withId(R.id.txtResult)).check(matches(withText("Result: 2")));
    }
}
