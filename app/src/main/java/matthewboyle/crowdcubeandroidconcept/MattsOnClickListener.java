package matthewboyle.crowdcubeandroidconcept;

import android.app.Dialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.beardedhen.androidbootstrap.BootstrapButton;

import org.w3c.dom.Text;

import matthewboyle.crowdcubeandroidconcept.domain.Bid;

/**
 * Created by matthewboyle on 07/06/2017.
 */

public class MattsOnClickListener implements View.OnClickListener {


    private Bid b;

    public MattsOnClickListener(Bid b){
        this.b = b;

    }

    @Override
    public void onClick(View v) {
        // custom dialog
        final Dialog dialog = new Dialog(v.getContext());
        dialog.setContentView(R.layout.invest_dialog);


        BootstrapButton dialogButton = (BootstrapButton) dialog.findViewById(R.id.button_pay);
        ImageView popup_image_view = (ImageView) dialog.findViewById(R.id.popup_image_view);
        popup_image_view.setImageResource(b.getCompanyLogo());
        TextView companyName = (TextView) dialog.findViewById(R.id.company_name_popup);
        companyName.setText(b.getCompany());
        // if button is clicked, close the custom dialog
        dialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(dialog.getContext(),"Thank you for your investment!",Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });

        dialog.show();


    }
}
