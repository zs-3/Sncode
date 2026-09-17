package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzbh extends com.google.android.gms.internal.auth.zza {
    zzbh(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.api.internal.IAuthService"
            r1.<init>(r2, r0)
            return
    }

    public final void zzd(com.google.android.gms.internal.auth.zzbg r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            r2 = 3
            r1.zzc(r2, r0)
            return
    }

    public final void zze(com.google.android.gms.internal.auth.zzbg r2, com.google.android.gms.auth.api.proxy.ProxyRequest r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r3)
            r2 = 1
            r1.zzc(r2, r0)
            return
    }
}
