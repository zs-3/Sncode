package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzchp {
    private com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private android.content.Context zzb;
    private long zzc;
    private java.lang.ref.WeakReference zzd;

    public zzchp() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* bridge */ /* synthetic */ long zza(com.google.android.gms.internal.ads.zzchp r2) {
            long r0 = r2.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ android.content.Context zzb(com.google.android.gms.internal.ads.zzchp r0) {
            android.content.Context r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzc(com.google.android.gms.internal.ads.zzchp r0) {
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.ref.WeakReference zzg(com.google.android.gms.internal.ads.zzchp r0) {
            java.lang.ref.WeakReference r0 = r0.zzd
            return r0
    }

    public final com.google.android.gms.internal.ads.zzchp zzd(long r1) {
            r0 = this;
            r0.zzc = r1
            return r0
    }

    public final com.google.android.gms.internal.ads.zzchp zze(android.content.Context r2) {
            r1 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.zzd = r0
            android.content.Context r0 = r2.getApplicationContext()
            if (r0 == 0) goto L11
            android.content.Context r2 = r2.getApplicationContext()
        L11:
            r1.zzb = r2
            return r1
    }

    public final com.google.android.gms.internal.ads.zzchp zzf(com.google.android.gms.ads.internal.util.client.VersionInfoParcel r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }
}
