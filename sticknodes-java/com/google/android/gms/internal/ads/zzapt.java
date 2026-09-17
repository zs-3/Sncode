package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzapt {
    private final java.util.concurrent.Executor zza;

    public zzapt(android.os.Handler r2) {
            r1 = this;
            r1.<init>()
            com.google.android.gms.internal.ads.zzapr r0 = new com.google.android.gms.internal.ads.zzapr
            r0.<init>(r1, r2)
            r1.zza = r0
            return
    }

    public final void zza(com.google.android.gms.internal.ads.zzaqc r3, com.google.android.gms.internal.ads.zzaql r4) {
            r2 = this;
            java.lang.String r0 = "post-error"
            r3.zzm(r0)
            com.google.android.gms.internal.ads.zzaqi r4 = com.google.android.gms.internal.ads.zzaqi.zza(r4)
            com.google.android.gms.internal.ads.zzaps r0 = new com.google.android.gms.internal.ads.zzaps
            r1 = 0
            r0.<init>(r3, r4, r1)
            java.util.concurrent.Executor r3 = r2.zza
            com.google.android.gms.internal.ads.zzapr r3 = (com.google.android.gms.internal.ads.zzapr) r3
            android.os.Handler r3 = r3.zza
            r3.post(r0)
            return
    }

    public final void zzb(com.google.android.gms.internal.ads.zzaqc r2, com.google.android.gms.internal.ads.zzaqi r3, java.lang.Runnable r4) {
            r1 = this;
            r2.zzq()
            java.lang.String r0 = "post-response"
            r2.zzm(r0)
            com.google.android.gms.internal.ads.zzaps r0 = new com.google.android.gms.internal.ads.zzaps
            r0.<init>(r2, r3, r4)
            java.util.concurrent.Executor r2 = r1.zza
            com.google.android.gms.internal.ads.zzapr r2 = (com.google.android.gms.internal.ads.zzapr) r2
            android.os.Handler r2 = r2.zza
            r2.post(r0)
            return
    }
}
