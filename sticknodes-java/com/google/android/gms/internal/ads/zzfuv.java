package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfuv extends com.google.android.gms.internal.ads.zzfut {
    private static com.google.android.gms.internal.ads.zzfuv zzc;

    static {
            return
    }

    private zzfuv(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "paidv2_id"
            java.lang.String r1 = "paidv2_creation_time"
            java.lang.String r2 = "PaidV2LifecycleImpl"
            r3.<init>(r4, r0, r1, r2)
            return
    }

    public static final com.google.android.gms.internal.ads.zzfuv zzi(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.internal.ads.zzfuv> r0 = com.google.android.gms.internal.ads.zzfuv.class
            monitor-enter(r0)
            com.google.android.gms.internal.ads.zzfuv r1 = com.google.android.gms.internal.ads.zzfuv.zzc     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.internal.ads.zzfuv r1 = new com.google.android.gms.internal.ads.zzfuv     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.internal.ads.zzfuv.zzc = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.internal.ads.zzfuv r2 = com.google.android.gms.internal.ads.zzfuv.zzc     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public final com.google.android.gms.internal.ads.zzfur zzh(long r8, boolean r10) throws java.io.IOException {
            r7 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzfuv> r0 = com.google.android.gms.internal.ads.zzfuv.class
            monitor-enter(r0)
            boolean r1 = r7.zzo()     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L10
            com.google.android.gms.internal.ads.zzfur r8 = new com.google.android.gms.internal.ads.zzfur     // Catch: java.lang.Throwable -> L1b
            r8.<init>()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r8
        L10:
            r2 = 0
            r3 = 0
            r1 = r7
            r4 = r8
            r6 = r10
            com.google.android.gms.internal.ads.zzfur r8 = r1.zzb(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return r8
        L1b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r8
    }

    public final void zzj() throws java.io.IOException {
            r3 = this;
            java.lang.Class<com.google.android.gms.internal.ads.zzfuv> r0 = com.google.android.gms.internal.ads.zzfuv.class
            monitor-enter(r0)
            r1 = 0
            boolean r2 = r3.zzg(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto Ld
            r3.zzf(r1)     // Catch: java.lang.Throwable -> Lf
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public final void zzk() throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzfus r0 = r2.zzb
            java.lang.String r1 = "paidv2_publisher_option"
            r0.zze(r1)
            return
    }

    public final void zzl() throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzfus r0 = r2.zzb
            java.lang.String r1 = "paidv2_user_option"
            r0.zze(r1)
            return
    }

    public final void zzm(boolean r3) throws java.io.IOException {
            r2 = this;
            com.google.android.gms.internal.ads.zzfus r0 = r2.zzb
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "paidv2_user_option"
            r0.zzd(r1, r3)
            return
    }

    public final void zzn(boolean r4) throws java.io.IOException {
            r3 = this;
            com.google.android.gms.internal.ads.zzfus r0 = r3.zzb
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r2 = "paidv2_publisher_option"
            r0.zzd(r2, r1)
            if (r4 != 0) goto L10
            r3.zzj()
        L10:
            return
    }

    public final boolean zzo() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfus r0 = r3.zzb
            java.lang.String r1 = "paidv2_publisher_option"
            r2 = 1
            boolean r0 = r0.zzf(r1, r2)
            return r0
    }

    public final boolean zzp() {
            r3 = this;
            com.google.android.gms.internal.ads.zzfus r0 = r3.zzb
            java.lang.String r1 = "paidv2_user_option"
            r2 = 1
            boolean r0 = r0.zzf(r1, r2)
            return r0
    }
}
