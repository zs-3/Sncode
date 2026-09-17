package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzbn {
    private final com.google.android.gms.internal.consent_sdk.zzds zza;
    private final java.util.concurrent.Executor zzb;
    private final java.util.concurrent.atomic.AtomicReference zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd;

    zzbn(com.google.android.gms.internal.consent_sdk.zzds r2, java.util.concurrent.Executor r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zzc = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.zzd = r0
            r1.zza = r2
            r1.zzb = r3
            return
    }

    final /* synthetic */ void zza(com.google.android.gms.internal.consent_sdk.zzbb r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzd
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.internal.consent_sdk.zzbe r1 = new com.google.android.gms.internal.consent_sdk.zzbe
            r1.<init>(r0)
            com.google.android.gms.internal.consent_sdk.zzbf r0 = new com.google.android.gms.internal.consent_sdk.zzbf
            r0.<init>()
            r3.zzf(r1, r0)
            return
    }

    public final void zzb(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener r3, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener r4) {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzcr.zza()
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzc
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.consent_sdk.zzbp r0 = (com.google.android.gms.internal.consent_sdk.zzbp) r0
            if (r0 != 0) goto L1d
            com.google.android.gms.internal.consent_sdk.zzg r3 = new com.google.android.gms.internal.consent_sdk.zzg
            r0 = 3
            java.lang.String r1 = "No available form can be built."
            r3.<init>(r0, r1)
            com.google.android.ump.FormError r3 = r3.zza()
            r4.onConsentFormLoadFailure(r3)
            return
        L1d:
            com.google.android.gms.internal.consent_sdk.zzds r1 = r2.zza
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.consent_sdk.zzav r1 = (com.google.android.gms.internal.consent_sdk.zzav) r1
            com.google.android.gms.internal.consent_sdk.zzav r0 = r1.zza(r0)
            com.google.android.gms.internal.consent_sdk.zzaw r0 = r0.zzb()
            com.google.android.gms.internal.consent_sdk.zzbb r0 = r0.zza()
            r0.zzf(r3, r4)
            return
    }

    public final void zzc() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzc
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.consent_sdk.zzbp r0 = (com.google.android.gms.internal.consent_sdk.zzbp) r0
            if (r0 != 0) goto L12
            java.lang.String r0 = "UserMessagingPlatform"
            java.lang.String r1 = "Failed to load and cache a form due to null consent form resources."
            android.util.Log.e(r0, r1)
            return
        L12:
            com.google.android.gms.internal.consent_sdk.zzds r1 = r3.zza
            java.lang.Object r1 = r1.zza()
            com.google.android.gms.internal.consent_sdk.zzav r1 = (com.google.android.gms.internal.consent_sdk.zzav) r1
            com.google.android.gms.internal.consent_sdk.zzav r0 = r1.zza(r0)
            com.google.android.gms.internal.consent_sdk.zzaw r0 = r0.zzb()
            com.google.android.gms.internal.consent_sdk.zzbb r0 = r0.zza()
            r1 = 1
            r0.zza = r1
            android.os.Handler r1 = com.google.android.gms.internal.consent_sdk.zzcr.zza
            com.google.android.gms.internal.consent_sdk.zzbd r2 = new com.google.android.gms.internal.consent_sdk.zzbd
            r2.<init>(r3, r0)
            r1.post(r2)
            return
    }

    public final void zzd(com.google.android.gms.internal.consent_sdk.zzbp r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzc
            r0.set(r2)
            return
    }

    public final void zze(android.app.Activity r4, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener r5) {
            r3 = this;
            com.google.android.gms.internal.consent_sdk.zzcr.zza()
            com.google.android.gms.internal.consent_sdk.zza r0 = com.google.android.gms.internal.consent_sdk.zza.zza(r4)
            com.google.android.gms.internal.consent_sdk.zzj r0 = r0.zzb()
            if (r0 != 0) goto L18
            android.os.Handler r4 = com.google.android.gms.internal.consent_sdk.zzcr.zza
            com.google.android.gms.internal.consent_sdk.zzbg r0 = new com.google.android.gms.internal.consent_sdk.zzbg
            r0.<init>(r5)
            r4.post(r0)
            return
        L18:
            boolean r1 = r0.isConsentFormAvailable()
            if (r1 != 0) goto L35
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = r0.getPrivacyOptionsRequirementStatus()
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r2 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            if (r1 != r2) goto L27
            goto L35
        L27:
            android.os.Handler r1 = com.google.android.gms.internal.consent_sdk.zzcr.zza
            com.google.android.gms.internal.consent_sdk.zzbh r2 = new com.google.android.gms.internal.consent_sdk.zzbh
            r2.<init>(r5)
            r1.post(r2)
            r0.zza(r4)
            return
        L35:
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = r0.getPrivacyOptionsRequirementStatus()
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            if (r0 != r1) goto L48
            android.os.Handler r4 = com.google.android.gms.internal.consent_sdk.zzcr.zza
            com.google.android.gms.internal.consent_sdk.zzbi r0 = new com.google.android.gms.internal.consent_sdk.zzbi
            r0.<init>(r5)
            r4.post(r0)
            return
        L48:
            java.util.concurrent.atomic.AtomicReference r0 = r3.zzd
            java.lang.Object r0 = r0.get()
            com.google.android.ump.ConsentForm r0 = (com.google.android.ump.ConsentForm) r0
            if (r0 != 0) goto L5d
            android.os.Handler r4 = com.google.android.gms.internal.consent_sdk.zzcr.zza
            com.google.android.gms.internal.consent_sdk.zzbj r0 = new com.google.android.gms.internal.consent_sdk.zzbj
            r0.<init>(r5)
            r4.post(r0)
            return
        L5d:
            r0.show(r4, r5)
            java.util.concurrent.Executor r4 = r3.zzb
            com.google.android.gms.internal.consent_sdk.zzbk r5 = new com.google.android.gms.internal.consent_sdk.zzbk
            r5.<init>(r3)
            r4.execute(r5)
            return
    }

    public final boolean zzf() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r1.zzc
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }
}
