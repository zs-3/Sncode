package com.google.android.gms.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
final class zzi implements com.google.android.gms.auth.zzk {
    final /* synthetic */ com.google.android.gms.auth.AccountChangeEventsRequest zza;

    zzi(com.google.android.gms.auth.AccountChangeEventsRequest r1) {
            r0 = this;
            r0.zza = r1
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.auth.zzk
    public final /* bridge */ /* synthetic */ java.lang.Object zza(android.os.IBinder r2) throws android.os.RemoteException, java.io.IOException, com.google.android.gms.auth.GoogleAuthException {
            r1 = this;
            com.google.android.gms.internal.auth.zzf r2 = com.google.android.gms.internal.auth.zze.zzb(r2)
            com.google.android.gms.auth.AccountChangeEventsRequest r0 = r1.zza
            com.google.android.gms.auth.AccountChangeEventsResponse r2 = r2.zzh(r0)
            com.google.android.gms.auth.zzl.zzc(r2)
            java.util.List r2 = r2.getEvents()
            return r2
    }
}
