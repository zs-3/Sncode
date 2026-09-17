package com.google.android.gms.ads.nativead;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public abstract class NativeAd {

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static abstract class AdChoicesInfo {
        public AdChoicesInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages();

        public abstract java.lang.CharSequence getText();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public static abstract class Image {
        public Image() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract android.graphics.drawable.Drawable getDrawable();

        public abstract double getScale();

        public abstract android.net.Uri getUri();

        public int zza() {
                r1 = this;
                r0 = -1
                return r0
        }

        public int zzb() {
                r1 = this;
                r0 = -1
                return r0
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public interface OnNativeAdLoadedListener {
        void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd r1);
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    public interface UnconfirmedClickListener {
        void onUnconfirmedClickCancelled();

        void onUnconfirmedClickReceived(java.lang.String r1);
    }

    public NativeAd() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void cancelUnconfirmedClick();

    public abstract void destroy();

    @java.lang.Deprecated
    public abstract void enableCustomClickGesture();

    public abstract com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo getAdChoicesInfo();

    public abstract java.lang.String getAdvertiser();

    public abstract java.lang.String getBody();

    public abstract java.lang.String getCallToAction();

    public abstract android.os.Bundle getExtras();

    public abstract java.lang.String getHeadline();

    public abstract com.google.android.gms.ads.nativead.NativeAd.Image getIcon();

    public abstract java.util.List<com.google.android.gms.ads.nativead.NativeAd.Image> getImages();

    public abstract com.google.android.gms.ads.MediaContent getMediaContent();

    public abstract java.util.List<com.google.android.gms.ads.MuteThisAdReason> getMuteThisAdReasons();

    public abstract java.lang.String getPrice();

    public abstract com.google.android.gms.ads.ResponseInfo getResponseInfo();

    public abstract java.lang.Double getStarRating();

    public abstract java.lang.String getStore();

    @java.lang.Deprecated
    public abstract boolean isCustomClickGestureEnabled();

    public abstract boolean isCustomMuteThisAdEnabled();

    public abstract void muteThisAd(com.google.android.gms.ads.MuteThisAdReason r1);

    public abstract void performClick(android.os.Bundle r1);

    @java.lang.Deprecated
    public abstract void recordCustomClickGesture();

    @com.google.android.gms.common.annotation.KeepForSdk
    protected abstract void recordEvent(android.os.Bundle r1);

    public abstract boolean recordImpression(android.os.Bundle r1);

    public abstract void reportTouchEvent(android.os.Bundle r1);

    public abstract void setMuteThisAdListener(com.google.android.gms.ads.MuteThisAdListener r1);

    public abstract void setOnPaidEventListener(com.google.android.gms.ads.OnPaidEventListener r1);

    public abstract void setUnconfirmedClickListener(com.google.android.gms.ads.nativead.NativeAd.UnconfirmedClickListener r1);

    protected abstract java.lang.Object zza();
}
