package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes.dex */
public final class zzd extends com.google.android.gms.internal.auth.zza implements com.google.android.gms.internal.auth.zzf {
    zzd(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.auth.IAuthManagerService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zzd(java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r3)
            r2 = 2
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.auth.zzc.zza(r2, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zze(android.accounts.Account r2, java.lang.String r3, android.os.Bundle r4) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzc(r0, r2)
            r0.writeString(r3)
            com.google.android.gms.internal.auth.zzc.zzc(r0, r4)
            r2 = 5
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r3 = android.os.Bundle.CREATOR
            android.os.Parcelable r3 = com.google.android.gms.internal.auth.zzc.zza(r2, r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r2.recycle()
            return r3
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zzf(android.accounts.Account r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzc(r0, r2)
            r2 = 7
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.auth.zzc.zza(r2, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final android.os.Bundle zzg(java.lang.String r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            r0.writeString(r2)
            r2 = 8
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.auth.zzc.zza(r2, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r2.recycle()
            return r0
    }

    @Override // com.google.android.gms.internal.auth.zzf
    public final com.google.android.gms.auth.AccountChangeEventsResponse zzh(com.google.android.gms.auth.AccountChangeEventsRequest r2) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.zza()
            com.google.android.gms.internal.auth.zzc.zzc(r0, r2)
            r2 = 3
            android.os.Parcel r2 = r1.zzb(r2, r0)
            android.os.Parcelable$Creator<com.google.android.gms.auth.AccountChangeEventsResponse> r0 = com.google.android.gms.auth.AccountChangeEventsResponse.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.auth.zzc.zza(r2, r0)
            com.google.android.gms.auth.AccountChangeEventsResponse r0 = (com.google.android.gms.auth.AccountChangeEventsResponse) r0
            r2.recycle()
            return r0
    }
}
