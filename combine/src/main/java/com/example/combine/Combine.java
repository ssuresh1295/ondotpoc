package com.example.combine;


import android.widget.ImageView;
import com.example.maths.ArithMetic;
import com.squareup.picasso.Picasso;

public class Combine {

    public float getValue(){

        return new ArithMetic().add(5f, 6f);
    }

    public void setImage(ImageView imageView){
        Picasso.get()
                .load("http://rohd7stg.prod.acquia-sites.com/sites/default/files/styles/icymi_image_400x200_/public/maxresdefault_33.jpg")
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(imageView);

    }
}
