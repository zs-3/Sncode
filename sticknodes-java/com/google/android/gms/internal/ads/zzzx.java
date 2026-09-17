package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzzx {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzaaz zzb;
    private com.google.android.gms.internal.ads.zzcm zzc;
    private com.google.android.gms.internal.ads.zzbx zzd;
    private com.google.android.gms.internal.ads.zzdj zze;
    private boolean zzf;

    public zzzx(android.content.Context r1, com.google.android.gms.internal.ads.zzaaz r2) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            r0.zza = r1
            r0.zzb = r2
            com.google.android.gms.internal.ads.zzdj r1 = com.google.android.gms.internal.ads.zzdj.zza
            r0.zze = r1
            return
    }

    static /* bridge */ /* synthetic */ android.content.Context zza(com.google.android.gms.internal.ads.zzzx r0) {
            android.content.Context r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzbx zzb(com.google.android.gms.internal.ads.zzzx r0) {
            com.google.android.gms.internal.ads.zzbx r0 = r0.zzd
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzdj zzc(com.google.android.gms.internal.ads.zzzx r0) {
            com.google.android.gms.internal.ads.zzdj r0 = r0.zze
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.ads.zzaaz zzf(com.google.android.gms.internal.ads.zzzx r0) {
            com.google.android.gms.internal.ads.zzaaz r0 = r0.zzb
            return r0
    }

    public final com.google.android.gms.internal.ads.zzzx zzd(com.google.android.gms.internal.ads.zzdj r1) {
            r0 = this;
            r0.zze = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzaak zze() {
            r4 = this;
            boolean r0 = r4.zzf
            r1 = 1
            r0 = r0 ^ r1
            com.google.android.gms.internal.ads.zzdi.zzf(r0)
            com.google.android.gms.internal.ads.zzbx r0 = r4.zzd
            r2 = 0
            if (r0 != 0) goto L20
            com.google.android.gms.internal.ads.zzcm r0 = r4.zzc
            if (r0 != 0) goto L17
            com.google.android.gms.internal.ads.zzaad r0 = new com.google.android.gms.internal.ads.zzaad
            r0.<init>(r2)
            r4.zzc = r0
        L17:
            com.google.android.gms.internal.ads.zzaae r0 = new com.google.android.gms.internal.ads.zzaae
            com.google.android.gms.internal.ads.zzcm r3 = r4.zzc
            r0.<init>(r3)
            r4.zzd = r0
        L20:
            com.google.android.gms.internal.ads.zzaak r0 = new com.google.android.gms.internal.ads.zzaak
            r0.<init>(r4, r2)
            r4.zzf = r1
            return r0
    }
}
