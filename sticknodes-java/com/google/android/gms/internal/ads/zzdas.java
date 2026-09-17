package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzdas implements java.lang.Runnable {
    private final java.lang.ref.WeakReference zza;

    /* synthetic */ zzdas(com.google.android.gms.internal.ads.zzdat r1, com.google.android.gms.internal.ads.zzdar r2) {
            r0 = this;
            r0.<init>()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.zza = r2
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.zza
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.zzdat r0 = (com.google.android.gms.internal.ads.zzdat) r0
            if (r0 == 0) goto L12
            com.google.android.gms.internal.ads.zzdao r1 = new com.google.android.gms.internal.ads.zzdao
            r1.<init>()
            r0.zzq(r1)
        L12:
            return
    }
}
