package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zza implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzb zza;

    zza(com.google.android.gms.ads.internal.util.zzb r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.ads.internal.util.zzb r0 = r2.zza
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            com.google.android.gms.ads.internal.util.zzb.zzc(r0, r1)
            com.google.android.gms.ads.internal.util.zzb r0 = r2.zza
            r0.zza()
            return
    }
}
