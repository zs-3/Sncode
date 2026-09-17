package com.google.android.gms.auth.account;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzc extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.auth.account.zze {
    zzc(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.auth.account.IWorkAccountService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzd(com.google.android.gms.auth.account.zzb r2, java.lang.String r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            r0.writeString(r3)
            r2 = 2
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zze(com.google.android.gms.auth.account.zzb r2, android.accounts.Account r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzd(r0, r2)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r3)
            r2 = 3
            r1.zzc(r2, r0)
            return
    }

    @Override // com.google.android.gms.auth.account.zze
    public final void zzf(boolean r3) throws android.os.RemoteException {
            r2 = this;
            android.os.Parcel r0 = r2.zza()
            int r1 = com.google.android.gms.internal.auth.zzc.zza
            r0.writeInt(r3)
            r3 = 1
            r2.zzc(r3, r0)
            return
    }
}
