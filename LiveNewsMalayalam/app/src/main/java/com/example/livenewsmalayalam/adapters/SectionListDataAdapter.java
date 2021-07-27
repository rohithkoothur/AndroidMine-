package com.example.livenewsmalayalam.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;


import com.example.livenewsmalayalam.AajActivity;
import com.example.livenewsmalayalam.AsianetActivity;
import com.example.livenewsmalayalam.HindiNewsActivity;
import com.example.livenewsmalayalam.IndiaTVActivity;
import com.example.livenewsmalayalam.IndiaTodayActivity;
import com.example.livenewsmalayalam.JanamNewsActivity;
import com.example.livenewsmalayalam.KairaliActivity;
import com.example.livenewsmalayalam.MainActivity;
import com.example.livenewsmalayalam.MainActivity2;
import com.example.livenewsmalayalam.MalayalamNewsActivity;
import com.example.livenewsmalayalam.NDTVActivity;
import com.example.livenewsmalayalam.NationalNewsEnglishActivity;
import com.example.livenewsmalayalam.News24Activity;
import com.example.livenewsmalayalam.R;
import com.example.livenewsmalayalam.RepublicActivity;
import com.example.livenewsmalayalam.TamilNewsActivity;
import com.example.livenewsmalayalam.models.SingleItemModel;

import java.util.ArrayList;


public class SectionListDataAdapter extends RecyclerView.Adapter<SectionListDataAdapter.SingleItemRowHolder> {

    private ArrayList<SingleItemModel> itemsList;
    private Context mContext;
    String newtitle;

    public SectionListDataAdapter(Context context, ArrayList<SingleItemModel> itemsList) {
        this.itemsList = itemsList;
        this.mContext = context;
    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_single_card, null);
        SingleItemRowHolder mh = new SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder, int i) {

        SingleItemModel singleItem = itemsList.get(i);

        holder.tvTitle.setText(singleItem.getName());
        holder.itemImage.setImageResource(singleItem.getImageResource());
        holder.activitystring.setText(singleItem.getActivityname());




       /* Glide.with(mContext)
                .load(feedItem.getImageURL())
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .error(R.drawable.bg)
                .into(feedListRowHolder.thumbView);*/
    }

    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView tvTitle;

        protected ImageView itemImage;

        protected TextView activitystring;


        public SingleItemRowHolder(View view) {
            super(view);

            this.tvTitle = (TextView) view.findViewById(R.id.tvTitle);
            this.itemImage = (ImageView) view.findViewById(R.id.itemImage);
            this.activitystring = (TextView) view.findViewById(R.id.activityid);


            view.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                   newtitle = (String) tvTitle.getText();
                   if(tvTitle.getText()=="Mathruboomi"  ){

                    Intent intent = new Intent(mContext, MalayalamNewsActivity.class);
                    intent.putExtra("tvTitletest",newtitle);
                    mContext.startActivity(intent);

                   }
                    if(tvTitle.getText()=="Janam"){

                        Intent intent = new Intent(mContext, MalayalamNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }

                    if(tvTitle.getText()=="24News"){

                        Intent intent = new Intent(mContext, News24Activity.class);
                        mContext.startActivity(intent);

                    }

                    if(tvTitle.getText()=="Asianet News"){

                        Intent intent = new Intent(mContext, MalayalamNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Kairali News"){

                        Intent intent = new Intent(mContext, MalayalamNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Republic"){

                        Intent intent = new Intent(mContext, HindiNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Aaj Tak"){

                        Intent intent = new Intent(mContext, HindiNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="NDTV"){

                        Intent intent = new Intent(mContext, HindiNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="India TV"){

                        Intent intent = new Intent(mContext, HindiNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="India Today"){

                        Intent intent = new Intent(mContext, HindiNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Republic ENG"){

                        Intent intent = new Intent(mContext, NationalNewsEnglishActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="CNN18"){

                        Intent intent = new Intent(mContext, NationalNewsEnglishActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="NDTV 24x7"){

                        Intent intent = new Intent(mContext, NationalNewsEnglishActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="News X"){

                        Intent intent = new Intent(mContext, NationalNewsEnglishActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Sun News"){

                        Intent intent = new Intent(mContext, TamilNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Puthiyathalaimurai"){

                        Intent intent = new Intent(mContext, TamilNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Polimer News"){

                        Intent intent = new Intent(mContext, TamilNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="News18 Tamil"){

                        Intent intent = new Intent(mContext, TamilNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }
                    if(tvTitle.getText()=="Jaya Plus"){

                        Intent intent = new Intent(mContext, TamilNewsActivity.class);
                        intent.putExtra("tvTitletest",newtitle);
                        mContext.startActivity(intent);

                    }





                    Toast.makeText(v.getContext(), tvTitle.getText(), Toast.LENGTH_SHORT).show();

                }
            });


        }

    }

}

