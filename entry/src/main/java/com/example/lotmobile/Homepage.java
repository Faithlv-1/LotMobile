package com.example.lotmobile;

import com.example.lotmobile.slice.HomepageSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Homepage extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(HomepageSlice.class.getName());
    }
}
