package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
final class zzaps implements java.lang.Runnable {
    private final com.google.android.gms.internal.ads.zzaqc zza;
    private final com.google.android.gms.internal.ads.zzaqi zzb;
    private final java.lang.Runnable zzc;

    public zzaps(com.google.android.gms.internal.ads.zzaqc r1, com.google.android.gms.internal.ads.zzaqi r2, java.lang.Runnable r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            com.google.android.gms.internal.ads.zzaqc r0 = r2.zza
            r0.zzw()
            com.google.android.gms.internal.ads.zzaqi r0 = r2.zzb
            boolean r1 = r0.zzc()
            if (r1 == 0) goto L15
            com.google.android.gms.internal.ads.zzaqc r1 = r2.zza
            java.lang.Object r0 = r0.zza
            r1.zzo(r0)
            goto L1c
        L15:
            com.google.android.gms.internal.ads.zzaqc r1 = r2.zza
            com.google.android.gms.internal.ads.zzaql r0 = r0.zzc
            r1.zzn(r0)
        L1c:
            com.google.android.gms.internal.ads.zzaqi r0 = r2.zzb
            boolean r0 = r0.zzd
            if (r0 == 0) goto L2a
            com.google.android.gms.internal.ads.zzaqc r0 = r2.zza
            java.lang.String r1 = "intermediate-response"
            r0.zzm(r1)
            goto L31
        L2a:
            com.google.android.gms.internal.ads.zzaqc r0 = r2.zza
            java.lang.String r1 = "done"
            r0.zzp(r1)
        L31:
            java.lang.Runnable r0 = r2.zzc
            if (r0 == 0) goto L38
            r0.run()
        L38:
            return
    }
}
