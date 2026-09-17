package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.0.0 */
/* loaded from: classes.dex */
public final class zzg extends java.lang.Exception {
    private final int zza;

    public zzg(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.zza = r1
            return
    }

    public zzg(int r1, java.lang.String r2, java.lang.Throwable r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.zza = r1
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
            r1 = this;
            java.lang.String r0 = super.getMessage()
            return r0
    }

    public final com.google.android.ump.FormError zza() {
            r3 = this;
            java.lang.Throwable r0 = r3.getCause()
            java.lang.String r1 = "UserMessagingPlatform"
            if (r0 != 0) goto L10
            java.lang.String r0 = super.getMessage()
            android.util.Log.w(r1, r0)
            goto L1b
        L10:
            java.lang.String r0 = super.getMessage()
            java.lang.Throwable r2 = r3.getCause()
            android.util.Log.w(r1, r0, r2)
        L1b:
            int r0 = r3.zza
            com.google.android.ump.FormError r1 = new com.google.android.ump.FormError
            java.lang.String r2 = super.getMessage()
            r1.<init>(r0, r2)
            return r1
    }
}
