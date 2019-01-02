package com.example.nadyarossy.playerlist;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.MySSLSocketFactory;
import com.loopj.android.http.SyncHttpClient;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import cz.msebera.android.httpclient.Header;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.rvCatagory)
    RecyclerView rvCatagory;
    SoccerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        adapter = new SoccerAdapter(this);
        String url = "https://www.thesportsdb.com/api/v1/json/1/lookup_all_players.php?id=133604";
        DemoAsync demoAsync = new DemoAsync();
        demoAsync.execute(url);
    }
    private class DemoAsync extends AsyncTask<String, Void, ArrayList<Soccer>> {
        @Override
        protected ArrayList<Soccer> doInBackground(String... strings) {
            String uri = strings[0];
            final ArrayList<Soccer> soccers = new ArrayList<>();
            SyncHttpClient client = new SyncHttpClient();
            client.setSSLSocketFactory(MySSLSocketFactory.getFixedSocketFactory());
            client.get(uri, new AsyncHttpResponseHandler() {
                @Override
                public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                    try {
                        String hasil = new String(responseBody);
                        JSONObject jsonPlayer = new JSONObject(hasil);
                        JSONArray jsonArray = jsonPlayer.getJSONArray("player");
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject soccerObj = jsonArray.getJSONObject(i);
                            Soccer soccer = new Soccer(soccerObj);
                            soccers.add(soccer);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                @Override
                public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {
                    Log.d("Tag", "onFailure" + statusCode);
                }
            });
            return soccers;
        }

        @Override
        protected void onPostExecute(ArrayList<Soccer> soccer){
            super.onPostExecute(soccer);
            rvCatagory.setLayoutManager(new LinearLayoutManager(MainActivity.this));
            adapter.setListSoccer(soccer);
            rvCatagory.setAdapter(adapter);
        }
    }
}
