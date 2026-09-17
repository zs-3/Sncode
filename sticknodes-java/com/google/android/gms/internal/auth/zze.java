package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public abstract class zze extends com.google.android.gms.internal.auth.zzb implements com.google.android.gms.internal.auth.zzf {
    public static com.google.android.gms.internal.auth.zzf zzb(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.auth.IAuthManagerService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.internal.auth.zzf
            if (r1 == 0) goto L11
            com.google.android.gms.internal.auth.zzf r0 = (com.google.android.gms.internal.auth.zzf) r0
            return r0
        L11:
            com.google.android.gms.internal.auth.zzd r0 = new com.google.android.gms.internal.auth.zzd
            r0.<init>(r2)
            return r0
    }
}
