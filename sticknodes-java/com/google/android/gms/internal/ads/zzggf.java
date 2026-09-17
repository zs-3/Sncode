package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzggf {
    public static com.google.android.gms.internal.ads.zzgfz zza(java.util.concurrent.ExecutorService r1) {
            boolean r0 = r1 instanceof com.google.android.gms.internal.ads.zzgfz
            if (r0 == 0) goto L7
            com.google.android.gms.internal.ads.zzgfz r1 = (com.google.android.gms.internal.ads.zzgfz) r1
            goto L19
        L7:
            boolean r0 = r1 instanceof java.util.concurrent.ScheduledExecutorService
            if (r0 == 0) goto L13
            com.google.android.gms.internal.ads.zzgge r0 = new com.google.android.gms.internal.ads.zzgge
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            r0.<init>(r1)
            goto L18
        L13:
            com.google.android.gms.internal.ads.zzggb r0 = new com.google.android.gms.internal.ads.zzggb
            r0.<init>(r1)
        L18:
            r1 = r0
        L19:
            return r1
    }

    public static java.util.concurrent.Executor zzb() {
            com.google.android.gms.internal.ads.zzgfc r0 = com.google.android.gms.internal.ads.zzgfc.zza
            return r0
    }

    static java.util.concurrent.Executor zzc(java.util.concurrent.Executor r1, com.google.android.gms.internal.ads.zzgec r2) {
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.internal.ads.zzgfc r0 = com.google.android.gms.internal.ads.zzgfc.zza
            if (r1 != r0) goto L8
            return r1
        L8:
            com.google.android.gms.internal.ads.zzgga r0 = new com.google.android.gms.internal.ads.zzgga
            r0.<init>(r1, r2)
            return r0
    }
}
