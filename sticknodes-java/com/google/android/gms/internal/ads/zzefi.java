package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzefi extends java.util.TimerTask {
    final /* synthetic */ android.app.AlertDialog zza;
    final /* synthetic */ java.util.Timer zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zzc;

    zzefi(com.google.android.gms.internal.ads.zzefj r1, android.app.AlertDialog r2, java.util.Timer r3, com.google.android.gms.ads.internal.overlay.zzm r4) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.<init>()
            return
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
            r1 = this;
            android.app.AlertDialog r0 = r1.zza
            r0.dismiss()
            java.util.Timer r0 = r1.zzb
            r0.cancel()
            com.google.android.gms.ads.internal.overlay.zzm r0 = r1.zzc
            if (r0 == 0) goto L11
            r0.zzb()
        L11:
            return
    }
}
