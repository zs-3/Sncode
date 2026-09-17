package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzbb implements com.google.android.ump.ConsentForm {
    boolean zza;
    private final android.app.Application zzb;
    private final com.google.android.gms.internal.consent_sdk.zzbw zzc;
    private final com.google.android.gms.internal.consent_sdk.zzap zzd;
    private final com.google.android.gms.internal.consent_sdk.zzbp zze;
    private final com.google.android.gms.internal.consent_sdk.zzds zzf;
    private android.app.Dialog zzg;
    private com.google.android.gms.internal.consent_sdk.zzbu zzh;
    private final java.util.concurrent.atomic.AtomicBoolean zzi;
    private final java.util.concurrent.atomic.AtomicReference zzj;
    private final java.util.concurrent.atomic.AtomicReference zzk;
    private final java.util.concurrent.atomic.AtomicReference zzl;

    public zzbb(android.app.Application r1, com.google.android.gms.internal.consent_sdk.zzab r2, com.google.android.gms.internal.consent_sdk.zzbw r3, com.google.android.gms.internal.consent_sdk.zzap r4, com.google.android.gms.internal.consent_sdk.zzbp r5, com.google.android.gms.internal.consent_sdk.zzds r6) {
            r0 = this;
            r0.<init>()
            java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
            r2.<init>()
            r0.zzi = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.zzj = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.zzk = r2
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r0.zzl = r2
            r2 = 0
            r0.zza = r2
            r0.zzb = r1
            r0.zzc = r3
            r0.zzd = r4
            r0.zze = r5
            r0.zzf = r6
            return
    }

    static /* bridge */ /* synthetic */ android.app.Application zza(com.google.android.gms.internal.consent_sdk.zzbb r0) {
            android.app.Application r0 = r0.zzb
            return r0
    }

    static /* bridge */ /* synthetic */ android.app.Dialog zzb(com.google.android.gms.internal.consent_sdk.zzbb r0) {
            android.app.Dialog r0 = r0.zzg
            return r0
    }

    static /* bridge */ /* synthetic */ com.google.android.gms.internal.consent_sdk.zzbw zzd(com.google.android.gms.internal.consent_sdk.zzbb r0) {
            com.google.android.gms.internal.consent_sdk.zzbw r0 = r0.zzc
            return r0
    }

    static /* bridge */ /* synthetic */ java.util.concurrent.atomic.AtomicReference zze(com.google.android.gms.internal.consent_sdk.zzbb r0) {
            java.util.concurrent.atomic.AtomicReference r0 = r0.zzl
            return r0
    }

    private final void zzk() {
            r2 = this;
            android.app.Dialog r0 = r2.zzg
            r1 = 0
            if (r0 == 0) goto La
            r0.dismiss()
            r2.zzg = r1
        La:
            com.google.android.gms.internal.consent_sdk.zzbw r0 = r2.zzc
            r0.zza(r1)
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzl
            java.lang.Object r0 = r0.getAndSet(r1)
            com.google.android.gms.internal.consent_sdk.zzay r0 = (com.google.android.gms.internal.consent_sdk.zzay) r0
            if (r0 == 0) goto L1c
            com.google.android.gms.internal.consent_sdk.zzay.zza(r0)
        L1c:
            return
    }

    @Override // com.google.android.ump.ConsentForm
    public final void show(android.app.Activity r5, com.google.android.ump.ConsentForm.OnConsentFormDismissedListener r6) {
            r4 = this;
            com.google.android.gms.internal.consent_sdk.zzcr.zza()
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.zzi
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 3
            if (r0 != 0) goto L24
            com.google.android.gms.internal.consent_sdk.zzg r5 = new com.google.android.gms.internal.consent_sdk.zzg
            boolean r0 = r4.zza
            if (r2 == r0) goto L17
            java.lang.String r0 = "ConsentForm#show can only be invoked once."
            goto L19
        L17:
            java.lang.String r0 = "Privacy options form is being loading. Please try again later."
        L19:
            r5.<init>(r3, r0)
            com.google.android.ump.FormError r5 = r5.zza()
            r6.onConsentFormDismissed(r5)
            return
        L24:
            com.google.android.gms.internal.consent_sdk.zzbu r0 = r4.zzh
            r0.zzc()
            com.google.android.gms.internal.consent_sdk.zzay r0 = new com.google.android.gms.internal.consent_sdk.zzay
            r0.<init>(r4, r5)
            android.app.Application r2 = r4.zzb
            r2.registerActivityLifecycleCallbacks(r0)
            java.util.concurrent.atomic.AtomicReference r2 = r4.zzl
            r2.set(r0)
            com.google.android.gms.internal.consent_sdk.zzbw r0 = r4.zzc
            r0.zza(r5)
            android.app.Dialog r0 = new android.app.Dialog
            r2 = 16973840(0x1030010, float:2.4060945E-38)
            r0.<init>(r5, r2)
            com.google.android.gms.internal.consent_sdk.zzbu r5 = r4.zzh
            r0.setContentView(r5)
            r0.setCancelable(r1)
            android.view.Window r5 = r0.getWindow()
            if (r5 != 0) goto L62
            com.google.android.gms.internal.consent_sdk.zzg r5 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = "Activity with null windows is passed in."
            r5.<init>(r3, r0)
            com.google.android.ump.FormError r5 = r5.zza()
            r6.onConsentFormDismissed(r5)
            return
        L62:
            r2 = -1
            r5.setLayout(r2, r2)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r1)
            r5.setBackgroundDrawable(r2)
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r5.setFlags(r2, r2)
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r5, r1)
            java.util.concurrent.atomic.AtomicReference r5 = r4.zzk
            r5.set(r6)
            r0.show()
            r4.zzg = r0
            com.google.android.gms.internal.consent_sdk.zzbu r5 = r4.zzh
            java.lang.String r6 = "UMP_messagePresented"
            java.lang.String r0 = ""
            r5.zzd(r6, r0)
            return
    }

    final com.google.android.gms.internal.consent_sdk.zzbu zzc() {
            r1 = this;
            com.google.android.gms.internal.consent_sdk.zzbu r0 = r1.zzh
            return r0
    }

    final void zzf(com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener r8, com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener r9) {
            r7 = this;
            com.google.android.gms.internal.consent_sdk.zzds r0 = r7.zzf
            com.google.android.gms.internal.consent_sdk.zzbv r0 = (com.google.android.gms.internal.consent_sdk.zzbv) r0
            com.google.android.gms.internal.consent_sdk.zzbu r0 = r0.zzb()
            r7.zzh = r0
            r1 = 0
            r0.setBackgroundColor(r1)
            android.webkit.WebSettings r1 = r0.getSettings()
            r2 = 1
            r1.setJavaScriptEnabled(r2)
            com.google.android.gms.internal.consent_sdk.zzbt r1 = new com.google.android.gms.internal.consent_sdk.zzbt
            r2 = 0
            r1.<init>(r0, r2)
            r0.setWebViewClient(r1)
            com.google.android.gms.internal.consent_sdk.zzba r0 = new com.google.android.gms.internal.consent_sdk.zzba
            r0.<init>(r8, r9, r2)
            java.util.concurrent.atomic.AtomicReference r8 = r7.zzj
            r8.set(r0)
            com.google.android.gms.internal.consent_sdk.zzbu r1 = r7.zzh
            com.google.android.gms.internal.consent_sdk.zzbp r8 = r7.zze
            java.lang.String r2 = r8.zza()
            java.lang.String r3 = r8.zzb()
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "UTF-8"
            r6 = 0
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)
            android.os.Handler r8 = com.google.android.gms.internal.consent_sdk.zzcr.zza
            com.google.android.gms.internal.consent_sdk.zzax r9 = new com.google.android.gms.internal.consent_sdk.zzax
            r9.<init>(r7)
            r0 = 10000(0x2710, double:4.9407E-320)
            r8.postDelayed(r9, r0)
            return
    }

    final void zzg(int r4) {
            r3 = this;
            r3.zzk()
            java.util.concurrent.atomic.AtomicReference r4 = r3.zzk
            r0 = 0
            java.lang.Object r4 = r4.getAndSet(r0)
            com.google.android.ump.ConsentForm$OnConsentFormDismissedListener r4 = (com.google.android.ump.ConsentForm.OnConsentFormDismissedListener) r4
            if (r4 != 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.consent_sdk.zzap r1 = r3.zzd
            r2 = 3
            r1.zzg(r2)
            r4.onConsentFormDismissed(r0)
            return
    }

    final void zzh(com.google.android.gms.internal.consent_sdk.zzg r3) {
            r2 = this;
            r2.zzk()
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzk
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            com.google.android.ump.ConsentForm$OnConsentFormDismissedListener r0 = (com.google.android.ump.ConsentForm.OnConsentFormDismissedListener) r0
            if (r0 != 0) goto Lf
            return
        Lf:
            com.google.android.ump.FormError r3 = r3.zza()
            r0.onConsentFormDismissed(r3)
            return
    }

    final void zzi() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzj
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            com.google.android.gms.internal.consent_sdk.zzba r0 = (com.google.android.gms.internal.consent_sdk.zzba) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            r0.onConsentFormLoadSuccess(r2)
            return
    }

    final void zzj(com.google.android.gms.internal.consent_sdk.zzg r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r2.zzj
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r1)
            com.google.android.gms.internal.consent_sdk.zzba r0 = (com.google.android.gms.internal.consent_sdk.zzba) r0
            if (r0 != 0) goto Lc
            return
        Lc:
            com.google.android.ump.FormError r3 = r3.zza()
            r0.onConsentFormLoadFailure(r3)
            return
    }
}
