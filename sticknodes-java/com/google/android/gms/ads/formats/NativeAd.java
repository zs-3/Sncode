package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class NativeAd {
    public static final java.lang.String ASSET_ADCHOICES_CONTAINER_VIEW = "1098";

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.Deprecated
    public static abstract class AdChoicesInfo {
        public AdChoicesInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.util.List<com.google.android.gms.ads.formats.NativeAd.Image> getImages();

        public abstract java.lang.CharSequence getText();
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
    @java.lang.Deprecated
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

    public NativeAd() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public abstract void performClick(android.os.Bundle r1);

    @java.lang.Deprecated
    public abstract boolean recordImpression(android.os.Bundle r1);

    @java.lang.Deprecated
    public abstract void reportTouchEvent(android.os.Bundle r1);
}
