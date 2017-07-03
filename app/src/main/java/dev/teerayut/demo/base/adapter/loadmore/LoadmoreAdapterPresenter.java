package dev.teerayut.demo.base.adapter.loadmore;

import java.util.List;

import dev.teerayut.demo.base.adapter.BaseItem;
import dev.teerayut.demo.base.adapter.BaseItemType;
import dev.teerayut.demo.base.adapter.BaseMvpListAdapterPresenter;
import dev.teerayut.demo.base.adapter.progress.ProgressItem;


/**
 * Created by TheKhaeng on 12/18/2016.
 */

public abstract class LoadmoreAdapterPresenter<A extends LoadmoreAdapterInterface.Adapter>
        extends BaseMvpListAdapterPresenter<A> implements LoadmoreAdapterInterface.Presenter<A>{

    private boolean isNextItemAvailable;


    @Override
    public int getItemViewType( int pos ){
        if( pos >= super.getItemCount() ){
            return BaseItemType.TYPE_PROGRESS;
        }
        return super.getItemViewType( pos );
    }

    @Override
    public int getItemCount(){
        int count = super.getItemCount();
        if( isNextItemAvailable ){
            count++;
        }
        return count;
    }


    @Override
    public BaseItem getItem(int pos ){
        if( pos >= super.getItemCount() ){
            return new ProgressItem();
        }
        return super.getItem( pos );
    }

    @Override
    public void setItems(List<BaseItem> items, boolean isNextItemAvailable ){
        super.setItems( items );
        this.isNextItemAvailable = isNextItemAvailable;
    }
}
