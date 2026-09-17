package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzax implements java.lang.Runnable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzax(com.google.android.gms.ads.internal.util.zzay r1, android.content.Context r2, java.lang.String r3, boolean r4, boolean r5) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r5 = this;
            com.google.android.gms.ads.internal.zzu.zzp()
            android.content.Context r0 = r5.zza
            android.app.AlertDialog$Builder r0 = com.google.android.gms.ads.internal.util.zzt.zzK(r0)
            java.lang.String r1 = r5.zzb
            r0.setMessage(r1)
            boolean r1 = r5.zzc
            if (r1 == 0) goto L18
            java.lang.String r1 = "Error"
            r0.setTitle(r1)
            goto L1d
        L18:
            java.lang.String r1 = "Info"
            r0.setTitle(r1)
        L1d:
            boolean r1 = r5.zzd
            r2 = 0
            java.lang.String r3 = "Dismiss"
            if (r1 == 0) goto L28
            r0.setNeutralButton(r3, r2)
            goto L35
        L28:
            com.google.android.gms.ads.internal.util.zzaw r1 = new com.google.android.gms.ads.internal.util.zzaw
            r1.<init>(r5)
            java.lang.String r4 = "Learn More"
            r0.setPositiveButton(r4, r1)
            r0.setNegativeButton(r3, r2)
        L35:
            android.app.AlertDialog r0 = r0.create()
            r0.show()
            return
    }
}
