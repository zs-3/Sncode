package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzbu extends android.webkit.WebView {
    private final android.os.Handler zza;
    private final com.google.android.gms.internal.consent_sdk.zzca zzb;
    private boolean zzc;

    public zzbu(com.google.android.gms.internal.consent_sdk.zzbw r1, android.os.Handler r2, com.google.android.gms.internal.consent_sdk.zzca r3) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.zzc = r1
            r0.zza = r2
            r0.zzb = r3
            return
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzca zza(com.google.android.gms.internal.consent_sdk.zzbu r0) {
            com.google.android.gms.internal.consent_sdk.zzca r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ void zzb(com.google.android.gms.internal.consent_sdk.zzbu r0, boolean r1) {
            r1 = 1
            r0.zzc = r1
            return
    }

    static /* bridge */ /* synthetic */ boolean zze(com.google.android.gms.internal.consent_sdk.zzbu r0) {
            boolean r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zzf(com.google.android.gms.internal.consent_sdk.zzbu r0, java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "consent://"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final void zzc() {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzca r0 = r2.zzb
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.consent_sdk.zzbr r1 = new com.google.android.gms.internal.consent_sdk.zzbr
            r1.<init>(r0)
            android.os.Handler r0 = r2.zza
            r0.post(r1)
            return
    }

    public final void zzd(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "("
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = ");"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            com.google.android.gms.internal.consent_sdk.zzbq r3 = new com.google.android.gms.internal.consent_sdk.zzbq
            r3.<init>(r1, r2)
            android.os.Handler r2 = r1.zza
            r2.post(r3)
            return
    }
}
