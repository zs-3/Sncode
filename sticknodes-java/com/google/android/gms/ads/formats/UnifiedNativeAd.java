package com.google.android.gms.ads.formats;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class UnifiedNativeAd {
    public UnifiedNativeAd() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract void performClick(android.os.Bundle r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract boolean recordImpression(android.os.Bundle r1);

    @com.google.android.gms.common.annotation.KeepForSdk
    public abstract void reportTouchEvent(android.os.Bundle r1);

    @java.lang.Deprecated
    public abstract com.google.android.gms.ads.VideoController zza();

    public abstract com.google.android.gms.ads.formats.NativeAd.Image zzb();

    public abstract java.lang.Double zzc();

    public abstract java.lang.Object zzd();

    public abstract java.lang.String zze();

    public abstract java.lang.String zzf();

    public abstract java.lang.String zzg();

    public abstract java.lang.String zzh();

    public abstract java.lang.String zzi();

    public abstract java.lang.String zzj();

    public abstract java.util.List zzk();
}
