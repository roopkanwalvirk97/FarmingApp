package com.demo.weatherforecast.ui;

import android.graphics.Bitmap;

import com.demo.weatherforecast.model.WeatherData;

public interface MainFragmentView {

    void showProgress();
    void hideProgress();
    void checkSharedPrefs();
    void updateViews(WeatherData weatherData);
    void setImage(Bitmap responseObject);
}
