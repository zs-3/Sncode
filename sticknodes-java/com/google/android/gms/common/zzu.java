package com.google.android.gms.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* loaded from: classes.dex */
final class zzu extends com.google.android.gms.common.zzw {
    private final java.util.concurrent.Callable zze;

    /* synthetic */ zzu(java.util.concurrent.Callable r8, com.google.android.gms.common.zzv r9) {
            r7 = this;
            r1 = 0
            r2 = 1
            r3 = 5
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.zze = r8
            return
    }

    @Override // com.google.android.gms.common.zzw
    final java.lang.String zza() {
            r2 = this;
            java.util.concurrent.Callable r0 = r2.zze     // Catch: java.lang.Exception -> L9
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
