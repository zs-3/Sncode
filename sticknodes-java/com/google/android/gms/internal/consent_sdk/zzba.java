package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
final class zzba implements com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener {
    private final com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener zza;
    private final com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener zzb;

    /* synthetic */ zzba(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener r1, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener r2, com.google.android.gms.internal.consent_sdk.zzaz r3) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public final void onConsentFormLoadFailure(com.google.android.ump.FormError r2) {
            r1 = this;
            com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadFailureListener r0 = r1.zzb
            r0.onConsentFormLoadFailure(r2)
            return
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
    public final void onConsentFormLoadSuccess(com.google.android.ump.ConsentForm r2) {
            r1 = this;
            com.google.android.ump.UserMessagingPlatform$OnConsentFormLoadSuccessListener r0 = r1.zza
            r0.onConsentFormLoadSuccess(r2)
            return
    }
}
