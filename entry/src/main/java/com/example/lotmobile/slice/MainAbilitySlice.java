package com.example.lotmobile.slice;

import com.example.lotmobile.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class MainAbilitySlice extends AbilitySlice implements Component.ClickedListener {
    Button login;
    Button enroll;
    Button forget_password;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        //三个按钮
        //获取id
        login=(Button)findComponentById(ResourceTable.Id_login);
        enroll=(Button)findComponentById(ResourceTable.Id_enroll);
        forget_password=(Button)findComponentById(ResourceTable.Id_forget_password);
        //绑定事件
        login.setClickedListener(this);
        enroll.setClickedListener(this);
        forget_password.setClickedListener(this);

    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    public void onClick(Component component) {
        //登录按钮
        if(component==login){
            //跳转登录界面
            //创建意图对象
            Intent to_homepage=new Intent();
            //创建意图的参数对象
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")  //跳转的机型，空为本机
                    .withBundleName("com.example.lotmobile")  //跳转的应用
                    .withAbilityName("com.example.lotmobile.Homepage")   //跳转的界面
                    .build();
            to_homepage.setOperation(operation);
            startAbility(to_homepage);
        }
        //注册按钮
        else if (component==enroll){
            //跳转登录界面
            //创建意图对象
            Intent to_enroll=new Intent();
            //创建意图的参数对象
            Operation operation = new Intent.OperationBuilder()
                    .withDeviceId("")  //跳转的机型，空为本机
                    .withBundleName("com.example.lotmobile")  //跳转的应用
                    .withAbilityName("com.example.lotmobile.EnrollAbility")   //跳转的界面
                    .build();
            to_enroll.setOperation(operation);
            startAbility(to_enroll);
        }
        //忘记密码按钮
        else if(component==forget_password){
            //跳转登录界面
            //创建意图对象
            Intent to_login=new Intent();
            //创建意图的参数对象
            new Intent.OperationBuilder()
                    .withDeviceId("")  //跳转的机型，空为本机
                    .withBundleName("com.example.lotmobile")  //跳转的应用
                    .withAbilityName("")   //跳转的界面
                    .build();
        }

    }
}
