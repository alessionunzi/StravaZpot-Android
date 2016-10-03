package com.sweetzpot.stravazpot.activity.api;

import com.sweetzpot.stravazpot.activity.request.CreateActivityRequest;
import com.sweetzpot.stravazpot.activity.rest.ActivityRest;
import com.sweetzpot.stravazpot.common.api.StravaAPI;
import com.sweetzpot.stravazpot.common.api.StravaConfig;

public class ActivityAPI extends StravaAPI {

    public ActivityAPI(StravaConfig config) {
        super(config);
    }

    public CreateActivityRequest createActivity(String name) {
        return new CreateActivityRequest(name, getAPI(ActivityRest.class), this);
    }
}
