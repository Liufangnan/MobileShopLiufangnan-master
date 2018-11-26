package com.example.administrator.mobileshopliufangnan.http.service;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.mobileshopliufangnan.entity.HttpREsult;
import com.example.administrator.mobileshopliufangnan.entity.MemberEntitylfn;
import com.example.administrator.mobileshopliufangnan.http.HttpMethods;


import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

public interface MemberService {

    @FormUrlEncoded
    @POST("member")
    Observable<HttpREsult<MemberEntitylfn>> register(
            @Field("uname") String uname,
            @Field("passeord") String passeword,
            @Field("email") String email
    );
    @FormUrlEncoded
    @POST("member/login")
    Observable <HttpREsult<MemberEntitylfn>> login(
            @Field("uname") String uname,
            @Field("password") String password
    );
}
