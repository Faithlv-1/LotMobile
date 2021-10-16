package com.example.lotmobile;

import com.example.lotmobile.slice.EnrollAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class EnrollAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(EnrollAbilitySlice.class.getName());
    }
}
