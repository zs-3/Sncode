package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzl {
    private final android.app.Application zza;
    private final com.google.android.gms.internal.consent_sdk.zzap zzb;

    zzl(android.app.Application r1, com.google.android.gms.internal.consent_sdk.zzap r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    static /* bridge */ /* synthetic */ android.app.Application zza(com.google.android.gms.internal.consent_sdk.zzl r0) {
            android.app.Application r0 = r0.zza
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzap zzb(com.google.android.gms.internal.consent_sdk.zzl r0) {
            com.google.android.gms.internal.consent_sdk.zzap r0 = r0.zzb
            return r0
    }

    final com.google.android.gms.internal.consent_sdk.zzci zzc(android.app.Activity r8, com.google.android.ump.ConsentRequestParameters r9) throws com.google.android.gms.internal.consent_sdk.zzg {
            r7 = this;
            com.google.android.ump.ConsentDebugSettings r0 = r9.getConsentDebugSettings()
            if (r0 != 0) goto L11
            android.app.Application r0 = r7.zza
            com.google.android.ump.ConsentDebugSettings$Builder r1 = new com.google.android.ump.ConsentDebugSettings$Builder
            r1.<init>(r0)
            com.google.android.ump.ConsentDebugSettings r0 = r1.build()
        L11:
            r4 = r0
            com.google.android.gms.internal.consent_sdk.zzn r0 = new com.google.android.gms.internal.consent_sdk.zzn
            r6 = 0
            r1 = r0
            r2 = r7
            r3 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.gms.internal.consent_sdk.zzci r8 = com.google.android.gms.internal.consent_sdk.zzn.zza(r0)
            return r8
    }
}
