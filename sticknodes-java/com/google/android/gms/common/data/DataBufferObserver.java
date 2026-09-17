package com.google.android.gms.common.data;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes.dex */
public interface DataBufferObserver {

    /* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
    public interface Observable {
        void addObserver(com.google.android.gms.common.data.DataBufferObserver r1);

        void removeObserver(com.google.android.gms.common.data.DataBufferObserver r1);
    }

    void onDataChanged();

    void onDataRangeChanged(int r1, int r2);

    void onDataRangeInserted(int r1, int r2);

    void onDataRangeMoved(int r1, int r2, int r3);

    void onDataRangeRemoved(int r1, int r2);
}
