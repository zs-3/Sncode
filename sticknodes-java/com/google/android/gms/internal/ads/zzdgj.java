package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzdgj extends com.google.android.gms.internal.ads.zzddr implements com.google.android.gms.internal.ads.zzbkn {
    public zzdgj(java.util.Set r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zza(com.google.android.gms.internal.ads.zzbwy r2) {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgi r0 = new com.google.android.gms.internal.ads.zzdgi
            r0.<init>(r2)
            r1.zzq(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final void zzb() {
            r1 = this;
            com.google.android.gms.internal.ads.zzdgh r0 = new com.google.android.gms.internal.ads.zzdgh
            r0.<init>()
            r1.zzq(r0)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzbkn
    public final synchronized void zzc() {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.internal.ads.zzdgg r0 = new com.google.android.gms.internal.ads.zzdgg     // Catch: java.lang.Throwable -> Lb
            r0.<init>()     // Catch: java.lang.Throwable -> Lb
            r1.zzq(r0)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }
}
