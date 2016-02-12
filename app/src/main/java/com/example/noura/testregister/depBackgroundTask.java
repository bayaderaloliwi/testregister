package com.example.noura.testregister;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

/**
 * Created by Noura on 2/9/2016.
 */

public class depBackgroundTask extends AsyncTask<String,Void,String> {

    Context ctx;
    depBackgroundTask(Context ctx){

        this.ctx = ctx;
}
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(String... params) {
        String req_url = "http://10.0.2.2/webapp/depregister.php";
        /**login*/
        String method = params[0];
        if(method.equals("depregister"))
        {

            String id = params[1];
            String r_id= params[2];
            String name = params[3];
            String password = params[4];
            String email = params[5];
            String address = params[6];
            String relation = params[7];


            try {
                URL url = new URL(req_url);
                HttpURLConnection httpURLConnection =(HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                OutputStream OS= httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(OS,"UTF-8"));
                String data = URLEncoder.encode("ID", "UTF-8") +"=" + URLEncoder.encode(id, "UTF-8")+ "&" +
                        URLEncoder.encode("RID", "UTF-8") +"=" + URLEncoder.encode(r_id, "UTF-8")+ "&" +
                        URLEncoder.encode("name", "UTF-8") +"=" + URLEncoder.encode(name, "UTF-8")+ "&" +
                        URLEncoder.encode("password", "UTF-8") +"=" + URLEncoder.encode(password, "UTF-8")+ "&" +
                        URLEncoder.encode("email", "UTF-8") +"=" + URLEncoder.encode(email, "UTF-8")+ "&" +
                        URLEncoder.encode("address", "UTF-8") +"=" + URLEncoder.encode(address, "UTF-8")+
                        URLEncoder.encode("relation", "UTF-8") +"=" + URLEncoder.encode(relation, "UTF-8");

                bufferedWriter.write(data);
                bufferedWriter.flush();
                bufferedWriter.close();
                OS.close();
                InputStream IS = httpURLConnection.getInputStream();
                IS.close();
                return "Registration Success...";
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return null;
    }
    @Override
    protected void onProgressUpdate(Void... values) {
        super.onProgressUpdate(values);
    }

    @Override
    protected void onPostExecute(String result) {
        Toast.makeText(ctx, result, Toast.LENGTH_LONG).show();
    }
}
