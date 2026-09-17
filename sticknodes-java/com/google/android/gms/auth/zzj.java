package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzj implements com.google.android.gms.auth.zzk {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ android.content.Context zzb;

    zzj(java.lang.String r1, android.content.Context r2) {
            r0 = this;
            r0.zza = r1
            r0.zzb = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.IBinder r5) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
            r4 = this;
            com.google.android.gms.internal.auth.zzf r5 = com.google.android.gms.internal.auth.zze.zzb(r5)
            java.lang.String r0 = r4.zza
            android.os.Bundle r5 = r5.zzg(r0)
            com.google.android.gms.auth.zzl.zzc(r5)
            java.lang.String r0 = "Error"
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "userRecoveryIntent"
            android.os.Parcelable r1 = r5.getParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r2 = "userRecoveryPendingIntent"
            android.os.Parcelable r5 = r5.getParcelable(r2)
            android.app.PendingIntent r5 = (android.app.PendingIntent) r5
            com.google.android.gms.internal.auth.zzby r2 = com.google.android.gms.internal.auth.zzby.zza(r0)
            com.google.android.gms.internal.auth.zzby r3 = com.google.android.gms.internal.auth.zzby.zzc
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L32
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        L32:
            android.content.Context r2 = r4.zzb
            java.lang.String r3 = "requestGoogleAccountsAccess"
            com.google.android.gms.auth.zzl.zzd(r2, r3, r0, r1, r5)
            com.google.android.gms.auth.GoogleAuthException r5 = new com.google.android.gms.auth.GoogleAuthException
            java.lang.String r0 = "Invalid state. Shouldn't happen"
            r5.<init>(r0)
            throw r5
    }
}
