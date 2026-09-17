package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
@com.google.android.gms.common.annotation.KeepName
/* loaded from: classes.dex */
public class UserRecoverableAuthException extends com.google.android.gms.auth.GoogleAuthException {
    private final android.content.Intent zza;
    private final android.app.PendingIntent zzb;
    private final com.google.android.gms.auth.zzn zzc;

    public UserRecoverableAuthException(java.lang.String r3, android.content.Intent r4) {
            r2 = this;
            com.google.android.gms.auth.zzn r0 = com.google.android.gms.auth.zzn.zza
            r1 = 0
            r2.<init>(r3, r4, r1, r0)
            return
    }

    private UserRecoverableAuthException(java.lang.String r1, android.content.Intent r2, android.app.PendingIntent r3, com.google.android.gms.auth.zzn r4) {
            r0 = this;
            r0.<init>(r1)
            r0.zzb = r3
            r0.zza = r2
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.auth.zzn r1 = (com.google.android.gms.auth.zzn) r1
            r0.zzc = r1
            return
    }

    public static com.google.android.gms.auth.UserRecoverableAuthException zza(java.lang.String r2, android.content.Intent r3, android.app.PendingIntent r4) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r4)
            com.google.android.gms.auth.UserRecoverableAuthException r0 = new com.google.android.gms.auth.UserRecoverableAuthException
            com.google.android.gms.auth.zzn r1 = com.google.android.gms.auth.zzn.zzb
            r0.<init>(r2, r3, r4, r1)
            return r0
    }

    public android.content.Intent getIntent() {
            r3 = this;
            android.content.Intent r0 = r3.zza
            if (r0 != 0) goto L28
            com.google.android.gms.auth.zzn r0 = r3.zzc
            int r0 = r0.ordinal()
            java.lang.String r1 = "Auth"
            if (r0 == 0) goto L21
            r2 = 1
            if (r0 == r2) goto L1b
            r2 = 2
            if (r0 == r2) goto L15
            goto L26
        L15:
            java.lang.String r0 = "this instantiation of UserRecoverableAuthException doesn't support an Intent."
            android.util.Log.e(r1, r0)
            goto L26
        L1b:
            java.lang.String r0 = "This shouldn't happen. Gms API throwing this exception should support the recovery Intent."
            android.util.Log.e(r1, r0)
            goto L26
        L21:
            java.lang.String r0 = "Make sure that an intent was provided to class instantiation."
            android.util.Log.w(r1, r0)
        L26:
            r0 = 0
            return r0
        L28:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            return r1
    }
}
