package uz.ithelp.geometriya;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    Toolbar toolbar;
    RecyclerView recyclerView;
    List<ModelRcycler> modelRcyclers = new ArrayList<>();
    TextView textViewSelectedChapterName;

    int getChemgeItemPosition;

    ConstraintLayout constraintLayout;
    UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        Intent intent = getIntent();

        // ruyhatni eloni va sozlanmasi
        recyclerView = findViewById(R.id.recyclerView1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));



        // tool bar sozlanmasi
        toolbar = findViewById(R.id.toolBAr);
        this.setSupportActionBar(toolbar);
        this.getSupportActionBar().setTitle("");

        // tanlangan chapter nomini activity2 da sarlavhaga yozish
        textViewSelectedChapterName = findViewById(R.id.textViewSelectedChapterName);


        getChemgeItemPosition = intent.getIntExtra("swimmers",1);


        //backround uchun liner layoutni aniqlash
        constraintLayout = findViewById(R.id.constraintLayout1);
        constraintLayout.setBackgroundColor(getResources().getColor(androidx.cardview.R.color.cardview_dark_background));

        switch (getChemgeItemPosition){
            case 1: {

                textViewSelectedChapterName.setText("I bap. HTML5 hám CSS3 járdeminde betlikler jaratıw");

                modelRcyclers.add(new ModelRcycler("1.1. HTML5 járdeminde betlikler jaratıw ","file:///android_asset/1-1.htm"));
                modelRcyclers.add(new ModelRcycler("1.2. CSS3(Cascading Style Sheets) tiykarları ","file:///android_asset/1-2.htm"));
                modelRcyclers.add(new ModelRcycler("1.3.\tCSS Sin-taksisi","file:///android_asset/1-3.htm"));
                modelRcyclers.add(new ModelRcycler("1.4.\tCSSda selektorlar","file:///android_asset/1-4.htm"));
                modelRcyclers.add(new ModelRcycler("1.5.\tCSSda reńler","file:///android_asset/1-5.htm"));
                modelRcyclers.add(new ModelRcycler("1.6.\tMiyras alıw","file:///android_asset/1-6.htm"));
                modelRcyclers.add(new ModelRcycler("1.7.\tBootstrap framework","file:///android_asset/1-7.htm"));


//                    ranglarni to'g'irlash kerka



            }break;


        }

        userAdapter  = new UserAdapter(modelRcyclers,  this);
        recyclerView.setAdapter(userAdapter);
    }

    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_view);

        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setMaxWidth(Integer.MAX_VALUE);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                userAdapter.getFilter().filter(newText);
                return true;
            }
        });
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id   = item.getItemId();
        if (id == R.id.search_view) return true;
        return super.onOptionsItemSelected(item);
    }

//    @Override
//    public void selectedUser(ModelRcycler modelRcycler) {
//        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
//    }

}