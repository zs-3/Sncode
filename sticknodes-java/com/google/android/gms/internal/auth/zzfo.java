package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzfo implements com.google.android.gms.internal.auth.zzfv {
    private final com.google.android.gms.internal.auth.zzfv[] zza;

    zzfo(com.google.android.gms.internal.auth.zzfv... r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final com.google.android.gms.internal.auth.zzfu zzb(java.lang.Class r5) {
            r4 = this;
            com.google.android.gms.internal.auth.zzfv[] r0 = r4.zza
            r1 = 0
        L3:
            r2 = 2
            if (r1 >= r2) goto L16
            r2 = r0[r1]
            boolean r3 = r2.zzc(r5)
            if (r3 == 0) goto L13
            com.google.android.gms.internal.auth.zzfu r5 = r2.zzb(r5)
            return r5
        L13:
            int r1 = r1 + 1
            goto L3
        L16:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = r5.getName()
            java.lang.String r1 = "No factory is available for message type: "
            java.lang.String r5 = r1.concat(r5)
            r0.<init>(r5)
            throw r0
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(java.lang.Class r5) {
            r4 = this;
            com.google.android.gms.internal.auth.zzfv[] r0 = r4.zza
            r1 = 0
            r2 = 0
        L4:
            r3 = 2
            if (r2 >= r3) goto L14
            r3 = r0[r2]
            boolean r3 = r3.zzc(r5)
            if (r3 == 0) goto L11
            r5 = 1
            return r5
        L11:
            int r2 = r2 + 1
            goto L4
        L14:
            return r1
    }
}
