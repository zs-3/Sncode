package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public abstract class zza {
    private static com.google.android.gms.internal.consent_sdk.zza zza;

    public zza() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.gms.internal.consent_sdk.zza zza(android.content.Context r3) {
            java.lang.Class<com.google.android.gms.internal.consent_sdk.zza> r0 = com.google.android.gms.internal.consent_sdk.zza.class
            monitor-enter(r0)
            com.google.android.gms.internal.consent_sdk.zza r1 = com.google.android.gms.internal.consent_sdk.zza.zza     // Catch: java.lang.Throwable -> L20
            if (r1 != 0) goto L1c
            com.google.android.gms.internal.consent_sdk.zzai r1 = new com.google.android.gms.internal.consent_sdk.zzai     // Catch: java.lang.Throwable -> L20
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L20
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L20
            android.app.Application r3 = (android.app.Application) r3     // Catch: java.lang.Throwable -> L20
            r1.zzb(r3)     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.consent_sdk.zza r3 = r1.zza()     // Catch: java.lang.Throwable -> L20
            com.google.android.gms.internal.consent_sdk.zza.zza = r3     // Catch: java.lang.Throwable -> L20
        L1c:
            com.google.android.gms.internal.consent_sdk.zza r3 = com.google.android.gms.internal.consent_sdk.zza.zza     // Catch: java.lang.Throwable -> L20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return r3
        L20:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            throw r3
    }

    public abstract com.google.android.gms.internal.consent_sdk.zzj zzb();

    public abstract com.google.android.gms.internal.consent_sdk.zzbn zzc();
}
