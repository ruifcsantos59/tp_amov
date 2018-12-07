package pt.a21260411a21260403isec.tp_amov;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class onePlayer extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_player);

        GridView gridView = (GridView) findViewById(R.id.tabuleiro);
        gridView.setAdapter(new ImageAdapter(this));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(onePlayer.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

        }


    public class ImageAdapter extends BaseAdapter {
        private Context mContext;

        public ImageAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return mThumbIds.length;
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                // if it's not recycled, initialize some attributes
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(125, 125));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(0, 0, 0, 0);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource(mThumbIds[position]);
            return imageView;
        }

        // references to our images
        private Integer[] mThumbIds = {
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,

                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,

                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,

                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,

                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,

                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,

                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,
                R.drawable.sample_1, R.drawable.sample,

                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1,
                R.drawable.sample, R.drawable.sample_1
        };
    }





}




