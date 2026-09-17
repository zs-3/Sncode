package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@23.4.0 */
/* loaded from: classes.dex */
public final class zzaxd extends com.google.android.gms.internal.ads.zzayc {
    public zzaxd(com.google.android.gms.internal.ads.zzawo r8, java.lang.String r9, java.lang.String r10, com.google.android.gms.internal.ads.zzasm r11, int r12, int r13) {
            r7 = this;
            java.lang.String r2 = "c/axzSlC5CKyeVvYpod083FD/YK+zLXfDqtD5AYe9EXr6xyYayRD+veafiAlev8F"
            java.lang.String r3 = "JFMtS6Z9bzmnMwoeWTxjTTnvJVVZDuewSTBrvx9CdBc="
            r6 = 5
            r0 = r7
            r1 = r8
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
            r6 = this;
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            r1 = -1
            r0.zzm(r1)
            com.google.android.gms.internal.ads.zzasm r0 = r6.zzd
            r0.zzl(r1)
            java.lang.reflect.Method r0 = r6.zze
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            com.google.android.gms.internal.ads.zzawo r3 = r6.zza
            android.content.Context r3 = r3.zzb()
            r4 = 0
            r2[r4] = r3
            r3 = 0
            java.lang.Object r0 = r0.invoke(r3, r2)
            int[] r0 = (int[]) r0
            com.google.android.gms.internal.ads.zzasm r2 = r6.zzd
            monitor-enter(r2)
            com.google.android.gms.internal.ads.zzasm r3 = r6.zzd     // Catch: java.lang.Throwable -> L43
            r4 = r0[r4]     // Catch: java.lang.Throwable -> L43
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L43
            r3.zzm(r4)     // Catch: java.lang.Throwable -> L43
            com.google.android.gms.internal.ads.zzasm r3 = r6.zzd     // Catch: java.lang.Throwable -> L43
            r1 = r0[r1]     // Catch: java.lang.Throwable -> L43
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L43
            r3.zzl(r4)     // Catch: java.lang.Throwable -> L43
            r1 = 2
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L43
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L41
            com.google.android.gms.internal.ads.zzasm r1 = r6.zzd     // Catch: java.lang.Throwable -> L43
            long r3 = (long) r0     // Catch: java.lang.Throwable -> L43
            r1.zzk(r3)     // Catch: java.lang.Throwable -> L43
        L41:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            return
        L43:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
            throw r0
    }
}
