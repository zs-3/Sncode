package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzp extends com.google.android.gms.internal.auth.zza {
    zzp(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.account.data.IGoogleAuthService"
            r1.<init>(r2, r0)
            return
    }

    public final void zzd(com.google.android.gms.common.api.internal.IStatusCallback r2, com.google.android.gms.internal.auth.zzbw r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r3)
            r2 = 2
            r1.zzc(r2, r0)
            return
    }

    public final void zze(com.google.android.gms.internal.auth.zzm r2, com.google.android.gms.auth.AccountChangeEventsRequest r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r3)
            r2 = 4
            r1.zzc(r2, r0)
            return
    }

    public final void zzf(com.google.android.gms.internal.auth.zzo r2, android.accounts.Account r3, java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r3)
            r0.writeString(r4)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r5)
            r2 = 1
            r1.zzc(r2, r0)
            return
    }

    public final void zzg(com.google.android.gms.internal.auth.zzk r2, android.accounts.Account r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r3)
            r2 = 6
            r1.zzc(r2, r0)
            return
    }

    public final void zzh(com.google.android.gms.internal.auth.zzk r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            r0.writeString(r3)
            r2 = 3
            r1.zzc(r2, r0)
            return
    }
}
