package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzfqz {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final android.content.Context zzb;
    private final java.util.concurrent.Executor zzc;
    private final com.google.android.gms.tasks.Task zzd;
    private final boolean zze;

    static {
            return
    }

    public zzfqz(android.content.Context r1, java.util.concurrent.Executor r2, com.google.android.gms.tasks.Task r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            r0.zzd = r3
            r0.zze = r4
            return
    }

    public static com.google.android.gms.internal.ads.zzfqz zza(android.content.Context r2, java.util.concurrent.Executor r3, boolean r4) {
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            if (r4 == 0) goto L10
            com.google.android.gms.internal.ads.zzfqx r1 = new com.google.android.gms.internal.ads.zzfqx
            r1.<init>(r2, r0)
            r3.execute(r1)
            goto L18
        L10:
            com.google.android.gms.internal.ads.zzfqy r1 = new com.google.android.gms.internal.ads.zzfqy
            r1.<init>(r0)
            r3.execute(r1)
        L18:
            com.google.android.gms.internal.ads.zzfqz r1 = new com.google.android.gms.internal.ads.zzfqz
            com.google.android.gms.tasks.Task r0 = r0.getTask()
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    static void zzg(int r0) {
            com.google.android.gms.internal.ads.zzfqz.zzf = r0
            return
    }

    private final com.google.android.gms.tasks.Task zzh(int r2, long r3, java.lang.Exception r5, java.lang.String r6, java.util.Map r7, java.lang.String r8) {
            r1 = this;
            boolean r7 = r1.zze
            if (r7 != 0) goto L12
            com.google.android.gms.tasks.Task r2 = r1.zzd
            java.util.concurrent.Executor r3 = r1.zzc
            com.google.android.gms.internal.ads.zzfqv r4 = new com.google.android.gms.internal.ads.zzfqv
            r4.<init>()
            com.google.android.gms.tasks.Task r2 = r2.continueWith(r3, r4)
            return r2
        L12:
            android.content.Context r7 = r1.zzb
            com.google.android.gms.internal.ads.zzarv r0 = com.google.android.gms.internal.ads.zzarz.zza()
            java.lang.String r7 = r7.getPackageName()
            r0.zza(r7)
            r0.zze(r3)
            int r3 = com.google.android.gms.internal.ads.zzfqz.zzf
            r0.zzg(r3)
            if (r5 == 0) goto L48
            java.io.StringWriter r3 = new java.io.StringWriter
            r3.<init>()
            java.io.PrintWriter r4 = new java.io.PrintWriter
            r4.<init>(r3)
            r5.printStackTrace(r4)
            java.lang.String r3 = r3.toString()
            r0.zzf(r3)
            java.lang.Class r3 = r5.getClass()
            java.lang.String r3 = r3.getName()
            r0.zzd(r3)
        L48:
            if (r8 == 0) goto L4d
            r0.zzb(r8)
        L4d:
            if (r6 == 0) goto L52
            r0.zzc(r6)
        L52:
            com.google.android.gms.tasks.Task r3 = r1.zzd
            java.util.concurrent.Executor r4 = r1.zzc
            com.google.android.gms.internal.ads.zzfqw r5 = new com.google.android.gms.internal.ads.zzfqw
            r5.<init>(r0, r2)
            com.google.android.gms.tasks.Task r2 = r3.continueWith(r4, r5)
            return r2
    }

    public final com.google.android.gms.tasks.Task zzb(int r9, java.lang.String r10) {
            r8 = this;
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r7 = r10
            com.google.android.gms.tasks.Task r9 = r0.zzh(r1, r2, r4, r5, r6, r7)
            return r9
    }

    public final com.google.android.gms.tasks.Task zzc(int r9, long r10, java.lang.Exception r12) {
            r8 = this;
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r4 = r12
            com.google.android.gms.tasks.Task r9 = r0.zzh(r1, r2, r4, r5, r6, r7)
            return r9
    }

    public final com.google.android.gms.tasks.Task zzd(int r9, long r10) {
            r8 = this;
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            com.google.android.gms.tasks.Task r9 = r0.zzh(r1, r2, r4, r5, r6, r7)
            return r9
    }

    public final com.google.android.gms.tasks.Task zze(int r9, long r10, java.lang.String r12) {
            r8 = this;
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r7 = r12
            com.google.android.gms.tasks.Task r9 = r0.zzh(r1, r2, r4, r5, r6, r7)
            return r9
    }

    public final com.google.android.gms.tasks.Task zzf(int r9, long r10, java.lang.String r12, java.util.Map r13) {
            r8 = this;
            r4 = 0
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r5 = r12
            com.google.android.gms.tasks.Task r9 = r0.zzh(r1, r2, r4, r5, r6, r7)
            return r9
    }
}
