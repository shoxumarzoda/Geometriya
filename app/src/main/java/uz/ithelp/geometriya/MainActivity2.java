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

public class MainActivity2 extends AppCompatActivity implements UserAdapter.SelectedUser {

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
        constraintLayout.setBackgroundColor(getResources().getColor(R.color.mycolor));

        switch (getChemgeItemPosition){
            case 1: {

                textViewSelectedChapterName.setText("I bob. Sirkul va chizg’ich yordamida yasaladigan masalalarw");

                modelRcyclers.add(new ModelRcycler("1.1-§.Sirkul va chizg’ich yordamida yasashga doir masalalar haqida tushuncha va  yasash postulatlari","file:///android_asset/1.1.htm"));
                modelRcyclers.add(new ModelRcycler("1.2-§. Bevosita yechiladigan masalalar ","file:///android_asset/1.2.htm"));
                modelRcyclers.add(new ModelRcycler("1.3-§. Nuqta, kesma, to`g`ri chiziq va burchaklar yasashga doir masalalar","file:///android_asset/1.3.htm"));
                modelRcyclers.add(new ModelRcycler("1.4-§. Yasashga doir masalalar yechishdagi bosqichlar","file:///android_asset/1.4.htm"));

            }break;
            case 2: {

                textViewSelectedChapterName.setText("II bob. Sirkul va chizg’ich yordamida yasash metodlari");

                modelRcyclers.add(new ModelRcycler("2.1-§.Geometrik o`rinlar metodi va unga doir masalalar","file:///android_asset/2.1.htm"));
                modelRcyclers.add(new ModelRcycler("2.2-§. To`g`rilash metodi va unga doir masalalar","file:///android_asset/2.2.htm"));
                modelRcyclers.add(new ModelRcycler("2.3-§.Geometrik almashtirishlar metodi","file:///android_asset/2.3.htm"));
                modelRcyclers.add(new ModelRcycler("2.3.1. O`q simmetriya metodiga doir masalalar","file:///android_asset/2.3.1.htm"));
                modelRcyclers.add(new ModelRcycler("2.3.2.Parallel ko`chirish metodiga doir masalalar","file:///android_asset/2.3.2.htm"));
                modelRcyclers.add(new ModelRcycler("2.3.3.Nuqta atrofida aylantirish (burish) metodiga doir masalalar","file:///android_asset/2.3.3.htm"));
                modelRcyclers.add(new ModelRcycler("2.3.4.Gomotetiya metodiga doir masalalar","file:///android_asset/2.3.4.htm"));
                modelRcyclers.add(new ModelRcycler("2.3.5.O`xshash almashtirish metodi va unga doir masalalar","file:///android_asset/2.3.5.htm"));
                modelRcyclers.add(new ModelRcycler("2.4-§.Inversiya metodiga doir savol va masalalar","file:///android_asset/2.4.htm"));
                modelRcyclers.add(new ModelRcycler("2.5-§.Algebraik metodiga doir savol va masalalar","file:///android_asset/2.5.htm"));

            }break;

            case 3: {

                textViewSelectedChapterName.setText("III bob. Sirkul va chizg’ich yordamida yechiladigan  va yechilmaydigan masalalar");

                modelRcyclers.add(new ModelRcycler("3.1-§.   Sirkul va chizg’ich yordamida yechiladigan yasashga doir masalalar kriteriyasi","file:///android_asset/3.1.htm"));
                modelRcyclers.add(new ModelRcycler("3.2-§.Sirkul va chizg’ich yordamida yechilmaydigan yasashga doir ba`zi masal","file:///android_asset/3.2.htm"));

            }break;
            case 4: {

                textViewSelectedChapterName.setText("IV bob. Sodda geometrik figuralarni yasashga doir masalalar");

                modelRcyclers.add(new ModelRcycler("4.1-§. Uchburchak yasashga doir masalalar","file:///android_asset/4.1.htm"));
                modelRcyclers.add(new ModelRcycler("4.2-§. To`rtburchak yasashga doir masalalar","file:///android_asset/4.2.htm"));
                modelRcyclers.add(new ModelRcycler("4.3-§. Trapetsiya yasashga doir masalalar","file:///android_asset/4.3.htm"));
                modelRcyclers.add(new ModelRcycler("4.4-§. Parallelogramm yasashga doir masalalar","file:///android_asset/4.4.htm"));
                modelRcyclers.add(new ModelRcycler("4.5-§. Ko`pburchak yasashga doir masalalar","file:///android_asset/4.5.htm"));
                modelRcyclers.add(new ModelRcycler("4.6-§. Mustaqil yechishga doir ba’zi aralash masalalar","file:///android_asset/4.6.htm"));

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


    @Override
    public void selectedUser(ModelRcycler modelRcycler) {
        startActivity(new Intent(MainActivity2.this, MainActivity3.class).putExtra("data",modelRcycler.getLoadUrl()));
    }

}