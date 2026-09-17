package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.4.0 */
/* loaded from: classes.dex */
public final class zzbih {
    private final com.google.android.gms.ads.formats.zzg zza;
    private final com.google.android.gms.ads.formats.zzf zzb;
    private com.google.android.gms.internal.ads.zzbgx zzc;

    public zzbih(com.google.android.gms.ads.formats.zzg r1, com.google.android.gms.ads.formats.zzf r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.formats.zzf zza(com.google.android.gms.internal.ads.zzbih r0) {
            com.google.android.gms.ads.formats.zzf r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.formats.zzg zzb(com.google.android.gms.internal.ads.zzbih r0) {
            com.google.android.gms.ads.formats.zzg r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbgx zze(com.google.android.gms.internal.ads.zzbih r0, com.google.android.gms.internal.ads.zzbgw r1) {
            com.google.android.gms.internal.ads.zzbgx r0 = r0.zzf(r1)
            return r0
    }

    private final synchronized com.google.android.gms.internal.ads.zzbgx zzf(com.google.android.gms.internal.ads.zzbgw r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzbgx r0 = r1.zzc     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L7
            monitor-exit(r1)
            return r0
        L7:
            com.google.android.gms.internal.ads.zzbgx r0 = new com.google.android.gms.internal.ads.zzbgx     // Catch: java.lang.Throwable -> L10
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L10
            r1.zzc = r0     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r0
        L10:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzbhg zzc() {
            r2 = this;
            com.google.android.gms.ads.formats.zzf r0 = r2.zzb
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.google.android.gms.internal.ads.zzbie r0 = new com.google.android.gms.internal.ads.zzbie
            r0.<init>(r2, r1)
            return r0
    }

    public final com.google.android.gms.internal.ads.zzbhj zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbig r0 = new com.google.android.gms.internal.ads.zzbig
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
