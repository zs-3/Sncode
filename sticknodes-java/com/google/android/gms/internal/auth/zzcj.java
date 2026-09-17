package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final /* synthetic */ class zzcj {
    public static java.lang.Object zza(com.google.android.gms.internal.auth.zzck r2) {
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.SecurityException -> L5
            goto L10
        L5:
            long r0 = android.os.Binder.clearCallingIdentity()
            java.lang.Object r2 = r2.zza()     // Catch: java.lang.Throwable -> L11
            android.os.Binder.restoreCallingIdentity(r0)
        L10:
            return r2
        L11:
            r2 = move-exception
            android.os.Binder.restoreCallingIdentity(r0)
            throw r2
    }
}
