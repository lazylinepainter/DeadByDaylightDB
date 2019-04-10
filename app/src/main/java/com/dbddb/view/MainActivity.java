package com.dbddb.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.dbddb.R;
import com.dbddb.model.dbdChildrenVO;
import com.dbddb.model.dbdVO;
import com.dbddb.viewmodel.API;
import com.dbddb.viewmodel.SubredditAdapter;

import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

public class MainActivity extends AppCompatActivity {

    public dbdVO dbdVO;
    public List<dbdChildrenVO> dbdChildrenVOList;
    public RecyclerView rvSubreddit;
    public SwipeRefreshLayout swipeRefresh;
    private SubredditAdapter adapter;
    private String idNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initVar();
        buildJsonObject();
    }

    private void buildJsonObject() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        API api = retrofit.create(API.class);

        Call<dbdVO> call = api.getData();
        call.enqueue(new Callback<dbdVO>() {
            @Override
            public void onResponse(@NonNull Call<dbdVO> call, @NonNull Response<dbdVO> response) {
                dbdVO = response.body();
                if (dbdVO != null) {
                    dbdChildrenVOList = dbdVO.data.children;
                    idNextPage = dbdVO.data.after;
                    adapter = new SubredditAdapter(dbdChildrenVOList);
                    rvSubreddit.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(@NonNull Call<dbdVO> call, @NonNull Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initVar() {
        rvSubreddit = findViewById(R.id.rv_post);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvSubreddit.setLayoutManager(layoutManager);
        rvSubreddit.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (!rvSubreddit.canScrollVertically(1)) {
                    buildNextPageJson();
                }
            }
        });

        ImageButton ibConfig = findViewById(R.id.ib_configuracao);
        ibConfig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("lmao.");
            }
        });

        swipeRefresh = findViewById(R.id.sfl_refresh);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                adapter = new SubredditAdapter(dbdChildrenVOList);
                adapter.clear();
                buildJsonObject();
                swipeRefresh.setRefreshing(false);
            }
        });
    }

    private void buildNextPageJson() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API.BASE_URL)
                .client(client)
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        API api = retrofit.create(API.class);

        Call<dbdVO> call = api.getData(idNextPage);
        call.enqueue(new Callback<dbdVO>() {
            @Override
            public void onResponse(@NonNull Call<dbdVO> call, @NonNull Response<dbdVO> response) {
                dbdVO = response.body();
                if (dbdVO != null) {
                    dbdChildrenVOList = dbdVO.data.children;
                    idNextPage = dbdVO.data.after;
                    adapter.updateInfo(dbdChildrenVOList);
                }
            }

            @Override
            public void onFailure(@NonNull Call<dbdVO> call, @NonNull Throwable t) {
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
