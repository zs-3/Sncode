package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzdo implements com.google.android.gms.internal.consent_sdk.zzdn {
    private final java.lang.Object zza;

    private zzdo(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.internal.consent_sdk.zzdn zzb(java.lang.Object r2) {
            com.google.android.gms.internal.consent_sdk.zzdo r0 = new com.google.android.gms.internal.consent_sdk.zzdo
            java.lang.String r1 = "instance cannot be null"
            java.util.Objects.requireNonNull(r2, r1)
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzds, com.google.android.gms.internal.consent_sdk.zzdr
    public final java.lang.Object zza() {
            r1 = this;
            java.lang.Object r0 = r1.zza
            return r0
    }
}
