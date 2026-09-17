package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzcr {
    public static final android.os.Handler zza = null;
    public static final java.util.concurrent.Executor zzb = null;

    static {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.google.android.gms.internal.consent_sdk.zzcr.zza = r0
            com.google.android.gms.internal.consent_sdk.zzcq r0 = new com.google.android.gms.internal.consent_sdk.zzcq
            java.lang.String r1 = "Google consent worker"
            r0.<init>(r1)
            com.google.android.gms.internal.consent_sdk.zzcr.zzb = r0
            return
    }

    public static void zza() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto Lb
            return
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Method must be call on main thread."
            r0.<init>(r1)
            throw r0
    }
}
