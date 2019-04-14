package co.edu.konradlorenz.cardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CancionAdapter extends RecyclerView.Adapter<CancionAdapter.MyViewHolder>  {

    private Context mContext;
    private List<Cancion> cancionList;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nombreCancion, duracion, artista;
        public ImageView smallcover;
        private View elementView;

        public MyViewHolder(View view) {
            super(view);
            nombreCancion = (TextView) view.findViewById(R.id.nombreCancion);
            duracion = (TextView) view.findViewById(R.id.duracion);
            artista = (TextView) view.findViewById(R.id.artista);
            smallcover = (ImageView) view.findViewById(R.id.coverMiniatura);
            elementView = view;
        }

        public void holi()
        {

        }
    }

    public CancionAdapter(Context mContext, List<Cancion> cancionList) {
        this.mContext = mContext;
        this.cancionList = cancionList;
    }

    @NonNull
    @Override
    public CancionAdapter.MyViewHolder  onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cancion, parent, false);

        return new MyViewHolder(itemView);    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Cancion cancion = cancionList.get(position);

        holder.holi();

        holder.nombreCancion.setText(cancion.getNombreCancion());
        holder.artista.setText(cancion.getNombreArtista());
        holder.duracion.setText(cancion.getDuracion());
        holder.smallcover.setImageResource(cancion.getCoverMiniatura());

    }

    @Override
    public int getItemCount() {
        return cancionList.size();
    }
}
