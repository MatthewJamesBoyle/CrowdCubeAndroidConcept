package matthewboyle.crowdcubeandroidconcept;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;



import java.util.ArrayList;
import java.util.List;

import matthewboyle.crowdcubeandroidconcept.domain.Bid;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> al;
    private ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);
        rv.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        rv.setLayoutManager(llm);
        List<Bid> bidList =  createData();

        BidApapter adapter = new BidApapter(bidList);
        rv.setAdapter(adapter);

    }

    private List<Bid> createData(){
     ArrayList<Bid> temp   = new ArrayList<Bid>();

        int plansnapLogo = getResources().getIdentifier("@drawable/plansnap_logo", null, getPackageName());
        int plansnapBg = getResources().getIdentifier("@drawable/plansnaptopbar", null, getPackageName());
        Bid planSnap = new Bid("planSnap","Backed by AB InBev, PlanSnap is a social planning app that gets everyone to agree on the details of a plan in just a few taps – even if users’ friends don't have the app. The company generated its first pre-product, has partnered with Time Out Magazine and was part of the TechStars accelerator.",
                27,66360,69,250000,plansnapBg,plansnapLogo,7.69);

        int drfocusedLogo = getResources().getIdentifier("@drawable/drfocusedlogo", null, getPackageName());
        int drfocusedTop = getResources().getIdentifier("@drawable/drfocusedbackgroundtop", null, getPackageName());
        Bid drFocused = new Bid("drfocused","Drfocused makes software designed to help doctors complete their work faster than present alternatives. Their first product is a cloud-based HR SaaS for medical admin/rostering which has been launched with users across 75 hospitals.",
                25,71950,19,300000,drfocusedTop,drfocusedLogo,13.04);

        int powervaultLogo =  getResources().getIdentifier("@drawable/powervaultlogo", null, getPackageName());
        int powerLogoTop =  getResources().getIdentifier("@drawable/powervaulttop", null, getPackageName());

        Bid powerVault = new Bid("PowerVault","An innovative home battery system, Powervault allows customers to make smarter use of their energy, by harnessing freely-generated solar energy and off-peak electricity to power their home.Their vision is that Powervault will become as commonplace as a washing machine or dishwasher.",
                28,369490,127,750000,powerLogoTop,powervaultLogo,8.49);




        temp.add(planSnap);
        temp.add(drFocused);
        temp.add(powerVault);

        return temp;
    }

}
