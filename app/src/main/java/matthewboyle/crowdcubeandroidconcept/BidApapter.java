package matthewboyle.crowdcubeandroidconcept;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapProgressBar;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

import matthewboyle.crowdcubeandroidconcept.domain.Bid;

import static java.lang.Math.toIntExact;

/**
 * Created by matthewboyle on 07/06/2017.
 */

public class BidApapter extends RecyclerView.Adapter<BidApapter.BidViewHolder>{

    private List<Bid> bidList;

    public BidApapter(List<Bid> bidList){
        this.bidList = bidList;

    }

    @Override
    public BidViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.funding_card, viewGroup, false);
        BidViewHolder vh = new BidViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(BidViewHolder holder, int position) {
        Bid currentBid = bidList.get(position);

        NumberFormat n = NumberFormat.getCurrencyInstance(Locale.UK);
        String targetInFormat = n.format(currentBid.getTarget());
        String raisedInFromat = n.format(currentBid.getRaised()/100);
        holder.company.setText(currentBid.getCompany());
        holder.copy.setText(currentBid.getCopy());
        holder.daysLeft.setText("Days Left: "+currentBid.getDaysLeft());
        holder.raised.setText(raisedInFromat+" Raised");
        holder.investors.setText(currentBid.getInvestors()+ " Investors");
        holder.target.setText(targetInFormat+ " Target");
        holder.equity.setText(currentBid.getEquity()+ "% Equity");
        holder.backgroundImage.setImageResource(currentBid.getBackgroundImage());
        holder.companyLogo.setImageResource(currentBid.getCompanyLogo());
        holder.cv.setOnClickListener(new MattsOnClickListener(currentBid));

        double percentage =  ((double)(currentBid.getRaised())/(double)currentBid.getTarget()) *100 ;
        holder.progress.setProgress((int)percentage);

    }



    @Override
    public int getItemCount() {
        return bidList.size();
    }

    public static class BidViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView company,copy,daysLeft,raised,investors,target,equity;
        ImageView backgroundImage,companyLogo;
        BootstrapProgressBar progress;

        BidViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            company = (TextView)itemView.findViewById(R.id.company);
            copy = (TextView)itemView.findViewById(R.id.copy);
            daysLeft = (TextView)itemView.findViewById(R.id.days_left);
            raised = (TextView)itemView.findViewById(R.id.raised);
            investors = (TextView)itemView.findViewById(R.id.investors);
            target = (TextView)itemView.findViewById(R.id.target);
            equity = (TextView)itemView.findViewById(R.id.equity);
            backgroundImage = (ImageView) itemView.findViewById(R.id.background_image);
            companyLogo = (ImageView) itemView.findViewById(R.id.company_logo);
            progress = (BootstrapProgressBar) itemView.findViewById(R.id.progress_bar);








        }
    }

}