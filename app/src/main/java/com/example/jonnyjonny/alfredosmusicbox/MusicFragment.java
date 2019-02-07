package com.example.jonnyjonny.alfredosmusicbox;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.VideoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MusicFragment extends Fragment {
    private ImageButton youTubeImageBtn;
    private ImageButton sCloudImageBtn;
    private Button gigBtn;
    private ImageButton fBookImageBtn;
    private ImageButton instaImageBtn;




    public MusicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_music, container, false);


        instaImageBtn=(ImageButton) view.findViewById(R.id.instaImageBtn);
        instaImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instaIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/alfredo_bass/"));
                startActivity(instaIntent);
            }
        });
        fBookImageBtn=(ImageButton) view.findViewById(R.id.fBookBtn);
        fBookImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fBookIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/Alfredo-Guerrieri-Music-40801367054/"));
                startActivity(fBookIntent);
            }
        });
        gigBtn=(Button) view.findViewById(R.id.gigBtn);
        gigBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gigIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.alfredosgroove.com/gigs"));
                startActivity(gigIntent);
            }
        });
        sCloudImageBtn=(ImageButton) view.findViewById(R.id.sCloudImageBtn);
        sCloudImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent audioIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://soundcloud.com/alfredobass"));
                startActivity(audioIntent);
            }
        });
        youTubeImageBtn=(ImageButton)view.findViewById(R.id.youTubeImageBtn);
        youTubeImageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://youtu.be/eKzjvIs1cv8"));
                startActivity(videoIntent);
            }
        });
        return view;



        // Inflate the layout for this fragment

    }

}
