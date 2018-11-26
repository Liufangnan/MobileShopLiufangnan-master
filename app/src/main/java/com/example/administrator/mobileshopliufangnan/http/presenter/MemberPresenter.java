package com.example.administrator.mobileshopliufangnan.http.presenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.mobileshopliufangnan.entity.MemberEntitylfn;
import com.example.administrator.mobileshopliufangnan.http.HttpMethods;

import rx.Observable;
import rx.Subscriber;

public class MemberPresenter extends HttpMethods {

    public static void register(Subscriber<MemberEntitylfn> subscriber,String username,String email,String password){
        Observable observable = memberService.register(username,password,email)
                .map(new HttpResultFunc<MemberEntitylfn>());
        toSubscribe(observable,subscriber);
    }
    public static void login(Subscriber<MemberEntitylfn>subscriber,String username,String password){
        Observable observable = memberService.login(username,password)
                .map(new HttpResultFunc<MemberEntitylfn>());
        toSubscribe(observable,subscriber);
    }
}
