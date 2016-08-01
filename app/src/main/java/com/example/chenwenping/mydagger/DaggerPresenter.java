package com.example.chenwenping.mydagger;

import bean.User;

/**
 * Created by chenwenping on 16/8/1.
 */
public class DaggerPresenter {
    MainActivity activity;
    User user;

    public DaggerPresenter(MainActivity activity, User user) {
        this.user = user;
        this.activity = activity;
    }

    public void showUserName() {
        activity.showUserName(user.name);
    }
}
