package com.github.pockethub.android.ui.item.code;

import android.support.annotation.NonNull;
import android.view.View;

import com.github.pockethub.android.R;
import com.github.pockethub.android.ui.item.BaseViewHolder;
import com.github.pockethub.android.ui.view.LinkTextView;
import com.xwray.groupie.Item;

import butterknife.BindView;

public class PathHeaderItem extends Item<PathHeaderItem.ViewHolder> {

    private CharSequence path;

    public PathHeaderItem(CharSequence path) {
        super(path.hashCode());
        this.path = path;
    }

    @Override
    public void bind(@NonNull ViewHolder viewHolder, int position) {
        viewHolder.path.setText(path);
    }

    @Override
    public int getLayout() {
        return R.layout.path_item;
    }

    @NonNull
    @Override
    public ViewHolder createViewHolder(@NonNull View itemView) {
        return new ViewHolder(itemView);
    }

    public class ViewHolder extends BaseViewHolder {
        @BindView(R.id.tv_path) LinkTextView path;

        public ViewHolder(@NonNull View rootView) {
            super(rootView);
        }
    }
}
