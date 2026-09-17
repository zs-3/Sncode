package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzcbk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcbn zza;

    zzcbk(com.google.android.gms.internal.ads.zzcbn r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.ads.zzcbn r0 = r2.zza
            com.google.android.gms.internal.ads.zzcbo r1 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            if (r1 == 0) goto L18
            com.google.android.gms.internal.ads.zzcbo r0 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            r0.zzd()
            com.google.android.gms.internal.ads.zzcbn r0 = r2.zza
            com.google.android.gms.internal.ads.zzcbo r0 = com.google.android.gms.internal.ads.zzcbn.zzi(r0)
            r0.zzi()
        L18:
            return
    }
}
