package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzfor extends java.util.TimerTask {
    final /* synthetic */ java.util.Timer zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzfot zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcgd zzc;

    zzfor(com.google.android.gms.internal.ads.zzfot r1, com.google.android.gms.internal.ads.zzcgd r2, java.util.Timer r3) {
            r0 = this;
            r0.zzc = r2
            r0.zza = r3
            r0.zzb = r1
            r0.<init>()
            return
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.ads.zzfot r0 = r2.zzb
            com.google.android.gms.internal.ads.zzfot.zzc(r0)
            com.google.android.gms.internal.ads.zzcgd r0 = r2.zzc
            r1 = 1
            r0.zza(r1)
            java.util.Timer r0 = r2.zza
            r0.cancel()
            return
    }
}
