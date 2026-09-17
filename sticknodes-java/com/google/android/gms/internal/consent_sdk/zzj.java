package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzj implements com.google.android.ump.ConsentInformation {
    private final com.google.android.gms.internal.consent_sdk.zzap zza;
    private final com.google.android.gms.internal.consent_sdk.zzu zzb;
    private final com.google.android.gms.internal.consent_sdk.zzbn zzc;
    private final java.lang.Object zzd;
    private final java.lang.Object zze;
    private boolean zzf;
    private boolean zzg;
    private com.google.android.ump.ConsentRequestParameters zzh;

    public zzj(com.google.android.gms.internal.consent_sdk.zzap r2, com.google.android.gms.internal.consent_sdk.zzu r3, com.google.android.gms.internal.consent_sdk.zzbn r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zzd = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.zze = r0
            r0 = 0
            r1.zzf = r0
            r1.zzg = r0
            com.google.android.ump.ConsentRequestParameters$Builder r0 = new com.google.android.ump.ConsentRequestParameters$Builder
            r0.<init>()
            com.google.android.ump.ConsentRequestParameters r0 = r0.build()
            r1.zzh = r0
            r1.zza = r2
            r1.zzb = r3
            r1.zzc = r4
            return
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean canRequestAds() {
            r4 = this;
            com.google.android.gms.internal.consent_sdk.zzap r0 = r4.zza
            boolean r0 = r0.zzk()
            r1 = 1
            if (r0 != 0) goto L1f
            boolean r0 = r4.zzc()
            r2 = 0
            if (r0 != 0) goto L12
            r0 = 0
            goto L18
        L12:
            com.google.android.gms.internal.consent_sdk.zzap r0 = r4.zza
            int r0 = r0.zza()
        L18:
            if (r0 == r1) goto L1f
            r3 = 3
            if (r0 != r3) goto L1e
            goto L1f
        L1e:
            return r2
        L1f:
            return r1
    }

    @Override // com.google.android.ump.ConsentInformation
    public final int getConsentStatus() {
            r1 = this;
            boolean r0 = r1.zzc()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            com.google.android.gms.internal.consent_sdk.zzap r0 = r1.zza
            int r0 = r0.zza()
            return r0
    }

    @Override // com.google.android.ump.ConsentInformation
    public final com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus getPrivacyOptionsRequirementStatus() {
            r1 = this;
            boolean r0 = r1.zzc()
            if (r0 != 0) goto L9
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN
            return r0
        L9:
            com.google.android.gms.internal.consent_sdk.zzap r0 = r1.zza
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.ump.ConsentInformation
    public final boolean isConsentFormAvailable() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzbn r0 = r1.zzc
            boolean r0 = r0.zzf()
            return r0
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void requestConsentInfoUpdate(android.app.Activity r3, com.google.android.ump.ConsentRequestParameters r4, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener r5, com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener r6) {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            r1 = 1
            r2.zzf = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r2.zzh = r4
            com.google.android.gms.internal.consent_sdk.zzu r0 = r2.zzb
            r0.zzc(r3, r4, r5, r6)
            return
        Lf:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Override // com.google.android.ump.ConsentInformation
    public final void reset() {
            r2 = this;
            com.google.android.gms.internal.consent_sdk.zzbn r0 = r2.zzc
            r1 = 0
            r0.zzd(r1)
            com.google.android.gms.internal.consent_sdk.zzap r0 = r2.zza
            r0.zze()
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            r1 = 0
            r2.zzf = r1     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    public final void zza(android.app.Activity r5) {
            r4 = this;
            boolean r0 = r4.zzc()
            if (r0 == 0) goto L23
            boolean r0 = r4.zzd()
            if (r0 == 0) goto Ld
            goto L23
        Ld:
            r0 = 1
            r4.zzb(r0)
            com.google.android.gms.internal.consent_sdk.zzu r0 = r4.zzb
            com.google.android.ump.ConsentRequestParameters r1 = r4.zzh
            com.google.android.gms.internal.consent_sdk.zzh r2 = new com.google.android.gms.internal.consent_sdk.zzh
            r2.<init>(r4)
            com.google.android.gms.internal.consent_sdk.zzi r3 = new com.google.android.gms.internal.consent_sdk.zzi
            r3.<init>(r4)
            r0.zzc(r5, r1, r2, r3)
            return
        L23:
            boolean r5 = r4.zzc()
            boolean r0 = r4.zzd()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Retry request is not executed. consentInfoUpdateHasBeenCalled="
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = ", retryRequestIsInProgress="
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.String r0 = "UserMessagingPlatform"
            android.util.Log.w(r0, r5)
            return
    }

    public final void zzb(boolean r2) {
            r1 = this;
            java.lang.Object r0 = r1.zze
            monitor-enter(r0)
            r1.zzg = r2     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    public final boolean zzc() {
            r2 = this;
            java.lang.Object r0 = r2.zzd
            monitor-enter(r0)
            boolean r1 = r2.zzf     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }

    public final boolean zzd() {
            r2 = this;
            java.lang.Object r0 = r2.zze
            monitor-enter(r0)
            boolean r1 = r2.zzg     // Catch: java.lang.Throwable -> L7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
            throw r1
    }
}
