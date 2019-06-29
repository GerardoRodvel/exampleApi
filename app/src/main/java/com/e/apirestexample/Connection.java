package com.e.apirestexample;


public class Connection {
    private Connection(){}


    //cambiar ip
    public static String API_URL = "http://127.0.0.1:8000/api/";

    public static ReportService getServiceRemote(){

        return Client.getClient(API_URL).create(ReportService.class);
    }

    public static UsersService getServiceRemotee(){

        return Client.getClient(API_URL).create(UsersService.class);

    }


}
