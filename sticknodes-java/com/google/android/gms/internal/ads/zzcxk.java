package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzcxk {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfhc zzb;
    private final android.os.Bundle zzc;
    private final com.google.android.gms.internal.ads.zzfgu zzd;
    private final com.google.android.gms.internal.ads.zzcxc zze;
    private final com.google.android.gms.internal.ads.zzegp zzf;

    /* synthetic */ zzcxk(com.google.android.gms.internal.ads.zzcxi r1, com.google.android.gms.internal.ads.zzcxj r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r2 = com.google.android.gms.internal.ads.zzcxi.zza(r1)
            r0.zza = r2
            com.google.android.gms.internal.ads.zzfhc r2 = com.google.android.gms.internal.ads.zzcxi.zzm(r1)
            r0.zzb = r2
            android.os.Bundle r2 = com.google.android.gms.internal.ads.zzcxi.zzb(r1)
            r0.zzc = r2
            com.google.android.gms.internal.ads.zzfgu r2 = com.google.android.gms.internal.ads.zzcxi.zzl(r1)
            r0.zzd = r2
            com.google.android.gms.internal.ads.zzcxc r2 = com.google.android.gms.internal.ads.zzcxi.zzc(r1)
            r0.zze = r2
            com.google.android.gms.internal.ads.zzegp r1 = com.google.android.gms.internal.ads.zzcxi.zzk(r1)
            r0.zzf = r1
            return
    }

    final android.content.Context zza(android.content.Context r1) {
            r0 = this;
            android.content.Context r1 = r0.zza
            return r1
    }

    final android.os.Bundle zzb() {
            r1 = this;
            android.os.Bundle r0 = r1.zzc
            return r0
    }

    final com.google.android.gms.internal.ads.zzcxc zzc() {
            r1 = this;
            com.google.android.gms.internal.ads.zzcxc r0 = r1.zze
            return r0
    }

    final com.google.android.gms.internal.ads.zzcxi zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcxi r0 = new com.google.android.gms.internal.ads.zzcxi
            r0.<init>()
            android.content.Context r1 = r2.zza
            r0.zze(r1)
            com.google.android.gms.internal.ads.zzfhc r1 = r2.zzb
            r0.zzi(r1)
            android.os.Bundle r1 = r2.zzc
            r0.zzf(r1)
            com.google.android.gms.internal.ads.zzcxc r1 = r2.zze
            r0.zzg(r1)
            com.google.android.gms.internal.ads.zzegp r1 = r2.zzf
            r0.zzd(r1)
            return r0
    }

    final com.google.android.gms.internal.ads.zzegp zze(java.lang.String r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzegp r0 = r1.zzf
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.android.gms.internal.ads.zzegp r0 = new com.google.android.gms.internal.ads.zzegp
            r0.<init>(r2)
            return r0
    }

    final com.google.android.gms.internal.ads.zzfgu zzf() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfgu r0 = r1.zzd
            return r0
    }

    final com.google.android.gms.internal.ads.zzfhc zzg() {
            r1 = this;
            com.google.android.gms.internal.ads.zzfhc r0 = r1.zzb
            return r0
    }
}
