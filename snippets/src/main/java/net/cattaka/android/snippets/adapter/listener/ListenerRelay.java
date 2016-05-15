package net.cattaka.android.snippets.adapter.listener;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by cattaka on 16/05/14.
 */
public class ListenerRelay<A extends RecyclerView.Adapter<? extends VH>, VH extends RecyclerView.ViewHolder> implements IListenerRelay<VH> {
    public void onItemClick(RecyclerView parent, A adapter, int position, int id, VH vh) {

    }

    public boolean onItemLongClick(RecyclerView parent, A adapter, int position, int id, View view, VH vh) {
        return false;
    }
}
