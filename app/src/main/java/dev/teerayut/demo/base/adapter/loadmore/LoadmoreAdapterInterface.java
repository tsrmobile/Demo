package dev.teerayut.demo.base.adapter.loadmore;

import java.util.List;

import dev.teerayut.demo.base.adapter.BaseItem;
import dev.teerayut.demo.base.adapter.BaseMvpListAdapterInterface;


/**
 * Created by TheKhaeng on 12/18/2016.
 */

public interface LoadmoreAdapterInterface{

    interface Adapter extends BaseMvpListAdapterInterface.Adapter{
    }

    interface Presenter<A extends LoadmoreAdapterInterface.Adapter>
            extends BaseMvpListAdapterInterface.Presenter<A>{
        void setItems(List<BaseItem> items, boolean isNextItemAvailable);
    }
}

