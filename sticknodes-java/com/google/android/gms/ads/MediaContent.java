package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public interface MediaContent {
    float getAspectRatio();

    float getCurrentTime();

    float getDuration();

    android.graphics.drawable.Drawable getMainImage();

    com.google.android.gms.ads.VideoController getVideoController();

    boolean hasVideoContent();

    void setMainImage(android.graphics.drawable.Drawable r1);

    com.google.android.gms.internal.ads.zzbgw zza();

    boolean zzb();
}
