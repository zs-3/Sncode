package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzchr {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final android.content.Context zzb;
    private final long zzc;
    private final java.lang.ref.WeakReference zzd;

    /* synthetic */ zzchr(com.google.android.gms.internal.ads.zzchp r1, com.google.android.gms.internal.ads.zzchq r2) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.internal.ads.zzchp.zzc(r1)
            r0.zza = r2
            android.content.Context r2 = com.google.android.gms.internal.ads.zzchp.zzb(r1)
            r0.zzb = r2
            java.lang.ref.WeakReference r2 = com.google.android.gms.internal.ads.zzchp.zzg(r1)
            r0.zzd = r2
            long r1 = com.google.android.gms.internal.ads.zzchp.zza(r1)
            r0.zzc = r1
            return
    }

    final long zza() {
            r2 = this;
            long r0 = r2.zzc
            return r0
    }

    final android.content.Context zzb() {
            r1 = this;
            android.content.Context r0 = r1.zzb
            return r0
    }

    public final com.google.android.gms.ads.internal.zzj zzc() {
            r3 = this;
            com.google.android.gms.ads.internal.zzj r0 = new com.google.android.gms.ads.internal.zzj
            android.content.Context r1 = r3.zzb
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = r3.zza
            r0.<init>(r1, r2)
            return r0
    }

    final com.google.android.gms.internal.ads.zzbfk zzd() {
            r2 = this;
            com.google.android.gms.internal.ads.zzbfk r0 = new com.google.android.gms.internal.ads.zzbfk
            android.content.Context r1 = r2.zzb
            r0.<init>(r1)
            return r0
    }

    final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zze() {
            r1 = this;
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r1.zza
            return r0
    }

    final java.lang.String zzf() {
            r3 = this;
            com.google.android.gms.ads.internal.util.zzt r0 = com.google.android.gms.ads.internal.zzu.zzp()
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1 = r3.zza
            android.content.Context r2 = r3.zzb
            java.lang.String r1 = r1.afmaVersion
            java.lang.String r0 = r0.zzc(r2, r1)
            return r0
    }

    final java.lang.ref.WeakReference zzg() {
            r1 = this;
            java.lang.ref.WeakReference r0 = r1.zzd
            return r0
    }
}
