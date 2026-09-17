package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zzjp {
    public static java.lang.Object zza(com.google.android.gms.internal.measurement.zzjq r2) {
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
