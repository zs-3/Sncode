package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdky {
    com.google.android.gms.internal.ads.zzbhd zza;
    com.google.android.gms.internal.ads.zzbha zzb;
    com.google.android.gms.internal.ads.zzbhq zzc;
    com.google.android.gms.internal.ads.zzbhn zzd;
    com.google.android.gms.internal.ads.zzbmp zze;
    final androidx.collection.SimpleArrayMap zzf;
    final androidx.collection.SimpleArrayMap zzg;

    public zzdky() {
            r1 = this;
            r1.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.zzf = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r1.zzg = r0
            return
    }

    public final com.google.android.gms.internal.ads.zzdky zza(com.google.android.gms.internal.ads.zzbha r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdky zzb(com.google.android.gms.internal.ads.zzbhd r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdky zzc(java.lang.String r2, com.google.android.gms.internal.ads.zzbhj r3, com.google.android.gms.internal.ads.zzbhg r4) {
            r1 = this;
            androidx.collection.SimpleArrayMap r0 = r1.zzf
            r0.put(r2, r3)
            if (r4 == 0) goto Lc
            androidx.collection.SimpleArrayMap r3 = r1.zzg
            r3.put(r2, r4)
        Lc:
            return r1
    }

    public final com.google.android.gms.internal.ads.zzdky zzd(com.google.android.gms.internal.ads.zzbmp r1) {
            r0 = this;
            r0.zze = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdky zze(com.google.android.gms.internal.ads.zzbhn r1) {
            r0 = this;
            r0.zzd = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdky zzf(com.google.android.gms.internal.ads.zzbhq r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzdla zzg() {
            r2 = this;
            com.google.android.gms.internal.ads.zzdla r0 = new com.google.android.gms.internal.ads.zzdla
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}
