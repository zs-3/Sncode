package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzazq implements java.lang.Runnable {
    final /* synthetic */ android.view.View zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzazu zzb;

    zzazq(com.google.android.gms.internal.ads.zzazu r1, android.view.View r2) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.ads.zzazu r0 = r2.zzb
            android.view.View r1 = r2.zza
            r0.zzc(r1)
            return
    }
}
