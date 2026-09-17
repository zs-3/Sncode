package com.google.android.gms.internal.appset;

/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
/* loaded from: classes.dex */
final class zzj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.internal.appset.zzl zza;

    /* synthetic */ zzj(com.google.android.gms.internal.appset.zzl r1, com.google.android.gms.internal.appset.zzi r2) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.internal.appset.zzl r0 = r5.zza
            long r0 = r0.zza()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            com.google.android.gms.common.util.Clock r2 = com.google.android.gms.common.util.DefaultClock.getInstance()
            long r2 = r2.currentTimeMillis()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L21
            com.google.android.gms.internal.appset.zzl r0 = r5.zza
            android.content.Context r0 = com.google.android.gms.internal.appset.zzl.zzb(r0)
            com.google.android.gms.internal.appset.zzl.zze(r0)
        L21:
            return
    }
}
