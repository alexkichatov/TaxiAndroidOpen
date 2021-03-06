//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.opentaxi.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.opentaxi.models.RequestCView;
import com.stil.generated.mysql.tables.pojos.Cars;
import org.androidannotations.api.BackgroundExecutor;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class BubbleOverlay_
    extends BubbleOverlay
    implements HasViews
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();
    private Handler handler_ = new Handler(Looper.getMainLooper());

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
    }

    private void init_(Bundle savedInstanceState) {
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static BubbleOverlay_.IntentBuilder_ intent(Context context) {
        return new BubbleOverlay_.IntentBuilder_(context);
    }

    public static BubbleOverlay_.IntentBuilder_ intent(Fragment supportFragment) {
        return new BubbleOverlay_.IntentBuilder_(supportFragment);
    }

    @Override
    public void showRequests(final RequestCView requests) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                BubbleOverlay_.super.showRequests(requests);
            }

        }
        );
    }

    @Override
    public void showCarPosition(final Cars cars) {
        handler_.post(new Runnable() {


            @Override
            public void run() {
                BubbleOverlay_.super.showCarPosition(cars);
            }

        }
        );
    }

    @Override
    public void showMyRequests() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    BubbleOverlay_.super.showMyRequests();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void showCar(final String carsNumber) {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 0, "") {


            @Override
            public void execute() {
                try {
                    BubbleOverlay_.super.showCar(carsNumber);
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    @Override
    public void showMyRequestsDelayed() {
        BackgroundExecutor.execute(new BackgroundExecutor.Task("", 15000, "") {


            @Override
            public void execute() {
                try {
                    BubbleOverlay_.super.showMyRequestsDelayed();
                } catch (Throwable e) {
                    Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), e);
                }
            }

        }
        );
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<BubbleOverlay_.IntentBuilder_>
    {

        private Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, BubbleOverlay_.class);
        }

        public IntentBuilder_(Fragment fragment) {
            super(fragment.getActivity(), BubbleOverlay_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                super.startForResult(requestCode);
            }
        }

    }

}
