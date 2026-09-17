package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface NativeCustomFormatAd {
    public static final java.lang.String ASSET_NAME_VIDEO = "_videoMediaView";

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public interface DisplayOpenMeasurement {
        void setView(android.view.View r1);

        boolean start();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public interface OnCustomClickListener {
        void onCustomClick(com.google.android.gms.ads.nativead.NativeCustomFormatAd r1, java.lang.String r2);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public interface OnCustomFormatAdLoadedListener {
        void onCustomFormatAdLoaded(com.google.android.gms.ads.nativead.NativeCustomFormatAd r1);
    }

    void destroy();

    java.util.List<java.lang.String> getAvailableAssetNames();

    java.lang.String getCustomFormatId();

    com.google.android.gms.ads.nativead.NativeCustomFormatAd.DisplayOpenMeasurement getDisplayOpenMeasurement();

    com.google.android.gms.ads.nativead.NativeAd.Image getImage(java.lang.String r1);

    com.google.android.gms.ads.MediaContent getMediaContent();

    java.lang.CharSequence getText(java.lang.String r1);

    void performClick(java.lang.String r1);

    void recordImpression();
}
