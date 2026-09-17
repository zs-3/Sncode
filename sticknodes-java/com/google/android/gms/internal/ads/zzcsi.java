package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcsi implements java.lang.Runnable {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;

    public /* synthetic */ zzcsi(java.util.concurrent.atomic.AtomicReference r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zza
            com.google.android.gms.internal.ads.zzcsk.zzj(r0)
            return
    }
}
