package com.example.workshopmicroservices.elkexamplespringboot;

import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Date;

// Controller Class
class ELKController {

    // initiate logger class


    // We gonna use the RestTemplate instance

    // restTemplate is a bean

    @RequestMapping(value = "/elkdemo")
    public String helloWorld() {
        String response = "Hello user ! " + new Date();
        //LOG.log(Level.INFO, "/elkdemo - > " + response);

        return response;
    }

    @RequestMapping(value = "/elk")
    public String helloWorld1() {

        // use exchange lib to get response from /elkdemo endpoint

        // user Logger to show info log


        // http exchange : get response from /exception endpoint

        // create log with level info

        return null;
    }

    @RequestMapping(value = "/exception")
    public String exception() {
        String rsp = "";
        try {
            int i = 1 / 0;
            // should get exception
        } catch (Exception e) {
            e.printStackTrace();
           // LOG.error(e);

            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            String sStackTrace = sw.toString(); // stack trace as a string
           // LOG.error("Exception As String :: - > " + sStackTrace);

            rsp = sStackTrace;
        }

        return rsp;
    }
}