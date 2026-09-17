package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaww implements android.app.AppOpsManager.OnOpActiveChangedListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzawx zza;

    zzaww(com.google.android.gms.internal.ads.zzawx r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // android.app.AppOpsManager.OnOpActiveChangedListener
    public final void onOpActiveChanged(java.lang.String r5, int r6, java.lang.String r7, boolean r8) {
            r4 = this;
            if (r8 == 0) goto L12
            com.google.android.gms.internal.ads.zzawx r5 = r4.zza
            long r6 = java.lang.System.currentTimeMillis()
            com.google.android.gms.internal.ads.zzawx.zzg(r5, r6)
            com.google.android.gms.internal.ads.zzawx r5 = r4.zza
            r6 = 1
            com.google.android.gms.internal.ads.zzawx.zzf(r5, r6)
            return
        L12:
            com.google.android.gms.internal.ads.zzawx r5 = r4.zza
            long r6 = java.lang.System.currentTimeMillis()
            long r0 = com.google.android.gms.internal.ads.zzawx.zza(r5)
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L34
            com.google.android.gms.internal.ads.zzawx r5 = r4.zza
            long r0 = com.google.android.gms.internal.ads.zzawx.zza(r5)
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 < 0) goto L34
            long r0 = com.google.android.gms.internal.ads.zzawx.zza(r5)
            long r6 = r6 - r0
            com.google.android.gms.internal.ads.zzawx.zze(r5, r6)
        L34:
            com.google.android.gms.internal.ads.zzawx r5 = r4.zza
            r6 = 0
            com.google.android.gms.internal.ads.zzawx.zzf(r5, r6)
            return
    }
}
