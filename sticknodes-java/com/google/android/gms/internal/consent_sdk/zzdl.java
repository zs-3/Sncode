package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzdl implements com.google.android.gms.internal.consent_sdk.zzdn {
    private com.google.android.gms.internal.consent_sdk.zzdq zza;

    public zzdl() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void zzb(com.google.android.gms.internal.consent_sdk.zzdq r1, com.google.android.gms.internal.consent_sdk.zzdq r2) {
            com.google.android.gms.internal.consent_sdk.zzdl r1 = (com.google.android.gms.internal.consent_sdk.zzdl) r1
            com.google.android.gms.internal.consent_sdk.zzdq r0 = r1.zza
            if (r0 != 0) goto L9
            r1.zza = r2
            return
        L9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final java.lang.Object zza() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzdq r0 = r1.zza
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.zza()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }
}
