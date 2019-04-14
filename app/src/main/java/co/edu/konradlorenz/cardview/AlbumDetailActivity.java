package co.edu.konradlorenz.cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlbumDetailActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CancionAdapter adapter;
    private List<Cancion> cancionList;
    private List<String> trueRomance=new ArrayList<>();
    private List<String> xscpae=new ArrayList<>();
    private List<String> maroon5=new ArrayList<>();
    private List<String> bornToDie=new ArrayList<>();
    private List<String> honeyMoon=new ArrayList<>();
    private List<String> iNeedADoctor=new ArrayList<>();
    private List<String> loud=new ArrayList<>();
    private List<String> legend=new ArrayList<>();
    private List<String> hello=new ArrayList<>();
    private List<String> greatestHits=new ArrayList<>();
    private List<String> lungs=new ArrayList<>();
    private List<String> ceremonials=new ArrayList<>();
    private List<String> melodrama=new ArrayList<>();



    private Map<String, List<String>> albumes = new HashMap<String, List<String>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_detail);

        Bundle extras = getIntent().getExtras();

        ImageView image = (ImageView) findViewById(R.id.albumPortada);
        image.setImageResource(extras.getInt("cover"));

        recyclerView = (RecyclerView) findViewById(R.id.recycler_canciones);
        cancionList = new ArrayList<>();
        adapter = new CancionAdapter(this, cancionList);


        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this, 1);
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(adapter);
        llenarArreglos();
        prepareCanciones(extras.getString("nombre"),extras.getInt("cover"));


    }

    private void prepareCanciones(String nombreAlbum, int imagen){


        List<String> albumActual= albumes.get(nombreAlbum);
        String nombreArtista=nombreArtista(nombreAlbum);
        for (String nombreCancion:albumActual
             ) {
            Cancion cancion = new Cancion(nombreCancion,nombreArtista,"3:40",imagen);
            cancionList.add(cancion);
        }


        adapter.notifyDataSetChanged();

    }

    public void llenarArreglos(){
        trueRomance.add("Nuclear seasons");
        trueRomance.add("You (Ha Ha Ha");
        trueRomance.add("Take my hand");
        trueRomance.add("Stay away");
        trueRomance.add("Set me free");
        trueRomance.add("Grins");
        trueRomance.add("So far away");
        trueRomance.add("Cloud aura");
        trueRomance.add("What I like");
        trueRomance.add("Black roses");
        trueRomance.add("You're the one");
        trueRomance.add("How can I");
        trueRomance.add("Lock you up");
        albumes.put("True Romance",trueRomance);
        xscpae.add("Love never felt so good");
        xscpae.add("Chicago");
        xscpae.add("Loving you");
        xscpae.add("A place with no name");
        xscpae.add("Slave to the Rythm");
        xscpae.add("Blue Gangsta");
        xscpae.add("Xscape");
        xscpae.add("Do you know where you children are");
        albumes.put("Xscpae",xscpae);
        maroon5.add("Moves like jagger");
        maroon5.add("Girls like you");
        maroon5.add("Sugar");
        maroon5.add("She will be loved");
        maroon5.add("One more night");
        maroon5.add("Payphone");
        maroon5.add("This love");
        maroon5.add("Maps");
        maroon5.add("Animals");
        maroon5.add("Misery");
        maroon5.add("Lips on you");
        albumes.put("Maroon 5",maroon5);
        bornToDie.add("Off to the races");
        bornToDie.add("Blue jeans");
        bornToDie.add("Videogames");
        bornToDie.add("Diet mountain diew");
        bornToDie.add("Nathional Athem");
        bornToDie.add("Dark paradise");
        bornToDie.add("Radio");
        bornToDie.add("Carmen");
        bornToDie.add("Million Dollar man");
        bornToDie.add("Summertime sadness");
        bornToDie.add("This is what makes us girls");
        albumes.put("Born to Die",bornToDie);
        iNeedADoctor.add("I Need a doctor");
        albumes.put("I Need a Doctor",iNeedADoctor);
        loud.add("S&M");
        loud.add("What's my name");
        loud.add("Chears");
        loud.add("Fading");
        loud.add("Only Girl");
        loud.add("California king bed");
        loud.add("Man down");
        loud.add("Raining men");
        loud.add("Complicated");
        loud.add("Skin");
        loud.add("Love the way you lied PT 2");
        albumes.put("Loud",loud);
        legend.add("Is this love");
        legend.add("No woman no cry");
        legend.add("Could you be love");
        legend.add("Three little birds");
        legend.add("Buffalo Soldier");
        legend.add("Get up stand up");
        legend.add("Stir it up");
        legend.add("One love/ People get ready");
        legend.add("I shot the sherif");
        legend.add("Waiting in vain");
        legend.add("Redention song");
        legend.add("Satisface my soul");
        legend.add("Exodus");
        legend.add("Jamming");
        albumes.put("Legend",legend);
        hello.add("Hello");
        hello.add("Send my love (To your new love)");
        hello.add("I miss you");
        hello.add("When we were young");
        hello.add("Remedy");
        hello.add("water under the bridge");
        hello.add("River lea");
        hello.add("Love in the dark");
        hello.add("Million years ago");
        hello.add("All I ask");
        hello.add("Sweetest devotion");
        albumes.put("Hello",hello);
        greatestHits.add("Bailamos");
        greatestHits.add("Away");
        greatestHits.add("Hero");
        greatestHits.add("Be with you");
        greatestHits.add("Takin' back my love");
        greatestHits.add("Rhytm divine");
        greatestHits.add("Do you know ? (The Ping Pong song)");
        greatestHits.add("Tired being sorry");
        greatestHits.add("Scape");
        greatestHits.add("Cool I have this kiss forever");
        greatestHits.add("Not in love");
        greatestHits.add("Don't turn off the lights");
        greatestHits.add("Love to see you cry");
        greatestHits.add("Maybe");
        greatestHits.add("Addicted");
        greatestHits.add("Somebody it's me");
        greatestHits.add("Can you hear me");
        albumes.put("Greatest Hits",greatestHits);
        lungs.add("Dog days are over");
        lungs.add("Rabbit hearth");
        lungs.add("I'm not calling you a liar");
        lungs.add("Howl");
        lungs.add("Kiss with a firts");
        lungs.add("Girl with one eye");
        lungs.add("Drumming song");
        lungs.add("Between two lungs");
        lungs.add("Cosmic love");
        lungs.add("My boy builds coffins");
        lungs.add("Hurricane drunk");
        lungs.add("Blinding");
        lungs.add("You've got the love");
        albumes.put("Lungs",lungs);
        ceremonials.add("Only if for a night");
        ceremonials.add("Shake it out");
        ceremonials.add("What the water gave me");
        ceremonials.add("Never let me go");
        ceremonials.add("Breaking down");
        ceremonials.add("Lover to lover");
        ceremonials.add("No light no light");
        ceremonials.add("Seven devils");
        ceremonials.add("Hearthlines");
        ceremonials.add("Spectrum");
        ceremonials.add("Leave my body");
        ceremonials.add("Remain nameless");
        ceremonials.add("Strangeness and charm");
        ceremonials.add("Bedroom hymns");
        albumes.put("Ceremonials",ceremonials);
        melodrama.add("Green Light");
        melodrama.add("Sober");
        melodrama.add("Homemade dynamite");
        melodrama.add("The louvre");
        melodrama.add("Liability");
        melodrama.add("Hard feelings");
        melodrama.add("Sober II");
        melodrama.add("Writer in the dark");
        melodrama.add("Super cut");
        melodrama.add("Liability(Reprise)");
        melodrama.add("Perfect places");
        albumes.put("Melodrama",melodrama);
        honeyMoon.add("Honeymoon");
        honeyMoon.add("Music to watch boys to");
        honeyMoon.add("Terrence loves you");
        honeyMoon.add("God knows I tried");
        honeyMoon.add("High by the beach");
        honeyMoon.add("Freak");
        honeyMoon.add("Art deco");
        honeyMoon.add("Burnt Norton interlude");
        honeyMoon.add("Religion");
        honeyMoon.add("Salvatore");
        honeyMoon.add("The blackest day");
        honeyMoon.add("24");
        honeyMoon.add("Swan song");
        honeyMoon.add("Don't let me misunderstood");
        albumes.put("Honeymoon",honeyMoon);






































    }

    public String nombreArtista(String nombreAlbum){
        if(nombreAlbum.equals("True Romance")){
            return "Charli XCX";
        }else if(nombreAlbum.equals("Xscpae")){
            return "Michael Jackson";
        }else if(nombreAlbum.equals("Maroon 5")){
            return "Maroon 5";
        }else if(nombreAlbum.equals("Born to Die")){
            return "Lana del rey";
        }else if(nombreAlbum.equals("Honeymoon")){
            return "Lana del rey";
        }else if(nombreAlbum.equals("I Need a Doctor")){
            return "Eminen";
        }else if(nombreAlbum.equals("Loud")){
            return "Rihanna";
        }else if(nombreAlbum.equals("Legend")){
            return "Bob Marley";
        }else if(nombreAlbum.equals("Hello")){
            return "Adele";
        }else if(nombreAlbum.equals("Greatest Hits")){
            return "Enrique Iglesias";
        }else if(nombreAlbum.equals("Lungs")){
            return "Florence and the Machine";
        }else if(nombreAlbum.equals("Ceremonials")){
            return "Florence and the Machine";
        }else if(nombreAlbum.equals("Melodrama")){
            return "Lorde";
        }else{
            return "No se encuentra";
        }
    }

    }

