package com.co.metro.cuadrado.web.userinterface;

public enum UrlInicioWeb {

    UrlInicio("https://www.metrocuadrado.com/");

    private final String url;


    UrlInicioWeb(String url) {
        this.url = url;
    }

    public String Url() {

        return url;
    }
}
