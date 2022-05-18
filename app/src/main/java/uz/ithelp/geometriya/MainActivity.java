package uz.ithelp.geometriya;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    ModelViewPagerAdapter modelViewPagerAdapter;

    List<ModelViewPager> modelViewPagerList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        modelViewPagerList = new ArrayList<>();
        initiali();

        modelViewPagerAdapter = new ModelViewPagerAdapter(modelViewPagerList,this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(modelViewPagerAdapter);
        viewPager.setPadding(130,0,130,0);

    }

    private void initiali() {


        modelViewPagerList.add(new ModelViewPager(R.drawable.book,"Kirish","Maktab o`quvchilarining, kollej va litsey ...","aasdasdasd"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.sirkul,"I bob. Sirkul va chizg’ich yordamida yasaladigan masalalar","Sirkul va chizg’ich...","aasdasdasd"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.sirkul2,"II bob. Sirkul va chizg’ich yordamida yasash metodlari ","Geometrik o`rinlar metodi...","aasdasdasd"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.sirkul3,"III bob. Sirkul va chizg’ich yordamida yechiladigan  va yechilmaydigan masalalar","masalalar kriteriyasi ...","aasdasdasd"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.sirkul4,"IV bob. Sodda geometrik figuralarni yasashga doir masalalar","Uchburchak yasashga doir masalalar...","aasdasdasd"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.book1,"Foydalanilgan adabiyotlar ro`yxati","1.\tR.K.Otajonov  “Geometrik yasash metodlari” Toshkent “O`qituvchi” – 1971. ...","aasdasdasd"));
        modelViewPagerList.add(new ModelViewPager(R.drawable.author,"Mualliflar","Shamshiyev A.,\nJo`rayev T. F.,\nTursunova Z. O.,\nG’iyosova Z. T.","adasdasd"));

    }
}