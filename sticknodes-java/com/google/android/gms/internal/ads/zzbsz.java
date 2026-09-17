package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbsz {
    private final com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener zzb;
    private com.google.android.gms.ads.nativead.NativeCustomFormatAd zzc;

    public zzbsz(com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener r1, com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomClickListener zzc(com.google.android.gms.internal.ads.zzbsz r0) {
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd.OnCustomFormatAdLoadedListener zzd(com.google.android.gms.internal.ads.zzbsz r0) {
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomFormatAdLoadedListener r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.nativead.NativeCustomFormatAd zze(com.google.android.gms.internal.ads.zzbsz r0, com.google.android.gms.internal.ads.zzbgw r1) {
            com.google.android.gms.ads.nativead.NativeCustomFormatAd r0 = r0.zzf(r1)
            return r0
    }

    private final synchronized com.google.android.gms.ads.nativead.NativeCustomFormatAd zzf(com.google.android.gms.internal.ads.zzbgw r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.ads.nativead.NativeCustomFormatAd r0 = r1.zzc     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r0
        L7:
            com.google.android.gms.internal.ads.zzbta r0 = new com.google.android.gms.internal.ads.zzbta     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            r1.zzc = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzbhg zza() {
            r2 = this;
            com.google.android.gms.ads.nativead.NativeCustomFormatAd$OnCustomClickListener r0 = r2.zzb
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzbsw r0 = new com.google.android.gms.internal.ads.zzbsw
            r0.<init>(r2, r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbhj zzb() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbsy r0 = new com.google.android.gms.internal.ads.zzbsy
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
